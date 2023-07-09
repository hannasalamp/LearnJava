package Problems;

public class CharacterInStr {
    public static void main(String[] args) {
//find the number of occurrence of a character in a string
        String str="malayalam";
        int len=str.length();
        int count=0;
        char search='a';
        for(int i=0; i<len; i++){
            if(str.charAt(i)==search){
                count++;
            }
        }
        System.out.println(count);
    }
}
