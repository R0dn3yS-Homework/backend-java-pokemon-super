public class Main {
  public static void main(String[] args) {
    Stats swampertStats = new Stats(100, 110, 90, 85, 90, 60);
    Move moveOne = new Move("Water Pulse", 60, 100, "Water");
    Move moveTwo = new Move("Take Down", 90, 85, "Normal");
    Move[] swampertMoveset = { moveOne, moveTwo };

    Swampert swampert = new Swampert(swampertStats, swampertMoveset);
    System.out.println(swampert.attack(swampert.moveset.moveset[0], swampert));
  }
}
