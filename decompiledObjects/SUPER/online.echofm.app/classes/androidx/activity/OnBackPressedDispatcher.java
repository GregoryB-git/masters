package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.d.b;
import androidx.lifecycle.d.c;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher
{
  public final Runnable a;
  public final ArrayDeque b = new ArrayDeque();
  
  public OnBackPressedDispatcher(Runnable paramRunnable)
  {
    a = paramRunnable;
  }
  
  public void a(h paramh, b paramb)
  {
    paramh = paramh.g();
    if (paramh.b() == d.c.o) {
      return;
    }
    paramb.a(new LifecycleOnBackPressedCancellable(paramh, paramb));
  }
  
  public a b(b paramb)
  {
    b.add(paramb);
    a locala = new a(paramb);
    paramb.a(locala);
    return locala;
  }
  
  public void c()
  {
    Iterator localIterator = b.descendingIterator();
    while (localIterator.hasNext())
    {
      localObject = (b)localIterator.next();
      if (((b)localObject).c())
      {
        ((b)localObject).b();
        return;
      }
    }
    Object localObject = a;
    if (localObject != null) {
      ((Runnable)localObject).run();
    }
  }
  
  public class LifecycleOnBackPressedCancellable
    implements f, a
  {
    public final d o;
    public final b p;
    public a q;
    
    public LifecycleOnBackPressedCancellable(d paramd, b paramb)
    {
      o = paramd;
      p = paramb;
      paramd.a(this);
    }
    
    public void a(h paramh, d.b paramb)
    {
      if (paramb == d.b.ON_START)
      {
        q = b(p);
      }
      else if (paramb == d.b.ON_STOP)
      {
        paramh = q;
        if (paramh != null) {
          paramh.cancel();
        }
      }
      else if (paramb == d.b.ON_DESTROY)
      {
        cancel();
      }
    }
    
    public void cancel()
    {
      o.c(this);
      p.e(this);
      a locala = q;
      if (locala != null)
      {
        locala.cancel();
        q = null;
      }
    }
  }
  
  public class a
    implements a
  {
    public final b o;
    
    public a(b paramb)
    {
      o = paramb;
    }
    
    public void cancel()
    {
      b.remove(o);
      o.e(this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */