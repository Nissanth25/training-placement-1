import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Map<String, String> phoneBook = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine().trim();
            String phoneNumber = scanner.nextLine().trim();
            phoneBook.put(name, phoneNumber);
        }
      
        while (scanner.hasNext()) {
            String query = scanner.nextLine().trim();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        
        scanner.close();
    }
}
