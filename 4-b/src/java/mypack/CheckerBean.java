package mypack;

public class CheckerBean {
    private String name, age, hob, email,gender,error;
    public CheckerBean(){
        error="";
    }
    public void setName(String n){name = n;}
    public void setAge(String a){age = a;}
    public void setHob(String h){hob = h;}
    public void setEmail(String em){email = em;}
    public void setGender(String g){gender = g;}
    public void setError(String e){error = e;}
    public boolean Validate(){
        boolean res=true;
        if(name.trim().equals("")){error += "<br>Enter First Name";res=false;}
        if(age.length() > 2)
        {error += "<br>Age Invalid"; res=false;}

        return res;
    }
    public String getError(){
    return error;
}
    
}