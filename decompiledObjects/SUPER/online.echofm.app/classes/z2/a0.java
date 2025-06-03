package z2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public final class a0
  implements Runnable
{
  public a0(b0 paramb0, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run()
  {
    Object localObject = q;
    if (b0.H1((b0)localObject) > 0)
    {
      LifecycleCallback localLifecycleCallback = o;
      if (b0.I1((b0)localObject) != null) {
        localObject = b0.I1((b0)localObject).getBundle(p);
      } else {
        localObject = null;
      }
      localLifecycleCallback.f((Bundle)localObject);
    }
    if (b0.H1(q) >= 2) {
      o.j();
    }
    if (b0.H1(q) >= 3) {
      o.h();
    }
    if (b0.H1(q) >= 4) {
      o.k();
    }
    if (b0.H1(q) >= 5) {
      o.g();
    }
  }
}

/* Location:
 * Qualified Name:     z2.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */