public class Main {
    public static void main(String[] args) {
        values james = new values();
        values steph = new values();
        System.out.println(james==james);
        james.x = 4;
        System.out.println(james.equals(steph));
    }
}
