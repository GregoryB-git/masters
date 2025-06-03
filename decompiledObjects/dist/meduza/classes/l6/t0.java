package l6;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import k6.g;
import m6.j;

public final class t0
  extends zau
{
  public t0(v0 paramv0, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message arg1)
  {
    int i = what;
    if (i != 0)
    {
      if (i != 1)
      {
        ??? = new StringBuilder();
        ???.append("TransformationResultHandler received unknown message type: ");
        ???.append(i);
        Log.e("TransformedResultImpl", ???.toString());
        return;
      }
      ??? = (RuntimeException)obj;
      Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(???.getMessage())));
      throw ???;
    }
    g localg = (g)obj;
    synchronized (a.c)
    {
      v0 localv0 = a.a;
      j.i(localv0);
      if (localg == null)
      {
        ??? = new com/google/android/gms/common/api/Status;
        ((Status)???).<init>(13, "Transform returned null", null, null);
        localv0.b((Status)???);
      }
      else if ((localg instanceof p0))
      {
        ??? = (p0)localg;
        localv0.b(null);
      }
      synchronized (c)
      {
        b = localg;
        localv0.c();
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     l6.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */