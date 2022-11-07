import java.util.ArrayList;
import java.util.List;


public class App {


    public static void ejercicio1(){

        List<String> listaNombre = new ArrayList<>();
        listaNombre.add("Juan");
        listaNombre.add("Sergio");
        listaNombre.add("David");
        listaNombre.add("Alejandro");
        listaNombre.add("Manuel");

        listaNombre.replaceAll(n -> n.toUpperCase());
        System.out.println(listaNombre);

        listaNombre.removeIf(n -> n.startsWith("A"));
        System.out.println(listaNombre);

        listaNombre.forEach(n -> System.out.println(n));

    }
    public static void main(String[] args) throws Exception {
        ejercicio1();
    }
}
