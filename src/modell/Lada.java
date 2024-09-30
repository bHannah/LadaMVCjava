package modell;

public class Lada {
    private String anyag, felirat;
    private boolean kincs;

    public Lada(String anyag, String felirat) {
        this(anyag, felirat, false);
    }
    
    public Lada(String anyag, String felirat, boolean kincs) {
        this.anyag = anyag;
        this.felirat = felirat;
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void kincsetElhelyez() {
        kincs = true;
    }
    
    public void kincsetKivesz() {
        kincs = false;
    }

}
