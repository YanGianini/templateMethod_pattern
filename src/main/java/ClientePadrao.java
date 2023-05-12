public class ClientePadrao extends Cliente{
    public boolean pedidoDeEmprestimo(int valor) {
        if (valor < (this.coeficienteConta()/1.5)) {
            return true;
        }else{
            return false;
        }
    }
}
