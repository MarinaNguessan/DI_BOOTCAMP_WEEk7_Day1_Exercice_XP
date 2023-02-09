package exercice4;

public class Laptop extends Computer {
	
	//les proprietes
    private int batteryLife;

    //le constructeur
    public Laptop(String brand, int stockage, int batteryLife, String modele) {
        super(brand, modele, stockage);
        this.batteryLife = batteryLife;
    }


   @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Battery life: " + batteryLife + " hours");
    }

    public void useTouchpad(String action) {
        System.out.println("Using touchpad to " + action);
    }

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop("Dell", 8, 500, "Dell Laptitude");
        laptop.displaySpecs();
        laptop.useTouchpad("scrolling");
		// TODO Auto-generated method stub

	}

}
