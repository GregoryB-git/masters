package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u.b;

public class r
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
  private volatile Object _cur;
  
  public r(boolean paramBoolean)
  {
    _cur = new s(8, paramBoolean);
  }
  
  public final boolean a(Object paramObject)
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = a;
    for (;;)
    {
      s locals = (s)localAtomicReferenceFieldUpdater.get(this);
      int i = locals.a(paramObject);
      if (i == 0) {
        break;
      }
      if (i != 1)
      {
        if (i == 2) {
          return false;
        }
      }
      else {
        b.a(a, this, locals, locals.i());
      }
    }
    return true;
  }
  
  public final void b()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = a;
    for (;;)
    {
      s locals = (s)localAtomicReferenceFieldUpdater.get(this);
      if (locals.d()) {
        return;
      }
      b.a(a, this, locals, locals.i());
    }
  }
  
  public final int c()
  {
    return ((s)a.get(this)).f();
  }
  
  public final Object d()
  {
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = a;
    for (;;)
    {
      s locals = (s)localAtomicReferenceFieldUpdater.get(this);
      Object localObject = locals.j();
      if (localObject != s.h) {
        return localObject;
      }
      b.a(a, this, locals, locals.i());
    }
  }
}

/* Location:
 * Qualified Name:     u6.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */