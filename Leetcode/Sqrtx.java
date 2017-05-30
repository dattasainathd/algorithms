import java.lang.*;
public class Solution {
    public int mySqrt(int x) {
        long y = x;
        while(y*y>x)
            y = (y+x/y)*1/2;
        return (int) y;
    }
}
