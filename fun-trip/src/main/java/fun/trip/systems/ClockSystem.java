package fun.trip.systems;

import com.artemis.Aspect;
import com.artemis.BaseEntitySystem;

public class ClockSystem extends BaseEntitySystem {

  public ClockSystem() {
    super(Aspect.all());
  }

  @Override
  protected void processSystem() {
    System.out.println("ClockSystem: " + world.getDelta());
  }
}
