package scala.com.webank.subscribe;

import com.google.common.eventbus.Subscribe;

import scala.com.webank.doorEvent.DoorEvent;

/**
 * @Auther: george
 * @Date: 18-9-17 20:01
 * @Description:
 */
public class DoorEventListener1 {

    public String doorState = "";

    @Subscribe
    public void listen(DoorEvent event){
        doorState = event.getDoorState();
        System.out.println("门的状态为：" + doorState);
    }

}
