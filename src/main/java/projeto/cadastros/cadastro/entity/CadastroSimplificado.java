package projeto.cadastros.cadastro.entity;

<<<<<<< HEAD
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

=======
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cadastros_simplificados")
public class CadastroSimplificado {
    @Id
    private String id;
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
    private String nome;
    private String cpf;
    private String setor;

<<<<<<< HEAD
    public CadastroSimplificado() {
    }

    public CadastroSimplificado(CadastroSimplificado cadastroSimplificado) {
        this.id = cadastroSimplificado.getId();
        this.nome = cadastroSimplificado.getNome();
        this.cpf = cadastroSimplificado.getCpf();
        this.setor = cadastroSimplificado.getSetor();
    }


=======
>>>>>>> 314908c836ba1d7952fa294e9218fa5c8ac8c6ed
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
