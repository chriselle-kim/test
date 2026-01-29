public class Billing {

    private String StartCur;
    private String EndCur;

    public void printBill(Transaction transaction, Currency_Conversion currency_Conversion, double EndAmount) {

        if ((transaction.getStartCurr())==1){                 // for currency label at printed bill
            StartCur="PhP";
        } else if ((transaction.getStartCurr())==2){
            StartCur="USD";
        } else {
            StartCur="EUR";
        }

        if ((transaction.getEndCurr())==1){
            EndCur="PhP";
        } else if ((transaction.getEndCurr())==2){
            EndCur="USD";
        } else {
            EndCur="EUR";
        }

        if ((currency_Conversion.Check_Success())==1){
            System.out.println("\n------- MONEY EXCHANGE BILL -------");
            System.out.println("BASE AMOUNT   :  " + StartCur + " " + transaction.getStartAmount());
            System.out.println("QUOTE AMOUNT  :  " + EndCur + " " + EndAmount);
            System.out.println("\nTransaction Successful!");
            System.out.println("------------------------------------");
        }

        
    }
}
