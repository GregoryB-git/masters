package qc;

import b.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.c;

public final class u
  extends c<t<?>>
{
  public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state");
  private volatile Object _state;
  
  public final boolean a(Object paramObject)
  {
    paramObject = (t)paramObject;
    paramObject = a;
    boolean bool;
    if (((AtomicReferenceFieldUpdater)paramObject).get(this) != null)
    {
      bool = false;
    }
    else
    {
      ((AtomicReferenceFieldUpdater)paramObject).set(this, a0.R);
      bool = true;
    }
    return bool;
  }
  
  public final void b(t paramt)
  {
    a.set(this, null);
  }
}

/* Location:
 * Qualified Name:     qc.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */