public class Main{
    public static void main(String[] args){
        //One start
        One one = new One();

        if(one.getX() <= 5 && one.getZ() != one.getY()){
            System.out.println("Test A passed");
        } else {
            System.out.println("Test A failed");
        }

        if(one.getX() == 5 || one.getX() == one.getY() && one.getZ() == 3){
            System.out.println("Test B passed");
        } else {
            System.out.println("Test B failed");
        }

        if((one.getX()/one.getY()) > (one.getZ()/one.getX())){
            System.out.println("Test C passed");
        } else {
            System.out.println("Test C failed");
        }

        if(!(one.getX() != (one.getY() - one.getZ())) == false){
            System.out.println("Test D passed");
        } else {
            System.out.println("Test D failed");
        }

        if(2 * one.getX() != one.getX() || one.getX() == 0){
            System.out.println("Test E passed");
        } else {
            System.out.println("Test E failed");
        }

        if(!true||!false){
            System.out.println("Test F passed");
        } else {
            System.out.println("Test F failed");
        }
        //One end

        //Two start
        Two two = new Two();

        if(two.getX()+two.getY() > 100){
            System.out.println("X + Y is over 100");
        } else {
            System.out.println("X + Y is 100 or lower");
        }

        for (int i = 0; i < 10; i++) {
            two.setX((int)(Math.random()*100+1));
            two.setY((int)(Math.random()*100+1));

            if(two.getX()+two.getY() > 100){
                System.out.println("X + Y is over 100");
            } else {
                System.out.println("X + Y is 100 or lower");
            }
        }
        //Two end

        //Four start
        Four four = new Four();

        for (int i = 0; i < 10; i++) {
            four.setFirst((int)(Math.random()*100+1));
            four.setSecond((int)(Math.random()*100+1));
            four.setThird((int)(Math.random()*100+1));

            if(four.getFirst() > four.getSecond() && four.getFirst() > four.getThird()){
                System.out.println("First is biggest");
            } else if(four.getSecond() > four.getFirst() && four.getSecond() > four.getThird()){
                System.out.println("Second is biggest");
            } else if(four.getThird() > four.getSecond() && four.getFirst() < four.getThird()){
                System.out.println("Third is biggest");
            } else if(four.getFirst() == four.getSecond() && four.getFirst() > four.getThird()){
                System.out.println("First and Second are equal");
            } else if(four.getFirst() > four.getSecond() && four.getFirst() == four.getThird()){
                System.out.println("First and Third are equal");
            } else if(four.getFirst() < four.getSecond() && four.getSecond() == four.getThird()){
                System.out.println("Second and Third are equal");
            } else{
                System.out.println("All three are equal");
            }
        }
        //Four end

        //Five start
        Five five = new Five();

        for(int i = 0; i < 25; i++) {
            if(five.getX() < 10){
                System.out.print(five.getX());
                System.out.println(" belongs to [0:9]");
            } else if(five.getX() < 20){
                System.out.print(five.getX());
                System.out.println(" belongs to [10:19]");
            } else if(five.getX() < 30){
                System.out.print(five.getX());
                System.out.println(" belongs to [20:29]");
            } else if(five.getX() < 40){
                System.out.print(five.getX());
                System.out.println(" belongs to [30:39]");
            } else if(five.getX() < 50){
                System.out.print(five.getX());
                System.out.println(" belongs to [40:49]");
            } else if(five.getX() < 60){
                System.out.print(five.getX());
                System.out.println(" belongs to [50:59]");
            } else if(five.getX() < 70){
                System.out.print(five.getX());
                System.out.println(" belongs to [60:69]");
            } else if(five.getX() < 80){
                System.out.print(five.getX());
                System.out.println(" belongs to [70:79]");
            } else if(five.getX() < 90){
                System.out.print(five.getX());
                System.out.println(" belongs to [80:89]");
            } else if(five.getX() < 100){
                System.out.print(five.getX());
                System.out.println(" belongs to [90:99]");
            }

            five.setX((int)(Math.random()*100));
        }
        //Five end

        //Six start
        Six six = new Six();

        for (int i = 0; i < 10; i++) {
            six.setX((int)(Math.random()*100+1));
            six.setY((int)(Math.random()*100+1));
            six.setZ((int)(Math.random()*100+1));

            System.out.print(six.getMidpoint());
            System.out.print(" is midpoint of ");
            System.out.print(six.getX());
            System.out.print(", ");
            System.out.print(six.getY());
            System.out.print(", ");
            System.out.println(six.getZ());
        }

        //Six end
    }
}