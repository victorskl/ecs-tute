package mini.ecs;

import java.util.Arrays;

public class GameContainer {

  public static void main(String[] args) {
    new GameContainer();
  }

  EntityManager manager;

  Systems.Render renderingSystem;

  Systems.Velocity velocitySystem;

  GameContainer() {

    manager = new EntityManager(5);
    printState();

    renderingSystem = new Systems.Render();
    velocitySystem = new Systems.Velocity();

    System.out.println("POS: " + Component.POS + ", VEL: " + Component.VEL + ", RDR: " + Component.RENDER);
    System.out.println();

    //--

    int id = manager.createEntity(Component.POS | Component.VEL | Component.RENDER); // flag=7
    System.out.println("ENTITY_ID: " + id);

    if (id > -1) {
      manager.pos[id].x = 10;
      manager.pos[id].y = 10;
      manager.vel[id].velx = 1;
      manager.vel[id].vely = 1;
      manager.rendering[id].name = "player";
    }

    printState();

    //--

    id = manager.createEntity(Component.POS | Component.RENDER); // flag=5
    System.out.println("ENTITY_ID: " + id);

    if (id > -1) {
      manager.pos[id].x = 0;
      manager.pos[id].y = 0;
      manager.rendering[id].name = "tree";
    }

    printState();

    //--

    startGameLoop();
  }

  void startGameLoop() {

    for(int i = 0; i < 10; i++) {

      velocitySystem.update(manager);

      renderingSystem.update(manager);

      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  void printState() {

    System.out.println("RNG_FLAG state: " + Arrays.toString(manager.flag));
    System.out.println("COMP_POS state: " + Arrays.toString(manager.pos));
    System.out.println("COMP_VEL state: " + Arrays.toString(manager.vel));
    System.out.println("COMP_REN state: " + Arrays.toString(manager.rendering));

    System.out.println();
  }
}
