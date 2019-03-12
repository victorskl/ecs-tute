package fun.trip.components;

import com.artemis.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentToInstructorRatio extends Component {

  private int ratio;
}
