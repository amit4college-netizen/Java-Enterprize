<%@page import="jakarta.persistence.*,asif.*,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
EntityManagerFactory emf =
    Persistence.createEntityManagerFactory("AssociationPU");

EntityManager em = emf.createEntityManager();

String submit = request.getParameter("btnSubmit");

if(submit != null && submit.equals("Submit")) {

    EntityTransaction et = em.getTransaction();

    try {

        Department d = new Department();
        d.setDeptName(request.getParameter("deptName"));

        Employee e = new Employee();
        e.setEmpName(request.getParameter("empName"));

        d.addEmployee(e);

        et.begin();
        em.persist(d);
        et.commit();

    } catch(RuntimeException ex) {

        if(et.isActive()) {
            et.rollback();
        }

        throw ex;
    }

    response.sendRedirect("View.jsp");
    return;
}

List<Department> departments =
    em.createQuery("SELECT d FROM Department d", Department.class)
      .getResultList();

%>

<!DOCTYPE html>
<html>
<body style="background-color: pink;">

<h2>Department and Employee Details</h2>

<a href="index.jsp">Add New Details</a>

<hr>

<%
for(Department d : departments) {
%>

<h3>Department: <%= d.getDeptName() %></h3>

<ul>
<%
for(Employee e : d.getEmployees()) {
%>
<li><%= e.getEmpName() %></li>
<%
}
%>
</ul>

<hr>

<%
}
em.close();
emf.close();
%>

</body>
</html>








