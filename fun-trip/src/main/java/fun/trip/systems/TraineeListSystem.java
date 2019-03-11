package fun.trip.systems;

import com.artemis.Aspect;
import com.artemis.Entity;
import com.artemis.systems.EntityProcessingSystem;
import fun.trip.components.FullName;

public class TraineeListSystem extends EntityProcessingSystem {


  public TraineeListSystem() {
    super(Aspect.all(FullName.class));
  }

  @Override
  protected void process(Entity e) {

    FullName name = e.getComponent(FullName.class);

    System.out.println("Trainee: " + name);

  }
}
