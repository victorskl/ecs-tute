package fun.trip;

import com.artemis.Archetype;
import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import fun.trip.components.IntakeSpecific;
import fun.trip.components.Rate;
import fun.trip.prefab.IntakeAssembly;
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
//        .dependsOn(MyPlugin.class)
        .with(
            new TraineeRecruitmentSystem(),
            new ClockSystem(),
            new TraineeListSystem()
            ).build();


    World world = new World(config);

    // prefabricated intake point assembly with default components
    Archetype intakePointArchetype = IntakeAssembly.newIntakeWithDefaultComponents(world);

    // create intake1 entity using prefabricated intake point archetype
    int intake1 = world.create(intakePointArchetype);

    world.edit(intake1)
        .add(new IntakeSpecific("intake1", new ArrayList<>(), 3))
        .add(new Rate("C", BigDecimal.valueOf(182.5)));

    // sim loop

    float delta = 0;
    while(true) {
      delta++;
      world.setDelta(delta);
      world.process();
      Thread.sleep(500);
    }
  }
}
