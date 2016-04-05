public class Rectangle {

  public int width;
  public int length;

  public Rectangle(int width, int length){
    this.width = width;
    this.length = length;
  }

  public int area(){
    return this.width * this.length;
  }

  public static void main(String [] args){

    Rectangle myRectangle = new Rectangle(100, 100);

    System.out.println(myRectangle.area());

  }

}
