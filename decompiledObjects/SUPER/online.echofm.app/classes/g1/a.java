package g1;

import W2.c;
import android.text.TextUtils;

public final class a
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  
  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
  }
  
  public static a a(String paramString)
  {
    g0.a.a(paramString.startsWith("Format:"));
    String[] arrayOfString = TextUtils.split(paramString.substring(7), ",");
    int i = -1;
    int j = i;
    int k = j;
    int m = k;
    int n = 0;
    int i1 = k;
    int i2 = j;
    for (j = n; j < arrayOfString.length; j++)
    {
      paramString = c.e(arrayOfString[j].trim());
      paramString.hashCode();
      switch (paramString.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              k = -1;
              break;
            } while (!paramString.equals("style"));
            k = 3;
            break;
          } while (!paramString.equals("start"));
          k = 2;
          break;
        } while (!paramString.equals("text"));
        k = 1;
        break;
      } while (!paramString.equals("end"));
      k = 0;
      switch (k)
      {
      default: 
        break;
      case 3: 
        i1 = j;
        break;
      case 2: 
        i = j;
        break;
      case 1: 
        m = j;
        break;
      case 0: 
        i2 = j;
      }
    }
    if ((i != -1) && (i2 != -1) && (m != -1)) {
      paramString = new a(i, i2, i1, m, arrayOfString.length);
    } else {
      paramString = null;
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     g1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */