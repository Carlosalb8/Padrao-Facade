public class Financeiro extends Loja {
    private static Financeiro financeiro = new Financeiro();

    private Financeiro() {
    }

    public static Financeiro getInstancia() {
        return financeiro;
    }
}
