public class Virus {
    static int virusCount = 0;
    private int newSeconds = 0;

    public int getSeconds() {
        return newSeconds;
    }

    public void setSeconds(int second) {
        if (second > 59 && second <101) {
            this.newSeconds = second;
        }
    }

    public Virus(){
        virusCount++;
    }

    static int getVirusCount(){
        return virusCount;
    }
}
