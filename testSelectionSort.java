import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort 
{
	@Test
	public	void test()
	{
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}    
	public testSelectionSort() 
	{ 
	
	}   
	public void testPositive()
	{    

		int[] arr = new int[5]; 
		arr[0] = 8;     
		arr[1] = 9;   
		arr[2] = 7;  
		arr[3] = 10; 
		arr[4] = 2;  
		
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2; 
		Sortedarr[1] = 7;    
		Sortedarr[2] = 8;   
		Sortedarr[3] = 9;   
		Sortedarr[4] = 10;  
		
		SelectionSort temp1=new SelectionSort();
		int [] values = temp1.basicSelectionSort(arr);
		int maxValue= values[arr.length-1];
		
		assertEquals("testPositive is false.", 10, maxValue);   
	}    
	public void testNegative()
	{      
		
		int[] arr = new int[5]; 
		arr[0] = -8;     
		arr[1] = -9;   
		arr[2] = -7;  
		arr[3] = -10; 
		arr[4] = -2;  
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10; 
		Sortedarr[1] = -9;    
		Sortedarr[2] = -8;   
		Sortedarr[3] = -7;   
		Sortedarr[4] = -2;  
		SelectionSort temp1=new SelectionSort();
		int [] Values = temp1.basicSelectionSort(arr);
		int maxValue=Values[Sortedarr.length-1];
		assertEquals("testNegative is false.", -2, maxValue);
		
	}
	


	public void testMixed()
	{     
		
		int[] arr = new int[5]; 
		arr[0] = -8;     
		arr[1] = 9;   
		arr[2] = 7;  
		arr[3] = -10; 
		arr[4] = 0;  
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10; 
		Sortedarr[1] = -8;    
		Sortedarr[2] = 0;   
		Sortedarr[3] = 7;   
		Sortedarr[4] = 9;  
		SelectionSort temp1=new SelectionSort();
		int [] Values = temp1.basicSelectionSort(arr);
		int maxValue=Values[Sortedarr.length-1];
		assertEquals("testMixed is false.", 9, maxValue); 
	}   
	public void testDuplicates()
	{ 
		
		int[] arr = new int[5]; 
		arr[0] = 8;     
		arr[1] = 8;   
		arr[2] = -10;  
		arr[3] = -10; 
		arr[4] = 2;  
		
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10; 
		Sortedarr[1] = -10;    
		Sortedarr[2] = 2;   
		Sortedarr[3] = 8;   
		Sortedarr[4] = 8;  
		SelectionSort temp1=new SelectionSort();
		int [] Values = temp1.basicSelectionSort(arr);
		int maxValue=Values[Sortedarr.length-1];
		assertEquals("testDuplicate is false.", 8, maxValue);
	}
}
		
	
