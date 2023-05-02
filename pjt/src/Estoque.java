public class Estoque extends Loja {
    private static Estoque estoque = new Estoque();

    private Estoque() {
    }

    public static Estoque getInstancia() {
        return estoque;
    }
}