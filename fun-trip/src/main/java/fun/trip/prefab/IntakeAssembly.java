package fun.trip.prefab;

import com.artemis.Archetype;
import com.artemis.ArchetypeBuilder;
import com.artemis.World;
import fun.trip.components.IntakeSpecific;
import fun.trip.components.Rate;
import fun.trip.components.SimQueue;

public class IntakeAssembly {

  public static Archetype newIntakeWithDefaultComponents(World world) {
    return new ArchetypeBuilder()
            .add(IntakeSpecific.class)
            .add(Rate.class)
            .add(SimQueue.class)
            .build(world);

  }
}
