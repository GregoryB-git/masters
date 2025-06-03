package l6;

import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import j6.b;
import java.util.concurrent.ConcurrentHashMap;
import k6.a.f;

public final class f0
  implements Runnable
{
  public f0(g0 paramg0, b paramb) {}
  
  public final void run()
  {
    Object localObject1 = b;
    Object localObject2 = (d0)f.r.get(b);
    if (localObject2 == null) {
      return;
    }
    b localb;
    if (a.D())
    {
      localObject1 = b;
      e = true;
      if (a.requiresSignIn())
      {
        localObject1 = b;
        if (e)
        {
          localObject2 = c;
          if (localObject2 != null) {
            a.getRemoteService((IAccountAccessor)localObject2, d);
          }
        }
        return;
      }
      try
      {
        localObject1 = b.a;
        ((a.f)localObject1).getRemoteService(null, ((a.f)localObject1).getScopesForConnectionlessNonSignIn());
        return;
      }
      catch (SecurityException localSecurityException)
      {
        Log.e("GoogleApiManager", "Failed to get service from broker. ", localSecurityException);
        b.a.disconnect("Failed to get service from broker.");
        localb = new b(10);
      }
    }
    else
    {
      localb = a;
    }
    ((d0)localObject2).o(localb, null);
  }
}

/* Location:
 * Qualified Name:     l6.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */