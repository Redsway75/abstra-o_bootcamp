package package1;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calculodXP() {
        return XP_PADRAO + 20d;
    }

    

    
     
}
