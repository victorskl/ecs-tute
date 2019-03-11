package fun.trip.components;

import com.artemis.Component;
import fun.trip.common.TraineeStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TraineeSpecific extends Component {
  private Integer currentFacility;
  private Integer previousBuffer;
  private Integer currentPosition;
  private TraineeStatus traineeStatus;
}
