<%@page import="java.util.*,jakarta.persistence.*,asif.Book" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<%!
private EntityManagerFactory entityManagerFactory;
private EntityManager entityManager;
private EntityTransaction entityTransaction;
List<Book> books;
%>

<%
entityManagerFactory =
    Persistence.createEntityManagerFactory("BookPU");

entityManager = entityManagerFactory.createEntityManager();

String submit = request.getParameter("btnSubmit");

if(submit != null && ("Submit").equals(submit)) {

    try {

        String bookName = request.getParameter("bookName");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        Book b = new Book();

        b.setBookName(bookName);
        b.setAuthor(author);
        b.setPrice(price);

        entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(b);
        entityTransaction.commit();

    } catch (RuntimeException e) {

        if(entityTransaction != null && entityTransaction.isActive())
            entityTransaction.rollback();

        throw e;
    }

    response.sendRedirect("BookView.jsp");
    return;
}

books = entityManager.createQuery(
    "SELECT b FROM Book b", Book.class
).getResultList();

entityManager.close();
entityManagerFactory.close();
%>

<html>
<body style="background-color: pink;">

<h2>View Book Details</h2>

<p>
Click <a href="index.jsp">here</a> to add a new book.
</p>

<hr>

<table border="1" cellpadding="10">

<tr>
    <th>Book ID</th>
    <th>Book Name</th>
    <th>Author</th>
    <th>Price</th>
</tr>

<%
Iterator<Book> iterator = books.iterator();

while(iterator.hasNext()) {

    Book obj = iterator.next();
%>

<tr>
    <td><%= obj.getBookId() %></td>
    <td><%= obj.getBookName() %></td>
    <td><%= obj.getAuthor() %></td>
    <td><%= obj.getPrice() %></td>
</tr>

<%
}
%>

</table>

</body>
</html>