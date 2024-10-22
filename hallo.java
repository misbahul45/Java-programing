
public class hallo {
    void hallo() {
        String nama = "rizal";

    }

    int sum() {
        int num1 = 2;
        int num2 = 7;
        int hasil = num1 + num2;
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        hallo halloClass = new hallo();
        halloClass.hallo();
        System.out.println("hasil " + halloClass.sum());
    }
}
