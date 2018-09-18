package scala.com.webank.event;

import java.util.EventObject;

/**
 * @Auther: george
 * @Date: 18-8-27 17:53
 * @Description: 事件类,用于封装事件源及一些与事件相关的参数.
 */
public class CusEvent extends EventObject {
    private static final long serialVersionUID = 1L;
    private Object source;

    public CusEvent(Object source){
        super(source);
        this.source = source;
    }

    @Override
    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }
}
