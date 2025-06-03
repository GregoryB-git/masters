package k3;

import java.util.concurrent.atomic.AtomicReference;
import n3.b;
import n3.b.a;
import n3.c;

public final class g
{
  public static final g b = new g();
  public static final b c = new b(null);
  public final AtomicReference a = new AtomicReference();
  
  public static g b()
  {
    return b;
  }
  
  public b a()
  {
    b localb = (b)a.get();
    Object localObject = localb;
    if (localb == null) {
      localObject = c;
    }
    return (b)localObject;
  }
  
  public static class b
    implements b
  {
    public b.a a(c paramc, String paramString1, String paramString2)
    {
      return f.a;
    }
  }
}

/* Location:
 * Qualified Name:     k3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */