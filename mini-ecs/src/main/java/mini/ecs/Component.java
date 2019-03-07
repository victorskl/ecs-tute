package mini.ecs;

public class Component {

  public final static int
      POS = 1 << 0,
      VEL = 1 << 1,
      RENDER = 1 << 2;

  public static class Velocity {
    float velx, vely;
  }

  public static class Position {
    float x, y;
  }

  public static class Rendering {
    String name; // for sake of having at least one field inside.
  }
}
