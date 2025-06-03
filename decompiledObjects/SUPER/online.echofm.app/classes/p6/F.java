package p6;

import X5.a;
import X5.b;
import X5.d;
import X5.e;
import X5.e.a;
import X5.g;
import X5.g.b;
import X5.g.c;
import kotlin.jvm.internal.Intrinsics;
import u6.j;
import u6.m;
import u6.n;

public abstract class F
  extends a
  implements e
{
  public static final a p = new a(null);
  
  public F()
  {
    super(e.c);
  }
  
  public final void C(d paramd)
  {
    Intrinsics.c(paramd, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
    ((j)paramd).r();
  }
  
  public abstract void E(g paramg, Runnable paramRunnable);
  
  public boolean F(g paramg)
  {
    return true;
  }
  
  public F G(int paramInt)
  {
    n.a(paramInt);
    return new m(this, paramInt);
  }
  
  public g.b b(g.c paramc)
  {
    return e.a.a(this, paramc);
  }
  
  public final d i(d paramd)
  {
    return new j(this, paramd);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(M.a(this));
    localStringBuilder.append('@');
    localStringBuilder.append(M.b(this));
    return localStringBuilder.toString();
  }
  
  public g x(g.c paramc)
  {
    return e.a.b(this, paramc);
  }
  
  public static final class a
    extends b
  {
    public a()
    {
      super(a.o);
    }
    
    public static final class a
      extends kotlin.jvm.internal.l
      implements g6.l
    {
      public static final a o = new a();
      
      public a()
      {
        super();
      }
      
      public final F a(g.b paramb)
      {
        if ((paramb instanceof F)) {
          paramb = (F)paramb;
        } else {
          paramb = null;
        }
        return paramb;
      }
    }
  }
}

/* Location:
 * Qualified Name:     p6.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */