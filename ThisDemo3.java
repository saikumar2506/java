//java program to invoke keyword using this  keyword
class A{
    void M(){
        System.out.println("Inside method M");
    }
    void N(){
        System.out.println("Inside method N");
        this.M();
    }
}
public class ThisDemo{
    public static void main(String args[]){
    A a=new A();
    a.N();
}
}
