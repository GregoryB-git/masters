package m5;

import android.text.TextUtils;

public final class b
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  
  public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramInt4;
    e = paramInt5;
  }
  
  public static b a(String paramString)
  {
    x6.b.q(paramString.startsWith("Format:"));
    paramString = TextUtils.split(paramString.substring(7), ",");
    int i = -1;
    int j = i;
    int k = j;
    int m = k;
    int n = 0;
    int i1 = k;
    int i2 = j;
    for (j = n; j < paramString.length; j++)
    {
      String str = x6.b.x0(paramString[j].trim());
      str.getClass();
      switch (str.hashCode())
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
            } while (!str.equals("style"));
            k = 3;
            break;
          } while (!str.equals("start"));
          k = 2;
          break;
        } while (!str.equals("text"));
        k = 1;
        break;
      } while (!str.equals("end"));
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
      paramString = new b(i, i2, i1, m, paramString.length);
    } else {
      paramString = null;
    }
    return paramString;
  }
}

/* Location:
 * Qualified Name:     m5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */