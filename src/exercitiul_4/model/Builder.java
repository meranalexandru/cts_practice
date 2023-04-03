package exercitiul_4.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Builder extends AbstractBuilder {
    private Reteta reteta = new Reteta();

    public Reteta build(){
        return this.reteta;
    }

    @Override
    public Builder setMedicamente(List<String> medicamente){
        this.reteta.setMedicamente(medicamente);
        return this;
    }

    @Override
    public AbstractBuilder setDataExpirare(LocalDate dataExpirare) {
        this.reteta.setDataExpirare(dataExpirare);
        return this;

    }
}
