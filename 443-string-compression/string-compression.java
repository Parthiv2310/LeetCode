class Solution {
    public int compress(char[] chars) {
        char previousChar = chars[0];
        int count=1;
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<chars.length; i++){
            char currentChar = chars[i];

            if(previousChar == currentChar){
                count++;
            }
            else {
                sb.append(previousChar);
                if(count > 1) sb.append(count);
                previousChar = currentChar;
                count=1;
            }
        }        
        sb.append(previousChar);
        if(count > 1) sb.append(count);

        for(int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}