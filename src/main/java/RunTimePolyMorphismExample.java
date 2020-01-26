public class RunTimePolyMorphismExample {
    public static void main(String[] args) {

        ARun a = new BRun();
        BRun b = new BRun();
        System.out.println(a.c + " " + a.getValue() +
                " " + b.getValue() + " " + b.getSuperValue());
    }
}

    class ARun
    {
        protected char c = 'A';
        char getValue()
        {
            return c;
        }
    }
    class BRun extends ARun
    {
        protected char c = 'B';
        char getSuperValue()
        {
            return super.c;
        }
    }

