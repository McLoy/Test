/**
 * Created by User on 26.01.2016.
 */
public class BearOrShark {
    public static void main(String[] args) {
        int luck = 10;
        if ((luck>10?luck++:--luck)<10){
            System.out.print("Bear");
        } if(luck<10) System.out.print("Shark");
    }
}
