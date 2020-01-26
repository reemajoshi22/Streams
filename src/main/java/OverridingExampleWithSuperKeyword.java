class DerivedWithSuperKeyword
{
    public void getDetails()
    {
        System.out.printf("Derived class ");
    }
}
public class OverridingExampleWithSuperKeyword extends  DerivedWithSuperKeyword {
    public void getDetails()
    {
        System.out.printf("Test class ");
        super.getDetails();
    }
    public static void main(String[] args)
    {
        DerivedWithSuperKeyword obj = new OverridingExampleWithSuperKeyword();
        obj.getDetails();
    }
}
