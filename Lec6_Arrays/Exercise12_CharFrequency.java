import java.util.Scanner;

public class Exercise12_CharFrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int[] freq=new int[26];
        for(char c:s.toCharArray()) if(c>='a'&&c<='z') freq[c-'a']++;
        for(int i=0;i<26;i++) if(freq[i]>0) System.out.println((char)('a'+i)+": "+freq[i]);
        sc.close();
    }
}
