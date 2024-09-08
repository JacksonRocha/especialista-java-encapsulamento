package jackson.rocha.projetoagenda.agenda;

public class Horario {

    public int[] valores = new int[2];

//    public final int hora;
//    public final int minuto;

    public Horario(int hora, int minuto) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida" + hora);
        }

        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido" + minuto);
        }

        this.valores[0] = hora;
        this.valores[1] = minuto;
    }
}
