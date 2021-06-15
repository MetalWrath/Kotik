

import model.Kotik;

public class Application {

	public static void main(String[] args) {

		Kotik cat1 = new Kotik(7, "Barsik", 15, "MYAAAAAAAW");
		Kotik cat2 = new Kotik();
		
		cat1.liveAnotherDay();
		System.out.println("-------------------------------------------------------------\n\n");
		cat2.liveAnotherDay();
		System.out.println("-------------------------------------------------------------\n\n");
		System.out.println("Count of created object: " + Kotik.objectCount);
		System.out.println("-------------------------------------------------------------\n\n");
		System.out.println("Comparison of sounds: " + cat1.getMeow().equals(cat2.getMeow()));
		
	}

}
