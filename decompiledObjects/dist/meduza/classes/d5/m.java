package d5;

import java.util.Locale;

public final class m
{
  public final String[] a;
  public final int[] b;
  public final String[] c;
  public final int d;
  
  public m(String[] paramArrayOfString1, int[] paramArrayOfInt, String[] paramArrayOfString2, int paramInt)
  {
    a = paramArrayOfString1;
    b = paramArrayOfInt;
    c = paramArrayOfString2;
    d = paramInt;
  }
  
  public final String a(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j;
    for (int i = 0;; i++)
    {
      j = d;
      if (i >= j) {
        break;
      }
      localStringBuilder.append(a[i]);
      j = b[i];
      if (j == 1)
      {
        localStringBuilder.append(paramString);
      }
      else
      {
        String str;
        if (j == 2) {
          str = String.format(Locale.US, c[i], new Object[] { Long.valueOf(paramLong1) });
        }
        for (;;)
        {
          localStringBuilder.append(str);
          break;
          if (j == 3)
          {
            str = String.format(Locale.US, c[i], new Object[] { Integer.valueOf(paramInt) });
          }
          else
          {
            if (j != 4) {
              break;
            }
            str = String.format(Locale.US, c[i], new Object[] { Long.valueOf(paramLong2) });
          }
        }
      }
    }
    localStringBuilder.append(a[j]);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     d5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */