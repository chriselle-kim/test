public class Currency_Conversion {

    private double StartAmount;
    private int StartCurr;
    private int EndCurr;
    private int success=1;

    public double CalculateEndAmount(Transaction transaction){      
        this.StartCurr=transaction.getStartCurr();
        this.EndCurr=transaction.getEndCurr();
        this.StartAmount=transaction.getStartAmount();
        
        if (StartCurr==1){    
            if (EndCurr==1){                           // conversion of php to php
                return StartAmount;
            } else if (EndCurr==2){                    // conversion of php to usd
                return (StartAmount* 0.017);
            } else if (EndCurr==3){                    // conversion of php to eur
                return (StartAmount* 0.014);
            } else{
                success=0;
                System.out.println ("Please enter a valid option.");
            }
        } else if (StartCurr==2){
            if (EndCurr==2){                            // conversion of usd to usd
                return StartAmount;
            } else if (EndCurr==1){                     // conversion of php to usd
                return (StartAmount* 59.00);
            } else if (EndCurr==3){                     // conersion of usd to eur
                return (StartAmount* 0.8431); 
            } else{
                success=0;
                System.out.println ("Please enter a valid option.");
            }
        } else if (StartCurr==3){
            if (EndCurr==3){                             // conversion of eur to eur 
                return StartAmount;
            } else if (EndCurr==1){                      // conversion of php to eur 
                return (StartAmount* 69.92);
            } else if (EndCurr==2){                      // conversion of eur to usd
                return (StartAmount* 1.1857);
            } else{
                success=0;
                System.out.println ("Please enter a valid option.");  // Invalid option message 
            }
        } else {
            success=0;
            System.out.println ("Please enter a valid option.");     // Invalid input message 
        }
        return success; // just to return a value
    }


    public int Check_Success(){   // to check if there was successful conversion to know whether to print bill or not 
        return success;           // since we had to return a value at the CalculateEndAmount method even when conversion was invalid
    }
    
}