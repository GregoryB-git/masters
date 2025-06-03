package m6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import u6.a;

public final class r0
  implements Handler.Callback
{
  public final boolean handleMessage(Message paramMessage)
  {
    int i = what;
    Object localObject2;
    if (i != 0)
    {
      if (i != 1) {
        return false;
      }
      synchronized (a.d)
      {
        p0 localp0 = (p0)obj;
        localObject2 = (q0)a.d.get(localp0);
        if ((localObject2 != null) && (b == 3))
        {
          ??? = String.valueOf(localp0);
          paramMessage = new java/lang/StringBuilder;
          paramMessage.<init>();
          paramMessage.append("Timeout waiting for ServiceConnection callback ");
          paramMessage.append((String)???);
          ??? = paramMessage.toString();
          paramMessage = new java/lang/Exception;
          paramMessage.<init>();
          Log.e("GmsClientSupervisor", (String)???, paramMessage);
          ??? = f;
          paramMessage = (Message)???;
          if (??? == null) {
            paramMessage = c;
          }
          ??? = paramMessage;
          if (paramMessage == null)
          {
            ??? = new android/content/ComponentName;
            paramMessage = b;
            j.i(paramMessage);
            ((ComponentName)???).<init>(paramMessage, "unknown");
          }
          ((q0)localObject2).onServiceDisconnected((ComponentName)???);
        }
        return true;
      }
    }
    synchronized (a.d)
    {
      paramMessage = (p0)obj;
      ??? = (q0)a.d.get(paramMessage);
      if ((??? != null) && (a.isEmpty()))
      {
        if (c)
        {
          localObject2 = e;
          o.f.removeMessages(1, localObject2);
          localObject2 = o;
          g.c(e, (ServiceConnection)???);
          c = false;
          b = 2;
        }
        a.d.remove(paramMessage);
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     m6.r0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */