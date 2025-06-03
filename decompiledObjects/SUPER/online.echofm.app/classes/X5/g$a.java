package X5;

import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public abstract class g$a
{
  public static g a(g paramg1, g paramg2)
  {
    Intrinsics.checkNotNullParameter(paramg2, "context");
    if (paramg2 != h.o) {
      paramg1 = (g)paramg2.u(paramg1, a.o);
    }
    return paramg1;
  }
  
  public static final class a
    extends l
    implements p
  {
    public static final a o = new a();
    
    public a()
    {
      super();
    }
    
    public final g a(g paramg, g.b paramb)
    {
      Intrinsics.checkNotNullParameter(paramg, "acc");
      Intrinsics.checkNotNullParameter(paramb, "element");
      g localg = paramg.x(paramb.getKey());
      h localh = h.o;
      if (localg != localh)
      {
        Object localObject = e.c;
        paramg = (e)localg.b((g.c)localObject);
        if (paramg == null) {}
        for (paramg = new c(localg, paramb);; paramg = new c(new c((g)localObject, paramb), paramg))
        {
          paramb = paramg;
          break;
          localObject = localg.x((g.c)localObject);
          if (localObject == localh)
          {
            paramb = new c(paramb, paramg);
            break;
          }
        }
      }
      return paramb;
    }
  }
}

/* Location:
 * Qualified Name:     X5.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */