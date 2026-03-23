import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "Hrádek-Kamenný Újezd-Rokycany-Svojkovice-Dobřív";
        String text2 = "Dobřív-Svojkovice-Volduchy-Osek-Rokycany-Kamenný Újezd-Dobřív";
        String text3 = "Kamenný Újezd-Rokycany-Ejpovice-Litohlavy-Osek";
        String text4 = "Dobřív-Svojkovice-Volduchy-Osek-Litohlavy-Klabava-Ejpovice-Rokycany-Svojkovice";

        Graf graf = new Graf();
        Trasa rokycany = graf.addVrchol("Rokycany");
        Trasa ejpovice = graf.addVrchol("Ejpovice");
        Trasa klabava = graf.addVrchol("Klabava");
        Trasa Litohlavy = graf.addVrchol("Litohlavy");
        Trasa osek = graf.addVrchol("Osek");
        Trasa volduchy = graf.addVrchol("Volduchy");
        Trasa svojkovice = graf.addVrchol("Svojkovice");
        Trasa dobriv = graf.addVrchol("Dobřív");
        Trasa kamennyujezd = graf.addVrchol("Kamenný újezd");
        Trasa hradek = graf.addVrchol("Hrádek");

        graf.addHrana(rokycany, ejpovice);
        graf.addHrana(ejpovice, klabava);
        graf.addHrana(klabava, Litohlavy);
        graf.addHrana(Litohlavy, osek);
        graf.addHrana(osek, rokycany);
        graf.addHrana(osek, volduchy);
        graf.addHrana(volduchy, svojkovice);
        graf.addHrana(svojkovice, rokycany);
        graf.addHrana(svojkovice, dobriv);
        graf.addHrana(dobriv, kamennyujezd);
        graf.addHrana(kamennyujezd, hradek);
        graf.addHrana(kamennyujezd, rokycany);

        System.out.println(graf.sled(text));
        System.out.println(graf.sled(text2));
        System.out.println(graf.sled(text3));
        System.out.println(graf.sled(text4));
        System.out.println("");
        System.out.println(graf.cesta(text));
        System.out.println(graf.cesta(text2));;
        System.out.println(graf.cesta(text3));;
        System.out.println(graf.cesta(text4));;
        System.out.println("");
        System.out.println(graf.kruh(text));
        System.out.println(graf.kruh(text2));
        System.out.println(graf.kruh(text3));
        System.out.println(graf.kruh(text4));
    }
}