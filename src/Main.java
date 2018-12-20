import jdk.nashorn.internal.objects.annotations.Function;

public class Main {

    public static void main(String[] args) {

        MyFunctionalInterface fi;

        fi = () -> System.out.println("Method call");

        fi.method();

        MyFunctionalReturnInterface fi2;

        fi2 = (x, y) -> x + y;

        System.out.println(fi2.method(1,2));

    }

    @FunctionalInterface
    public interface MyFunctionalInterface {
        void method();
    }

    @FunctionalInterface
    public interface MyFunctionalReturnInterface {
        int method(int x, int y);
    }
}
