import entities.*;
import repositories.InMemoryRepository;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        InMemoryRepository<UnidadMedida> repositoryUnidadMedidad = new InMemoryRepository<>();

       //Crear como unidad de medida 8 Porciones, 4 porciones y 1litro.
        UnidadMedida porciones8 = UnidadMedida.builder()
                .denominacion("8 Porciones")
                .build();
        UnidadMedida porciones4 = UnidadMedida.builder()
                .denominacion("4 Porciones")
                .build();
        UnidadMedida litro1 = UnidadMedida.builder()
                .denominacion("1 Litro")
                .build();


        repositoryUnidadMedidad.save(porciones8);
        repositoryUnidadMedidad.save(porciones4);
        repositoryUnidadMedidad.save(litro1);

        //Suponiendo que tenemos 3 variedades de Pizzas y tamaños
            //
        InMemoryRepository<Imagen> repositoryImagen = new InMemoryRepository<>();
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

        Imagen imahappy1 = Imagen.builder()
                .denominacion("Happy Hour 1")
                .build();
        Imagen imahappy2 = Imagen.builder()
                .denominacion("Happy Hour 2")
                .build();

        Imagen verano1 = Imagen.builder()
                .denominacion("Verano 1")
                .build();
        Imagen verano2 = Imagen.builder()
                .denominacion("Verano 2")
                .build();
        Imagen invierno1 = Imagen.builder()
                .denominacion("Invierno 1")
                .build();
        Imagen invierno2 = Imagen.builder()
                .denominacion("Invierno 2")
                .build();

