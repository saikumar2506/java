import java.io.*;
class Student {
    public String Sname;
    private String Sphone;
    public String getSphone(){
        return Sphone;
    }
    public void setSphone(String ph)
    {
        this.Sphone=ph;
    }
}
    public class EncapsulationDemo{
        public static void main(String args[]){
        Student S = new Student ();
         S.Sname ="B.saikumar";
         S.setSphone("9014******");
         System.out.println("Student name is "+S.Sname);
         System.out.println("Student phone number is"+S.getSphone());
        }
}

