package comsyntax.Class20;

public class MethodOverloadingTester {
    public static void main(String[] args) {
        MethodOverloading.add(10, 20);
        MethodOverloading.addDouble(10.5, 105.4);
        int[] arr={10,10,10,20};
        MethodOverloading.addArray(arr);

    }
}
