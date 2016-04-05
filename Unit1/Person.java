public class Person {

  public String first;
  public String last;

  public Person(String first, String last){
    this.first = first;
    this.last = last;
  }

// using this is better practice, though not totally neceessary
  public String fullName(){
    return this.first + " " + this.last;
  }

  public static void main(String [] args){
    // We used Person as a type for our variable rambo, just like we can use int or String.

    Person rambo = new Person("Sylvester", "Stallone");

    rambo.fullName();

    System.out.println(rambo.fullName());

  }

}
