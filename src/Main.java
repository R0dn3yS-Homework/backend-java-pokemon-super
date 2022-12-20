public class Main {
  public static void main(String[] args) {
    Pokemon emolga = new Pokemon("Emolga", "Electric", "Flying");
    Pokemon excadrill = new Pokemon("Excadrill", "Ground", "Steel");
    Pokemon swampert = new Pokemon("Swampert", "Water", "Ground");

    System.out.println(emolga.Defend(new Type("Ground")));
    System.out.println(swampert.Defend(new Type("Grass")));
  }
}
