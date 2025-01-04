package automation.data.compare.datacomponents;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = {"env"})
public class BaseDomainComponents {

    private String env;
}
