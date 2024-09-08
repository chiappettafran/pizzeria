package entities;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "articulos")
@Builder

public class Promocion {

    private Long id;
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    @Builder.Default
    private HashSet<Articulo> articulos = new HashSet<>();
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();
}
