public class H03_35 {
    public String reverse(String s){
        if(s.length() == 0) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
