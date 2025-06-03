package d0;

import g0.M;
import g0.a;

public final class l
{
  public static final l e = new b(0).e();
  public static final String f = M.w0(0);
  public static final String g = M.w0(1);
  public static final String h = M.w0(2);
  public static final String i = M.w0(3);
  public final int a;
  public final int b;
  public final int c;
  public final String d;
  
  public l(b paramb)
  {
    a = b.a(paramb);
    b = b.b(paramb);
    c = b.c(paramb);
    d = b.d(paramb);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof l)) {
      return false;
    }
    paramObject = (l)paramObject;
    if ((a != a) || (b != b) || (c != c) || (!M.c(d, d))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    int j = a;
    int k = b;
    int m = c;
    String str = d;
    int n;
    if (str == null) {
      n = 0;
    } else {
      n = str.hashCode();
    }
    return (((527 + j) * 31 + k) * 31 + m) * 31 + n;
  }
  
  public static final class b
  {
    public final int a;
    public int b;
    public int c;
    public String d;
    
    public b(int paramInt)
    {
      a = paramInt;
    }
    
    public l e()
    {
      boolean bool;
      if (b <= c) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      return new l(this, null);
    }
    
    public b f(int paramInt)
    {
      c = paramInt;
      return this;
    }
    
    public b g(int paramInt)
    {
      b = paramInt;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */