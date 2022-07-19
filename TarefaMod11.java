import java.util.ArrayList;
import java.util.List;

public class TarefaMod11 {

    public static void main(String args[]){

    listaNomes();

    }

    private static void listaNomes() {
        List <Pessoa> lista = new ArrayList<Pessoa>();

        Pessoa a = new Pessoa("Pablo", "Masculino");
        Pessoa b = new Pessoa("Maria", "Feminino");
        Pessoa c = new Pessoa("Ricardo", "Masculino");
        Pessoa d = new Pessoa("Carol", "Feminino");
        Pessoa e = new Pessoa("Felippe", "Masculino");
        Pessoa f = new Pessoa("Carlota", "Feminino");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        System.out.println(lista);

        System.out.println("Grupo Masculino");
        System.out.println(a);
        System.out.println(c);
        System.out.println(e);

        System.out.println("Grupo Feminino");
        System.out.println(b);
        System.out.println(d);
        System.out.println(f);




    }



    }



