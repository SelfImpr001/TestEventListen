package scala.com.webank.doorEvent;

/**
 * @Auther: george
 * @Date: 18-9-12 11:03
 * @Description:
 */
public class DoorMain {
    public static void main(String[] args) {
        DoorSourceManager manager = new DoorSourceManager();
        manager.addDoorListener(new DoorEventListener());
        manager.fireOpen();
        System.out.println("我已经进来了");
        manager.fireClose();
    }
}
