package Loja;

/**
 *
 * @author 202309327139
 */
public interface FabricaPedido {
	
    ItemPedido criarItemPedido(Produto produto, int quantidade);
    Pagamento criarPagamento();
    Entrega criarEntrega();    
}