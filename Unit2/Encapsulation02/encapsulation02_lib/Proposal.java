package encapsulation02_lib;
//make a private string, with PUBLIC methods to get and set the name
public class Proposal {
  private String name = "initial name";

  public String getName(){
    return name;
  }

  public void setName(String newName){
    this.name = newName;
  }
}
