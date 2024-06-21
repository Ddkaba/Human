
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Lungs(20));
        thread.start();
        Heart heart = new Heart(70);
        heart.knockHeart();

    }
}