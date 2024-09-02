package entities;


import lombok.*;

import java.util.HashSet;
import java.util.Set;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Builder
public class Imagen {

    private Long id;
    private String denominacion;

}
