public class sbreverse {
    public static void main(String[]args){
        StringBuilder sb=new StringBuilder("krishna");
        for(int i=0;i<sb.length()/2;i++){   //loop till half the length
            int front=i; //front index
            int back=sb.length()-1-i;  //back index
 char frontchar=sb.charAt(front);// get character at front index
 char backchar=sb.charAt(back);// get character at back index
 sb.setCharAt(front,backchar);//replace front character with back character
 sb.setCharAt(back,frontchar);//replace back character with front character

        }
        System.out.println(sb);
    }
}
