package ea;

import android.os.BaseBundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ec.i;
import nc.e0;
import ub.h;
import x6.b;

public final class h0$a
  extends Handler
{
  public final h a;
  
  public h0$a(h paramh)
  {
    super(Looper.getMainLooper());
    a = paramh;
  }
  
  public final void handleMessage(Message paramMessage)
  {
    i.e(paramMessage, "msg");
    Object localObject;
    if (what == 3)
    {
      paramMessage = paramMessage.getData();
      if (paramMessage != null)
      {
        localObject = paramMessage.getString("SessionUpdateExtra");
        paramMessage = (Message)localObject;
        if (localObject != null) {}
      }
      else
      {
        paramMessage = "";
      }
      Log.d("SessionLifecycleClient", "Session update received.");
      b.g0(e0.a(a), null, new g0(paramMessage, null), 3);
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Received unexpected event from the SessionLifecycleService: ");
      ((StringBuilder)localObject).append(paramMessage);
      Log.w("SessionLifecycleClient", ((StringBuilder)localObject).toString());
      super.handleMessage(paramMessage);
    }
  }
}

/* Location:
 * Qualified Name:     ea.h0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */