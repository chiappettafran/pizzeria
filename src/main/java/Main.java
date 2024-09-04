import entities.*;
import repositories.InMemoryRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        InMemoryRepository<UnidadMedida> repoUnidadMedida = new InMemoryRepository<>();
        InMemoryRepository<Articulo> repoArticulo = new InMemoryRepository<>();
        InMemoryRepository<Imagen> repoImagen = new InMemoryRepository<>();
        InMemoryRepository<Promocion> repoPromocion = new InMemoryRepository<>();

        //Crear como unidad de medida 8 Porciones, 4 porciones y 1litro.
        UnidadMedida ochoPorc = UnidadMedida.builder()
                .denominacion("8 porciones")
                .build();
        UnidadMedida cuatroPorc = UnidadMedida.builder()
                .denominacion("4 porciones")
                .build();
        UnidadMedida unLitro = UnidadMedida.builder()
                .denominacion("1 litro")
                .build();
        repoUnidadMedida.save(ochoPorc);
        repoUnidadMedida.save(cuatroPorc);
        repoUnidadMedida.save(unLitro);

        //Crear imagenes
        Imagen imagen1 = Imagen.builder()
                .denominacion("Pizza Grande Hawaiana")
                .build();
        Imagen imagen2 = Imagen.builder()
                .denominacion("Pizza Grande Napolitana")
                .build();
        Imagen imagen3 = Imagen.builder()
                .denominacion("Pizza Grande Muzza")
                .build();
        Imagen imagen4 = Imagen.builder()
                .denominacion("Pizza Chica Hawaiana")
                .build();
        Imagen imagen5 = Imagen.builder()
                .denominacion("Pizza Chica Napolitana")
                .build();
        Imagen imagen6 = Imagen.builder()
                .denominacion("Pizza Chica Muzza")
                .build();
        Imagen imagen7 = Imagen.builder()
                .denominacion("Cerveza Andes")
                .build();
        Imagen imagen8 = Imagen.builder()
                .denominacion("Cerveza Quilmes")
                .build();
        Imagen imaHappy1 = Imagen.builder()
                .denominacion("Happy Hour")
                .build();
        Imagen imaHappy2 = Imagen.builder()
                .denominacion("Happy Hour")
                .build();
        Imagen verano1 = Imagen.builder()
                .denominacion("Promo Verano")
                .build();
        Imagen verano2 = Imagen.builder()
                .denominacion("Promo Verano")
                .build();
        Imagen invierno1 = Imagen.builder()
                .denominacion("Promo Invierno")
                .build();
        Imagen invierno2 = Imagen.builder()
                .denominacion("Promo Invierno")
                .build();
        repoImagen.save(imagen1);
        repoImagen.save(imagen2);
        repoImagen.save(imagen3);
        repoImagen.save(imagen4);
        repoImagen.save(imagen5);
        repoImagen.save(imagen6);
        repoImagen.save(imagen7);
        repoImagen.save(imagen8);


        //Crear Articulos
        Articulo cerveza1 = Articulo.builder()
                .denominacion("Cerveza Andes")
                .precioVenta(5000D)
                .precioCompra(3000D)
                .stockActual(65)
                .stockMaximo(150)
                .imagen(imagen7)
                .unidadMedida(unLitro)
                .build();
        Articulo cerveza2 = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .precioVenta(6500D)
                .precioCompra(4000D)
                .stockActual(45)
                .stockMaximo(150)
                .imagen(imagen8)
                .unidadMedida(unLitro)
                .build();

        Articulo pizzaChica1 = Articulo.builder()
                .denominacion("Pizza Chica Hawaiana")
                .precioVenta(4500D)
                .precioCompra(2750D)
                .stockActual(20)
                .stockMaximo(40)
                .imagen(imagen4)
                .unidadMedida(cuatroPorc)
                .build();
        Articulo pizzaChica2 = Articulo.builder()
                .denominacion("Pizza Chica Napolitana")
                .precioVenta(4700D)
                .precioCompra(2750D)
                .stockActual(25)
                .stockMaximo(35)
                .imagen(imagen5)
                .unidadMedida(cuatroPorc)
                .build();
        Articulo pizzaChica3 = Articulo.builder()
                .denominacion("Pizza Chica Muzza")
                .precioVenta(3800D)
                .precioCompra(2300D)
                .stockActual(40)
                .stockMaximo(75)
                .imagen(imagen6)
                .unidadMedida(cuatroPorc)
                .build();
        Articulo pizzaGrande1 = Articulo.builder()
                .denominacion("Pizza Grande Hawaiana")
                .precioVenta(8750D)
                .precioCompra(5500D)
                .stockActual(15)
                .stockMaximo(35)
                .imagen(imagen1)
                .unidadMedida(ochoPorc)
                .build();
        Articulo pizzaGrande2 = Articulo.builder()
                .denominacion("Pizza Grande Napolitana")
                .precioVenta(9200D)
                .precioCompra(5500D)
                .stockActual(17)
                .stockMaximo(35)
                .imagen(imagen2)
                .unidadMedida(ochoPorc)
                .build();
        Articulo pizzaGrande3 = Articulo.builder()
                .denominacion("Pizza Grande Muzza")
                .precioVenta(7500D)
                .precioCompra(4600D)
                .stockActual(30)
                .stockMaximo(60)
                .imagen(imagen3)
                .unidadMedida(ochoPorc)
                .build();


        //Creando promociones
        Promocion happyHour = Promocion.builder()
                .deominacion("Promo Happy Hour Septiembre")
                .fechaDesde(LocalDate.of(2024, 9, 1))
                .fechaHasta(LocalDate.of(2024, 9, 30))
                .horaDesde(LocalTime.of(18, 30))
                .horaHasta(LocalTime.of(21, 30))
                .descripcionDescuento("Happy Primavera 20%off: Hawaiana 8porc + Muzza 8porc + Quilmes")
                .tipoPromocion(TipoPromocion.happyHour)
                .build();
        happyHour.getPromoImagen().add(imaHappy1);
        happyHour.getPromoImagen().add(imaHappy2);
        happyHour.getArticulos().add(pizzaGrande1);
        happyHour.getArticulos().add(pizzaGrande3);
        happyHour.getArticulos().add(cerveza2);
        double precio = 0;
        for (Articulo articulo : happyHour.getArticulos()) {
            precio += articulo.getPrecioVenta();
            articulo.getPromocionesArticulo().add(happyHour);
        }
        happyHour.setPrecioPromocional(precio*0.8);

        Promocion veranoPromo = Promocion.builder()
                .deominacion("Promo Verano 2024/2025")
                .fechaDesde(LocalDate.of(2024, 12, 1))
                .fechaHasta(LocalDate.of(2025, 2, 28))
                .horaDesde(LocalTime.of(0, 0))
                .horaHasta(LocalTime.of(23, 59))
                .descripcionDescuento("Verano hot combo 25%off: Hawaiana chica + Napo grande + Quilmes 1lt + Andes 1lt")
                .tipoPromocion(TipoPromocion.Verano)
                .build();
        veranoPromo.getPromoImagen().add(verano1);
        veranoPromo.getPromoImagen().add(verano2);
        veranoPromo.getArticulos().add(pizzaChica1);
        veranoPromo.getArticulos().add(pizzaGrande2);
        veranoPromo.getArticulos().add(cerveza1);
        veranoPromo.getArticulos().add(cerveza2);
        precio = 0;
        for (Articulo articulo : veranoPromo.getArticulos()) {
            precio += articulo.getPrecioVenta();
            articulo.getPromocionesArticulo().add(veranoPromo);
        }
        veranoPromo.setPrecioPromocional(precio*0.75);

        Promocion inviernoPromo = Promocion.builder()
                .deominacion("Promo Invierno 2025")
                .fechaDesde(LocalDate.of(2025, 6, 1))
                .fechaHasta(LocalDate.of(2025, 8, 31))
                .horaDesde(LocalTime.of(0, 0))
                .horaHasta(LocalTime.of(23, 59))
                .descripcionDescuento("Promos que hielan la sangre 45%off!!!!!!!!!: Hawaiana + Muzza chica + Quilmes 1lt")
                .tipoPromocion(TipoPromocion.Invierno)
                .build();
        inviernoPromo.getPromoImagen().add(invierno1);
        inviernoPromo.getPromoImagen().add(invierno2);
        inviernoPromo.getArticulos().add(pizzaGrande1);
        inviernoPromo.getArticulos().add(pizzaChica3);
        inviernoPromo.getArticulos().add(cerveza2);
        precio = 0;
        for (Articulo articulo : inviernoPromo.getArticulos()) {
            precio += articulo.getPrecioVenta();
            articulo.getPromocionesArticulo().add(inviernoPromo);
        }
        inviernoPromo.setPrecioPromocional(precio*0.55);

        repoArticulo.save(cerveza1);
        repoArticulo.save(cerveza2);
        repoArticulo.save(pizzaChica1);
        repoArticulo.save(pizzaChica2);
        repoArticulo.save(pizzaChica3);
        repoArticulo.save(pizzaGrande1);
        repoArticulo.save(pizzaGrande2);
        repoArticulo.save(pizzaGrande3);

        repoPromocion.save(happyHour);
        repoPromocion.save(veranoPromo);
        repoPromocion.save(inviernoPromo);






    }

}
