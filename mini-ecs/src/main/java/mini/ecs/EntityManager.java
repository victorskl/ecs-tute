package mini.ecs;

public class EntityManager {

  public int flag[];

  public Component.Position pos[];

  public Component.Velocity vel[];

  public Component.Rendering rendering[];

  public final int size;

  public EntityManager(int size) {
    System.out.println("initialize entity manager with entity holder size: " + size);

    this.size = size;
    pos = new Component.Position[size];
    vel = new Component.Velocity[size];
    rendering = new Component.Rendering[size];
    flag = new int[size];
  }

  public int createEntity(int flag) {
    System.out.println("creating a new entity with random flag: " + flag);

    for (int i = 0; i < size; i++) {
      if (this.flag[i] == 0) {
        this.flag[i] = flag;
        if ((flag & Component.POS) > 0) {
          pos[i] = new Component.Position();
        }
        if ((flag & Component.VEL) > 0) {
          vel[i] = new Component.Velocity();
        }
        if ((flag & Component.RENDER) > 0) {
          rendering[i] = new Component.Rendering();
        }
        return i;
      }
    }
    return -1;
  }
}
