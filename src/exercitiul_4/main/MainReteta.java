package exercitiul_4.main;

import exercitiul_4.model.Builder;
import exercitiul_4.model.Reteta;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainReteta {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> medicamentes =List.of("Paracetamol", "Urinal");

        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");


        Reteta reteta = new Builder()
                .setMedicamente(medicamentes)
                .setDataExpirare(LocalDate.now())
                .build();
        System.out.println(reteta);

        Reteta reteta2 = (Reteta) reteta.clone();
        reteta2.getMedicamente().add("Nurofen");

        System.out.println(reteta);
        System.out.println(reteta2);
    }
}
