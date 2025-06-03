package oc;

import android.os.Handler;
import android.os.Looper;
import ec.i;
import java.util.concurrent.CancellationException;
import nc.e2;
import nc.l;
import nc.r0;
import nc.s1;
import nc.t0;
import nc.u1;
import p2.m0;
import sc.n;
import tc.b;
import ub.h;

public final class f
  extends g
{
  private volatile f _immediate;
  public final Handler c;
  public final String d;
  public final boolean e;
  public final f f;
  
  public f(Handler paramHandler)
  {
    this(paramHandler, null, false);
  }
  
  public f(Handler paramHandler, String paramString, boolean paramBoolean)
  {
    c = paramHandler;
    d = paramString;
    e = paramBoolean;
    if (paramBoolean) {
      localObject = this;
    } else {
      localObject = null;
    }
    _immediate = ((f)localObject);
    f localf = _immediate;
    Object localObject = localf;
    if (localf == null)
    {
      localObject = new f(paramHandler, paramString, true);
      _immediate = ((f)localObject);
    }
    f = ((f)localObject);
  }
  
  public final boolean B0()
  {
    boolean bool;
    if ((e) && (i.a(Looper.myLooper(), c.getLooper()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final s1 C0()
  {
    return f;
  }
  
  public final void D0(h paramh, Runnable paramRunnable)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("The task was rejected, the handler underlying the dispatcher '");
    localStringBuilder.append(this);
    localStringBuilder.append("' was closed");
    m0.l(paramh, new CancellationException(localStringBuilder.toString()));
    r0.b.z0(paramh, paramRunnable);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof f)) && (c == c)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void f(long paramLong, l paraml)
  {
    d locald = new d(paraml, this);
    Handler localHandler = c;
    long l = paramLong;
    if (paramLong > 4611686018427387903L) {
      l = 4611686018427387903L;
    }
    if (localHandler.postDelayed(locald, l)) {
      paraml.v(new e(this, locald));
    } else {
      D0(e, locald);
    }
  }
  
  public final int hashCode()
  {
    return System.identityHashCode(c);
  }
  
  public final t0 q0(long paramLong, e2 parame2, h paramh)
  {
    Handler localHandler = c;
    long l = paramLong;
    if (paramLong > 4611686018427387903L) {
      l = 4611686018427387903L;
    }
    if (localHandler.postDelayed(parame2, l)) {
      return new c(this, parame2);
    }
    D0(paramh, parame2);
    return u1.a;
  }
  
  public final String toString()
  {
    Object localObject1 = r0.a;
    localObject1 = n.a;
    Object localObject2;
    if (this == localObject1)
    {
      localObject1 = "Dispatchers.Main";
    }
    else
    {
      try
      {
        localObject1 = ((s1)localObject1).C0();
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        localObject2 = null;
      }
      if (this == localObject2) {
        localObject2 = "Dispatchers.Main.immediate";
      } else {
        localObject2 = null;
      }
    }
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      localObject3 = d;
      localObject2 = localObject3;
      if (localObject3 == null) {
        localObject2 = c.toString();
      }
      localObject3 = localObject2;
      if (e) {
        localObject3 = g.d((String)localObject2, ".immediate");
      }
    }
    return (String)localObject3;
  }
  
  public final void z0(h paramh, Runnable paramRunnable)
  {
    if (!c.post(paramRunnable)) {
      D0(paramh, paramRunnable);
    }
  }
}

/* Location:
 * Qualified Name:     oc.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */