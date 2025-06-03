package nc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ub.e;

public final class c$a
  extends n1
{
  public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
  private volatile Object _disposer;
  public final k<List<? extends T>> e;
  public t0 f;
  
  public c$a(c paramc, l paraml)
  {
    e = paraml;
  }
  
  public final void l(Throwable paramThrowable)
  {
    if (paramThrowable != null)
    {
      paramThrowable = e.e(paramThrowable);
      if (paramThrowable != null)
      {
        e.n(paramThrowable);
        paramThrowable = (c.b)p.get(this);
        if (paramThrowable != null) {
          paramThrowable.i();
        }
      }
    }
    else if (c.b.decrementAndGet(o) == 0)
    {
      k localk = e;
      j0[] arrayOfj0 = o.a;
      paramThrowable = new ArrayList(arrayOfj0.length);
      int i = 0;
      int j = arrayOfj0.length;
      while (i < j)
      {
        paramThrowable.add(arrayOfj0[i].getCompleted());
        i++;
      }
      localk.resumeWith(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     nc.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */