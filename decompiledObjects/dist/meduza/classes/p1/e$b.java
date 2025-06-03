package p1;

public final class e$b
{
  public final long[] a;
  public final boolean[] b;
  public final int[] c;
  public boolean d;
  
  public e$b(int paramInt)
  {
    a = new long[paramInt];
    b = new boolean[paramInt];
    c = new int[paramInt];
  }
  
  public final int[] a()
  {
    try
    {
      int i = d;
      if (i == 0) {
        return null;
      }
      long[] arrayOfLong = a;
      int j = arrayOfLong.length;
      int k = 0;
      for (int m = k; k < j; m++)
      {
        long l = arrayOfLong[k];
        int n = 1;
        if (l > 0L) {
          i = 1;
        } else {
          i = 0;
        }
        boolean[] arrayOfBoolean = b;
        if (i != arrayOfBoolean[m])
        {
          arrayOfInt = c;
          if (i == 0) {
            n = 2;
          }
          arrayOfInt[m] = n;
        }
        else
        {
          c[m] = 0;
        }
        arrayOfBoolean[m] = i;
        k++;
      }
      d = false;
      int[] arrayOfInt = (int[])c.clone();
      return arrayOfInt;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     p1.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */