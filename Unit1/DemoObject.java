public class DemoObject {

  public int foo;

  public DemoObject(int _foo){
    // this = object instance
    // this.foo = object instance variable
    this.foo = _foo;
  }

  public void printMe(){
    // prints the memory address and type of the object instance
    System.out.println(this);
  }

  public void printFoo(){
    // prints the value of the object instance's foo variable
    System.out.println(this.foo);
  }

  public static void main(String [] args){

    DemoObject objOne = new DemoObject(1);
    objOne.printMe();
    objOne.printFoo();

    DemoObject objTwo = new DemoObject(2);
    objTwo.printMe();
    objTwo.printFoo();
  }
}
