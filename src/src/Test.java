package src;

public class Test {
	
	public static void main(String[] args) {
		Imobil im = new Imobil();
		im.setAdresa("adresa mea");
		System.out.println(im.toString());
		
		Imobil im1 = new Imobil("str Test", 15.25);
		System.out.println(im1.toString());
		
		im1.setAdresa("alabala");
		System.out.println(im1.toString());
		
		System.out.println();
		System.out.println("Adresa este :" + im1.getAdresa());
		
		
	}

}
