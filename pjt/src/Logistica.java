public class Logistica extends Loja {
    private static Logistica logistica = new Logistica();

    private Logistica() {
    }

    public static Logistica getInstancia() {
        return logistica;
    }
}
