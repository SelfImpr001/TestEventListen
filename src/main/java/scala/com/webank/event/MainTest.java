package scala.com.webank.event;

/**
 * @Auther: george
 * @Date: 18-8-27 17:58
 * @Description:
 */
public class MainTest {
    public static void main(String[] args) {
        EventSourceObject object = new EventSourceObject();
        System.out.println("我原来的名字是：" + object.getName());

        //注册监听器  等下再加一个监听器
        object.addCusListener(new CusEventListener(){
            @Override
            public void fireCusEvent(CusEvent e) {
                System.out.println("CusEventListener method start");
                super.fireCusEvent(e);
            }
        });

        object.addCusListener(new BusEventListener(){
            @Override
            public void fireCusEvent(CusEvent e) {
                System.out.println("BusEventListener method start");
                super.fireCusEvent(e);
            }
        });

        System.out.println("触发事件");
        object.setName("george");
    }
}
