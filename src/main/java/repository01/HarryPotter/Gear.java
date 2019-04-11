package repository01.HarryPotter;

public class Gear extends Thing implements Magical, Normal {

  @Override
  public void normalUse() {
    System.out.println("using...");
  }

  @Override
  public void magicalUse() {
    System.out.println("doing some magic...");
  }
}
