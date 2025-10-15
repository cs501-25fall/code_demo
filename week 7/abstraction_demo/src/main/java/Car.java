public class Car {
    private boolean engineReady = false;
    private boolean fuelInjection = false;
    private boolean sparkPlugIgnition = false;
    private boolean rpmStabilization = false;

    // Internal (hidden) complex steps — useful for engineers, not for drivers
    private void injectFuel() {
        System.out.println("Injecting fuel into cylinders...");
        fuelInjection = true;
    }

    private void igniteSparkPlugs() {
        System.out.println("Igniting spark plugs...");
        sparkPlugIgnition = true;
    }

    private void stabilizeRPM() {
        System.out.println("Stabilizing engine RPM...");
        if (sparkPlugIgnition && fuelInjection) {
            rpmStabilization = true;
        }
        if (rpmStabilization){
            engineReady = true;
        } else{
            System.out.println("Injecting fuel into cylinders and then Igniting spark plugs.");
        }
    }

    public void drive() {
        if (!engineReady) {
            System.out.println("Engine not started! Starting pre-process...");
            injectFuel();
            igniteSparkPlugs();
            stabilizeRPM();
            if (!engineReady) {                 // guard: still not ready
                System.out.println("Engine failed to start!");
                return;
            }
        }
        System.out.println("Car is moving!");
    }
}

class UnabstractedCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}