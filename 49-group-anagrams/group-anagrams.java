class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        
        
        
        for(int i=0;i<strs.length;i++){
            
            String input=strs[i];
            char[] newString = input.toCharArray();
            Arrays.sort(newString);
            String key = new String(newString);
            if(!map.containsKey(key)){
            List<String> list = new ArrayList<>();
            map.put(key,list);

            }
            
            List<String> newlist=map.get(key);
            newlist.add(strs[i]);
            
            
            
        }
        List<List<String>> answer = new ArrayList<>();

        for (List<String> list : map.values()) {
            answer.add(list);
                                        }

        return answer;
        

        
    }
}