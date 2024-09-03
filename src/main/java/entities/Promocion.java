package entities;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString (exclude = "promociones")
@Builder
public class Promocion {
    private long id;
    private String deominacion;
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
    private HashSet<Articulo> promociones = new HashSet<>();
}
