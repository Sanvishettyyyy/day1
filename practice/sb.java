public class sb {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Sanvi");
        System.out.println(sb);

        // System.out.println(sb.charAt(0));

        // sb.setCharAt(0,'V');
        // System.out.println(sb);
        sb.insert(0,'V');
        System.out.println(sb);
    }
}
