package fun.trip.components;

import com.artemis.Component;
import fun.trip.common.CareerStatus;
import fun.trip.common.Gender;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonSpecific extends Component {
  private LocalDate dob;
  private Gender gender;
  private String rank;
  private LocalDate dateJoined;
  private LocalDate dateLeft;
  private CareerStatus careerStatus;
}
