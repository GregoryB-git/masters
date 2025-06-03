package A2;

import android.content.ComponentName;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

public final class i0
  implements Handler.Callback
{
  public final boolean handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 0)
    {
      if (i != 1) {
        return false;
      }
      e0 locale0;
      g0 localg0;
      synchronized (j0.k(o))
      {
        locale0 = (e0)obj;
        localg0 = (g0)j0.k(o).get(locale0);
        if ((localg0 == null) || (localg0.a() != 3)) {
          break label183;
        }
        ??? = String.valueOf(locale0);
        paramMessage = new java/lang/StringBuilder;
        paramMessage.<init>();
        paramMessage.append("Timeout waiting for ServiceConnection callback ");
        paramMessage.append((String)???);
        ??? = new java/lang/Exception;
        ((Exception)???).<init>();
        Log.e("GmsClientSupervisor", paramMessage.toString(), (Throwable)???);
        ??? = localg0.b();
        paramMessage = (Message)???;
        if (??? == null) {
          paramMessage = locale0.b();
        }
      }
      ??? = paramMessage;
      if (paramMessage == null)
      {
        ??? = new android/content/ComponentName;
        paramMessage = locale0.d();
        n.i(paramMessage);
        ((ComponentName)???).<init>(paramMessage, "unknown");
      }
      localg0.onServiceDisconnected((ComponentName)???);
      label183:
      return true;
      throw paramMessage;
    }
    synchronized (j0.k(o))
    {
      paramMessage = (e0)obj;
      ??? = (g0)j0.k(o).get(paramMessage);
      if ((??? == null) || (!((g0)???).i())) {
        break label269;
      }
      if (((g0)???).j()) {
        ((g0)???).g("GmsClientSupervisor");
      }
    }
    j0.k(o).remove(paramMessage);
    label269:
    return true;
  }
}

/* Location:
 * Qualified Name:     A2.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */