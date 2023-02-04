class Solution {
    public String makeGood(String s) {
        
        int currentPos = 0;        
        Character[] charObjectArray = s.chars().mapToObj(c -> (char)c).toArray(Character[]::new); 
        
        List<Character> list = new LinkedList<>();
        Collections.addAll(list, charObjectArray);
        
        while (currentPos < list.size() - 1){
            if (isAdjacentLetterSameChar(list.get(currentPos), list.get(currentPos+1))){
                list.remove(currentPos);
                list.remove(currentPos);
                currentPos = 0;    
            }
            else{
                currentPos ++;
            }
        }
        
        String result = list.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining());
                
        return result;
    }
    
    boolean isAdjacentLetterSameChar(char c1, char c2){
        if (c1 + 32 == c2 || c1 - 32 == c2){
            return true;
        }
        return false;
    }
}