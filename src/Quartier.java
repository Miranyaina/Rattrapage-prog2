import java.util.ArrayList;
import java.util.List;

public abstract class Quartier extends endroit{
    private List<immeuble> immeubles;
    public Quartier(int id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    public void ajouterImmeuble(immeuble immeubles) {
        this.immeubles.add(immeubles);
    }
}
