package exercice3;

public class Car extends Vehicule {
	
	 private String name;

	
	
	// Constructeur sans parmètre
    public Car() {
    super();
    }

    // La fonction qui definit le nom d'une voiture
    public void setDetails(String name, String model, int speed) {
        this.name = name;
        setModel(model);
        setSpeed(speed);
    }

    public void setDetails(String name){
        this.name = name;
    }



    // Implementation de la fonction getDetails

    public String getDetails(String carName) {
        return carName +"," + getModel() + "," + getSpeed();
    }

	public static void main(String[] args) {
		
		Car car1 = new Car();
        car1.setSpeed(125);
        car1.setModel("ford256");
        System.out.println(car1.getDetails("Ford"));
        car1.setDetails("Range Rover", "verlar", 135);
        System.out.println(car1.getDetails("Range Rover"));
		// TODO Auto-generated method stub

	}

}
