package exercice3;

public class Vehicule {
	
	 private String model;
	    private int speed;

	    public Vehicule() {
	        super();
	    }

	    public Vehicule(String model, int speed) {
	        this.model = model;
	        this.speed = speed;
	    }

	    public String getModel() {
	        return this.model;
	    }

	    public int getSpeed() {
	        return this.speed;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
