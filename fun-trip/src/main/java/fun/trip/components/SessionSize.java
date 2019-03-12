package fun.trip.components;

import com.artemis.Component;
import java.time.temporal.ChronoUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionSize extends Component {

  private int minWaitTime;

  private int maxWaitTime;

  private ChronoUnit timeUnit;
}
