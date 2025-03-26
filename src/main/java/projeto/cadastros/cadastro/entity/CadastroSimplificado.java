package projeto.cadastros.cadastro.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "cadastros_simplificados")
public class CadastroSimplificado {

    @MongoId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String nome;
    private String cpf;
    private String setor;

    public CadastroSimplificado() {
    }

    public CadastroSimplificado(CadastroSimplificado cadastroSimplificado) {
        this.id = cadastroSimplificado.getId();
        this.nome = cadastroSimplificado.getNome();
        this.cpf = cadastroSimplificado.getCpf();
        this.setor = cadastroSimplificado.getSetor();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
