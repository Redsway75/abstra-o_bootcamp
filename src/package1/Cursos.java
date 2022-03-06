package package1;

public class Cursos extends Conteudo {
    
    private int Cargahoraria;

    public int getCargahoraria() {
        return Cargahoraria;
    }
    public void setCargahoraria(int cargahoraria) {
        Cargahoraria = cargahoraria;
    }
    @Override
    public double calculodXP() {
        return XP_PADRAO*Cargahoraria;
    }
       
}
