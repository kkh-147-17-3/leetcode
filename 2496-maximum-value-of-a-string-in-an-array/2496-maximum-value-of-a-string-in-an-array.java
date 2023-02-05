class Solution {
    public int maximumValue(String[] strs) {
        int length = strs.length;
        int[] values = new int[length];
        for (int i = 0; i < length; i++){
            try{
                values[i] = Integer.parseInt(strs[i]);
            }
            catch(NumberFormatException e){
                values[i] = strs[i].length();
            }
        }
        Arrays.sort(values);
        return values[length - 1];
    }
}