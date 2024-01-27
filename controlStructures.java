public class controlStructures{
    public static void main(String[] args){
        int x=10;
       int  y=12;

        //simple if statement
        if(x+y>20){
            System.out.println(" X + Y is greater than 20");
        }

        //IF- Else statement
        if(x+y<10){
                 System.out.println(" X + Y is less than 10");
        } else{
                 System.out.println(" X + Y is greater than 20");
        }

        //IF-else-If ladder
        String city="Nairobi";
        if(city=="mombasa"){
             System.out.println("My city is Mombasa");
             
        }else if(city=="Nakuru"){
            System.out.println("My city is Nakuru");

        }else if(city=="Lagos"){
            System.out.println("My city is Lagos");

        }else{
            System.out.println(city);
        }
        //Nested if statements
        String address="Delhi, India";
        if(address.endsWith("India")){
            if(address.contains("Dubai")){
                System.out.println("Your home is Dubai");
            }else if(address.contains("Kenya")){
                System.out.println("Your home is Kenya");
            }else{
                 System.out.println(address.split(",")[0]);
            }

        }else{
                    System.out.println("You are not Leaving in India");
        }
    }
}