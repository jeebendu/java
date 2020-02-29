package src.com.jee.oops;

class Vehicle {
    public String brand = "Ford";
    public void honk() {
      System.out.println("Vehicle, honk!");
    }
  }
  
  class Car extends Vehicle {
    private final String modelName = "Mustang";
    public static void main(String[] args) {
      final String brand = "Car";
      final Car myFastCar = new Car();
      
      myFastCar.honk();
      System.out.println(myFastCar.brand +brand+ " " + myFastCar.modelName);

      Vehicle vehicle = new Car();
      vehicle.honk();
    }
    public void honk() {
      System.out.println("Car, honk!");
    }
  }