import entities.UnidadMedida;
import repositories.InMemoryRepository;

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

    }
}
