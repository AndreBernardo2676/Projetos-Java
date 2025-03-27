package Loja;

/**
 *
 * @author 202309327139
 */
public class PagamentoDigital implements Pagamento{
    
    public void processarPagamento(double valor){
        System.out.println("Processando pagamento digital de R$" + valor);
    }
    
}