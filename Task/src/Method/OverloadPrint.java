package Method;

public class OverloadPrint {
    void print(String msg) {
        System.out.println("Message: " + msg);
    }

    void print(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
