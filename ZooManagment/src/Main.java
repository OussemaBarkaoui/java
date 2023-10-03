import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /* int nbrCage=20;
       String zooName="my zoo";
        boolean validInput = false;
        //System.out.println(zooName+" comporte "+nbrCage+" cages");
        Scanner myobjet=new Scanner(System.in);

        System.out.println("donner le nom de zoo");
        String name= myobjet.nextLine();

        System.out.println("donner les nombres des cages ");

        while (!validInput) {
            if (myobjet.hasNextInt()) {
                nbrCage = myobjet.nextInt();
                validInput = true;
            } else {
                System.out.println("Please enter a valid integer for the number of cages.");
                myobjet.next(); // Clear the invalid input
            }
        }
        if(validInput)
        {
            System.out.println(name+" comporte "+nbrCage+" cages");
        }

    }*/
      Animal lion=new Animal("simba","cats",5,false);

        Zoo myZoo1=new Zoo("esprit","Ariana",20);
        Zoo myZoo2=new Zoo("esprit","Ariana",20);
 /*
        myZoo.animals[0]=lion;
        myZoo.displayZoo();
        System.out.println("*********************");

        System.out.println(myZoo);
        System.out.println("****************");
        System.out.println(myZoo.toString());
        System.out.println("****************");
        System.out.println(lion.tostring());*/
        myZoo1.addAnimal(lion);

        //myZoo1.displayZoo();
boolean a=myZoo1.iszoofull();
        System.out.println(a);
        Zoo zoo=new Zoo("","",0);
        zoo.compareZoo(myZoo1,myZoo2);
        System.out.println(zoo.toString());
}}