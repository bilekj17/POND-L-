import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graf {
    Scanner sc = new Scanner(System.in);
    private List<Trasa> trasa =  new ArrayList<>();
    private List<Cesta> cesta =  new ArrayList<>();

    public Trasa addVrchol(String nazev){
        Trasa tr = new Trasa(nazev);
        trasa.add(tr);
        return tr;
    }

    public void addHrana(Trasa a, Trasa b){
        cesta.add(new Cesta(a, b));
    }

    public boolean sled(String text){
        String[] split = text.trim().split("-");
        for (int i = 0; i < split.length-2; i++){
            for (Cesta c : cesta){
                if (split[i].equals(c.getA().getNazev())||split[i].equals(c.getB().getNazev())){
                    if (split[i+1].equals(c.getA().getNazev())||split[i+1].equals(c.getB().getNazev())){
                        if (i+1 == split.length-2){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean cesta(String text){
        String[] split = text.trim().split("-");
        for (int i = 0; i < split.length; i++){
            for (int j = i + 1; j < split.length; j++){
                if (split[i].equals(split[j])){
                    return false;
                }
            }
        }
        if (sled(text) == true){
            return true;
        }
        return false;
    }

    public boolean kruh(String text){
        String[] split = text.trim().split("-");
        if (!split[0].equals(split[split.length-1])){
            return false;
        }else{
            for (int i = 0; i < split.length-1; i++){
                for (int j = i + 1; j < split.length-1; j++){
                    if (split[i].equals(split[j])){
                        return false;
                    }
                }
            }
        }
        if (sled(text) == true){
            return true;
        }
        return false;
    }
}
