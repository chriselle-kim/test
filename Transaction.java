public class Transaction {

    private double StartAmount;   // object for transaction
    private int StartCurr;
    private int EndCurr;

    public Transaction (int StartCurr, int EndCurr, double StartAmount){
        this.StartCurr = StartCurr;
        this.EndCurr = EndCurr;
        this.StartAmount = StartAmount;
    }

    public double getStartAmount() {   // getters
        return StartAmount;
    }

    public int getStartCurr() {
        return StartCurr;
    }

    public int getEndCurr() {
        return EndCurr;
    }

    

}
