package Loja;

public class Main {
	public static void main(String[] args) {
		FabricaPedido fabricaFisica = new FabricaPedidoFisico();
		Produto produtoFisico = new Produto("Livro Fisico", 30.0);
		ItemPedido itemFisico = fabricaFisica.criarItemPedido(produtoFisico,  2);
		Pagamento pagamentoFisico = fabricaFisica.criarPagamento();
		Entrega entregaFisica = fabricaFisica.criarEntrega();
		double totalFisico = itemFisico.getPreco() + entregaFisica.calcularCustoEntrega();
		System.out.println("Total do pedido fisico R$ " + totalFisico);
		pagamentoFisico.processarPagamento(totalFisico);
		FabricaPedido fabricaDigital = new FabricaPedidoDigital();
		Produto produtoDigital = new Produto("E-book", 20.0);
		ItemPedido itemDigital = fabricaDigital.criarItemPedido(produtoDigital, 1);
		Pagamento pagamentoDigital = fabricaDigital.criarPagamento();
		Entrega entregaDigital = fabricaDigital.criarEntrega();
		double totalDigital = itemDigital.getPreco() + entregaDigital.calcularCustoEntrega();
		System.out.println("Total do pedido digital R$ " + totalDigital);
		pagamentoDigital.processarPagamento(totalDigital);
		
		}

}
