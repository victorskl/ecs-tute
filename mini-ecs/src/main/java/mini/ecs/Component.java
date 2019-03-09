package mini.ecs;

public class Component {

  public final static int POS = 1 << 0, VEL = 1 << 1, RENDER = 1 << 2; // i.e. POS: 1, VEL: 2, RDR: 4

  public static class Velocity {

    float velx, vely;

    public String toString() {
      return ("(" + velx + "," + vely + ")");
    }
  }

  public static class Position {

    float x, y;

    public String toString() {
      return ("(" + x + "," + y + ")");
    }
  }

  public static class Rendering {

    String name; // for sake of having at least one field inside.

    public String toString() {
      return name;
    }
  }
}
