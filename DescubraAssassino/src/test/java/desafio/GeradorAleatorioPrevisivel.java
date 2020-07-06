package desafio;

import java.util.LinkedList;
import java.util.Queue;

import desafio.GeradorAleatorio;


public class GeradorAleatorioPrevisivel implements GeradorAleatorio {

	private Queue<Integer> proximos = new LinkedList<Integer>();
	
	@Override
	public int proximoInteiro(int limite) {
		return proximos.poll();
	}
	
	public void adicionaProximo(int n) {
		proximos.add(n);
	}
}
