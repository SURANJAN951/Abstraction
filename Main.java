abstract class vehicle{ //if in a class there is any abstract method or method without body then we declare
                        //that class as abstract and we can make reference of abstract class:-
                        // - vehicle obj = new Car();
                       // but you can't make object of abstract class- vehicle obj = new vehicle
    abstract public void run(); //Abstraction is a method which has no body, has only implementation.
        //System.out.println("Vehicle is running"); There is no use of this statement.

    abstract public void stand(); //Abstraction is a method which has no body, has only implementation.
        //System.out.println("The vehicle is standing"); Also this statement is not in use.

    public void landing(){
        System.out.println("vehicle is landing");
    }
}


class Car extends vehicle{
    public void run(){

        System.out.println("Car is running");
    }
    public void stand(){

        System.out.println("Car is standing");
    }
    public void alert(){
        System.out.println("your vehicle is smoking");
    }
}


class Bike extends vehicle{
    public void run(){
        System.out.println("Bike is running");
    }
    public void stand(){
        System.out.println("The Bike is standing");
    }
}

class Ground{
    public void Earth(vehicle ref){ //here we are passing reference of vehicle(parent)
        ref.run(); // here we are invoking run method by using reference of parent vehicle
        ref.stand();// see the line 54 and 55 we are passing reference of Car and Bike in the ref of vehicle,
        //so after running this it will go for run and stand method which are present in class Car and Bike.

// This is called polymorphism because we are calling only one time run & stand method but this is executing from
// both the classes i.e, from class Car and Bike, Means one is to many...

        System.out.println("---------------------------------");
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Let's see what happens");
        System.out.println("-------------------------");
        Car obj1=new Car();
        Bike obj2=new Bike();
        vehicle ref=new Car();
        Ground obj3=new Ground();
        obj3.Earth(obj1);
        obj3.Earth(obj2);
      //ref.alert();//Error because you can't make obj of abstract classes but can make reference.
        // for this you can use downCasting  (ciggrette, papa behaviour) ((car)ref).landing();
        obj1.landing();
        ((Car)ref).alert();
    }
}