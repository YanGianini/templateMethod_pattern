import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientePadraoTest {

    @Test
    void deveAprovarEmprestimo() {
        ClientePadrao cliente = new ClientePadrao();
        cliente.setLimite(2000);
        cliente.setScore(3);
        cliente.setTotalEmConta(5000);
        assertEquals(true, cliente.pedidoDeEmprestimo(13000));
    }

    @Test
    void deveReprovarEmprestimo() {
        ClientePadrao cliente = new ClientePadrao();
        cliente.setLimite(2000);
        cliente.setScore(3);
        cliente.setTotalEmConta(5000);
        assertEquals(false, cliente.pedidoDeEmprestimo(14000));
    }
}
