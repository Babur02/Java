package String;

public class Count {
    public static void main(String[] args) {
        String str = "ONCE UPON A TIME IN MUMBAI";
        char arr[] = str.toCharArray();
        int size = arr.length;
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        int i = 0;
        while (i != size) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')
                    ++vowels;
                else
                    ++consonants;
            } else
                ++spaces;
            ++i;
        }
        System.out.println(arr);
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Spaces : " + spaces);
    }
}
