package sort.quicksort;

import java.sql.Array;
import java.util.Arrays;

public class quicksort {
	public static int Quick_Sort_Partion(int R[],int left,int right)
	{                                            //�õݹ鷽����R[left]��R[righ]�ļ�¼���п�������
	    int temp, buf;                            //��ʱ����
	    int i = left, j = right;

	    while(left < right)                            /* �����˽������м�ɨ�裬ֱ��low��high���ʱΪֹ */
	    {
	        buf = R[left];                            //������ĵ�1����¼��Ϊ��׼ ������ʱ��Ԫ��
	        while(left < right && buf <= R[right])    /* �����������ɨ�裬���Ҳ��ҵ�1��С�ڻ�׼ֵ������Ԫ��*/
	            right--;
	    
	        temp = R[right];                        /* ��������Ԫ��x[low]��x[high] */
	        R[right] = R[left];
	        R[left] = temp;

	        while(left < right && buf >= R[left])    /* �������ҽ���ɨ�裬���Ҳ��ҵ�1�����ڻ�׼ֵ������Ԫ�� */
	            left++;

	        if(left == right)
	            return left;
	        else
	        {
	            temp = R[right];                        /* ��������Ԫ��x[low]��x[high] */
	            R[right] = R[left];
	            R[left] = temp;
	        }
	    }
	    return left;
	}

	public static void Quick_Sort(int R[],int left,int right)                /* ������������� */
	{
	    int temp;

	    if(left < right)
	    {
	        temp = Quick_Sort_Partion(R, left, right);        /* �������������� */
	        Quick_Sort(R,left, temp-1);                        /* �ݹ���ã����������н��п������� */
	        Quick_Sort(R,temp+1, right);                    /* �ݹ���ã����������н��п������� */
	    }
	}
	
	//�����������
	public static void main(String[] args) {
		int i;
	    int X[] = {26,23,96,13,36,67,45,15};
	    Quick_Sort(X,0,7);
	    System.out.println(Arrays.toString(X));
	}
	

}
