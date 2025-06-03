package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import u.b;

public abstract class e
{
  public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_next");
  public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_prev");
  private volatile Object _next;
  private volatile Object _prev;
  
  public e(e parame)
  {
    _prev = parame;
  }
  
  public final void b()
  {
    p.lazySet(this, null);
  }
  
  public final e c()
  {
    for (e locale = g(); (locale != null) && (locale.h()); locale = (e)p.get(locale)) {}
    return locale;
  }
  
  public final e d()
  {
    Object localObject = e();
    Intrinsics.b(localObject);
    while (((e)localObject).h())
    {
      e locale = ((e)localObject).e();
      if (locale == null) {
        return (e)localObject;
      }
      localObject = locale;
    }
    return (e)localObject;
  }
  
  public final e e()
  {
    Object localObject = a(this);
    if (localObject == d.a()) {
      return null;
    }
    return (e)localObject;
  }
  
  public final Object f()
  {
    return o.get(this);
  }
  
  public final e g()
  {
    return (e)p.get(this);
  }
  
  public abstract boolean h();
  
  public final boolean i()
  {
    boolean bool;
    if (e() == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean j()
  {
    return b.a(o, this, null, d.a());
  }
  
  public final void k()
  {
    if (i()) {
      return;
    }
    e locale1;
    e locale2;
    do
    {
      locale1 = c();
      locale2 = d();
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = p;
      Object localObject;
      e locale3;
      do
      {
        localObject = localAtomicReferenceFieldUpdater.get(locale2);
        if ((e)localObject == null) {
          locale3 = null;
        } else {
          locale3 = locale1;
        }
      } while (!b.a(localAtomicReferenceFieldUpdater, locale2, localObject, locale3));
      if (locale1 != null) {
        o.set(locale1, locale2);
      }
    } while (((locale2.h()) && (!locale2.i())) || ((locale1 != null) && (locale1.h())));
  }
  
  public final boolean l(e parame)
  {
    return b.a(o, this, null, parame);
  }
}

/* Location:
 * Qualified Name:     u6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */