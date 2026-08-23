class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(String val : strs) {
            int count[]=new int[26];
            for(char ch : val.toCharArray()) {
                count[ch-'a']++;
            }
            StringBuilder key=new StringBuilder();
            for(int i=0;i<26;i++) {
                key.append("#");
                key.append(count[i]);
            } 
            if(!map.containsKey(key.toString())) {
                map.put(key.toString(),new ArrayList<>());
            }

            map.get(key.toString()).add(val);
        }

        return new ArrayList<>(map.values());
    }
}