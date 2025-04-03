package padrao_builder;

public class XmlNotaNegociacao implements NotaNegociacaoBuilder {
	private NotaNegociacao nota;
		public XmlNotaNegociacao() {
		this.nota = new NotaNegociacao();
	}
	@Override
	public void buildCabecalho() {
		nota.adicionarConteudo("<cabecalho>Xml: Cabeçalho da nota");
	}
	@Override
	public void buildOperacoes() {
		nota.adicionarConteudo("<operacoes>Xml: Lista de Operações");
		
	}
	@Override
	public void buildSumario() {
		nota.adicionarConteudo("<sumario>Xml: Sumario com totais de taxas");
	}
	@Override

	public NotaNegociacao getNota() {
		return nota;
	}

}
