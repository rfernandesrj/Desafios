package desafio;

import java.util.Random;

public class GeradorAleatorioJavaRand implements GeradorAleatorio {

	@Override
	public int proximoInteiro(int limite) {
		return new Random().nextInt(limite);
	}

}
