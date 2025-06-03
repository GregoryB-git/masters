package r1;

import ec.i;
import lc.k;

public final class a$a$a
{
  public static boolean a(String paramString1, String paramString2)
  {
    i.e(paramString1, "current");
    if (i.a(paramString1, paramString2)) {
      return true;
    }
    if (paramString1.length() == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      int j = 0;
      i = j;
      int k = i;
      for (int m = i; j < paramString1.length(); m = i)
      {
        int n = paramString1.charAt(j);
        if ((k == 0) && (n != 40)) {
          break label152;
        }
        if (n == 40)
        {
          i = m + 1;
        }
        else
        {
          i = m;
          if (n == 41)
          {
            m--;
            i = m;
            if (m == 0)
            {
              i = m;
              if (k != paramString1.length() - 1) {
                break label152;
              }
            }
          }
        }
        j++;
        k++;
      }
      if (m == 0)
      {
        i = 1;
        break label154;
      }
    }
    label152:
    int i = 0;
    label154:
    if (i != 0)
    {
      paramString1 = paramString1.substring(1, paramString1.length() - 1);
      i.d(paramString1, "this as java.lang.String…ing(startIndex, endIndex)");
      return i.a(k.C0(paramString1).toString(), paramString2);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     r1.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */