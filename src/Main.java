import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//@Retention(RetentionPolicy.RUNTIME)
//@interface MyAnno{
//    String title();
//    int count();
//}

public class Main {
//    @MyAnno(title = "Class - Main:", count = 10)
    public static void main(String args[]){
//        Object meta=new Object();
        new MyWindowChat();
//        MyWindow2 myWindow2=new MyWindow2();
//        try{
//            Class<?> c= meta.getClass();
//            Method m= c.getMethod("toCharArray");
//            System.out.println(m);
//            MyAnno myAnno=m.getAnnotations(Object.class);
//        }catch (NoSuchMethodException e) {
//            System.out.println("Throw the exception - NoSuchMethodException.");
//            e.printStackTrace();
//        }catch (RuntimeException e){
//            System.out.println("Throw the exception.");
//            e.getStackTrace();
//        }

    }
}
