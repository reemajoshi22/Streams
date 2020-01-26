
class Derived
{
    protected final void getDetails()
    {
        System.out.println("Derived class");
    }
}
public class OverridingProtectedFinal extends Derived{
// compilation fails below cz we cannot override final methods
   /* protected final void getDetails()
    {
        System.out.println("Test class");
    }*/
    public static void main(String[] args)
    {
        Derived obj = new Derived();
        obj.getDetails();
    }
}
