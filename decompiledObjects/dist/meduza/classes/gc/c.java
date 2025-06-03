package gc;

import ac.a.a;
import java.io.Serializable;

public abstract class c
{
  public static final a a = new a();
  public static final a b;
  
  static
  {
    yb.b.a.getClass();
    Object localObject = a.a.a;
    int i;
    if ((localObject != null) && (((Integer)localObject).intValue() < 34)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0) {
      localObject = new hc.a();
    } else {
      localObject = new b();
    }
    b = (a)localObject;
  }
  
  public static final class a
    extends c
    implements Serializable
  {
    public final int a()
    {
      return c.b.b();
    }
  }
}

/* Location:
 * Qualified Name:     gc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */