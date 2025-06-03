package z2;

import A2.n;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import x2.b;
import x2.j;

public final class W
  implements Runnable
{
  public final U o;
  
  public W(X paramX, U paramU)
  {
    o = paramU;
  }
  
  public final void run()
  {
    if (!p.p) {
      return;
    }
    Object localObject = o.b();
    if (((b)localObject).g())
    {
      localX = p;
      o.startActivityForResult(GoogleApiActivity.a(localX.b(), (PendingIntent)n.i(((b)localObject).f()), o.a(), false), 1);
      return;
    }
    X localX = p;
    if (s.b(localX.b(), ((b)localObject).a(), null) != null)
    {
      localX = p;
      s.v(localX.b(), p.o, ((b)localObject).a(), 2, p);
      return;
    }
    if (((b)localObject).a() == 18)
    {
      localObject = p;
      localObject = s.q(((LifecycleCallback)localObject).b(), p);
      localX = p;
      s.r(localX.b().getApplicationContext(), new V(this, (Dialog)localObject));
      return;
    }
    X.q(p, (b)localObject, o.a());
  }
}

/* Location:
 * Qualified Name:     z2.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */