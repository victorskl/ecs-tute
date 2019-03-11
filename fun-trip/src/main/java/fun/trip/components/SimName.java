package fun.trip.components;

import com.artemis.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
@NoArgsConstructor
public class SimName extends Component {
  private String name;
}
