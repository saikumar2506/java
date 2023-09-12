import java.io.*;
import java.util.*;
class Animal {
    public void AnimalSound(){
        System.out.println("An animal can make sound");
    }
}
class Cow extends Animal{
    public void AnimalSound(){
        System.out.println("A cow can sound-MAWW");
    }
}
public class PolymorphismDemo{
    public static void main(String args[]){
        Animal an=new Animal();
       Cow cow=new Cow();
        an.AnimalSound();
        cow.AnimalSound();
    }
}
