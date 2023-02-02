class Solution {
    public String thousandSeparator(int n) {
        
        char[] nCharArr = String.valueOf(n).toCharArray();
        int newCharArrLen = nCharArr.length + ((nCharArr.length - 1) / 3);
        char[] newCharArr = new char[newCharArrLen];
        
        newCharArr[newCharArrLen - 1] = nCharArr[nCharArr.length - 1];
        
        int counter = 1;
        for (int i = newCharArrLen - 2, j = nCharArr.length - 2; j >= 0; i--, j--){
            if (counter % 3 == 0){
                newCharArr[i] = '.';
                i--;
            }
            newCharArr[i] = nCharArr[j];
            counter++;
        }
        return new String(newCharArr);
    }
}