package r1;

import ec.i;
import f;
import g;
import java.util.Locale;
import lc.k;

public final class a$a
{
  public final String a;
  public final String b;
  public final boolean c;
  public final int d;
  public final String e;
  public final int f;
  public final int g;
  
  public a$a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    a = paramString1;
    b = paramString2;
    c = paramBoolean;
    d = paramInt1;
    e = paramString3;
    f = paramInt2;
    paramString1 = Locale.US;
    i.d(paramString1, "US");
    paramString1 = paramString2.toUpperCase(paramString1);
    i.d(paramString1, "this as java.lang.String).toUpperCase(locale)");
    if (k.o0(paramString1, "INT")) {
      paramInt1 = 3;
    } else if ((!k.o0(paramString1, "CHAR")) && (!k.o0(paramString1, "CLOB")) && (!k.o0(paramString1, "TEXT")))
    {
      if (k.o0(paramString1, "BLOB")) {
        paramInt1 = 5;
      } else if ((!k.o0(paramString1, "REAL")) && (!k.o0(paramString1, "FLOA")) && (!k.o0(paramString1, "DOUB"))) {
        paramInt1 = 1;
      } else {
        paramInt1 = 4;
      }
    }
    else {
      paramInt1 = 2;
    }
    g = paramInt1;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    int i = d;
    paramObject = (a)paramObject;
    if (i != d) {
      return false;
    }
    if (!i.a(a, a)) {
      return false;
    }
    if (c != c) {
      return false;
    }
    String str;
    if ((f == 1) && (f == 2))
    {
      str = e;
      if ((str != null) && (!a.a(str, e))) {
        return false;
      }
    }
    if ((f == 2) && (f == 1))
    {
      str = e;
      if ((str != null) && (!a.a(str, e))) {
        return false;
      }
    }
    i = f;
    if ((i != 0) && (i == f))
    {
      str = e;
      if (str != null ? !a.a(str, e) : e != null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        return false;
      }
    }
    if (g != g) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = g;
    int k;
    if (c) {
      k = 1231;
    } else {
      k = 1237;
    }
    return ((i * 31 + j) * 31 + k) * 31 + d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Column{name='");
    localStringBuilder.append(a);
    localStringBuilder.append("', type='");
    localStringBuilder.append(b);
    localStringBuilder.append("', affinity='");
    localStringBuilder.append(g);
    localStringBuilder.append("', notNull=");
    localStringBuilder.append(c);
    localStringBuilder.append(", primaryKeyPosition=");
    localStringBuilder.append(d);
    localStringBuilder.append(", defaultValue='");
    String str1 = e;
    String str2 = str1;
    if (str1 == null) {
      str2 = "undefined";
    }
    return g.f(localStringBuilder, str2, "'}");
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     r1.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */