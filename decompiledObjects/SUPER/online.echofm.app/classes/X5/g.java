package X5;

import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public abstract interface g
{
  public abstract b b(c paramc);
  
  public abstract g k(g paramg);
  
  public abstract Object u(Object paramObject, p paramp);
  
  public abstract g x(c paramc);
  
  public static final abstract class a
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
  
  public static abstract interface b
    extends g
  {
    public abstract b b(g.c paramc);
    
    public abstract g.c getKey();
    
    public static final abstract class a
    {
      public static Object a(g.b paramb, Object paramObject, p paramp)
      {
        Intrinsics.checkNotNullParameter(paramp, "operation");
        return paramp.invoke(paramObject, paramb);
      }
      
      public static g.b b(g.b paramb, g.c paramc)
      {
        Intrinsics.checkNotNullParameter(paramc, "key");
        if (Intrinsics.a(paramb.getKey(), paramc)) {
          Intrinsics.c(paramb, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
        } else {
          paramb = null;
        }
        return paramb;
      }
      
      public static g c(g.b paramb, g.c paramc)
      {
        Intrinsics.checkNotNullParameter(paramc, "key");
        Object localObject = paramb;
        if (Intrinsics.a(paramb.getKey(), paramc)) {
          localObject = h.o;
        }
        return (g)localObject;
      }
      
      public static g d(g.b paramb, g paramg)
      {
        Intrinsics.checkNotNullParameter(paramg, "context");
        return g.a.a(paramb, paramg);
      }
    }
  }
  
  public static abstract interface c {}
}

/* Location:
 * Qualified Name:     X5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */