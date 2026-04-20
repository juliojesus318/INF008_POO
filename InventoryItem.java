public class InventoryItem
{
    private int itemCode;
    private String description;
    private double unitPrice;
    private int quantityInStock;
    private int minimumStockLevel;
    public boolean empty;


    public InventoryItem() {
        this.itemCode = 0;
        this.description = " ";
        unitPrice = 0.0;
        minimumStockLevel = 0;
        quantityInStock = 0;
        this.empty = true;
    }
     public InventoryItem(int itemCode, String description, double unitPrice, int quantityInStock, int minimumStockLevel) {
        this.itemCode = itemCode;
        this.description = description;
        setUnitPrice(unitPrice);
        setMinimumQuantity(minimumStockLevel, quantityInStock);
    }



    public InventoryItem(int itemCode)
    {
        this.itemCode = itemCode;
    }

    public InventoryItem(String description)
    {
        this.description = description;
    }

    public InventoryItem(double unitPricel)
    {
        this.unitPrice = unitPrice;

    }
    public InventoryItem(int minimumStockLevel, int quantityInStock)
    {
        this.minimumStockLevel = minimumStockLevel;
        this.quantityInStock = quantityInStock;
    }



    public void setCode(int itemCode)
    {
        this.itemCode = itemCode;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setUnitPrice(double unitPrice)
    {
        if(unitPrice > 0)
        {
            this.unitPrice = unitPrice;
        }
    }

    public void setMinimumQuantity(int minimumStockLevel, int quantityInStock)
    {
        if(minimumStockLevel > 0 && quantityInStock >= 0)
        {
            this.minimumStockLevel = minimumStockLevel;
            this.quantityInStock = quantityInStock;
        }
    }

    public double applyDiscount(double percentage)
    {
        percentage = unitPrice * 0.1;
        return unitPrice -= percentage;
    }

    public int updateStock(int quantityInStock)
    {
        if(quantityInStock >= 0 )
            this.quantityInStock = quantityInStock;
        return quantityInStock;
    }

    public int updateStock(int quantityInStock, boolean empty)
    {
        if(empty == false)
            this.quantityInStock -= quantityInStock;
        return quantityInStock;
    }

    public boolean isBelowMinimumStock()
    {
        if(quantityInStock >= 1)
        {
            empty = false;
        }
        return empty;

    }

    public void display()
    {
        System.out.println("cod -> " + itemCode + "\ndescription -> " + description + "\nquantity -> "+ quantityInStock + "\nprice -> "+ unitPrice  + "\nminimum -> " + minimumStockLevel);
    }

    public static void main(String[] args)
    {
        InventoryItem c1 = new InventoryItem();
        c1.setCode(13215);
        c1.setDescription("e de novo");
        c1.setMinimumQuantity(1, 1);
        c1.setUnitPrice(9.99);

        c1.applyDiscount(10);
        System.out.println(c1.empty);
        if(c1.isBelowMinimumStock() == false)
        {
        System.out.println(c1.empty);
            boolean back = c1.isBelowMinimumStock();
            c1.updateStock(1, back);
        }
        c1.display();

    }
}
