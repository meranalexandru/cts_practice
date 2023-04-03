package exercitiul_4.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reteta extends AbstractPrototype {
    private List<String> medicamente;
    private LocalDate dataExpirare;

    protected Reteta() {
    }


    protected void setMedicamente(List<String> medicamente) {
        this.medicamente = medicamente;
    }


    public void setDataExpirare(LocalDate dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Reteta clona = new Reteta();
        clona.medicamente = new ArrayList<>(this.medicamente);
        clona.dataExpirare = LocalDate.from(this.dataExpirare);
        return clona;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "medicamente=" + medicamente +
                ", dataExpirare=" + dataExpirare +
                '}';
    }
}
