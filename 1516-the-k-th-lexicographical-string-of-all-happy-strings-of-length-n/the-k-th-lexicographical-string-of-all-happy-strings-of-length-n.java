class Solution {
    public String getHappyString(int n, int k) {
        List<String> ll=new ArrayList<>();
        happy(n,"",ll,0);
        if(ll.size()<k){
            return "";
        }
        return ll.get(k-1);
    }
    public static void happy(int n,String ans,List<String> ll,int len){
        if(len==n){
            ll.add(ans);
            return;
        }
        for(char c:new char[]{'a','b','c'}){
            if(ans.length()==0 || ans.charAt(ans.length()-1)!=c){
                happy(n,ans+c,ll,len+1);
            }
        }
    }
}