public class RPGproject {

    //ATTRIBUTES  (Class variables)
    private String name;
    private int health;
    private int stamina;
    private int strength;
    private String characterClass;


//METHODS:

    //CONSTRUCTORS- initialize the class
    public RPGproject()			//default constructor
    {
        name="Uncle Terry";
        health=50;
        stamina=50;
        strength=10;
        characterClass="Mage";
    }



    //ACCESSORS: Allow access to information without changing it

    public void printRPGproject()
    {
        System.out.println(name + " the Character\nHealth:" + health + "\nStamina: "
                + stamina + "\nStrength: " + strength + "/nCharacterClass: " +characterClass );

    }

    public int getHealth() 	  //returns the halth of the character
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

    public void rename(String newname)   //changes name
    {
        name=newname;
    }

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
        if (characterClass.equals("Mage"))
        {
            setHealth(50);
        }


        if (characterClass.equals("Mage"))
        {
            setStamina(50);
        }


        if (characterClass.equals("Mage"))
        {
            setStrength(10);
        }


    }

}
