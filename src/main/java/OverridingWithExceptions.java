import java.io.IOException;

class DerivedClassWithException
{
    public void getDetails() throws IOException //line 23
    {
        System.out.println("Derived class");
    }
}
public class OverridingWithExceptions extends  DerivedClassWithException {
// The exception thrown by the overriding method should not be new or more
// broader checked exception. In the code above, Exception is more broader class of
// checked exception than IOException, so this results in compilation error.
    /*public void getDetails() throws Exception //line 24
    {
        System.out.println("Test class");
    }*/
    public static void main(String[] args) throws IOException //line 25
    {
        DerivedClassWithException obj = new DerivedClassWithException();
        obj.getDetails();
    }
}