//        Imagen cerveza1 = Imagen.builder()
//                .denominacion("Cerveza Andes")
//                .build();
//        Imagen cerveza2 = Imagen.builder()
//                .denominacion("Cerveza Quilmes")
//                .build();

        repositoryImagen.save(imagen1);
        repositoryImagen.save(imagen2);
        repositoryImagen.save(imagen3);
        repositoryImagen.save(imagen4);
        repositoryImagen.save(imagen5);
        repositoryImagen.save(imagen6);
        repositoryImagen.save(imagen7);
        repositoryImagen.save(imagen8);
        repositoryImagen.save(imahappy1);
        repositoryImagen.save(imahappy2);
        repositoryImagen.save(verano1);
        repositoryImagen.save(verano2);
        repositoryImagen.save(invierno1);
        repositoryImagen.save(invierno2);


        //-	Crear los siguientes Artículos   y relacionarlos con sus respectivas imágenes:

        InMemoryRepository<Articulo> repositoryArticulo = new InMemoryRepository<>();
        Articulo pizzaGrande1 = Articulo.builder()
                .denominacion("Pizza Grande Hawaiana")
                .precioVenta(5000D)
                .precioCompra(3000D)
                .stockActual(80)
                .stockMaximo(100)
                .imagen(imagen1)
                .unidadMedida(porciones8)
                .build();

        Articulo pizzaChica1 = Articulo.builder()
                .denominacion("Pizza Chica Hawaiana")
                .precioVenta(4000D)
                .precioCompra(2000D)
                .stockActual(100)
                .stockMaximo(150)
                .imagen(imagen4)
                .unidadMedida(porciones4)
                .build();

        Articulo pizzaGrande2 = Articulo.builder()
                .denominacion("Pizza Grande Napolitana")
                .precioVenta(4500D)
                .precioCompra(3100D)
                .stockActual(75)
                .stockMaximo(110)
                .imagen(imagen2)
                .unidadMedida(porciones8)
                .build();

        Articulo pizzaChica2 = Articulo.builder()
                .denominacion("Pizza Chica Napolitana")
                .precioVenta(3500D)
                .precioCompra(1500D)
                .stockActual(120)
                .stockMaximo(175)
                .imagen(imagen5)
                .unidadMedida(porciones4)
                .build();

        Articulo pizzaGrande3 = Articulo.builder()
                .denominacion("Pizza Grande Muzza")
                .precioVenta(4700D)
                .precioCompra(3200D)
                .stockActual(90)
                .stockMaximo(130)
                .imagen(imagen3)
                .unidadMedida(porciones8)
                .build();

        Articulo pizzaChica3 = Articulo.builder()
                .denominacion("Pizza Chica Muzza")
                .precioVenta(3800D)
                .precioCompra(2000D)
                .stockActual(60)
                .stockMaximo(150)
                .imagen(imagen6)
                .unidadMedida(porciones4)
                .build();

        Articulo cerveza1 = Articulo.builder()
                .denominacion("Cerveza Andes")
                .precioVenta(2000D)
                .precioCompra(1000D)
                .stockActual(175)
                .stockMaximo(200)
                .imagen(imagen7)
                .unidadMedida(litro1)
                .build();
        Articulo cerveza2 = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .precioVenta(1800D)
                .precioCompra(900D)
                .stockActual(151)
                .stockMaximo(200)
                .imagen(imagen8)
                .unidadMedida(litro1)
                .build();

        repositoryArticulo.save(pizzaGrande1);
        repositoryArticulo.save(pizzaChica1);
        repositoryArticulo.save(pizzaGrande2);
        repositoryArticulo.save(pizzaChica2);
        repositoryArticulo.save(pizzaGrande3);
        repositoryArticulo.save(pizzaChica3);
        repositoryArticulo.save(cerveza1);
        repositoryArticulo.save(cerveza2);

        //
        InMemoryRepository<Promocion> repositoryPromocion = new InMemoryRepository<>();
        Promocion promocion1 = Promocion.builder()
                .denominacion("Promocion Happy Hour Septiembre")
                .FechaDesde(LocalDate.of(2024, 9, 1))
                .FechaHasta(LocalDate.of(2024, 9,30))
                .HoraDesde(LocalTime.of(16,30))
                .HoraHasta(LocalTime.of(20, 30))
                .descripcionDescuento("Promocion Septiembre Happy Hour 15%off llevando 1 Pizza Grande Hawaiana, 1 Pizza Grande Mizza y 1 Cerveza QUilmes")
                .tipoPromocion(TipoPromocion.happyHour)
                .build();

        promocion1.getImagenes().add(imahappy1);
        promocion1.getImagenes().add(imahappy2);
        promocion1.getArticulos().add(pizzaGrande1);
        promocion1.getArticulos().add(pizzaGrande3);
        promocion1.getArticulos().add(cerveza2);

        Double precioProm1 = 0D;
        for (Articulo articulo: promocion1.getArticulos()) {
            precioProm1 += articulo.getPrecioVenta();
            articulo.getPromociones().add(promocion1);
        }
        promocion1.setPrecioPromocional(precioProm1*0.85);

        Promocion promocion2 = Promocion.builder()
                .denominacion("Promocion Verano")
                .FechaDesde(LocalDate.of(2024, 12,21))
                .FechaHasta(LocalDate.of(2025, 3, 21))
                .HoraDesde(LocalTime.of(0,0))
                .HoraHasta(LocalTime.of(23,59))
                .descripcionDescuento("Promocion Verano 20% off llevando 1 Pizza Chica Hawaiana, 1 Pizza Grande Napolitana, 1 Cerveza Quilmes y 1 Cerveza Andes")
                .tipoPromocion(TipoPromocion.Verano)
                .build();

        promocion2.getImagenes().add(verano1);
        promocion2.getImagenes().add(verano2);
        promocion2.getArticulos().add(pizzaChica1);
        promocion2.getArticulos().add(pizzaGrande2);
        promocion2.getArticulos().add(cerveza1);
        promocion2.getArticulos().add(cerveza2);

        precioProm1 = 0D;
        for (Articulo articulo: promocion2.getArticulos()) {
            precioProm1 += articulo.getPrecioVenta();
            articulo.getPromociones().add(promocion2);
        }
        promocion2.setPrecioPromocional(precioProm1*0.8);

        Promocion promocion3 = Promocion.builder()
                .denominacion("Promocion Incierno")
                .FechaDesde(LocalDate.of(2025, 6, 21))
                .FechaHasta(LocalDate.of(2025, 9, 21))
                .HoraDesde(LocalTime.of(0,0))
                .HoraHasta(LocalTime.of(0,0))
                .descripcionDescuento("Promocion Invierno 30% off llevando 1 Pizza Grande Hawaiana, 1 Pizza Chica Muzza y 1 Cerveza Quilmes")
                .tipoPromocion(TipoPromocion.Invierno)
                .build();

        promocion3.getImagenes().add(invierno1);
        promocion3.getImagenes().add(invierno2);
        promocion3.getArticulos().add(pizzaGrande1);
        promocion3.getArticulos().add(pizzaChica3);
        promocion3.getArticulos().add(cerveza2);

        precioProm1 = 0D;
        for (Articulo articulo: promocion3.getArticulos()) {
            precioProm1 += articulo.getPrecioVenta();
            articulo.getPromociones().add(promocion3);
        }
        promocion3.setPrecioPromocional(precioProm1*0.7);

        repositoryPromocion.save(promocion1);
        repositoryPromocion.save(promocion2);
        repositoryPromocion.save(promocion3);

        //Programa

        System.out.println("- - - - - - Mostrando Promociones - - - - - -");
        for (Promocion promocion : repositoryPromocion.findAll()){
            System.out.println(promocion.toString());
        }
        System.out.println("- - - - - - Mostrando Articulos - - - - - -");
        for (Articulo articulo : repositoryArticulo.findAll()){
            System.out.println(articulo.toString());
        }
        System.out.println("- - - - - - Mostrando Promociones por Separado - - - - - -");
        System.out.println("Promocion 1:");
        Optional<Promocion> promocionOPT = repositoryPromocion.findById(1L);
        promocionOPT.ifPresent(promocion -> System.out.println(promocion.getDenominacion()
                + "\n" + promocion.getDescripcionDescuento()
                + "\n" + "ARTICULOS: " + listaDeArticulosPromo(promocion.getArticulos())
                + "\n" + "Precio: " + promocion.getPrecioPromocional()));

        System.out.println("Promocion 2:");
        promocionOPT = repositoryPromocion.findById(2L);
        promocionOPT.ifPresent(promocion -> System.out.println(promocion.getDenominacion()
                + "\n" + promocion.getDescripcionDescuento()
                + "\n" + "ARTICULOS: " + listaDeArticulosPromo(promocion.getArticulos())
                + "\n" + "Precio: " + promocion.getPrecioPromocional()));

        System.out.println("Promocion 3:");
        promocionOPT = repositoryPromocion.findById(3L);
        promocionOPT.ifPresent(promocion -> System.out.println(promocion.getDenominacion()
                + "\n" + promocion.getDescripcionDescuento()
                + "\n" + "ARTICULOS: " + listaDeArticulosPromo(promocion.getArticulos())
                + "\n" + "Precio: " + promocion.getPrecioPromocional()));

        System.out.println("- - - - - - Mostrando el dia y horario de la promocion de verano - - - - - -");
        Optional<Promocion> promoVerano = repositoryPromocion.findById(2L);
        promoVerano.ifPresent(promocion -> System.out.println(promocion.getDenominacion()
                + "\n * Desde: " + promocion.getFechaDesde()
                + "\n * Hasta: " + promocion.getFechaHasta()
                + "\n * Hora Inicio: " + promocion.getHoraDesde()
                + "\n * Hora Fin: " + promocion.getHoraHasta()));

        System.out.println("- - - - - - Mostrando Promocion mas Economica - - - - - -");

        double precioPromocion = 0;
        long idPromoEconomica = 0;
        for (Promocion promocion : repositoryPromocion.findAll()) {
            if (promocion.getPrecioPromocional() < precioPromocion || idPromoEconomica == 0){
                precioPromocion = promocion.getPrecioPromocional();
                idPromoEconomica = promocion.getId();
            }
        }
        repositoryPromocion.findById(idPromoEconomica).ifPresent(promocion -> System.out.println("La promocion mas economica es: "
        + promocion.getDenominacion()
        + "\n Precio: $" + promocion.getPrecioPromocional()));
    }
    public static String listaDeArticulosPromo(HashSet<Articulo> articulos){
        String devolucionArticulos = "";
        for (Articulo articulo : articulos){
            devolucionArticulos += articulo.getDenominacion() + " | ";
        }
        return devolucionArticulos;
    }
}