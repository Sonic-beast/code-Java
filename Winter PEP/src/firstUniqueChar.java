public class firstUniqueChar {
        public static char findFirstUnique(String str) {
            int[] freq = new int[256]; // Frequency array for ASCII characters
            StringBuilder sb = new StringBuilder(str); // StringBuilder for character order

            // Step 1: Count frequency of each character
            for (int i = 0; i < sb.length(); i++) {
                freq[sb.charAt(i)]++; // Convert char to integer (ASCII) and count
            }

            // Step 2: Find the first character with frequency 1
            for (int i = 0; i < sb.length(); i++) {
                if (freq[sb.charAt(i)] == 1) {
                    return sb.charAt(i); // Return first unique character
                }
            }

            return '';
        }

        public static void main(String[] args) {
            String str = "swiss";
            System.out.println("First Unique Character: " + new firstUniqueChar(str));
        }
    }

