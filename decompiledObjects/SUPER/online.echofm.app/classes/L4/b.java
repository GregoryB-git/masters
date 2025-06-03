package L4;

import N4.i;
import c2.c;
import c2.f;
import c2.g;

public final class b
{
  public static final F4.a d = ;
  public final String a;
  public final r4.b b;
  public f c;
  
  public b(r4.b paramb, String paramString)
  {
    a = paramString;
    b = paramb;
  }
  
  public final boolean a()
  {
    if (c == null)
    {
      g localg = (g)b.get();
      if (localg != null) {
        c = localg.a(a, i.class, c2.b.b("proto"), new a());
      } else {
        d.j("Flg TransportFactory is not available at the moment");
      }
    }
    boolean bool;
    if (c != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b(i parami)
  {
    if (!a())
    {
      d.j("Unable to dispatch event because Flg Transport is not available");
      return;
    }
    c.b(c.d(parami));
  }
}

/* Location:
 * Qualified Name:     L4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */