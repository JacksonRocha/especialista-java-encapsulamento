package jackson.rocha.cartaobeneficio.servico;

import jackson.rocha.cartaobeneficio.Cartao;
import jackson.rocha.cartaobeneficio.Estabelecimento;
import jackson.rocha.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {

        if (valor > cartao.saldo) {
            throw new RuntimeException("Saldo insuficiente para efetuar o pagamento");
        }

        cartao.saldo -= valor;

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.titular, "Pagamento", valor);
    }
}
