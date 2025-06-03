package z2;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public final class Y
  implements Runnable
{
  public Y(Z paramZ, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run()
  {
    Object localObject = q;
    if (Z.d((Z)localObject) > 0)
    {
      LifecycleCallback localLifecycleCallback = o;
      if (Z.e((Z)localObject) != null) {
        localObject = Z.e((Z)localObject).getBundle(p);
      } else {
        localObject = null;
      }
      localLifecycleCallback.f((Bundle)localObject);
    }
    if (Z.d(q) >= 2) {
      o.j();
    }
    if (Z.d(q) >= 3) {
      o.h();
    }
    if (Z.d(q) >= 4) {
      o.k();
    }
    if (Z.d(q) >= 5) {
      o.g();
    }
  }
}

/* Location:
 * Qualified Name:     z2.Y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */