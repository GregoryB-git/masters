package c5;

import V4.d;

public abstract class p
  extends m
{
  public static final int[] a = { 1, 1, 1 };
  public static final int[] b = { 1, 1, 1, 1, 1 };
  public static final int[] c = { 1, 1, 1, 1, 1, 1 };
  public static final int[][] d;
  public static final int[][] e;
  
  static
  {
    Object localObject1 = new int[10][];
    localObject1[0] = { 3, 2, 1, 1 };
    localObject1[1] = { 2, 2, 2, 1 };
    localObject1[2] = { 2, 1, 2, 2 };
    localObject1[3] = { 1, 4, 1, 1 };
    localObject1[4] = { 1, 1, 3, 2 };
    localObject1[5] = { 1, 2, 3, 1 };
    localObject1[6] = { 1, 1, 1, 4 };
    localObject1[7] = { 1, 3, 1, 2 };
    localObject1[8] = { 1, 2, 1, 3 };
    localObject1[9] = { 3, 1, 1, 2 };
    d = (int[][])localObject1;
    Object localObject2 = new int[20][];
    e = (int[][])localObject2;
    System.arraycopy(localObject1, 0, localObject2, 0, 10);
    for (int i = 10; i < 20; i++)
    {
      localObject1 = d[(i - 10)];
      localObject2 = new int[localObject1.length];
      for (int j = 0; j < localObject1.length; j++) {
        localObject2[j] = localObject1[(localObject1.length - j - 1)];
      }
      e[i] = localObject2;
    }
  }
  
  public static boolean a(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    if (i == 0) {
      return false;
    }
    i--;
    int j = Character.digit(paramCharSequence.charAt(i), 10);
    return b(paramCharSequence.subSequence(0, i)) == j;
  }
  
  public static int b(CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    int j = i - 1;
    int k = 0;
    while (j >= 0)
    {
      int m = paramCharSequence.charAt(j) - '0';
      if ((m >= 0) && (m <= 9))
      {
        k += m;
        j -= 2;
      }
      else
      {
        throw d.a();
      }
    }
    j = k * 3;
    k = i - 2;
    while (k >= 0)
    {
      i = paramCharSequence.charAt(k) - '0';
      if ((i >= 0) && (i <= 9))
      {
        j += i;
        k -= 2;
      }
      else
      {
        throw d.a();
      }
    }
    return (1000 - j) % 10;
  }
}

/* Location:
 * Qualified Name:     c5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */