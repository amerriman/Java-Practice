public class Car {

  public int miles = 0;

  public int miles() {
    return 12;
  }

  public static void main(String[] args){
    Car car = new Car();
    // miles variable
    System.out.println( car.miles ); // prints 0
    // miles() method
    System.out.println( car.miles() ); // prints 12
  }
}

// In Java, a method is a field that cannot be referenced, only invoked. If you call a method name without parenthesis, it will think it is a variable. This allows us to have variables that share the same name as a method, Java will differentiate:

