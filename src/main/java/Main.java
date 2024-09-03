import entities.Articulo;
import entities.Imagen;
import entities.UnidadMedida;
import repositories.InMemoryRepository;

import javax.persistence.criteria.CriteriaBuilder;

public class Main {
    public static void main(String[] args) {

        InMemoryRepository<UnidadMedida> repoUnidadMedida = new InMemoryRepository<>();
        InMemoryRepository<Articulo> repoArticulo = new InMemoryRepository<>();
        InMemoryRepository<Imagen> repoImagen = new InMemoryRepository<>();

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

        //crear pizzas e imagenes

    }

}
