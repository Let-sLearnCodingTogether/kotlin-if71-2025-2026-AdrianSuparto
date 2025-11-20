package Interoperability;

import javax.xml.crypto.Data;

public class CallKotlinFromJava {
    public static void main(String[] args) {
        System.out.println("Hello From Java");

        // TYPE_DATA NAMA_VARIABLE = NEW NAMA_CLASS
        CounterExampleKotlin counter1 = new CounterExampleKotlin();
        System.out.println(counter1.getNumber());

        counter1.increment();
        System.out.println(counter1.getNumber());

        System.out.println(StringUtilsKt.isEmail("test@gmail.com"));

        Logger logger = new Logger();
        logger.log("Aplikasi dimulai");
        logger.log("Aplikasi dimulai", "DEBUG");

        String dbUrl = Database.Companion.getConnectionUrl();
        String dbUrl2 = Database.getConnectionUrl();
        System.out.println(dbUrl);
        System.out.println(dbUrl2);
    }
}
