package pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PetStore {
    private String username ;
    private String firstname ;
    private String lastanme ;
    private String email ;
    private String phone ;
    private String password ;
}
