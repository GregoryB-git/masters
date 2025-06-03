package y1;

import java.io.Serializable;

public final class e$b
  implements Serializable
{
  public static final a s = new a(null);
  private static final long serialVersionUID = 20160803001L;
  public final String o;
  public final boolean p;
  public final boolean q;
  public final String r;
  
  public e$b(String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    o = paramString1;
    p = paramBoolean1;
    q = paramBoolean2;
    r = paramString2;
  }
  
  private final Object readResolve()
  {
    return new e(o, p, q, r, null);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     y1.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */