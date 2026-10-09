package mypack;

import counter.ejb.MarksBean;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("marks")
@RequestScoped
public class Marks {

    private String name;
    private String subject;
    private int mark;

    @EJB
    private MarksBean marksBean;

    public void save() {

        marksBean.addMarks(name, subject, mark);

        name = "";
        subject = "";
        mark = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}