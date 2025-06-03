package q6;

import X5.g;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import p6.B0;
import p6.F;
import p6.S;
import p6.W;
import p6.u0;

public final class c
  extends d
  implements S
{
  private volatile c _immediate;
  public final Handler q;
  public final String r;
  public final boolean s;
  public final c t;
  
  public c(Handler paramHandler, String paramString)
  {
    this(paramHandler, paramString, false);
  }
  
  public c(Handler paramHandler, String paramString, boolean paramBoolean)
  {
    super(null);
    q = paramHandler;
    r = paramString;
    s = paramBoolean;
    if (paramBoolean) {
      localObject = this;
    }
    _immediate = ((c)localObject);
    c localc = _immediate;
    localObject = localc;
    if (localc == null)
    {
      localObject = new c(paramHandler, paramString, true);
      _immediate = ((c)localObject);
    }
    t = ((c)localObject);
  }
  
  public void E(g paramg, Runnable paramRunnable)
  {
    if (!q.post(paramRunnable)) {
      J(paramg, paramRunnable);
    }
  }
  
  public boolean F(g paramg)
  {
    boolean bool;
    if ((s) && (Intrinsics.a(Looper.myLooper(), q.getLooper()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void J(g paramg, Runnable paramRunnable)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("The task was rejected, the handler underlying the dispatcher '");
    localStringBuilder.append(this);
    localStringBuilder.append("' was closed");
    u0.c(paramg, new CancellationException(localStringBuilder.toString()));
    W.b().E(paramg, paramRunnable);
  }
  
  public c K()
  {
    return t;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof c)) && (q == q)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return System.identityHashCode(q);
  }
  
  public String toString()
  {
    Object localObject1 = I();
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = r;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = q.toString();
      }
      localObject2 = localObject1;
      if (s)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(".immediate");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
    }
    return (String)localObject2;
  }
}

/* Location:
 * Qualified Name:     q6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */