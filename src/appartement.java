public class appartement {
    private int id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private Statut statut;

    public appartement(int id, String titre, String description, double loyerMensuel, Statut statut) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public double getLoyerMensuel() {
        return loyerMensuel;
    }

    public Statut getStatut() {
        return statut;
    }
}

enum Statut {
    LIBRE,
    OCCUPE,
    EN_COURS_DE_LIBERATION;
}
