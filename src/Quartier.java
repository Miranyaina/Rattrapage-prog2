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

    public boolean contientAppartement(appartement appartement) {
        for (immeuble immeuble : immeubles) {
            if (immeuble.getAppartement().contains(appartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compterLesAppartements() {
        int totalAppartements = 0;
        for (immeuble immeuble : immeubles) {
            totalAppartements += immeuble.compterLesAppartements();
        }
        return totalAppartements;
    }

    public List<immeuble> getImmeubles() {
        return immeubles;
    }
}
