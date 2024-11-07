import java.util.Timer;
import java.util.TimerTask;

    public class simpletimer {
        public static void main(String[] args) {
            System.out.println("Timer dimulai...");
            
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
            int counter = 1;
    @Override
        public void run() {
            if (counter <= 5) {
            System.out.println("Detik ke-" + counter);
            counter++;
        } else {
        System.out.println("Timer selesai.");
        timer.cancel();
        }
    }
};
    //menjadwalkan tugas setiap 1detik (1000ms)
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
