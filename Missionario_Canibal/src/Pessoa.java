public class Pessoa {
    int id;
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
