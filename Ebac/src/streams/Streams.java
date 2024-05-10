package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<String> lista1 = List.of("Jeff", "JC", "Logan").stream();

        Stream<String> set1 = Set.of("Heloisa", "Barbara", "Dani").stream();

        Map<String, String> map1 = Map.of("Seiya", "Ikki");
        Stream<String> chaves = map1.keySet().stream();
        Stream<String> valores = map1.values().stream();

        Stream<String> streamSTS = Stream.of("Animes", "Mangas");

    }
}
