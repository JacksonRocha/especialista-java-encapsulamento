package jackson.rocha.cartaobeneficio.servico;

import jackson.rocha.cartaobeneficio.Cartao;
import jackson.rocha.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.obterTitular(), "Deposito", valorDeposito);
    }

}
