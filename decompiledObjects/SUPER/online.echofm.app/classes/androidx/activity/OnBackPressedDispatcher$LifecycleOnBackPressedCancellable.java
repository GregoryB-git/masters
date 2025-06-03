package androidx.activity;

import androidx.lifecycle.d;
import androidx.lifecycle.d.b;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
  implements f, a
{
  public final d o;
  public final b p;
  public a q;
  
  public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(OnBackPressedDispatcher paramOnBackPressedDispatcher, d paramd, b paramb)
  {
    o = paramd;
    p = paramb;
    paramd.a(this);
  }
  
  public void a(h paramh, d.b paramb)
  {
    if (paramb == d.b.ON_START)
    {
      q = r.b(p);
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

/* Location:
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */