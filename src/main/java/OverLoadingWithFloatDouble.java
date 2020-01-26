public class OverLoadingWithFloatDouble {
    private String function(float i, int f)
    {
        return ("gfg");
    }
    private String function(double i, double f)
    {
        return ("GFG");
    }
    public static void main(String[] args)
    {
        OverLoadingWithFloatDouble obj = new OverLoadingWithFloatDouble();
        System.out.println(obj.function(1., 20));
    }
}
