package Loja;

/**
 *
 * @author 202309327139
 */
public class PagamentoFisico implements Pagamento {
    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando pagamento físico de R$" + valor);
             
    }
}
