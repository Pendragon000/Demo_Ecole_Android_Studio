package cstjean.mobile.ecole.travail;

import org.jspecify.annotations.NonNull;

import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class TravailEquipe extends Travail {
    private Map<Integer, String> coequipiers = new LinkedHashMap<>();

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TravailEquipe that = (TravailEquipe) o;
        return Objects.equals(coequipiers, that.coequipiers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coequipiers);
    }

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        TravailEquipe clone = (TravailEquipe) super.clone();
        HashMap<Integer, String> coequipiers = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : this.coequipiers.entrySet()) {
            coequipiers.put(entry.getKey(), entry.getValue());
// Ou entry.getValue().clone() quand c'est un objet ...
        }
        clone.coequipiers = coequipiers;
        return clone;
    }
}
