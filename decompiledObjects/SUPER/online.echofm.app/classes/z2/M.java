package z2;

import A2.n;
import S2.e;
import T2.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import x2.b;
import y2.a.a;
import y2.a.f;
import y2.e.a;
import y2.e.b;

public final class M
  extends T2.d
  implements e.a, e.b
{
  public static final a.a i = S2.d.c;
  public final Context b;
  public final Handler c;
  public final a.a d;
  public final Set e;
  public final A2.d f;
  public e g;
  public L h;
  
  public M(Context paramContext, Handler paramHandler, A2.d paramd)
  {
    b = paramContext;
    c = paramHandler;
    f = ((A2.d)n.j(paramd, "ClientSettings must not be null"));
    e = paramd.e();
    d = locala;
  }
  
  public final void K(l paraml)
  {
    c.post(new K(this, paraml));
  }
  
  public final void c1(L paramL)
  {
    Object localObject = g;
    if (localObject != null) {
      ((a.f)localObject).c();
    }
    f.i(Integer.valueOf(System.identityHashCode(this)));
    localObject = d;
    Context localContext = b;
    Looper localLooper = c.getLooper();
    A2.d locald = f;
    g = ((a.a)localObject).a(localContext, localLooper, locald, locald.f(), this, this);
    h = paramL;
    paramL = e;
    if ((paramL != null) && (!paramL.isEmpty()))
    {
      g.n();
      return;
    }
    c.post(new J(this));
  }
  
  public final void d1()
  {
    e locale = g;
    if (locale != null) {
      locale.c();
    }
  }
  
  public final void n(int paramInt)
  {
    g.c();
  }
  
  public final void o(b paramb)
  {
    h.a(paramb);
  }
  
  public final void v(Bundle paramBundle)
  {
    g.d(this);
  }
}

/* Location:
 * Qualified Name:     z2.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */