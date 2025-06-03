package s6;

import V5.n.a;
import V5.t;
import Z5.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import t6.c;

public final class n
  extends t6.d
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
  private volatile Object _state;
  
  public boolean d(l paraml)
  {
    paraml = a;
    if (paraml.get(this) != null) {
      return false;
    }
    paraml.set(this, m.b());
    return true;
  }
  
  public final Object e(X5.d paramd)
  {
    Object localObject = new p6.m(Y5.b.b(paramd), 1);
    ((p6.m)localObject).z();
    if (!u.b.a(c(), this, m.b(), localObject))
    {
      n.a locala = V5.n.o;
      ((X5.d)localObject).resumeWith(V5.n.a(t.a));
    }
    localObject = ((p6.m)localObject).w();
    if (localObject == Y5.b.c()) {
      h.c(paramd);
    }
    if (localObject == Y5.b.c()) {
      return localObject;
    }
    return t.a;
  }
  
  public X5.d[] f(l paraml)
  {
    a.set(this, null);
    return c.a;
  }
  
  public final void g()
  {
    Object localObject1 = a;
    do
    {
      do
      {
        localObject2 = ((AtomicReferenceFieldUpdater)localObject1).get(this);
        if (localObject2 == null) {
          return;
        }
        if (localObject2 == m.c()) {
          return;
        }
        if (localObject2 != m.b()) {
          break;
        }
      } while (!u.b.a(a, this, localObject2, m.c()));
      return;
    } while (!u.b.a(a, this, localObject2, m.b()));
    localObject1 = (p6.m)localObject2;
    Object localObject2 = V5.n.o;
    ((X5.d)localObject1).resumeWith(V5.n.a(t.a));
  }
  
  public final boolean h()
  {
    Object localObject = a.getAndSet(this, m.b());
    Intrinsics.b(localObject);
    boolean bool;
    if (localObject == m.c()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     s6.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */