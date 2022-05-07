import java.util.*;
public class IterHack{

    static Iterator func(ArrayList mylist){
        Iterator it1=mylist.iterator();
        while(it1.hasNext()){
            Object element = it1.next();
            if(element instanceof Integer | element.equals("###")){
                it1.remove();
            }
        }
        Iterator it2 = mylist.iterator();
        return it2;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }
        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
