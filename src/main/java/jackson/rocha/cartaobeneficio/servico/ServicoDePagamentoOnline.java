package jackson.rocha.cartaobeneficio.servico;

import jackson.rocha.cartaobeneficio.Cartao;
import jackson.rocha.cartaobeneficio.Estabelecimento;
import jackson.rocha.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {

        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }
}
