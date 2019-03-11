package fun.trip.components;

import com.artemis.Component;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FullName extends Component {
  private String firstName;
  private String lastName;
  private List<String> middleNames;
  private String nickName;
  private String codeName;

  public FullName(String firstName, String lastName)  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format("%s, %s", this.lastName, this.firstName);
  }
}
