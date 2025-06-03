package nc;

import f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rb.h;
import ub.e;

public final class c<T>
{
  public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "notCompletedCount");
  public final j0<T>[] a;
  private volatile int notCompletedCount;
  
  public c(j0<? extends T>[] paramArrayOfj0)
  {
    a = paramArrayOfj0;
    notCompletedCount = paramArrayOfj0.length;
  }
  
  public final class a
    extends n1
  {
    public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
    private volatile Object _disposer;
    public final k<List<? extends T>> e;
    public t0 f;
    
    public a(l paraml)
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
      else if (c.b.decrementAndGet(c.this) == 0)
      {
        k localk = e;
        j0[] arrayOfj0 = a;
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
  
  public final class b
    extends i
  {
    public b() {}
    
    public final void h(Throwable paramThrowable)
    {
      i();
    }
    
    public final void i()
    {
      c.a[] arrayOfa = c.this;
      int i = arrayOfa.length;
      int j = 0;
      while (j < i)
      {
        t0 localt0 = f;
        if (localt0 != null)
        {
          localt0.dispose();
          j++;
        }
        else
        {
          ec.i.i("handle");
          throw null;
        }
      }
    }
    
    public final Object invoke(Object paramObject)
    {
      paramObject = (Throwable)paramObject;
      i();
      return h.a;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("DisposeHandlersOnCancel[");
      localStringBuilder.append(c.this);
      localStringBuilder.append(']');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     nc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */