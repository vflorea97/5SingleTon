package ro.mycode;

public class Bilet {
    private static volatile Bilet instance;
    private String id;

    private Bilet(String id) {
        this.id = id;
    }

    public static Bilet getInstance(String id){
        if (instance == null){}
        synchronized (Bilet.class){
            if (instance == null){
                instance = new Bilet(id);
            }
        }
        return instance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
