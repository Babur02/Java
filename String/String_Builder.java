public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        StringBuffer sf=new StringBuffer(sb);
        sb.append('a');
        System.out.println(sb);
    }
}
// String class is immutable,slow consumes more memory whem concate
// StringBuilder class is used to create mutable(modifiable) String,non-synchronized,introduced in Java1.5
// StringBuffer class is used to create mutable(modifiable) String objects.It is same as String class except it is mutable,fast consumes less memory in concatenation,synchronized,introduced in Java1.0