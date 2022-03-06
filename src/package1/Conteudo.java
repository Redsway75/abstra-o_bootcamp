package package1;

public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d;
    protected String Titulo;
    protected String Descricao;



    public abstract double calculodXP();
    
//=======================================================//


    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    @Override
    public String toString() {
            return "\nCURSO: "+Titulo+ "\nDescricao: "+Descricao;
    }

    

}
