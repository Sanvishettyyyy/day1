public class recursion15 {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static void printComb(String str,int idx,String comb){
    if(idx==str.length()){
        System.out.println(comb);
        return;
    }
    char currchar=str.charAt(idx);
    String mapping=keypad[currchar-'0'];
for(int i=0;i<mapping.length();i++){
    printComb(str,idx+1,comb+mapping.charAt(i));
}}
public static void main(String[]args){
    String str="123";
    printComb(str,0,"");
}
}