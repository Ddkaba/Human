public class Heart {
    private int heartbeat;
    private double frequency;

    public void knockHeart() throws InterruptedException {
        for (int i = 0; i < heartbeat; i++) {
            System.out.println("Knock Knock");
            Thread.sleep((int) frequency);
        }
    }


    public Heart(int heartbeat) {
        this.heartbeat = heartbeat;
        this.frequency = (double) 60 /heartbeat * 1000;
    }

    public int getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(int heartbeat) {
        this.heartbeat = heartbeat;
    }
}
