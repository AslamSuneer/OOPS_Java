import java.util.*;
class check{
    void test(){
        try{
            int n=100/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error found!");
             System.out.println(e);
        }
        finally{
             System.out.println("Program continues...");
        }
    }
}
class checkthrow{
    void test2()throws ArithmeticException{
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Age");
         int age=sc.nextInt();
         if(age<18)
         throw new ArithmeticException("Access Denied!");
         else
          System.out.println("Access Granted");
    }
}
class exp{
    public static void main(String args[]){
        check ob1=new check();
        checkthrow ob2=new checkthrow();
        ob1.test();
        ob2.test2();
    }
}
