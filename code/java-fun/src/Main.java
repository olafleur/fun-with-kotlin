import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Monstre> monstres = new ArrayList<>();

        monstres.add(new Monstre("coucou", 3, 2.7));
        monstres.add(new Monstre("un autre", 4, 98.3));
        monstres.add(new Monstre("super cool", 87, 103.4));

        Optional<Monstre> resultat = monstres.stream().filter(Monstre::energiePlusPetit).map(m -> new Monstre("bla", m.toString().length(), Math.PI)).findFirst();

        System.out.println(resultat);
    }
}