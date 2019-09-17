public class Seven{
    private int x,y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int temp) {
        x = temp;
    }

    public void setY(int temp) {
        y = temp;
    }

    public int getDiff(){
        return Math.abs(x*y);
    }
}
