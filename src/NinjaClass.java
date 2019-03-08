public class NinjaClass {

    //ATTRIBUTES  (Class variables)
    private String name;
    private int health;
    private int stamina;
    private int strength;
    private String characterClass;


//METHODS:

    //CONSTRUCTORS- initialize the class
    public NinjaClass()			//default constructor
    {
        name="Buquifious";
        health=100;
        stamina=100;
        strength=5;
        characterClass="Ninja";
    }
    //public NinjaCharacter(String n);    //second constructor



    //ACCESSORS: Allow access to information without changing it

    public void printNinjaClass()
    {
        System.out.println(name + " the Character\nHealth:" + health + "\nStamina: "
                + stamina + "\nStrength: " + strength + "/nCharacterClass: " +characterClass );

    }

    public int getHealth()  	  //returns the halth of the character
    {
        return health;
    }

    public int getStamina()
    {
        return stamina;
    }

    public int getStrength()
    {
        return strength;
    }

    public String getCharacterClass()
    {
        return characterClass;
    }
    //MODIFIERS:  Allow user to change information in the class


    //public void upgradestrength(String newcolor);

    public void setHealth(int health)
    {
        this.health= health;
    }

    public void setStamina(int stamina)
    {
        this.stamina= stamina;
    }

    public void setStrength(int strength)
    {
        this.strength= strength;
    }

    public void attributes()                   //changes location
    {
        if (characterClass.equals("Ninja"))
        {
            setHealth(50);
        }


        if (characterClass.equals("Ninja"))
        {
            setStamina(50);
        }


        if (characterClass.equals("Ninja"))
        {
            setStrength(10);
        }





    }
}
