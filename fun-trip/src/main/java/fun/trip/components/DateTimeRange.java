package fun.trip.components;

import com.artemis.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DateTimeRange extends Component {

  private LocalDateTime start;

  private LocalDateTime end;
}
