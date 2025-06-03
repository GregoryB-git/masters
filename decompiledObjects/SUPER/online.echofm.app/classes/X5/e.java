package X5;

import kotlin.jvm.internal.Intrinsics;

public abstract interface e
  extends g.b
{
  public static final b c = b.o;
  
  public abstract void C(d paramd);
  
  public abstract d i(d paramd);
  
  public static final abstract class a
  {
    public static g.b a(e parame, g.c paramc)
    {
      Intrinsics.checkNotNullParameter(paramc, "key");
      boolean bool = paramc instanceof b;
      Object localObject = null;
      if (bool)
      {
        b localb = (b)paramc;
        paramc = (g.c)localObject;
        if (localb.a(parame.getKey()))
        {
          parame = localb.b(parame);
          paramc = (g.c)localObject;
          if ((parame instanceof g.b)) {
            paramc = parame;
          }
        }
        return paramc;
      }
      if (e.c == paramc) {
        Intrinsics.c(parame, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
      } else {
        parame = null;
      }
      return parame;
    }
    
    public static g b(e parame, g.c paramc)
    {
      Intrinsics.checkNotNullParameter(paramc, "key");
      if ((paramc instanceof b))
      {
        b localb = (b)paramc;
        paramc = parame;
        if (localb.a(parame.getKey()))
        {
          paramc = parame;
          if (localb.b(parame) != null) {
            paramc = h.o;
          }
        }
        return paramc;
      }
      if (e.c == paramc) {
        parame = h.o;
      }
      return parame;
    }
  }
  
  public static final class b
    implements g.c
  {}
}

/* Location:
 * Qualified Name:     X5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */