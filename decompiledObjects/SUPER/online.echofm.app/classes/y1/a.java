package y1;

import O1.P;
import java.io.Serializable;
import x1.B;

public final class a
  implements Serializable
{
  public static final a q = new a(null);
  private static final long serialVersionUID = 1L;
  public final String o;
  public final String p;
  
  public a(String paramString1, String paramString2)
  {
    o = paramString2;
    paramString2 = paramString1;
    if (P.c0(paramString1)) {
      paramString2 = null;
    }
    p = paramString2;
  }
  
  public a(x1.a parama)
  {
    this(parama.l(), B.m());
  }
  
  private final Object writeReplace()
  {
    return new b(p, o);
  }
  
  public final String a()
  {
    return p;
  }
  
  public final String b()
  {
    return o;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    P localP = P.a;
    paramObject = (a)paramObject;
    bool1 = bool2;
    if (P.e(p, p))
    {
      bool1 = bool2;
      if (P.e(o, o)) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    String str = p;
    int i;
    if (str == null) {
      i = 0;
    } else {
      i = str.hashCode();
    }
    return i ^ o.hashCode();
  }
  
  public static final class a {}
  
  public static final class b
    implements Serializable
  {
    public static final a q = new a(null);
    private static final long serialVersionUID = -2488473066578201069L;
    public final String o;
    public final String p;
    
    public b(String paramString1, String paramString2)
    {
      o = paramString1;
      p = paramString2;
    }
    
    private final Object readResolve()
    {
      return new a(o, p);
    }
    
    public static final class a {}
  }
}

/* Location:
 * Qualified Name:     y1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */