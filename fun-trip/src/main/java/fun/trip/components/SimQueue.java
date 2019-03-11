package fun.trip.components;

import com.artemis.Component;
import java.util.LinkedList;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Data
public class SimQueue extends Component {
  private LinkedList<Integer> entities;

  public SimQueue() {
    entities = new LinkedList<>();
  }
}
