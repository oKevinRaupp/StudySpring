package firstws.study.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    public Produto() {
    }

    public Produto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
