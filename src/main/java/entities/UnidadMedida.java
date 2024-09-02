package entities;


import lombok.*;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Builder
public class UnidadMedida {

    private Long id;
    private String denominacion;

}
