
package maparevistatres;

import java.util.ArrayList;


public class Amigo {
     private String nomeAmigo;
    //private String telefoneAmigo;
    //private String statusAmigo;
    ArrayList<Caixa> caixa = new ArrayList();
    ArrayList<Revista> revista = new ArrayList();
    
    private String dataEmprestimo;
    
    public Amigo(Caixa caixa, Revista revista, String nomeAmigo, String dataEmprestimo) {
        this.nomeAmigo = nomeAmigo;
        this.caixa.add (caixa);
        this.revista.add(revista);
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Empréstimo {" + "Nome do Amigo = " + nomeAmigo + ", Coleção = " 
                + caixa + ", Revista = " + revista + ", Data do Empréstimo = " + dataEmprestimo + '}';
    }
    
}
