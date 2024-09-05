package entities;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString (exclude = "articulos")
@Builder
public class Promocion {
    private Long id;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    @Builder.Default
    private HashSet<Imagen> promoImagen = new HashSet<>();

    @Builder.Default
    private HashSet<Articulo> articulos = new HashSet<>();
}
