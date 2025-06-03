package t;

public final class c
{
  public int[] a;
  public int b;
  public int c;
  public int d;
  
  public c()
  {
    this(8);
  }
  
  public c(int paramInt)
  {
    if (paramInt >= 1)
    {
      if (paramInt <= 1073741824)
      {
        int i = paramInt;
        if (Integer.bitCount(paramInt) != 1) {
          i = Integer.highestOneBit(paramInt - 1) << 1;
        }
        d = (i - 1);
        a = new int[i];
        return;
      }
      throw new IllegalArgumentException("capacity must be <= 2^30");
    }
    throw new IllegalArgumentException("capacity must be >= 1");
  }
  
  public void a(int paramInt)
  {
    int[] arrayOfInt = a;
    int i = c;
    arrayOfInt[i] = paramInt;
    paramInt = d & i + 1;
    c = paramInt;
    if (paramInt == b) {
      c();
    }
  }
  
  public void b()
  {
    c = b;
  }
  
  public final void c()
  {
    int[] arrayOfInt1 = a;
    int i = arrayOfInt1.length;
    int j = b;
    int k = i - j;
    int m = i << 1;
    if (m >= 0)
    {
      int[] arrayOfInt2 = new int[m];
      System.arraycopy(arrayOfInt1, j, arrayOfInt2, 0, k);
      System.arraycopy(a, 0, arrayOfInt2, k, b);
      a = arrayOfInt2;
      b = 0;
      c = i;
      d = (m - 1);
      return;
    }
    throw new RuntimeException("Max array capacity exceeded");
  }
  
  public boolean d()
  {
    boolean bool;
    if (b == c) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int e()
  {
    int i = b;
    if (i != c)
    {
      int j = a[i];
      b = (i + 1 & d);
      return j;
    }
    throw new ArrayIndexOutOfBoundsException();
  }
}

/* Location:
 * Qualified Name:     t.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */