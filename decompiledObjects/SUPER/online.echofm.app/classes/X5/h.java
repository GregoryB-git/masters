package X5;

import g6.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class h
  implements g, Serializable
{
  public static final h o = new h();
  private static final long serialVersionUID = 0L;
  
  private final Object readResolve()
  {
    return o;
  }
  
  public g.b b(g.c paramc)
  {
    Intrinsics.checkNotNullParameter(paramc, "key");
    return null;
  }
  
  public int hashCode()
  {
    return 0;
  }
  
  public g k(g paramg)
  {
    Intrinsics.checkNotNullParameter(paramg, "context");
    return paramg;
  }
  
  public String toString()
  {
    return "EmptyCoroutineContext";
  }
  
  public Object u(Object paramObject, p paramp)
  {
    Intrinsics.checkNotNullParameter(paramp, "operation");
    return paramObject;
  }
  
  public g x(g.c paramc)
  {
    Intrinsics.checkNotNullParameter(paramc, "key");
    return this;
  }
}

/* Location:
 * Qualified Name:     X5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */