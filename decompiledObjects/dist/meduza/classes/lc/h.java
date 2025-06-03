package lc;

import ec.i;

public class h
  extends g
{
  public static final boolean k0(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      boolean bool;
      if (paramString2 == null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    return paramString1.equalsIgnoreCase(paramString2);
  }
  
  public static final boolean l0(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, boolean paramBoolean)
  {
    i.e(paramString1, "<this>");
    i.e(paramString2, "other");
    if (!paramBoolean) {
      paramBoolean = paramString1.regionMatches(paramInt1, paramString2, paramInt2, paramInt3);
    } else {
      paramBoolean = paramString1.regionMatches(paramBoolean, paramInt1, paramString2, paramInt2, paramInt3);
    }
    return paramBoolean;
  }
  
  public static String m0(String paramString1, String paramString2, String paramString3)
  {
    i.e(paramString1, "<this>");
    i.e(paramString3, "newValue");
    int i = k.q0(0, paramString1, paramString2, false);
    if (i >= 0)
    {
      int j = paramString2.length();
      int k = 1;
      if (j >= 1) {
        k = j;
      }
      int m = paramString1.length();
      m = paramString3.length() + (m - j);
      if (m >= 0)
      {
        StringBuilder localStringBuilder = new StringBuilder(m);
        m = 0;
        int n;
        int i1;
        do
        {
          localStringBuilder.append(paramString1, m, i);
          localStringBuilder.append(paramString3);
          n = i + j;
          if (i >= paramString1.length()) {
            break;
          }
          i1 = k.q0(i + k, paramString1, paramString2, false);
          i = i1;
          m = n;
        } while (i1 > 0);
        localStringBuilder.append(paramString1, n, paramString1.length());
        paramString1 = localStringBuilder.toString();
        i.d(paramString1, "toString(...)");
      }
    }
    else
    {
      return paramString1;
    }
    throw new OutOfMemoryError();
  }
  
  public static boolean n0(String paramString1, String paramString2)
  {
    i.e(paramString1, "<this>");
    i.e(paramString2, "prefix");
    return paramString1.startsWith(paramString2);
  }
}

/* Location:
 * Qualified Name:     lc.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */