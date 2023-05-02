import java.util.ArrayList;
import java.util.List;

public abstract class Loja {
    private List<Cliente> clientesComDividas = new ArrayList<>();

    public Loja() {
    }

    public void addClienteComDivida(Cliente cliente) {
        this.clientesComDividas.add(cliente);
    }

    public boolean verificarClienteComDivida(Cliente cliente) {
        return this.clientesComDividas.contains(cliente);
    }
}
