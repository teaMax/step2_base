package topic7_Methods.task3_Greeting;

public class Greeting {
    public static void main(String[] args) {
        System.out.println(getGreeting("Иван"));
    }

    public static String getGreeting(String name) {
        return("Привет, " + name + "!");
    }
}
