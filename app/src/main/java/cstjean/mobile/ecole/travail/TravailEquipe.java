package cstjean.mobile.ecole.travail;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

public class TravailEquipe extends Travail {
    private final Map<Integer, String> coequipiers = new LinkedHashMap<>();

    public void ajouterCoequipier(int da, String nom) {
        coequipiers.put(da, nom);
    }

    String getCoequipier(int da) {
        return coequipiers.get(da);
    }

    public int  getNombreCoequipier() {
        return coequipiers.size();
    }

    public TravailEquipe(String nom, Calendar dateRemise) {
        super(nom, dateRemise);
    }
}
