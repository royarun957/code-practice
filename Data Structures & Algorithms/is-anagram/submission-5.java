class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()){
        return false;
      }
      if ((s.length() == 1 && t.length() == 1) && s.charAt(0) == t.charAt(0)) {
          return true;
      }
      else{
        HashMap s_map = charMap(s);
        HashMap t_map = charMap(t);
        return s_map.equals(t_map);
      }   
    }

    public static HashMap charMap(String x){
      HashMap<Character, Integer> mapper = new HashMap<>();
      int lenOfx = x.length() ;
      for(int i =0; i<lenOfx; i++){
        if(mapper.containsKey(x.charAt(i))) {
            mapper.put(x.charAt(i), mapper.get(x.charAt(i))+1);
        }
        else{
          mapper.put(x.charAt(i), 1);
        }
      }
      return mapper;
    }
}

