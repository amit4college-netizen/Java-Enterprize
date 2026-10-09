package asif;
import jakarta.persistence.*;
@Entity
@Table(name="GuestBook")
public class GuestBook {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="VisitorNo", unique=true, updatable=false)
private Integer visitorNo;
@Column(name="VisitorName")
private String visitorName;
@Column(name="Message")
private String message;
@Column(name="MessageDate")
private String messageDate;
public GuestBook() {
}
public Integer getVisitorNo() {
return visitorNo;
}
public void setVisitorNo(Integer visitorNo) {
this.visitorNo = visitorNo;
}
public String getVisitorName() {
return visitorName;
}
public void setVisitorName(String visitorName) {
this.visitorName = visitorName;
}
public String getMessage() {
return message;
}
public void setMessage(String message) {
this.message = message;
}
public String getMessageDate() {
return messageDate;
}
public void setMessageDate(String messageDate) {
this.messageDate = messageDate;
}
}