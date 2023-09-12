import java.io.*;
import java.util.*;
class Animal{
    String name;
    public void Eat(){
        System.out.println("I can EAT");
    }
}
class JerryMouse extends Animal{
    public void display(){
        System.out.println("My name is "+name);
    }
}
public class InheritanceDemo{
    public static void main(String args[]){
        JerryMouse JM=new JerryMouse();
        JM.name="Jerry-The Mouse";
        JM.display();
        JM.Eat();
    }
}
