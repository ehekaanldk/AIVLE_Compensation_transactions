package compensation.domain;

import compensation.domain.*;
import compensation.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OutofStock extends AbstractEvent {

    private Long id;
    private Long stock;
    private Long orderid;
}
