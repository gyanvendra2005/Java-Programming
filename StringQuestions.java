public class StringQuestions{
    public static void main(String[] args){
        String str = "abcb";
        String temp;
        int n = str.length();
        int i=0;
        int j= n-1;
        int flag=0;
        while(i<=n/2){
           if(str.charAt(i)==str.charAt(j)){
            flag =1;
           }
           else{
              flag=0;
              break;
           }
           i++;
           j--;
        }
        if(flag==1){
            System.out.print("palindrome");
        }
    }
}