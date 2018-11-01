package org.SpLNinth.EventListen.example2;  
  
public class MainTest {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        EventSourceObject object = new EventSourceObject();  
        //注册监听器  
        object.addCusListener(new CusEventListener(){  
            @Override  
            public void fireCusEvent(CusEvent e) {  
                super.fireCusEvent(e);  
            }  
        });  
        //触发事件  
        object.setName("eric");  
        object.setName("e1ric");  
        object.setName("er2ic");  
        object.setName("eri3c");  
    }  
}  
 