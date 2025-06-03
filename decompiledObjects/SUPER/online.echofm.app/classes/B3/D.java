package B3;

import r4.a;
import r4.a.a;
import r4.b;

public class D
  implements b, a
{
  public static final a.a c = new A();
  public static final b d = new B();
  public a.a a;
  public volatile b b;
  
  public D(a.a parama, b paramb)
  {
    a = parama;
    b = paramb;
  }
  
  public static D e()
  {
    return new D(c, d);
  }
  
  public static D i(b paramb)
  {
    return new D(null, paramb);
  }
  
  public void a(a.a parama)
  {
    b localb = b;
    Object localObject = d;
    if (localb != localObject)
    {
      parama.a(localb);
      return;
    }
    try
    {
      localb = b;
      if (localb != localObject)
      {
        localObject = localb;
      }
      else
      {
        localObject = a;
        C localC = new B3/C;
        localC.<init>((a.a)localObject, parama);
        a = localC;
        localObject = null;
      }
      if (localObject != null) {
        parama.a(localb);
      }
      return;
    }
    finally {}
  }
  
  public Object get()
  {
    return b.get();
  }
  
  public void j(b paramb)
  {
    if (b == d) {
      try
      {
        a.a locala = a;
        a = null;
        b = paramb;
        locala.a(paramb);
        return;
      }
      finally {}
    }
    throw new IllegalStateException("provide() can be called only once.");
  }
}

/* Location:
 * Qualified Name:     B3.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */