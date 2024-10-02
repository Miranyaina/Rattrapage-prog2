import java.util.ArrayList;
import java.util.List;

public abstract class immeuble extends endroit {
    private int nombreDEtages;
    private List<appartement> appartement;

    public immeuble(int id, String nom, int nombreDEtages) {
        super(id, nom);
        this.nombreDEtages = nombreDEtages;
        this.appartement = new ArrayList<>();
    }

    public void ajouterAppartement(appartement appartement) {
        this.appartement.add(appartement);
    }

    public int compterLesAppartements() {
        return appartement.size();
    }

    public List<appartement> getAppartement() {
        return appartement;
    }
}
