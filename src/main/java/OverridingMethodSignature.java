class DerivedClass
{
    public void getDetails(String temp)
    {
        System.out.println("Derived class " + temp);
    }
}
public class OverridingMethodSignature extends DerivedClass {
//  Compilation error below
    /*public int getDetails(String temp)
    {
        System.out.println("Test class " + temp);
        return 0;
    }*/
    public static void main(String[] args)
    {
        OverridingMethodSignature obj = new OverridingMethodSignature();
        obj.getDetails("GFG");
    }
}
