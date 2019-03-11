package fun.trip.systems;

import com.artemis.Aspect;
import com.artemis.Entity;
import com.artemis.systems.EntityProcessingSystem;
import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;
import com.devskiller.jfairy.producer.person.PersonProperties;
import fun.trip.components.FullName;
import fun.trip.components.IntakeSpecific;
import fun.trip.components.Rate;
import fun.trip.components.SimQueue;
import java.math.BigDecimal;

public class TraineeRecruitmentSystem extends EntityProcessingSystem {

  public TraineeRecruitmentSystem() {
    super(Aspect.all(Rate.class).all(IntakeSpecific.class).all(SimQueue.class));
  }

  @Override
  protected void process(Entity e) {

    Rate rate = e.getComponent(Rate.class);
    SimQueue queue = e.getComponent(SimQueue.class);
    IntakeSpecific intakeSpecific = e.getComponent(IntakeSpecific.class);

    System.out.println("intake name: " + intakeSpecific.getName());
    System.out.println("rate.getParam(): " + rate.getParam());

    if (rate.getParam().doubleValue() > 0) {

      BigDecimal intakeRate = BigDecimal.valueOf(365D).divide(rate.getParam());

      System.out.println("intakeRate: " + intakeRate);

      if (world.getDelta() % intakeRate.doubleValue() == 0) {

        int trainee = world.create();

        Fairy fairy = Fairy.create();
        Person person = fairy.person(PersonProperties.ageBetween(18, 35));

        world.edit(trainee).add(new FullName(person.getFirstName(), person.getLastName()));

        queue.getEntities().add(trainee);

      }

    }

    System.out.println("size: " + queue.getEntities().size());

  }
}
