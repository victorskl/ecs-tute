package fun.trip.components;

import com.artemis.Component;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DateRange extends Component {

  private LocalDate start;

  private LocalDate end;
}
