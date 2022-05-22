
package maparevistatres;


public class Revista {
    //private String tipoColecao;
    private Integer numeroEdicao;
    private Integer anoEdicao;
    //private Integer Caixa;
    private Caixa caixa;

    public Revista(Integer numeroEdicao, Integer anoEdicao, Caixa caixa) {
        this.numeroEdicao = numeroEdicao;
        this.anoEdicao = anoEdicao;
        this.caixa = caixa;
    }

    @Override
    public String toString() {
        return "Revista{" + "Número da Edição =" + numeroEdicao + ", Ano da Edição =" + anoEdicao + ", Caixa =" + caixa + '}';
    }

    

    
}
