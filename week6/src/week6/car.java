package week6;

public class car {
	private String brand;
    private String model;
    private int year;

    // Constructors
    public car() { }
    public car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year  = year;
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear()     { return year;  }

    // Setters
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year)      { this.year  = year;  }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car("Toyota", "Camry", 2021);
        car c2 = new car();
        c2.setBrand("Tesla");
        c2.setModel("Model 3");
        c2.setYear(2024);

        System.out.println(c1); 
        System.out.println(c2); 
        System.out.println("c1 brand: " + c1.getBrand());
		

	}

}
