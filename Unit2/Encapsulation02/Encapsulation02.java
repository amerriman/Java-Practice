// package galvanize;

import encapsulation02_lib.Proposal;

public class Encapsulation02 {
  public static void main(String[] args){
    Proposal prop = new Proposal();
    // prop.name = "Some thing";
    // System.out.println(prop.name);
    System.out.println(prop.getName());

    prop.setName("Fancy Pants New Name");

    System.out.println(prop.getName());
  }
}
