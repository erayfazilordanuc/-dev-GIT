public class Main {
    public static void main(String[] args) {
        Fighter Mike = new Fighter("Mike Tyson","Demir Mike",25,13,100,35);
        Fighter Ali = new Fighter("Muhammed Ali","Altın Eldiven",21,17,105,25);
        Match match = new Match(Mike,Ali,91,151);
        match.run();
    }
}