package array;

public class count {

    public static void main(String[] args) {
        int num = 0;
        String input = "APC\n" +
                "APC/Yeast&Mold\n" +
                "APC/Yeast&Mold/Listeria\n" +
                "STX";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '/' || input.charAt(i) == '&'
            || input.charAt(i) == '\n') {
                num++;
            }
        }

        System.out.println(num+1);
    }
}
