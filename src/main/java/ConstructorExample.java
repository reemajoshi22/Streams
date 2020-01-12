public class ConstructorExample {
    String name;

    public ConstructorExample(String name) {
        this.name = name;
    }

    public ConstructorExample() {
        this(makeRandomName());
    }

    private static String makeRandomName() {
        int x = (int) (Math.random() * 5);
        String name = new String[] {"Fluffy", "Fido",
                "Rover", "Spike",
                "Gigi"}[x];
        return name;
    }

    public static void main(String[] args) {
        ConstructorExample constructorExample=new ConstructorExample();
        System.out.println(constructorExample.name);
    }
}
