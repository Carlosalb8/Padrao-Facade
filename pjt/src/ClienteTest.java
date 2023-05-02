import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void testVerificarClienteSemDividas() {
        Cliente cliente = new Cliente();
        assertTrue(ClienteFacade.verificarDividas(cliente));
    }

    @Test
    public void testVerificarDividasComFinanceiro() {
        Cliente cliente = new Cliente();
        Financeiro.getInstancia().addClienteComDivida(cliente);
        assertFalse(ClienteFacade.verificarDividas(cliente));
    }

    @Test
    public void testVerificarDividasComLogistica() {
        Cliente cliente = new Cliente();
        Logistica.getInstancia().addClienteComDivida(cliente);
        assertFalse(ClienteFacade.verificarDividas(cliente));
    }

    @Test
    public void testVerificarDividasComEstoque() {
        Cliente cliente = new Cliente();
        Estoque.getInstancia().addClienteComDivida(cliente);
        assertFalse(ClienteFacade.verificarDividas(cliente));
    }
}
