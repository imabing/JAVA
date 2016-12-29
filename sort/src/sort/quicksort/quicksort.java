package sort.quicksort;

import java.sql.Array;
import java.util.Arrays;

public class quicksort {
	public static int Quick_Sort_Partion(int R[],int left,int right)
	{                                            //用递归方法把R[left]至R[righ]的记录进行快速排序
	    int temp, buf;                            //临时变量
	    int i = left, j = right;

	    while(left < right)                            /* 从两端交替向中间扫描，直至low和high相等时为止 */
	    {
	        buf = R[left];                            //将区间的第1个记录作为基准 置入临时单元中
	        while(left < right && buf <= R[right])    /* 从右向左进行扫描，查找查找第1个小于基准值的数据元素*/
	            right--;
	    
	        temp = R[right];                        /* 交换数据元素x[low]和x[high] */
	        R[right] = R[left];
	        R[left] = temp;

	        while(left < right && buf >= R[left])    /* 从左向右进行扫描，查找查找第1个大于基准值的数据元素 */
	            left++;

	        if(left == right)
	            return left;
	        else
	        {
	            temp = R[right];                        /* 交换数据元素x[low]和x[high] */
	            R[right] = R[left];
	            R[left] = temp;
	        }
	    }
	    return left;
	}

	public static void Quick_Sort(int R[],int left,int right)                /* 定义快速排序函数 */
	{
	    int temp;

	    if(left < right)
	    {
	        temp = Quick_Sort_Partion(R, left, right);        /* 划分左、右子序列 */
	        Quick_Sort(R,left, temp-1);                        /* 递归调用，对左子序列进行快速排序 */
	        Quick_Sort(R,temp+1, right);                    /* 递归调用，对右子序列进行快速排序 */
	    }
	}
	
	//快速排序测试
	public static void main(String[] args) {
		int i;
	    int X[] = {26,23,96,13,36,67,45,15};
	    Quick_Sort(X,0,7);
	    System.out.println(Arrays.toString(X));
	}
	

}
