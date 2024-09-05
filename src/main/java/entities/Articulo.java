package entities;

import lombok.*;

import java.util.HashSet;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString (exclude = "promocionesArticulo")
public class Articulo {
    private Long id;
    private String denominacion;
    private Double precioVenta;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Imagen imagen;
    private UnidadMedida unidadMedida;

    @Builder.Default
    private HashSet<Promocion> promocionesArticulo = new HashSet<>();
}
