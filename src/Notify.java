public class Notify {
    // gets called from checkWebsites, Notifys User over preferred communication method
    public static void Message(int c) {
        if(c != 0) {
            System.out.println("contents have changed");
        }
    }
}
