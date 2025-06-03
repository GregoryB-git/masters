package X5;

import g6.l;
import kotlin.jvm.internal.Intrinsics;

public abstract class b
  implements g.c
{
  public final l o;
  public final g.c p;
  
  public b(g.c paramc, l paraml)
  {
    o = paraml;
    paraml = paramc;
    if ((paramc instanceof b)) {
      paraml = p;
    }
    p = paraml;
  }
  
  public final boolean a(g.c paramc)
  {
    Intrinsics.checkNotNullParameter(paramc, "key");
    boolean bool;
    if ((paramc != this) && (p != paramc)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final g.b b(g.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "element");
    return (g.b)o.invoke(paramb);
  }
}

/* Location:
 * Qualified Name:     X5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */