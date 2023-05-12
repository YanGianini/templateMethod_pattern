import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteVipTest {
    @Test
    void deveAprovarEmprestimo() {
        ClienteVIP cliente = new ClienteVIP();
        cliente.setLimite(20000);
        cliente.setScore(6);
        cliente.setTotalEmConta(10000);
        assertEquals(true, cliente.pedidoDeEmprestimo(170000));
    }

    @Test
    void deveReprovarEmprestimo() {
        ClienteVIP cliente = new ClienteVIP();
        cliente.setLimite(2000);
        cliente.setScore(3);
        cliente.setTotalEmConta(5000);
        assertEquals(false, cliente.pedidoDeEmprestimo(180000));
    }
}
