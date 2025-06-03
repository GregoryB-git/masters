package y1;

import java.io.Serializable;

public final class a$b
  implements Serializable
{
  public static final a q = new a(null);
  private static final long serialVersionUID = -2488473066578201069L;
  public final String o;
  public final String p;
  
  public a$b(String paramString1, String paramString2)
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

/* Location:
 * Qualified Name:     y1.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */