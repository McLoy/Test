/**
 * Created by User on 26.01.2016.
 */
class Chiken{}

interface HenHouse{public java.util.List<Chiken> getChikens();}

public class ChikenSong {
    public static void main(String[] args) {
        HenHouse house = _____
                Chiken chiken = house.getChikens().get(0);
        for (int i=0;i<house.getChikens().size();
                chiken = house.getChikens().get(i++)){
            System.out.println("Cluck");
        }
    }
}
