package x0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import b1.h;
import b1.h0;
import b1.k;
import b1.k.a;
import b1.p;
import b1.p0;
import b1.s0;
import b1.t0;
import c1.b;
import java.util.Map;
import s1.c;
import s1.d;
import s1.e;

public final class o0
  implements h, e, t0
{
  public final i a;
  public final s0 b;
  public final Runnable c;
  public p d = null;
  public d e = null;
  
  public o0(i parami, s0 params0, u.a parama)
  {
    a = parami;
    b = params0;
    c = parama;
  }
  
  public final void a(k.a parama)
  {
    d.f(parama);
  }
  
  public final void b()
  {
    if (d == null)
    {
      d = new p(this);
      d locald = new d(this);
      e = locald;
      locald.a();
      c.run();
    }
  }
  
  public final c1.a getDefaultViewModelCreationExtras()
  {
    for (Object localObject1 = a.requireContext().getApplicationContext(); (localObject1 instanceof ContextWrapper); localObject1 = ((ContextWrapper)localObject1).getBaseContext()) {
      if ((localObject1 instanceof Application))
      {
        localObject1 = (Application)localObject1;
        break label46;
      }
    }
    localObject1 = null;
    label46:
    b localb = new b();
    if (localObject1 != null)
    {
      localObject2 = p0.a;
      a.put(localObject2, localObject1);
    }
    Object localObject2 = h0.a;
    localObject1 = a;
    a.put(localObject2, localObject1);
    localObject1 = h0.b;
    a.put(localObject1, this);
    if (a.getArguments() != null)
    {
      localObject2 = h0.c;
      localObject1 = a.getArguments();
      a.put(localObject2, localObject1);
    }
    return localb;
  }
  
  public final k getLifecycle()
  {
    b();
    return d;
  }
  
  public final c getSavedStateRegistry()
  {
    b();
    return e.b;
  }
  
  public final s0 getViewModelStore()
  {
    b();
    return b;
  }
}

/* Location:
 * Qualified Name:     x0.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */