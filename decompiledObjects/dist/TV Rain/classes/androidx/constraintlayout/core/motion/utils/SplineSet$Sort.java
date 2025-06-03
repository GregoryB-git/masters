package androidx.constraintlayout.core.motion.utils;

class SplineSet$Sort
{
  public static void doubleQuickSort(int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[paramArrayOfInt.length + 10];
    arrayOfInt[0] = paramInt2;
    arrayOfInt[1] = paramInt1;
    paramInt1 = 2;
    while (paramInt1 > 0)
    {
      paramInt1--;
      int i = arrayOfInt[paramInt1];
      paramInt2 = paramInt1 - 1;
      int j = arrayOfInt[paramInt2];
      paramInt1 = paramInt2;
      if (i < j)
      {
        int k = partition(paramArrayOfInt, paramArrayOfFloat, i, j);
        int m = paramInt2 + 1;
        arrayOfInt[paramInt2] = (k - 1);
        paramInt1 = m + 1;
        arrayOfInt[m] = i;
        paramInt2 = paramInt1 + 1;
        arrayOfInt[paramInt1] = j;
        paramInt1 = paramInt2 + 1;
        arrayOfInt[paramInt2] = (k + 1);
      }
    }
  }
  
  private static int partition(int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfInt[paramInt2];
    int k;
    for (int j = paramInt1; paramInt1 < paramInt2; j = k)
    {
      k = j;
      if (paramArrayOfInt[paramInt1] <= i)
      {
        swap(paramArrayOfInt, paramArrayOfFloat, j, paramInt1);
        k = j + 1;
      }
      paramInt1++;
    }
    swap(paramArrayOfInt, paramArrayOfFloat, j, paramInt2);
    return j;
  }
  
  private static void swap(int[] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfInt[paramInt1];
    paramArrayOfInt[paramInt1] = paramArrayOfInt[paramInt2];
    paramArrayOfInt[paramInt2] = i;
    float f = paramArrayOfFloat[paramInt1];
    paramArrayOfFloat[paramInt1] = paramArrayOfFloat[paramInt2];
    paramArrayOfFloat[paramInt2] = f;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.SplineSet.Sort
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */