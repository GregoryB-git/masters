package j7;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;
import k7.c;
import k7.d;
import k7.e;
import k7.n;

public final class f
  extends e
{
  public f(h paramh, TaskCompletionSource paramTaskCompletionSource1, TaskCompletionSource paramTaskCompletionSource2)
  {
    super(paramTaskCompletionSource1);
  }
  
  public final void a()
  {
    try
    {
      Object localObject1 = c;
      c localc = (c)a.m;
      Object localObject3 = b;
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      Object localObject4 = i.a;
      try
      {
        localObject4 = i.a;
        ((HashMap)localObject4).put("java", Integer.valueOf(20002));
        ((BaseBundle)localObject1).putInt("playcore_version_code", ((Integer)((HashMap)localObject4).get("java")).intValue());
        if (((Map)localObject4).containsKey("native")) {
          ((BaseBundle)localObject1).putInt("playcore_native_version", ((Integer)((Map)localObject4).get("native")).intValue());
        }
        if (((Map)localObject4).containsKey("unity")) {
          ((BaseBundle)localObject1).putInt("playcore_unity_version", ((Integer)((Map)localObject4).get("unity")).intValue());
        }
        g localg = new j7/g;
        h localh = c;
        TaskCompletionSource localTaskCompletionSource = b;
        localObject4 = b;
        localg.<init>(localh, localTaskCompletionSource);
        localc.c2((String)localObject3, (Bundle)localObject1, localg);
        return;
      }
      finally {}
      d locald;
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localObject3 = c;
      locald = h.c;
      localObject3 = b;
      locald.getClass();
      if (Log.isLoggable("PlayCore", 6)) {
        Log.e("PlayCore", d.c(a, "error requesting in-app review for %s", new Object[] { localObject3 }), localRemoteException);
      }
      b.trySetException(new RuntimeException(localRemoteException));
    }
  }
}

/* Location:
 * Qualified Name:     j7.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */