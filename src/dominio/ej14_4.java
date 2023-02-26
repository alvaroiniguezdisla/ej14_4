package dominio;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ej14_4 {
    public static ArrayList listapares(int[]lista){
        return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).filter(i->i%2==0).collect(Collectors.toCollection(ArrayList::new));
    }
}
