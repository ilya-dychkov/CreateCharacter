import java.util.Random;

public class Main {
    final static Random random = new Random();
    public static void main(String[] args){
        int a=random.nextInt(6)+1;
        Character myChar=new Character();
        switch(random.nextInt(3)){
            case 0:
                myChar = new Character(new RaceDwarves(), new GenerateRandomStats(random.nextInt(4)));
                break;
            case 1:
                myChar = new Character(new RaceHumans(), new GenerateRandomStats(random.nextInt(4)));
                break;
            case 2:
                myChar = new Character(new RaceElves(), new GenerateRandomStats(random.nextInt(4)));
                break;
        }
        System.out.println(myChar.toString());
    }
}
