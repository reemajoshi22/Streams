
class SuperConstructorClass {


    public SuperConstructorClass() {
        System.out.println("no arg const of super class");
    }
}
public class SuperSubConstructor extends SuperConstructorClass{

    public static void main(String[] args) {
        SuperSubConstructor superSubConstructor=new SuperSubConstructor();
    }

}


