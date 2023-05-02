public class Cliente {
    public Cliente() {
    }

    public boolean podeComprar() {
        return ClienteFacade.verificarDividas(this);
    }
}