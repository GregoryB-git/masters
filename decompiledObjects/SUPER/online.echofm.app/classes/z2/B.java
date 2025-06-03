package z2;

import A2.c.c;
import A2.i;
import android.os.Handler;
import android.util.Log;
import java.util.Map;
import java.util.Set;
import y2.a.f;

public final class B
  implements c.c, L
{
  public final a.f a;
  public final b b;
  public i c = null;
  public Set d = null;
  public boolean e = false;
  
  public B(e parame, a.f paramf, b paramb)
  {
    a = paramf;
    b = paramb;
  }
  
  public final void a(x2.b paramb)
  {
    x localx = (x)e.A(f).get(b);
    if (localx != null) {
      localx.H(paramb);
    }
  }
  
  public final void b(x2.b paramb)
  {
    e.r(f).post(new A(this, paramb));
  }
  
  public final void c(i parami, Set paramSet)
  {
    if ((parami != null) && (paramSet != null))
    {
      c = parami;
      d = paramSet;
      h();
      return;
    }
    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
    a(new x2.b(4));
  }
  
  public final void h()
  {
    if (e)
    {
      i locali = c;
      if (locali != null) {
        a.o(locali, d);
      }
    }
  }
}

/* Location:
 * Qualified Name:     z2.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */