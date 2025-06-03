package o4;

public final class i
{
  public int a = 0;
  public int b = -1;
  public int c = 0;
  public int[] d;
  public int e;
  
  public i()
  {
    int[] arrayOfInt = new int[16];
    d = arrayOfInt;
    e = (arrayOfInt.length - 1);
  }
  
  public final void a(int paramInt)
  {
    int i = c;
    int[] arrayOfInt1 = d;
    if (i == arrayOfInt1.length)
    {
      i = arrayOfInt1.length << 1;
      if (i >= 0)
      {
        int[] arrayOfInt2 = new int[i];
        int j = arrayOfInt1.length;
        int k = a;
        j -= k;
        System.arraycopy(arrayOfInt1, k, arrayOfInt2, 0, j);
        System.arraycopy(d, 0, arrayOfInt2, j, k);
        a = 0;
        b = (c - 1);
        d = arrayOfInt2;
        e = (i - 1);
      }
      else
      {
        throw new IllegalStateException();
      }
    }
    i = b + 1 & e;
    b = i;
    d[i] = paramInt;
    c += 1;
  }
}

/* Location:
 * Qualified Name:     o4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */