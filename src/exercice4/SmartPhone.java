package exercice4;

public class SmartPhone extends Computer{
	
	 private String operatingSystem;

	    //le constructeur
	    public SmartPhone(String brand, int stockage,String modele) {
	        super(brand, modele, stockage);
	        this.operatingSystem = operatingSystem;
	    }

	    
	    @Override
	    public void displaySpecs() {
	        super.displaySpecs();
	        System.out.println("Operating System: " + operatingSystem);
	    }

	    public void makeCall(String phoneNumber) {
	        String brand = null;
	        System.out.println("Calling " + phoneNumber + " using " + brand + " smartphone");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
