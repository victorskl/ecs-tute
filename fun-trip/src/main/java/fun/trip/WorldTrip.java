package fun.trip;

import com.artemis.Archetype;
import com.artemis.ArchetypeBuilder;
import com.artemis.Entity;
import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import fun.trip.components.IntakeSpecific;
import fun.trip.components.Rate;
import fun.trip.components.SimName;
import fun.trip.components.SimQueue;
import fun.trip.systems.ClockSystem;
import fun.trip.systems.TraineeListSystem;
import fun.trip.systems.TraineeRecruitmentSystem;
import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTrip {

  public static void main(String[] args) throws InterruptedException {
    new WorldTrip().start();
  }

  private void start() throws InterruptedException {


    WorldConfiguration config = new WorldConfigurationBuilder()
      //  .dependsOn(MyPlugin.class)
        .with(
            new TraineeRecruitmentSystem(), new ClockSystem(), new TraineeListSystem()
            ).build();


    World world = new World(config);

    Entity e = world.createEntity();
    System.out.println(e.getId());
    System.out.println(world.createEntity().getId());
    System.out.println(world.createEntity().getId());
    System.out.println(world.createEntity().getId());
    System.out.println(world.createEntity().getId());
    System.out.println(world.createEntity().getId());

    Archetype intakePointArchtype =
        new ArchetypeBuilder()
            .add(IntakeSpecific.class)
            .add(Rate.class)
            .add(SimName.class)
            .add(SimQueue.class)
            .build(world);

    int bwcId = world.create(intakePointArchtype);

    world.edit(bwcId)
        .add(new IntakeSpecific(new ArrayList<>(), 3))
        .add(new Rate("C", BigDecimal.valueOf(2)))
        .add(new SimName("bwc")).add( new SimQueue());

    float delta = 0;
    while(true) {
      delta++;
      world.setDelta(delta);
      world.process();
      Thread.sleep(500);
    }
  }
}
