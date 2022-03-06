package package1;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;


public class Bootcamp {

    private String Nome;
    private String Descricao;
    private final LocalDate DataInicio = LocalDate.now();
    private final LocalDate DataFinal = DataInicio.plusDays(10);
    
    private Set<Dev> DevsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

//==================================================================//

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    public LocalDate getDataInicio() {
        return DataInicio;
    }
    public LocalDate getDataFinal() {
        return DataFinal;
    }
    public Set<Dev> getDevsInscritos() {
        return DevsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        DevsInscritos = devsInscritos;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Descricao == null) ? 0 : Descricao.hashCode());
        result = prime * result + ((DevsInscritos == null) ? 0 : DevsInscritos.hashCode());
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (Descricao == null) {
            if (other.Descricao != null)
                return false;
        } else if (!Descricao.equals(other.Descricao))
            return false;
        if (DevsInscritos == null) {
            if (other.DevsInscritos != null)
                return false;
        } else if (!DevsInscritos.equals(other.DevsInscritos))
            return false;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }
    

}
