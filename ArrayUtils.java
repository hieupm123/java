/**
 * Hoàn thiện các phương thức trong lớp ArrayUtils theo các yêu cầu 
 * như trong phần mô tả và đề bài. Các phương thức cần được giữ nguyên dạng
 * tên / danh sách tham đối/ kiểu trả về/ mẫu khai báo ....
 * */
import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;
public class ArrayUtils{

    //thực hiện đọc và trả lại mảng n số nguyên
    public static int[] readArray(Scanner reader){
        int N = reader.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; ++i){
        	arr[i] = reader.nextInt();
        }
        // viết bổ sung mã lệnh
        return arr; //Cần thay đổi giá trị trả về nhưng phải cùng kiểu int[]
    }

    //kiểm tra một dãy số nguyên có lập thành cấp số cộng với công sai chẵn hay không
    public static boolean isEvenArithmetic(int[] arr){
        int N = arr.length;
        if(N <= 1) return false;
        int ans = arr[1] - arr[0];
        for(int i = 1; i < N; ++i){
        	if(ans != (arr[i] - arr[i - 1])) return false;
         // viết bổ sung mã lệnh
        }
        return (ans % 2 == 0); //Có thể thay đổi giá trị trả về nhưng phải cùng kiểu
    }
    
    public static boolean PalindromeNumbers(int a){
    	String s = Integer.toString(a);
    	int N = s.length();
    	for(int i = 0; i < N; ++i){
    		if(s.charAt(i) != (s.charAt(N - i - 1))) return false;
    	}
    	return true;
    }
    //đếm số lượng các số đối xứng có trong dãy
    public static int countPalindromeNumbers(int[] arr){
        int count = 0; int N = arr.length;
        for(int i = 0; i < N; ++i){
        	if(PalindromeNumbers(arr[i])) ++ count;
        }
        // bổ sung mã lệnh ở đây
        return count; 
    }
    

    //phân tích số lớn thứ hai trong mảng thành tích của các thừa số nguyên tố
    public static void analysis2ndMax(int[] arr){
        int max_1 = -1000000000, max_2 = -1000000000;
        // bổ sung mã lệnh ở đây
        int N = arr.length;
        for(int i = 0; i < N; ++i){
        	if(arr[i] > max_1){
        		max_2 = max_1;
        		max_1 = arr[i];
        	}else if(arr[i] < max_1){
        		max_2 = max(max_2,arr[i]);
        	}
        }
        for(int i = 2; i <= max_2; ++i){
        	while(max_2 % i == 0){
        		out.printf("%d ", i);
        		max_2 /= i;
        	}
        }
    }       

    // Tìm và trả về dãy con liên tiếp tăng dài nhất
    public static int[] findLongestSequence(int[] arr) {
    	int N = arr.length;
        int[] dp = new int[N + 100], id = new int[N + 100];
        int ans = 0, id_mx = 0;
        for(int i = 1; i <= N; ++i){
        	dp[i] = 1;
        	for(int j = 1; j < i; ++j){
        		if(arr[j - 1] < arr[i - 1]){
                    if(dp[i] < dp[j] + 1){
        			    dp[i] = max(dp[i],dp[j] + 1);
                        id[i] = j;
                    }
                }
        	}
            if(ans < dp[i]){
                ans = max(ans,dp[i]);
                id_mx = i;
            }
        }
        int res[] = new int[ans];
        for(int i = id_mx;; i = id[i]){
            res[dp[i] - 1] = arr[i - 1];
            if(id[i] == 0) break;
        }
        // bổ sung mã lệnh ở đây

        return res; //Cần thay đổi giá trị trả về nhưng phải cùng kiểu int[]
     }
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	sc.close();
    }
}
