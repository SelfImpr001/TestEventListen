package scala.com.webank.distributedlock;

/**
 * @Auther: george
 * @Date: 18-9-2 23:12
 * @Description:
 */
public class DistrubutedLockTest {
    static int n = 60000;

    public static void secskill() {
        try {
            Thread.sleep(60000L);
            System.out.println(--n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                DistributedLock lock = null;
                try {
                    lock = new DistributedLock("127.0.0.1:2181", "test1");
                    lock.lock();
                    secskill();
                    System.out.println(Thread.currentThread().getName() + "正在运行");
                } finally {
                    if (lock != null) {
                        lock.unlock();
                    }
                }
            }
        };

        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(runnable);
            t.start();
        }
    }
}
