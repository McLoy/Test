public class FeedingSchedule {
    public static void main(String[] args) {
//        boolean keepGoing = true;
//        int count = 0;
//        int x = 3;
//        while (count++ < 3){
//            int y = (1 + 2*count)%3;
//            switch (y){
//                default:
//                case 0: x -=1; break;
//                case 1: x +=5;
//            }
//        }
//        System.out.println(x);

//        System.out.println("a");
//        try{
//            System.out.println("b");
//            throw  new IllegalArgumentException();
//        } catch (RuntimeException e){
//            System.out.println("c");
//        } finally {
//            System.out.println("d");
//        }
//        System.out.println("e");

        int x = 5, j = 0;
        OUTER: for (int i=0;i<3;)
            INNER: do{
                i++; x++;
                if(x>10) break INNER;
                x +=4;
                j++;
            } while (j <= 2);
        System.out.println(x);
    }}
