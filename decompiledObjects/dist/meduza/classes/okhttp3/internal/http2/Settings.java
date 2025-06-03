package okhttp3.internal.http2;

public final class Settings
{
  public int a;
  public final int[] b = new int[10];
  
  public final int a()
  {
    int i;
    if ((a & 0x80) != 0) {
      i = b[7];
    } else {
      i = 65535;
    }
    return i;
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      int[] arrayOfInt = b;
      if (paramInt1 < arrayOfInt.length)
      {
        a = (1 << paramInt1 | a);
        arrayOfInt[paramInt1] = paramInt2;
      }
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Settings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */