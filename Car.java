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
