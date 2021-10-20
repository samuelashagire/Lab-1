/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop
 */
public class isAllPossibilities {
    
    	public static void main(String[] args) {
		int i=isAllPossibilities(new int[]{1, 2, 0, 3});
		System.out.println(i);
                
                int i2=isAllPossibilities(new int[]{3, 2, 1, 0});
		System.out.println(i2);
                
                int i3=isAllPossibilities(new int[]{1, 2, 4, 3});
		System.out.println(i3);
                
                int i4=isAllPossibilities(new int[]{0, 2, 3});
		System.out.println(i4);
                
                int i5=isAllPossibilities(new int[]{});
		System.out.println(i5);
        }     

       public static int isAllPossibilities(int[] a)
       
       {
            int result = 1, count = 0;
            int i, j;
              
            for (i = 0; i < a.length; i++)
            {
                count = 0;
                for (j = 0; j < a.length; j++)
                {
                    if (a[i] == j)
                        count++;
                }
                
                if (j == a.length && count == 0)
                {
                    result = 0;
                     
                }
            }
             
     return result;             
}

}
