class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character,Integer> map= new HashMap <>();
        HashMap<Character,Integer> s1_map= new HashMap <>();
        if (s1.length() > s2.length()) {
            return false;
        }
        int l=0;
        int r=s1.length()-1;
        //creating permutation string in map
         for(int j=0;j<s1.length();j++){
            if(!s1_map.containsKey(s1.charAt(j))){
                s1_map.put(s1.charAt(j),1);
            }
            else{
                
                s1_map.put(s1.charAt(j),s1_map.get(s1.charAt(j))+1);
            }
        }

        // create sliding window for the main string 

           
            for(int i=0;i<s1.length();i++){
                    
                if(!map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i),1);
                }
                else{
                    map.put(s2.charAt(i),map.get(s2.charAt(i))+1);
                    }
                }
            while(r<=s2.length()-1){
                if(map.equals(s1_map)){
                    return true;
                }
                if (r == s2.length() - 1){
                    break;
                }
                 map.put(s2.charAt(l),map.get(s2.charAt(l))-1);
                
                if(map.get(s2.charAt(l))==0){
                    map.remove(s2.charAt(l));
                }                   
                         
                l++;

                
                r++;
                

                 if(!map.containsKey(s2.charAt(r))){
                map.put(s2.charAt(r),1);
                }
                else{
                    map.put(s2.charAt(r),map.get(s2.charAt(r))+1);
                    }
                }
                return false;
            
                
            }
        }
        
    

