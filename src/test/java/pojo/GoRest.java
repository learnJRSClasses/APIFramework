package pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GoRest {
    private String name ;
    private String email ;
    private String status ;
    private String gender ;
}
