class display{
public synchronized void print(String msg){
System.out.print("["+msg);
try{
Thread.sleep(100);
}
catch(InterruptedException e){
System.out.println(e.getMessage());
}
System.out.println("]");
}

}

class syn extends Thread{
display d;
String msg;

public syn(display d,String msg){
this.d=d;
this.msg=msg;
}
public void run(){
d.print(msg);
}
}
class thread{
public static void main(String args[]){
display d=new display();
syn t1=new syn(d,"Hello");
syn t2=new syn(d,"World");
t1.start();
t2.start();
}


}