package jackson.rocha.cartaobeneficio.servico;

import jackson.rocha.cartaobeneficio.Cartao;
import jackson.rocha.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        if (valorDeposito < Cartao.VALOR_MINIMI_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de deposito não pode ser menor que R$ %.2f", Cartao.VALOR_MINIMI_DEPOSITO));
        }
        cartao.alterarSaldo(cartao.obterSaldo() + valorDeposito - Cartao.TARIFA_DEPOSITO);

        return new Recibo(cartao.obterTitular(), "Deposito", valorDeposito);
    }

}
