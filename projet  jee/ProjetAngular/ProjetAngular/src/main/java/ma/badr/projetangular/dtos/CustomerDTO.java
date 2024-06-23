package ma.badr.projetangular.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
