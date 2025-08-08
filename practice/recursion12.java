public class recursion12 {
    public static boolean map[]=new boolean[26];
    public static void remDup(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){  //currchar-'a'=map index
            remDup(str,idx+1,newString);
        }
        else{
            newString+=currchar;
            map[currchar-'a']=true;
            remDup(str,idx+1,newString);
        }
 
    }
    public static void main(String[]args){
String str="abbccdaeaffdgas";
remDup(str,0,"");   
 }
}
