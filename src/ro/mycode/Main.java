package ro.mycode;

public class Main {

    public static void main(String[] args) {
	Bilet bilet = Bilet.getInstance("bcs0001");

        System.out.println(bilet.getId());

        Bilet bilet1 = Bilet.getInstance("sulor");

        System.out.println(bilet1.getId());
    }
}
