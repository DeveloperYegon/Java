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


            //SWITCH statements
        int number=2;
        switch (number){
            case 0:
                System.out.println("The number is 0");
            break;
            case 1:
                System.out.println("The number is 1");
            break;
            default:
                System.out.println(number);
            
        }
        //loop statements

        //for loop
        int sum=0;
        for(int j=1;j<=10;j++){
            sum=sum+j;
        }
        System.out.println("The sum of the first 10 natural numbers is:" +sum);


        //for each loop
        String[] names={"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing array items");
        for(String name:names){
            System.out.println(name);
        }

        //while loop
        int i=0;
        System.out.println("Print the list of first 10 even numbers\n");
        while(i<=10){
            System.out.println(i);
            i=i+2;
        }

        //do--while loop
        int n=0;
        System.out.println("Print the list of first 10 even numbers\n");
        do{
            System.out.println(n);
            n=n+2;
        }while(n<=10);
        
         System.out.println("jump statements");
        
        //jump statements
        ////////////////////break
        for(int a=0;a<=10;a++){
            System.out.println(a);
            if(a==6){
                break;
            }
        }
        System.out.println("labeled break");
        //break statement example with labeled for loop             
                 a: 
                for(int b = 0; b<= 10; b++) { 
                        b: 
                        for(int q = 0; q<=15;q++) { 
                            c: 
                            for (int k = 0; k<=20; k++) { 
                                System.out.println(k); 
                                if(k==5) { 
                                break a; 
                                } 
                             } 
                        } 
                        
                } 




System.out.println("jump statements continue");
                //continue statement

        for(int w = 0; w<= 2; w++){
                for (int r = i; r<=5; r++) {
                    if(w == 4) {
                        continue;
                    }
                    System.out.println(w);
                }
         }
    }
}