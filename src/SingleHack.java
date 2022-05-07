class SingTon{
    public String str;
    private static SingTon instance;
    private SingTon() {
        this.str = str;
    }
    public static SingTon getSingleInstance(){
        if (instance == null){
            instance = new SingTon();
        }
        return instance;
    }
}

public class SingleHack {
    public static void main(String[] args) {

    }
}
