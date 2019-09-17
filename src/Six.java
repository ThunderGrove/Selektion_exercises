public class Six{
    private int x=1,y=2,z=3;

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    public void setX(int temp){
        x = temp;
    }

    public void setY(int temp){
        y = temp;
    }

    public void setZ(int temp){
        z = temp;
    }

    public int getMidpoint(){
        return Math.max(Math.min(x, y), Math.min(Math.max(x, y), z));
    }
}
