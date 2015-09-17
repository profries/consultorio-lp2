import java.text.SimpleDateFormat;
import java.util.Date;

//Classe Paciente
public class Paciente {
    private String rg;
    private String nome;
    private Date dataNascimento;

    public Paciente(String rg, String nome, Date dataNascimento) {
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }    

}
