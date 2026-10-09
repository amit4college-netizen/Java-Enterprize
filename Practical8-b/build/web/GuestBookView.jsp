<%@page import="java.util.*"%>
<%@page import="jakarta.persistence.*"%>
<%@page import="asif.GuestBook"%>

<%
EntityManagerFactory entityManagerFactory =
        Persistence.createEntityManagerFactory("JPAApplication1PU");

EntityManager entityManager =
        entityManagerFactory.createEntityManager();

EntityTransaction entityTransaction = null;

String submit = request.getParameter("btnSubmit");

if (submit != null && submit.equals("Submit")) {

    try {
        String guest = request.getParameter("guest");
        String message = request.getParameter("message");

        String messageDate = new java.util.Date().toString();

        GuestBook gb = new GuestBook();

        gb.setVisitorName(guest);
        gb.setMessage(message);
        gb.setMessageDate(messageDate);

        entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(gb);
        entityTransaction.commit();

    } catch (RuntimeException e) {

        if (entityTransaction != null && entityTransaction.isActive()) {
            entityTransaction.rollback();
        }

        throw e;
    }

    response.sendRedirect("GuestBookView.jsp");
    return;
}

List<GuestBook> guestbook =
        entityManager.createQuery(
            "SELECT g FROM GuestBook g ORDER BY g.visitorNo DESC",
            GuestBook.class
        ).getResultList();

entityManager.close();
entityManagerFactory.close();
%>

<!DOCTYPE html>
<html>
<body style="background-color: lightblue;">

<h2>View the Guest Book</h2>

<p>
    Click <a href="index.jsp">here</a> to sign the guestbook.
</p>

<hr>

<%
for (GuestBook obj : guestbook) {
%>

    <p>
        On <%= obj.getMessageDate() %>,<br>
        <b><%= obj.getVisitorName() %>:</b>
        <%= obj.getMessage() %>
    </p>

    <hr>

<%
}
%>

</body>
</html>