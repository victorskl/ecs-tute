package fun.trip.systems;

import com.artemis.ArchetypeBuilder;
import com.artemis.Aspect;
import com.artemis.Entity;
import com.artemis.systems.EntityProcessingSystem;
import com.artemis.systems.IteratingSystem;
import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;
import com.devskiller.jfairy.producer.person.PersonProperties;
import com.devskiller.jfairy.producer.person.PersonProperties.PersonProperty;
import fun.trip.components.FullName;
import fun.trip.components.IntakeSpecific;
import fun.trip.components.Rate;
import fun.trip.components.SimName;
import fun.trip.components.SimQueue;
import java.math.BigDecimal;
import java.util.LinkedList;

public class TraineeRecruitmentSystem extends EntityProcessingSystem {

  public TraineeRecruitmentSystem() {
    super(Aspect.all(Rate.class).all(IntakeSpecific.class).all(SimQueue.class));
  }

  @Override
  protected void process(Entity e) {

    Rate rate = e.getComponent(Rate.class);
    System.out.println(rate.getParam());

    if(rate.getParam() == null) {
      rate.setParam(new BigDecimal(2));
    }

    SimQueue queue = e.getComponent(SimQueue.class);


    //if(world.getDelta() % rate.getParam() == 0) {

      int trainee = world.create();

      Fairy fairy = Fairy.create();


      fairy.creditCard();
      Person person = fairy.person(PersonProperties.ageBetween(18,35));

      world.edit(trainee).add(new FullName(person.getFirstName(), person.getLastName()));


      if(queue.getEntities() == null) {
        queue.setEntities(new LinkedList<>());
      }
      queue.getEntities().add(trainee);
  //  }

    System.out.println("size: " + queue.getEntities().size());


   // rate.setParam(rate.getParam().pow(2));
    e.getComponent(IntakeSpecific.class);

    SimName name = e.getComponent(SimName.class);

    System.out.println(name);
    if(name.getName() == null) {
      name.setName("");
    }
    System.out.println(name);

//    name.setName(name.getName() + ".");
//    System.out.println(name);

    System.out.println("Rate: " + rate.getParam());
    System.out.println(e);
    System.out.println(world.getDelta());

  }


}
