public class Lungs implements Runnable{

    private int countBreath;
    private double frequencyBreath;

    public Lungs(int countBreath) {
        this.countBreath = countBreath;
        this.frequencyBreath = (double) 60 /countBreath * 1000;
    }


    @Override
    public void run() {
        for (int i = 0; i < countBreath; i++) {
            System.out.println(" breath");
            try {
                Thread.sleep((int) frequencyBreath);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getCountBreath() {
        return countBreath;
    }

    public void setCountBreath(int countBreath) {
        this.countBreath = countBreath;
    }
}
