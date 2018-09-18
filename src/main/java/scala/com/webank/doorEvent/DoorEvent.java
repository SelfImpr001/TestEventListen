package scala.com.webank.doorEvent;

import java.util.EventObject;

/**
 * @Auther: george
 * @Date: 18-9-12 10:22
 * @Description:
 */
public class DoorEvent extends EventObject {

    private String doorState = "";


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public DoorEvent(Object source,String doorState) {
        super(source);
        this.doorState = doorState;
    }

    public String getDoorState() {
        return doorState;
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState;
    }
}
