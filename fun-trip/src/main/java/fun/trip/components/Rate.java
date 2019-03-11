package fun.trip.components;

import com.artemis.Component;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rate extends Component {
  private String type;
  private BigDecimal param;
}
