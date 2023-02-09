package atos;

public class Exercice1MyPoint {
	
	   
	// Déclaration des propiétés
	    private int x;
	    private int y;

	    // Création du  constructeur sans parametre
	    public Exercice1MyPoint() {
	        super();
	        x = 0;
	        y = 0;
	    }

	    //Création du constructeur avec parametre
	    public Exercice1MyPoint(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    // Création des getters et des setters

	    public int getX() {
	        return this.x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return this.y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    // Création du getter et du setter xy
	    public void setXY(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public int[] getXY() {
	        int[] result = new int[2];
	        result[0] = x;
	        result[1] = y;
	        return result;
	    }

	    public double distance(int x, int y){
	        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) ;
	    }

	    public double distance(Exercice1MyPoint given){
	        return Math.sqrt(Math.pow(this.x - given.x, 2) + Math.pow(this.y - given.y, 2)) ;
	    }

	    public double distance(){
	        return Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.y - 0, 2)) ;
	    }
	
	

	public static void main(String[] args) {
		
		/* Affichage de la distance du point*/
		
		Exercice1MyPoint p1 = new Exercice1MyPoint(3,4);
        System.out.println("La distance du point est:" + p1.distance(5,6));
		
	}

}
