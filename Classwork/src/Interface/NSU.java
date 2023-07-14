
package Interface;

public class NSU {
    private int D_head;
    private int Proff;
    private int Assistant_Proof;
    private int Senior_Lec,TA;
    private String type;

    public NSU(int D_head, int Proff, int Assistant_Proof, int Senior_Lec, int TA,String type) {
        this.D_head = D_head;
        this.Proff = Proff;
        this.Assistant_Proof = Assistant_Proof;
        this.Senior_Lec = Senior_Lec;
        this.TA = TA;
        this.type = type;
    }

    public int getD_head() {
        return D_head;
    }

    public void setD_head(int D_head) {
        this.D_head = D_head;
    }

    public int getProff() {
        return Proff;
    }

    public void setProff(int Proff) {
        this.Proff = Proff;
    }

    public int getAssistant_Proof() {
        return Assistant_Proof;
    }

    public void setAssistant_Proof(int Assistant_Proof) {
        this.Assistant_Proof = Assistant_Proof;
    }

    public int getSenior_Lec() {
        return Senior_Lec;
    }

    public void setSenior_Lec(int Senior_Lec) {
        this.Senior_Lec = Senior_Lec;
    }

    public int getTA() {
        return TA;
    }

    public void setTA(int TA) {
        this.TA = TA;
    }

    @Override
    public String toString() {
        return type + "{" + "D_head=" + D_head + ", Proff=" + Proff + ", Assistant_Proof=" + Assistant_Proof + ", Senior_Lec=" + Senior_Lec + ", TA=" + TA + '}';
    }
    
}
    

