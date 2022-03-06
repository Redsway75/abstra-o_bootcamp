package package1;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Optional;

public class Dev {

    private String Nome;

    private Set<Conteudo> ConteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> ConteudoConcluido = new LinkedHashSet<>();

    public void Progredir(){
        Optional<Conteudo> cont =  this.ConteudoInscritos.stream().findFirst();
        if(cont.isPresent()){
            this.ConteudoConcluido.add(cont.get());
            this.ConteudoInscritos.remove(cont.get());
        }
        else
            System.out.println("Você não está matriculado em nenhum curso!");
    }

    public double calculodXP(){
        return this.ConteudoConcluido.stream().mapToDouble(Conteudo -> Conteudo.calculodXP()).sum();
    }

    public void InscreverBootcamp(Bootcamp bootcamp){
         bootcamp.getDevsInscritos().add(this);
        this.ConteudoInscritos.addAll(bootcamp.getConteudos());
    }


//============================================//

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return ConteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        ConteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return ConteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        ConteudoConcluido = conteudoConcluido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ConteudoConcluido == null) ? 0 : ConteudoConcluido.hashCode());
        result = prime * result + ((ConteudoInscritos == null) ? 0 : ConteudoInscritos.hashCode());
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
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
        Dev other = (Dev) obj;
        if (ConteudoConcluido == null) {
            if (other.ConteudoConcluido != null)
                return false;
        } else if (!ConteudoConcluido.equals(other.ConteudoConcluido))
            return false;
        if (ConteudoInscritos == null) {
            if (other.ConteudoInscritos != null)
                return false;
        } else if (!ConteudoInscritos.equals(other.ConteudoInscritos))
            return false;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        return true;
    }
    
    
}
