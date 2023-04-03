package exercitiul_4.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public abstract class AbstractBuilder {
    public abstract Reteta build();

    public abstract AbstractBuilder setMedicamente(List<String> medicamente);

    public abstract AbstractBuilder setDataExpirare(LocalDate dataExpirare);

}
