package X5;

import g6.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

public final class c
  implements g, Serializable
{
  public final g o;
  public final g.b p;
  
  public c(g paramg, g.b paramb)
  {
    o = paramg;
    p = paramb;
  }
  
  private final Object writeReplace()
  {
    int i = g();
    g[] arrayOfg = new g[i];
    final kotlin.jvm.internal.t localt = new kotlin.jvm.internal.t();
    u(V5.t.a, new c(arrayOfg, localt));
    if (o == i) {
      return new a(arrayOfg);
    }
    throw new IllegalStateException("Check failed.".toString());
  }
  
  public g.b b(g.c paramc)
  {
    Intrinsics.checkNotNullParameter(paramc, "key");
    for (Object localObject = this;; localObject = (c)localObject)
    {
      g.b localb = p.b(paramc);
      if (localb != null) {
        return localb;
      }
      localObject = o;
      if (!(localObject instanceof c)) {
        break;
      }
    }
    return ((g)localObject).b(paramc);
  }
  
  public final boolean d(g.b paramb)
  {
    return Intrinsics.a(b(paramb.getKey()), paramb);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((((c)paramObject).g() == g()) && (((c)paramObject).f(this))) {}
      }
      else
      {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final boolean f(c paramc)
  {
    for (;;)
    {
      if (!d(p)) {
        return false;
      }
      paramc = o;
      if (!(paramc instanceof c)) {
        break;
      }
      paramc = (c)paramc;
    }
    Intrinsics.c(paramc, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
    return d((g.b)paramc);
  }
  
  public final int g()
  {
    int i = 2;
    Object localObject = this;
    for (;;)
    {
      localObject = o;
      if ((localObject instanceof c)) {
        localObject = (c)localObject;
      } else {
        localObject = null;
      }
      if (localObject == null) {
        return i;
      }
      i++;
    }
  }
  
  public int hashCode()
  {
    return o.hashCode() + p.hashCode();
  }
  
  public g k(g paramg)
  {
    return g.a.a(this, paramg);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('[');
    localStringBuilder.append((String)u("", b.o));
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  public Object u(Object paramObject, p paramp)
  {
    Intrinsics.checkNotNullParameter(paramp, "operation");
    return paramp.invoke(o.u(paramObject, paramp), p);
  }
  
  public g x(g.c paramc)
  {
    Intrinsics.checkNotNullParameter(paramc, "key");
    if (p.b(paramc) != null) {
      return o;
    }
    paramc = o.x(paramc);
    if (paramc == o) {
      paramc = this;
    } else if (paramc == h.o) {
      paramc = p;
    } else {
      paramc = new c(paramc, p);
    }
    return paramc;
  }
  
  public static final class a
    implements Serializable
  {
    public static final a p = new a(null);
    private static final long serialVersionUID = 0L;
    public final g[] o;
    
    public a(g[] paramArrayOfg)
    {
      o = paramArrayOfg;
    }
    
    private final Object readResolve()
    {
      g[] arrayOfg = o;
      Object localObject = h.o;
      int i = arrayOfg.length;
      for (int j = 0; j < i; j++) {
        localObject = ((g)localObject).k(arrayOfg[j]);
      }
      return localObject;
    }
    
    public static final class a {}
  }
  
  public static final class b
    extends l
    implements p
  {
    public static final b o = new b();
    
    public b()
    {
      super();
    }
    
    public final String a(String paramString, g.b paramb)
    {
      Intrinsics.checkNotNullParameter(paramString, "acc");
      Intrinsics.checkNotNullParameter(paramb, "element");
      if (paramString.length() == 0)
      {
        paramString = paramb.toString();
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(paramString);
        localStringBuilder.append(", ");
        localStringBuilder.append(paramb);
        paramString = localStringBuilder.toString();
      }
      return paramString;
    }
  }
  
  public static final class c
    extends l
    implements p
  {
    public c(g[] paramArrayOfg, kotlin.jvm.internal.t paramt)
    {
      super();
    }
    
    public final void a(V5.t paramt, g.b paramb)
    {
      Intrinsics.checkNotNullParameter(paramt, "<anonymous parameter 0>");
      Intrinsics.checkNotNullParameter(paramb, "element");
      paramt = o;
      kotlin.jvm.internal.t localt = localt;
      int i = o;
      o = (i + 1);
      paramt[i] = paramb;
    }
  }
}

/* Location:
 * Qualified Name:     X5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */