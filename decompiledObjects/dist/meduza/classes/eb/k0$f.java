package eb;

import java.util.Arrays;
import n7.g;
import n7.g.a;
import nb.i.g.a;
import x6.b;

public final class k0$f
{
  public static final f e = new f(null, null, e1.e, false);
  public final k0.i a;
  public final h.a b;
  public final e1 c;
  public final boolean d;
  
  public k0$f(k0.i parami, i.g.a parama, e1 parame1, boolean paramBoolean)
  {
    a = parami;
    b = parama;
    b.y(parame1, "status");
    c = parame1;
    d = paramBoolean;
  }
  
  public static f a(e1 parame1)
  {
    b.s("error status shouldn't be OK", parame1.e() ^ true);
    return new f(null, null, parame1, false);
  }
  
  public static f b(k0.i parami, i.g.a parama)
  {
    b.y(parami, "subchannel");
    return new f(parami, parama, e1.e, false);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof f;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (f)paramObject;
    bool1 = bool2;
    if (b.Q(a, a))
    {
      bool1 = bool2;
      if (b.Q(c, c))
      {
        bool1 = bool2;
        if (b.Q(b, b))
        {
          bool1 = bool2;
          if (d == d) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, c, b, Boolean.valueOf(d) });
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "subchannel");
    locala.a(b, "streamTracerFactory");
    locala.a(c, "status");
    locala.c("drop", d);
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.k0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */