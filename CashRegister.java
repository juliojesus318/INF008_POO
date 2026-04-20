class cashRegister
{
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    public cashRegister(){}

    public cashRegister(String registerId, double currentBalance)
    {
        this.registerId = registerId;
        this.transactionCount = 0;
        this.currentBalance = currentBalance;
    }

    public cashRegister(String registerId, int transactionCount)
    {
        this.registerId = registerId;
        this.transactionCount = transactionCount;
        this.currentBalance = 0;
    }

    public cashRegister(String registerId, int transactionCount, double currentBalance)
    {
        this.registerId = registerId;
        this.transactionCount = transactionCount;
        this.currentBalance = currentBalance;
    }

    void processPayment(double amount)
    {
        if(amount > 0)
        {
            currentBalance += amount;
            transactionCount++;
            System.out.println("paid");
        }else
        {
            System.out.println("NOT paid");
        }
    }

    void processRefund(int refund, double amount)
    {
        if(amount > 0 && amount <= currentBalance)
        {
            currentBalance -= amount;
            transactionCount++;
            System.out.println("refund");
        }else
        {
            System.out.println("NOT refund");
        }

    }
    public void getDailyReport()
        {
            System.out.println("Id -> " + registerId);
            System.out.println("current -> " + currentBalance);
            System.out.println("transactions -> " + transactionCount);
        }
}

public class CashRegister{
    public static void main(String[] args)
    {

    cashRegister c1 = new cashRegister("CAIXA-01", 100);
    c1.processPayment(50);
    c1.processRefund(7600, 20);

    System.out.println("kowalski relatorio");
    c1.getDailyReport();
    }
}
