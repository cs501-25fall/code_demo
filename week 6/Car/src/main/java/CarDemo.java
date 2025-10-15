class Car {
    private String model;
    private int year;
    private int mileage;

    // 1st Constructor — make a *brand-new car*
    Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.mileage = 0; // new car always starts with zero mileage
        System.out.println("New " + model + " (" + year + ") created!");
    }

    // 2nd Constructor — *restore* a used car (e.g., loaded from file or DB)
    Car(String model, int year, int mileage) {
        this.model = model;
        this.year = year;
        this.mileage = mileage; // load existing mileage
        System.out.println("Used " + model + " (" + year + "), mileage: " + mileage);
    }

    void drive(int km) {
        mileage += km;
        System.out.println(model + " drove " + km + " km. Total: " + mileage);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car newCar = new Car("Toyota", 2025);              // brand-new car
        Car usedCar = new Car("Honda", 2020, 45000);  // restored used car

        newCar.drive(100);
        usedCar.drive(200);
    }
}


