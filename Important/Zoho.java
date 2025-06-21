public class Zoho {

    class LongestSameCharsubsequence {
        public static void printLongestSubstring(String str) {
            int maxLen = -1;
            int start = 0, end = 0;

            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                for(int j = str.length() - 1; j > i; j--) {
                    if(ch == str.charAt(j)) {
                       int len = j - i;
                       if(maxLen < len) {
                            maxLen = len;
                            start = i;
                            end = j;
                       }
                       break; 
                    }
                }

            }

            if(maxLen == -1) {
                System.out.println("Not found");
            }else {
                System.out.println("Longest substring: " + str.substring(start, end + 1));
                System.out.println("Length: " + maxLen);
            }
        }
    }


    class TopKFreqEle {
        public static void findTopKFreq(int[] arr, int k) {
            int n = arr.length;
            int[] unique = new int[n];
            int[] freq = new int[n];
            int size = 0;

            for(int i = 0; i < n; i++) {
                boolean found = false;

                for(int j = 0; j < size; j++) {
                    if(arr[i] == unique[j]) {
                        freq[j]++;
                        found = true;
                        break;
                    }
                }

                if(!found) {
                    unique[size] = arr[i];
                    freq[size] = 1;
                    size++;
                }
            }


            for(int i = 0; i < k; i++) {
                int maxFreq = -1;
                int maxIndex = -1;

                for(int j = 0; j < size; j++) {
                    if(freq[j] > maxFreq) {
                        maxFreq = freq[j];
                        maxIndex = j;
                    }
                }

                if(maxIndex != -1) {
                    System.out.println(unique[maxIndex] + " ");
                    freq[maxIndex] = -1;
                }
            }

            System.out.println();
        }
    }

    class NGE {
        public static void nextGreater(int[] arr, int n) {
            int[] res = new int[n];
            int[] stack = new int[n];
            int top = -1;

            for(int i = n - 1; i >= 0; i--) {

                while(top >= 0 && stack[top] <= arr[i]) {
                    top--;
                }
                
                if(top == -1) {
                    res[i] = -1;
                }else {
                    res[i] = stack[top];
                }

                stack[++top] = arr[i];
            }
        }
    }
}

