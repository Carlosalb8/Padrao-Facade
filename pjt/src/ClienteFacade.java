public class ClienteFacade {
    public ClienteFacade() {
    }

    public static boolean verificarDividas(Cliente cliente) {
        if (Financeiro.getInstancia().verificarClienteComDivida(cliente)) {
            return false;
        } else if (Logistica.getInstancia().verificarClienteComDivida(cliente)) {
            return false;
        } else {
            return !Estoque.getInstancia().verificarClienteComDivida(cliente);
        }
    }
}
