class Solution {
    public String gcdOfStrings(String str1, String str2) {
        char[] str1CharArr = str1.toCharArray();
        char[] str2CharArr = str2.toCharArray();
        
        char[] shorterArr = (str1CharArr.length) < (str2CharArr.length) ? str1CharArr : str2CharArr;
        char[] longerArr = (str1CharArr.length) < (str2CharArr.length) ? str2CharArr : str1CharArr;

        String subStr = "";
        String result = "";
        for (int i = 0; i < shorterArr.length; i++){
            subStr += Character.toString(shorterArr[i]);
            if(shorterArr.length % subStr.toCharArray().length != 0) continue;
            if(longerArr.length % subStr.toCharArray().length != 0) continue;
            
            int divide = longerArr.length / subStr.toCharArray().length;
            String completeString = "";
            for (int d = 0; d < divide; d++){
                completeString += subStr;
            }
            System.out.println(completeString);
            if (!completeString.equals(String.valueOf(longerArr))){
                continue;
            }

            completeString = "";
            divide = shorterArr.length / subStr.toCharArray().length;
            for (int d = 0; d < divide; d++){
                completeString += subStr;
            }

            if (!completeString.equals(String.valueOf(shorterArr))){
                continue;
            }
            result = subStr;
        }
        return result;
    }
}