public abstract class Cliente {
    private String nome;
    private float totalEmConta;
    private float score;
    private float limite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTotalEmConta() {
        return totalEmConta;
    }

    public void setTotalEmConta(int totalEmConta) {
        this.totalEmConta = totalEmConta;
    }

    public float getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public float coeficienteConta() {
        return (this.totalEmConta + this.limite) * this.score;
    }
}
