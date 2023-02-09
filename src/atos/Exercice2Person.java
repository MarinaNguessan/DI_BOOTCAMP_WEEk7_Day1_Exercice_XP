package atos;

public class Exercice2Person {
	
  // Création des propiétés de la classe
	
	private String name;
    private String lastName;
    private String email;
    private int age;
    
    // Création du constructeur avec paramètre

    public Exercice2Person(String name, String lastName, String email, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    // Création des getters et des setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
	
	public static void main(String[] args) {
		Exercice2Person person = new Exercice2Person("John", "Wick", "john@wick.com", 55);
        System.out.println(person.toString());


	}

}
