package X5;

import g6.p;
import kotlin.jvm.internal.Intrinsics;

public abstract class g$b$a
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

/* Location:
 * Qualified Name:     X5.g.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */