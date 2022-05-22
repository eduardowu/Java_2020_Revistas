
package maparevistatres;

import java.util.ArrayList;

/**
 *
 * @author Werner
 */
public class MapaRevistaTres {

    public static void main(String[] args) {
    
        System.out.println ("*** Teste Cadastro de Caixas e Revistas em Arrays ***");
        
        //Cadastra as caixas e as revistas em Arrays
        
        ArrayList<Caixa> caixa = new ArrayList();
        ArrayList<Revista> revista = new ArrayList();
        
        //Caixas 01, 02 e 03
        caixa.add(new Caixa (01, "Cebolinha", "vermelha"));//posicao 0
        caixa.add(new Caixa (02, "Pato Donald", "amarela"));//posicao 1
        caixa.add(new Caixa (03, "Batman", "azul"));//posicao 2
    
        System.out.println ("*** Cadastradas as Caixas da coleção: ***");
    
            for (int i=0; i<caixa.size(); i++){
                System.out.println(caixa.get(i));
            }
    
        //Revistas Cebolinha
        revista.add(new Revista(115, 1986, caixa.get(0)));//posicao 0
        revista.add(new Revista(116, 1986, caixa.get(0)));//posição 1
        //Revistas Pato Donald
        revista.add(new Revista(201, 1997, caixa.get(1)));//posição 2
        revista.add(new Revista(202, 1997, caixa.get(1)));//posição 3
        //Revistas Batman
        revista.add(new Revista(95, 2011, caixa.get(2)));//posição 4
        revista.add(new Revista(96, 2011, caixa.get(2)));//posição 5
    
        System.out.println ("*** Cadastradas as Revistas da coleção: ***");
    
            for (int i=0; i<revista.size(); i++){
                System.out.println(revista.get(i));
            }
        
        //Cadastra os empréstimos (para amigos)
        ArrayList<Amigo> amigo = new ArrayList();
        
        amigo.add(new Amigo (caixa.get(0), revista.get(0), "Adriano", "01/01/2020"));
        amigo.add(new Amigo (caixa.get(0), revista.get(1), "Paulo Henrique", "01/02/2020"));
        amigo.add(new Amigo (caixa.get(2), revista.get(4), "Adriano", "25/12/2019"));
        amigo.add(new Amigo (caixa.get(2), revista.get(5), "Marcelo", "26/01/2020"));
    
        System.out.println ("*** Cadastrados os empréstimos das revistas: ***");
    
            for (int i=0; i<amigo.size(); i++){
                System.out.println(amigo.get(i));
            }
    }
}
