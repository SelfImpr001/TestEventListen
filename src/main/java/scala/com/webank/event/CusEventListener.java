package scala.com.webank.event;

import java.util.EventListener;

/**
 * @Auther: george
 * @Date: 18-8-27 17:55
 * @Description: 事件监听器，实现java.util.EventListener接口。定义回调方法，将你想要做的事
 *   放到这个方法下,因为事件源发生相应的事件时会调用这个方法。
 */

public class CusEventListener implements MyEventListener {

    //事件发生后的回调方法
    public void fireCusEvent(CusEvent e){
        EventSourceObject eObject = (EventSourceObject)e.getSource();
        System.out.println("cus new name is \""+eObject.getName()+"\"");    }
}
