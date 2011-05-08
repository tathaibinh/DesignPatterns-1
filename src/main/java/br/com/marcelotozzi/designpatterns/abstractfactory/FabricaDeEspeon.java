package br.com.marcelotozzi.designpatterns.abstractfactory;

public class FabricaDeEspeon extends FabricaDeEvolucoesDoEevee {
	@Override
	public Pokemon criarEvolucao() {
		Pokemon espeon = new Pokemon();
		espeon.setNome("Espeon");
		return espeon;
	}
}