package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;


@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private HashSet<Imagen> promoImagen;
    private HashSet<Articulo> promociones;
}
