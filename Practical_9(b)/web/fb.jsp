<%@page import="org.hibernate.*, org.hibernate.cfg.*, mypack.*" %>
<%! SessionFactory sf;
org.hibernate.Session hibSession;
%>
<%
sf = new AnnotationConfiguration()
        .configure()
        .addAnnotatedClass(GuestBookBean.class)
        .buildSessionFactory();
hibSession = sf.openSession();
Transaction tx = null;
GuestBookBean gb = new GuestBookBean();
try{
tx = hibSession.beginTransaction();
String username = request.getParameter("name");
String usermsg = request.getParameter("message");
String nowtime = ""+new java.util.Date();
gb.setVisitorName(username);
gb.setMsg(usermsg);
gb.setMsgDate(nowtime);
hibSession.save(gb);
tx.commit();
out.println("Thank You for your valuable feedback....");
}catch(Exception e){out.println(e);}
hibSession.close();
%>