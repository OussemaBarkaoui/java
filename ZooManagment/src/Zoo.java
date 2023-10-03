public class Zoo {
    private Animal[] animals;
    private String name,city;
    private int nbrCages;

    public String getName(){return name;}
    public String getCity(){return city;}
    public int getNbrCages(){return nbrCages;}


    public Zoo(String name,String city,int nbrCages)
    {
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        this.animals=new Animal[20];
    }
    public void displayZoo()
    {
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.nbrCages);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("*************************");
    }
    public String toString() {
        return "Zoo Name: " + this.name + "\nCity: " + this.city + "\nNumber of Cages: " + this.nbrCages;
    }
    public Boolean addAnimal(Animal animal)
    {
        for(int i=0;i<animals.length;i++)
        {
            if(animals[i]==null)
            {
                animals[i]= animal;
                return true;
            }

        }
        return false;
    }
    public boolean iszoofull()
    {
        for(int i=0;i<animals.length;i++)
        {
            if(animals[i]==null)
            {
                return false;
            }

        }
        return true;
    }
    public Zoo compareZoo(Zoo z1,Zoo z2)
    {
        int nombre1=0;
        int nombre2=0;
        for(int i=0;i<z1.animals.length;i++) {
            if (z1.animals[i] != null)
            {
               nombre1++;
            }
        }
        for(int i=0;i<z2.animals.length;i++) {
            if (z2.animals[i] != null)
            {
                nombre2++;
            }
        }
        if(nombre1>nombre2)
            return z1;

        else return z2;
    }
}

