
import java.util.ArrayList;

/**
 *
 * @author lhries
 */
public class RepositorioPacientes {
    private ArrayList<Paciente> listaPacientes;
    
    public RepositorioPacientes(){
        listaPacientes= new ArrayList<Paciente>();        
    }
    
    public void adicionar(Paciente paciente){
        listaPacientes.add(paciente);
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }
    
    public Paciente buscarPacientePorRg(String rg)
    {
        for(Paciente p: listaPacientes)
        {
            if(p.getRg().equals(rg))
            {
                return(p);
            }
        }
        return(null);
    }
    
    public boolean existePaciente(String rg){
        if(this.buscarPacientePorRg(rg)!=null)
            return true;
        else
            return false;
            
    }
    
    public Paciente buscarPacientePorNome(String nome)
    {
        for(Paciente p: listaPacientes)
        {
            if(p.getNome().equals(nome))
            {
                return(p);
            }
        }
        return(null);
    }
    
    public boolean temPacientes(){
        return !listaPacientes.isEmpty();
    }
    
}
