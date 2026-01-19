package LatihanKuis;

public class Validator {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Umur harus >= 18");
        }
    }
}
