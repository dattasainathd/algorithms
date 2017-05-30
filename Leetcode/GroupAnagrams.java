public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> res = new ArrayList<List<String>>();
        if(strs.length == 0 ||strs == null)
            return res;

        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String k = String.valueOf(c);
            if(!map.containsKey(k))
                map.put(k, new ArrayList<String>());
            map.get(k).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
