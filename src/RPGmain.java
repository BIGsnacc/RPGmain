
/*
    1 Get Info
        1.1. Ask the user if they want to start the game
        1.2. Ask the user if they want to fight
        1.3. Ask the user if they want to punch
        1.4. Ask the user if they want to have the Mage punch them.


    2 Do Calculations
        2.1. Add or subtract health from user depending on their answer
        2.2. Add or subtract health from the Mage depending on the user's answer


    3 Print Results
        3.1. Say how much health was given or taken from your character
        3.2. Say how much health was given or taken from the Mage
        3.3. Say if the user or the Mage won





 */







import java.util.Scanner;
public class RPGmain
{
    private RPGproject player1;
    private NinjaClass player2;

    public RPGmain()  //constructor- set values
    {
        player1= new RPGproject();  //You could do this in the run method instead
        player2= new NinjaClass();  //You could do this in the run method instead
    }

    public void run()
    {
        String choice;
        String gameChoice;
        Scanner keyboard = new Scanner(System.in);
        do{

            System.out.println("Would you like to start the game? Yes or No"); // loop for starting the game
            choice=keyboard.nextLine().toLowerCase();
            if(!choice.equals("yes"))	{

                System.out.println("I think you should reconsider your answer. Try answering again.");
            }
        }while(!choice.equals("yes"));
        System.out.println("Hello and welcome to the annual Ninja versus Mage fight night!");
        System.out.println("This fight night is a little different.");
        System.out.println("This years Ninja and Mage will be randomly selected from the crowd!");
        System.out.println("You have been selected to be this nights Ninja!");
        System.out.println("Fight now!");
        System.out.println("You will be asked to attack, if you don't, you will heal by 25 health.");
        while(player1.getHealth()>0||player2.getHealth()>0){   //Attack choice while loop
            System.out.println("Do you attack yes or no?");    //User attack choice
            gameChoice = keyboard.nextLine().toLowerCase();
            if(gameChoice.equals("yes")){
                System.out.println ("Your hit took away 25 of the Mage's health"); //How much damage user attack dealt
                player1.setHealth(player1.getHealth()-25);
            }
            else{
                System.out.println("You gained 25 health points!");  //How much health is gained
                player2.setHealth(player2.getHealth()+25);
            }
            System.out.println("Mage, it is your turn to attack, do you? yes or no:");  //Mage attack choice
            gameChoice = keyboard.nextLine().toLowerCase();
            if(gameChoice.equals("yes")){
                System.out.println ("Your hit took away 50 of the Ninja's health");   //How much damage Mage attack dealt
                player2.setHealth(player2.getHealth()-50);
            }
            else {
                System.out.println("You gained 25 health points!");   //how much user health is gained
                player1.setHealth(player1.getHealth() + 25);
            }           //Winner
                if(player2.getHealth()==0) {
                    System.out.println("The Mage has won the battle!");
                    System.out.println("Thank you for participating.");
                }
                if(player1.getHealth()==0){
                    System.out.println("The Ninja has won the battle!");
                    System.out.println("Thank you for participating.");
                }


        }



    }

    public static void main(String args[])
    {

        RPGmain mygame = new RPGmain();   //game run
        mygame.run();









    }
}

