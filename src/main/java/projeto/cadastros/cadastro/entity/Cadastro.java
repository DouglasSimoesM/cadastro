package projeto.cadastros.cadastro.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cadastros")
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String setor;
    private String endereco;
    private String telefone;
    private String email;

<<<<<<< HEAD
    public Cadastro() {
    }

    public Cadastro(Cadastro cadastro) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

=======
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
