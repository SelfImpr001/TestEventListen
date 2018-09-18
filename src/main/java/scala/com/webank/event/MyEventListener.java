package scala.com.webank.event;

import java.util.EventListener;

/**
 * @Auther: george
 * @Date: 18-8-29 16:23
 * @Description:
 */
public interface MyEventListener extends EventListener {
    public void fireCusEvent(CusEvent e);
}
