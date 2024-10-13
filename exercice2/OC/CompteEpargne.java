package OC;

public class CompteEpargne extends Compte {
    public CompteEpargne(String id, String dateCreation) {
        super(id, dateCreation);
    }

    @Override
    public boolean addOperation(Operation operation) {
        if (operation.getTypeOperation() == TypeOperation.Debit) {
            this.operations.add(operation);
            this.montant += operation.getMontant() * 0.05; // 5% bonus pour les dépôts
            return true;
        } else {
            if (this.montant >= operation.getMontant() * 0.1 &&
                    java.time.LocalDate.now().getYear() > Integer.parseInt(this.dateCreation.split("/")[2])) {
                this.operations.add(operation);
                this.montant -= operation.getMontant() * 0.1; // 10% pour les retraits
                return true;
            }
            return false;
        }
    }
}
