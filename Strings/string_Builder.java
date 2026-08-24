public class string_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }

        // for sb ,TC = O(26) -> O(n)
        // for string , TC = O(n*26) -> O(n*n)
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
