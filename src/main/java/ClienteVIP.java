public class ClienteVIP extends Cliente{
    public boolean pedidoDeEmprestimo(int valor) {
        if (valor < (this.coeficienteConta()*2)) {
            return true;
        }else{
            return false;
        }
    }
}
