package StaticInJava;

class DatabaseConfig{
    DatabaseConfig(){
        System.out.println("Constructor executed");
    }
    static String url;
    static String username;
    static int port;

    static{
        url = "jdbc:mysql://localhost";
        username = "admin";
        port = 3306;
        System.out.println("DB Config initialized!");
    }
}

class Example{

    static{
    System.out.println("Static Block 1");
    }

    static int x = 10;


    static {
        System.out.println("Static Block 2 x = " + x);
    }
}

public class Static3 {
    public static void main(String[] args) {

        DatabaseConfig databaseConfig0 = new DatabaseConfig();
        System.out.println(databaseConfig0.url);
        System.out.println();

        DatabaseConfig databaseConfig1 = new DatabaseConfig();
        System.out.println(databaseConfig1.url);
        System.out.println();

        DatabaseConfig databaseConfig2 = new DatabaseConfig();
        System.out.println(databaseConfig2.url);
        System.out.println();

        new Example();



    }
}

