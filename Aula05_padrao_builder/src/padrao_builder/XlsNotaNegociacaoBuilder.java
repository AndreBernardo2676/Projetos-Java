package padrao_builder;

	public class XlsNotaNegociacaoBuilder implements NotaNegociacaoBuilder{
		private NotaNegociacao nota;
		public XlsNotaNegociacaoBuilder() {
			this.nota = new NotaNegociacao();

		}
		@Override
		public void buildCabecalho() {
			nota.adicionarConteudo("XLS: Cabeçalho da nota");
		}
		@Override
		public void buildOperacoes() {
			nota.adicionarConteudo("XLS: Lista de Operações");
	
		}
		@Override
		public void buildSumario() {
			nota.adicionarConteudo("XLS: Sumario com totais de taxas");
		}
		@Override

		public NotaNegociacao getNota() {
			return nota;
		}


}
