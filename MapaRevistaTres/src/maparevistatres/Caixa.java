
package maparevistatres;

public class Caixa {
    private Integer numeroCaixa;
    private String identificacaoEtiquetaCaixa;
    private String corCaixa;
    
 public Caixa(Integer numeroCaixa, String identificacaoEtiquetaCaixa, String corCaixa) {
        this.numeroCaixa = numeroCaixa;
        this.identificacaoEtiquetaCaixa = identificacaoEtiquetaCaixa;
        this.corCaixa = corCaixa;
    }

    @Override
    public String toString() {
        return "Caixa da Coleção {" + "Número da Caixa = " + numeroCaixa + ", Coleção = " 
                + identificacaoEtiquetaCaixa + ", Cor da Caixa = " + corCaixa + '}';
    }
    
 
}
