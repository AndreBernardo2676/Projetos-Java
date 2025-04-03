package Prototype;

public class Main {
	public static void main(String[] args) {
		
		AmbienteConfig devClone = AmbientePrototypeRegistry.getPrototipo("DEV");
		devClone.exibirInfo();
		devClone.setUrl("http://dev.featureX.colal");
		devClone.setUsuario("devFeatureUser");
		devClone.setTimeoutSegundos(45);
		devClone.exibirInfo();
		
		AmbienteConfig prodClone = AmbientePrototypeRegistry.getPrototipo("PROD");
		prodClone.exibirInfo();
		prodClone.setUrl("http://prod-novo.suaempresa.com");
		prodClone.setSenha("senhaNova123");
		prodClone.exibirInfo();
		
	}

}
