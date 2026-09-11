class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
        int a= x,dig=0,rev=0;
        while(x!=0){
            dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(a==rev)
        {
        return true;
        }
        return false;
        }
        else
        {
        return false;
        }
    }
}