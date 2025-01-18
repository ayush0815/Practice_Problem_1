class Helloworld {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello, World!");
            try {
                Thread.sleep(60000); // Pause for 60,000 milliseconds (60 seconds)
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e.getMessage());
            }
        }
    }
}
