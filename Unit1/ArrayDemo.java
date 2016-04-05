public class ArrayDemo {


  public static void main(String [] args){
    //you have to tell it how many items max will be in the array - and when you run length, it gives you that number, even if there are NO items in the array
    int[] numbers = new int[10];
    String[] starWars = {"Han Solo", "Luke Skywalker", "R2D2"};
    System.out.println(numbers.length);
    //This returns zero
    System.out.println(numbers[4] + " numbers[4]");
    System.out.println(starWars[0] + ", " + starWars[1] + ", " +  starWars[2]);

  }
}

//Java arrays do not have helper methods.
// Java arrays have a specified length.
// Java arrays may only contain a single type.
// Java array literal syntax uses curly braces.
