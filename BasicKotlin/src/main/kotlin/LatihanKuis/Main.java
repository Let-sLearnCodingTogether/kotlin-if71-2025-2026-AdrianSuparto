package LatihanKuis;

public class Main {
    public static void main(String[] args) {
        AgeValidator v = new AgeValidator();
        try {
            v.check(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Error dari Kotlin: " + e.getMessage());
        }
    }
}

