public class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if(digits.length()==0)
            return res;

        res.add("");

        for(int i =0; i< digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(res.peek().length()== i){
                String t = res.remove();
                for(char s: map[x].toCharArray())
                    res.add(t+s);
            }
        }
        return res;
    }
}
