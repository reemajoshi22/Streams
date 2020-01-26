class DerivedClassWithProtectedAccess{
    public void getDetails()
    {
        System.out.println("Derived class");
    }
}
public class OverridingWithaccessModifier extends DerivedClassWithProtectedAccess {
    // compilation fails :
   // The overriding method can not have more restrictive access modifier.
    /*protected void getDetails()
    {
        System.out.println("Test class");
    }*/
    public static void main(String[] args)
    {
        DerivedClassWithProtectedAccess obj = new OverridingWithaccessModifier();  // line xyz
        obj.getDetails();
    }
}
