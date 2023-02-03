class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        
        int startedNum = arr[0];
        int repeatedTime = 0;
        boolean result = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                
                if (j - i > arr.length / 2) break;
                if (j - i + 1 != m ) continue;
                
                int count = 1;
                int[] subArr = Arrays.copyOfRange(arr, i, j + 1);

                int startIdx = 0;
                int fullArrIdx = j + 1;

                while(true){                    
                    if (fullArrIdx == arr.length) break;
                    if (arr[fullArrIdx] != subArr[startIdx]) break;

                    fullArrIdx++;
                    startIdx ++;
                    
                    if (startIdx == subArr.length){     
                        count ++;
                        startIdx = 0;
                    }
                    
                }
                
                if (count >= k) {
                    result = true;
                    return result;
                }
            }
            
        
        }
        
        return result;
        
    }
}