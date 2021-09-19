package project1;

public class Player {
   private String name;
   private int age;
   private String country;
   private int power;

    public Player(String name, int age, String country, int power) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.power = power;
    }
    public String getName (){
        return name;
    }
    public int getAge (){
        return age;
    }
    public String getCountry () {
        return country;
    }
    public int getPower (){
        return power;
    }
    public String getInfo(){
        return ("name:" + this.name + "\n" + "age:" + this.age + "\n" + "country:" + this.country + "\n" + "power:" + this.power + "\n" + "*****" + "\n");
    }

   }