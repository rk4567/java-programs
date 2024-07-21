
import java.util.Scanner;

class profit_loss{
    public static void main(String[] args) {
        double costPrice,sellingPrice,profitPercentage,lossPercentage,profit,loss;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter cost price: ");
        costPrice=scn.nextDouble();
        System.out.println("Enter selling price: ");
        sellingPrice=scn.nextDouble();
        scn.close();
        if(costPrice<sellingPrice)
        {
            profit=sellingPrice-costPrice;
            System.out.println("profit =" +profit);
            profitPercentage=(profit*100)/costPrice;
            System.out.println("profit percentage = "+profitPercentage);
        }
        else if(costPrice>sellingPrice)
        {
            loss=costPrice-sellingPrice;
            System.out.println("loss =" +loss);
            lossPercentage=(loss*100)/costPrice;
            System.out.println("loss percentage = "+lossPercentage);
        }
        else if (sellingPrice==costPrice)
        System.out.println("no profit no loss");


}}