public class Main {

    public static void main(String[] args)
    {
        //Declarations
        double price =0;
        double ship;

        //User Output
        System.out.println("Enter the price of your item");

        //Input
        price = 150;
        System.out.println(price);

        //Conditions
        if (price >= 100)
        {
            //Calc
            ship = price *.02;
            price = ship +price;

            //Output
            System.out.println("Your Shipping Cost: "+ship+" final price of your item: "+price);
        }
        else
        {
            //Output
            System.out.println("Your Shipping Cost: Free final price of your item: "+price);

        }






    }
}