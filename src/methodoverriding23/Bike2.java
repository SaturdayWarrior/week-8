package methodoverriding23;

public class Bike2 extends Vehicle{
    public void run (){
        //defining the same method an in the parent class
        System.out.println("Bike is running safely ");

    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();// creating object
        obj.run();//calling method
    }

}
