package scala.com.webank.doorEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: george
 * @Date: 18-9-12 10:44
 * @Description:
 */
public class DoorSourceManager {
    private List<DoorEventListener> doorEventListeners;

    /**
     * 向监听器集合中添加事件
     * @param doorEventListener
     */
    public void addDoorListener(DoorEventListener doorEventListener){
        if(doorEventListeners == null){
            doorEventListeners = new ArrayList<DoorEventListener>();
        }
        doorEventListeners.add(doorEventListener);
    }

    /**
     * 向监听器集合中删除事件
     * @param doorEventListener
     */
    public void removeDoorListener(DoorEventListener doorEventListener){
        if(doorEventListeners == null){
            return;
        }
        doorEventListeners.remove(doorEventListener);
    }

    /**
     * 触发开门事件
     */
    public void fireOpen(){
        if(doorEventListeners == null) return;
        DoorEvent doorEvent = new DoorEvent(this,"open");
        notifyListeners(doorEvent);
    }

    /**
     * 触发关门事件
     */
    public void fireClose(){
        if(doorEventListeners == null) return;
        DoorEvent doorEvent = new DoorEvent(this,"close");
        notifyListeners(doorEvent);
    }

    /**
     * 通知所有的doorEventListener
     */
    private void notifyListeners(DoorEvent event){
        Iterator iter =  doorEventListeners.iterator();
        while(iter.hasNext()){
            DoorEventListener listener = (DoorEventListener)iter.next();
            listener.handleDoorEvent(event);
        }
    }
}
