class Solution {
    public boolean canConstruct(String r, String m) {

        HashMap<Character , Integer> map = new HashMap<>();
        int i=0;
        while(i<r.length()) {
            char ch = r.charAt(i);
            if(map.containsKey(ch)==false) {
                map.put(ch , 1);
            }
            else {
                map.put(ch , map.get(ch)+1);
            }
            i++;
        } 

        HashMap<Character , Integer> sap = new HashMap<>();
        int j=0;
        while(j<m.length()) {
            char ch = m.charAt(j);
            if(sap.containsKey(ch)==false) {
                sap.put(ch , 1);
            }
            else {
                sap.put(ch , sap.get(ch)+1);
            }
            j++;
        }
        for(char ch : map.keySet()) {
            if(!sap.containsKey(ch)) {
                return false;
            }

            if(sap.get(ch) < map.get(ch)) {
                return false;
            }
        }

        return true;
    }
}