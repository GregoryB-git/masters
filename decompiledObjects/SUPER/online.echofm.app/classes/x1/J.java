package x1;

import W5.g;
import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

public final class J
  extends AbstractList
{
  public static final b u = new b(null);
  public static final AtomicInteger v = new AtomicInteger();
  public Handler o;
  public int p;
  public final String q = String.valueOf(Integer.valueOf(v.incrementAndGet()));
  public List r;
  public List s = new ArrayList();
  public String t;
  
  public J(Collection paramCollection)
  {
    r = new ArrayList(paramCollection);
  }
  
  public J(F... paramVarArgs)
  {
    r = new ArrayList((Collection)g.b(paramVarArgs));
  }
  
  public F D(int paramInt)
  {
    return (F)r.get(paramInt);
  }
  
  public final String M()
  {
    return t;
  }
  
  public final Handler S()
  {
    return o;
  }
  
  public final List T()
  {
    return s;
  }
  
  public final String U()
  {
    return q;
  }
  
  public final List V()
  {
    return r;
  }
  
  public int W()
  {
    return r.size();
  }
  
  public final int X()
  {
    return p;
  }
  
  public void a(int paramInt, F paramF)
  {
    Intrinsics.checkNotNullParameter(paramF, "element");
    r.add(paramInt, paramF);
  }
  
  public F c0(int paramInt)
  {
    return (F)r.remove(paramInt);
  }
  
  public void clear()
  {
    r.clear();
  }
  
  public boolean d(F paramF)
  {
    Intrinsics.checkNotNullParameter(paramF, "element");
    return r.add(paramF);
  }
  
  public F d0(int paramInt, F paramF)
  {
    Intrinsics.checkNotNullParameter(paramF, "element");
    return (F)r.set(paramInt, paramF);
  }
  
  public final void e0(Handler paramHandler)
  {
    o = paramHandler;
  }
  
  public final void f(a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "callback");
    if (!s.contains(parama)) {
      s.add(parama);
    }
  }
  
  public final List i()
  {
    return k();
  }
  
  public final List k()
  {
    return F.n.j(this);
  }
  
  public final I q()
  {
    return s();
  }
  
  public final I s()
  {
    return F.n.m(this);
  }
  
  public static abstract interface a
  {
    public abstract void a(J paramJ);
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     x1.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */