package o0;

import g0.M;

public final class h
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  
  public h(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramString5;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    if ((!M.c(a, a)) || (!M.c(b, b)) || (!M.c(c, c)) || (!M.c(d, d)) || (!M.c(e, e))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    String str = a;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = b;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = c;
    int m;
    if (str != null) {
      m = str.hashCode();
    } else {
      m = 0;
    }
    str = d;
    int n;
    if (str != null) {
      n = str.hashCode();
    } else {
      n = 0;
    }
    str = e;
    if (str != null) {
      i = str.hashCode();
    }
    return ((((527 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i;
  }
}

/* Location:
 * Qualified Name:     o0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */