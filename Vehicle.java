public abstract class Vehicle 
{
    abstract void move();
    
    protected int yearOfManufacture;
   
    public Vehicle(int yearOfManufacture) 
    {
      this.yearOfManufacture = yearOfManufacture;
    }
      public abstract void accelerate();
}

public class Car extends Vehicle 
{
    void move() 
    {
        System.out.println("Inside the move method of the Car class...");
    }
    public static void main(String args[]) 
    {
        Vehicle obj = new Car();
        obj.move();
    }
}
