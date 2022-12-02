/**
 * Chương trình xóa phần tử trùng lặp trong mảng, chỉ để lại phần tử xuất hiện đầu tiên
 * import các thư viện (nếu cần thiết) - Bổ sung các phương thức/hàm (nếu cần thiết)
 * Giữ lại khung chương trình và phương thức xoaPhantu ở dưới
 * **/
import java.util.*;
 public class XoaPTtrung{
     
    public static int[] xoaPhantu(int A[], int k){
       int ans[] = new int[A.length - 1];
       int N = A.length;
       for(int i = 0; i < k; ++i){
       		ans[i] = A[i];
       }
       for(int i = k + 1, j = k; i < N; ++i, ++j){
       	ans[j] = A[i];
       }
       return ans;
        // bổ sung mã lệnh ở đây
    }
     
    public static void main(String Args[]){
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; ++i){
        	A[i] = sc.nextInt();
        }
        // A = xoaPhantu(A,3);
        boolean run = true;
        while(run){
        	run = false;
        	boolean tmp = true;
        	for(int i = 0; i < A.length; ++i){
        		if(!tmp) break;
        		for(int j = i + 1; j < A.length; ++j){
        			if(A[i] == A[j]){
        				A = xoaPhantu(A,j);
        				--j; tmp = false; run = true;
        			}
        		}
        	}
        }
        N = A.length;
        for(int i = 0; i < N; ++i){
        	System.out.printf("%d ", A[i]);
        }
        // Nhập dữ liệu từ đây - bổ sung mã lệnh
        sc.close();
    }
 }
