package scala.com.webank.subscribe;

import com.google.common.eventbus.EventBus;

import scala.com.webank.doorEvent.DoorEvent;

/**
 * @Auther: george
 * @Date: 18-9-17 20:10
 * @Description:
 */
public class DoorEventBusTest {

    public static void main(String[] args) throws Exception {
        new DoorEventBusTest().testReceiveEvent();
    }


    public void testReceiveEvent() throws Exception {



        EventBus eventBus = new EventBus("test");
        DoorEventListener listener = new DoorEventListener();
        DoorEventListener1 listener1 = new DoorEventListener1();

        eventBus.register(listener);
        eventBus.register(listener1);

        eventBus.post(new DoorEvent(this,"open"));
        eventBus.post(new DoorEvent(this,"close"));
        eventBus.post(new DoorEvent(this,"open"));

        System.out.println("doorstate:"+listener);
    }
}
