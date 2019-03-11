package fun.trip.components;

import com.artemis.Component;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IntakeSpecific extends Component {

  private String name;

  @NonNull
  private List<String> produces;

  @NonNull
  private int monthsInService;
}
