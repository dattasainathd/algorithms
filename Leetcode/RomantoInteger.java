public class Solution {
    public int romanToInt(String s) {
        int l = s.length();
        int total = 0;
        int val = 0;
        for(int i =l-1; i>=0; i--){
            if(s.charAt(i)=='I')
                total += (total>=5?-1:1);
            else if(s.charAt(i)=='V')
                total += 5;
            else if(s.charAt(i)=='X')
                total += 10*(total>=50?-1:1);
            else if(s.charAt(i)=='L')
                total += 50;
            else if(s.charAt(i)=='C')
                total += 100*(total>=500?-1:1);
            else if(s.charAt(i)=='D')
                total += 500;
            else if(s.charAt(i)=='M')
                total += 1000*(total>=5000?-1:1);
        }
        return total;
    }
}
