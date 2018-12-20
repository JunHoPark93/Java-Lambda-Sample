
public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void innerMethod() {
            Main.MyFunctionalInterface fi = () -> {
                System.out.println("outter field : " + outterField);
                System.out.println("outter field : " + UsingThis.this.outterField);

                System.out.println("inner field : " + innerField);
                System.out.println("inner field : " + this.innerField);
            };

            fi.method();
        }
    }
}
