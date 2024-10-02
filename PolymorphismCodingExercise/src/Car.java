public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public String startEngine() {
        return "The " + getClass().getSimpleName() + "'s engine started.";
    }

    public String accelerate() {
        return "The " +  getClass().getSimpleName() + " accelerates.";
    }

    public String brake() {
        return "The " + getClass().getSimpleName() + " applies its brakes.";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The " + getClass().getSimpleName() + "'s engine started, and the car is ready to drive!";
    }

    @Override
    public String accelerate() {
        return "The " +  getClass().getSimpleName() + " accelerates smoothly!";
    }

    @Override
    public String brake() {
        return "The " + getClass().getSimpleName() + " applies its brakes smoothly!";
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The " + getClass().getSimpleName() + "'s engine started, and the car is ready to drive!";
    }

    @Override
    public String accelerate() {
        return "The " +  getClass().getSimpleName() + " accelerates smoothly!";
    }

    @Override
    public String brake() {
        return "The " + getClass().getSimpleName() + " applies its brakes smoothly!";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The " + getClass().getSimpleName() + "'s engine started, and the car is ready to drive!";
    }

    @Override
    public String accelerate() {
        return "The " +  getClass().getSimpleName() + " accelerates smoothly!";
    }

    @Override
    public String brake() {
        return "The " + getClass().getSimpleName() + " applies its brakes smoothly!";
    }
}