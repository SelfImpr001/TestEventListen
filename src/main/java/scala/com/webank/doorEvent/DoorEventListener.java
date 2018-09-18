package scala.com.webank.doorEvent;

import java.util.EventListener;

/**
 * @Auther: george
 * @Date: 18-9-12 10:28
 * @Description:
 */
public class DoorEventListener implements EventListener {

    public void handleDoorEvent(DoorEvent doorEvent){
        if(doorEvent.getDoorState().equals("open")){
            System.out.println("门打开了");
        }else{
            System.out.println("门关闭了");
        }
    }

}
