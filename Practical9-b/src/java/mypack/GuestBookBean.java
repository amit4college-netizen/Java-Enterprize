package mypack;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import javax.persistence.*;
@Entity
@Table(name="guestbook")
public class GuestBookBean implements java.io.Serializable {
 @Id
 @GeneratedValue
 @Column(name="vno")
 private Integer visitorNo;
 @Column(name="vname")
 private String visitorName;
 @Column(name="msg")
 private String msg;
 @Column(name="mdate")
 private String msgDate;
 public GuestBookBean() { }
 public Integer getVisitorNo() { return visitorNo; }
 public String getVisitorName() { return visitorName; }
 public String getMsg() { return msg; }
 public String getMsgDate() { return msgDate; }
 public void setVisitorNo(Integer vn) { visitorNo = vn ; }
 public void setVisitorName(String vn) { visitorName = vn; }
 public void setMsg(String m) { msg = m; }
 public void setMsgDate(String md) {
    msgDate = md;
}
}