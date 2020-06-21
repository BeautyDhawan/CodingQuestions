package String;

public class String {
    public static void ReverseString(java.lang.String a) {
        System.out.println("string=" + a);
        char[] ch = a.toCharArray();

        int left = 0;

        int right = ch.length - 1;

        while (left < right) {
            if (Character.isLetter(ch[left]) && Character.isLetter(ch[right])) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            } else if (!(Character.isLetter(ch[left]) && Character.isLetter(ch[right]))) {
                left++;
                right--;
            } else if (Character.isLetter(ch[left])) {
                right--;
            } else if (Character.isLetter(ch[right])) {
                left++;
            }
        }

        System.out.println(ch);
    }

    public static void main(String[] args) {
        java.lang.String a = "ab#cd@@u";
        String.ReverseString(a);
    }
}
