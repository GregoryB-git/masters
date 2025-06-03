package X5;

import java.io.Serializable;

public final class c$a
  implements Serializable
{
  public static final a p = new a(null);
  private static final long serialVersionUID = 0L;
  public final g[] o;
  
  public c$a(g[] paramArrayOfg)
  {
    o = paramArrayOfg;
  }
  
  private final Object readResolve()
  {
    g[] arrayOfg = o;
    Object localObject = h.o;
    int i = arrayOfg.length;
    for (int j = 0; j < i; j++) {
      localObject = ((g)localObject).k(arrayOfg[j]);
    }
    return localObject;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     X5.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */