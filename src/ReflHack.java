import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student123{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }

}

public class ReflHack {

    public static void main(String[] args){
        Class<Student123> student = Student123.class ;
        Method[] methods = student.getDeclaredMethods();
        List<String> methodList = new ArrayList<>();
        for (Method i: methods){
            String metStr = i.getName();
            methodList.add(metStr);
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}