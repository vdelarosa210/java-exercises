package Java2;

/**
 * Created by violet on 5/18/17.
 */
public class NameGenerator {

    public static void main(String[] args) {


        String[] adjectives = {"confident", "additional", "existing", "scared", "obvious", "immediate", "boring", "guilty", "unusual", "reasonable"};

        String[] nouns = {"article", "criticism", "storage", "mixture", "breath", "industry", "payment", "guidance", "politics", "tradition"};

        int rdm = (int) Math.floor(Math.random() * 10);

        System.out.println("The name generated is " + adjectives[rdm] + " " + nouns[rdm]);
        System.out.println(rdm);

    }


}
