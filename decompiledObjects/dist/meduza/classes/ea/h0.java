package ea;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import ec.i;
import f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import nc.e0;
import ub.h;
import x6.b;

public final class h0
{
  public final h a;
  public Messenger b;
  public final LinkedBlockingDeque<Message> c;
  public final b d;
  
  public h0(h paramh)
  {
    a = paramh;
    c = new LinkedBlockingDeque(20);
    d = new b(this);
  }
  
  public static final Message a(h0 paramh0, List paramList, int paramInt)
  {
    paramh0.getClass();
    paramh0 = new ArrayList();
    paramList = paramList.iterator();
    Object localObject;
    while (paramList.hasNext())
    {
      localObject = paramList.next();
      int i;
      if (what == paramInt) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        paramh0.add(localObject);
      }
    }
    Iterator localIterator = paramh0.iterator();
    if (!localIterator.hasNext())
    {
      paramh0 = null;
    }
    else
    {
      paramh0 = localIterator.next();
      if (localIterator.hasNext()) {
        for (;;)
        {
          long l1 = ((Message)paramh0).getWhen();
          paramList = paramh0;
          do
          {
            localObject = localIterator.next();
            long l2 = ((Message)localObject).getWhen();
            long l3 = l1;
            paramh0 = paramList;
            if (l1 < l2)
            {
              paramh0 = (h0)localObject;
              l3 = l2;
            }
            l1 = l3;
            paramList = paramh0;
          } while (localIterator.hasNext());
        }
      }
    }
    return (Message)paramh0;
  }
  
  public final void b(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    c.drainTo(localArrayList);
    Message localMessage = Message.obtain(null, paramInt, 0, 0);
    i.d(localMessage, "obtain(null, messageCode, 0, 0)");
    localArrayList.add(localMessage);
    b.g0(e0.a(a), null, new i0(this, localArrayList, null), 3);
  }
  
  public static final class a
    extends Handler
  {
    public final h a;
    
    public a(h paramh)
    {
      super();
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
  
  public static final class b
    implements ServiceConnection
  {
    public b(h0 paramh0) {}
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      paramComponentName = f.l("Connected to SessionLifecycleService. Queue size ");
      paramComponentName.append(a.c.size());
      Log.d("SessionLifecycleClient", paramComponentName.toString());
      a.b = new Messenger(paramIBinder);
      a.getClass();
      paramComponentName = a;
      paramComponentName.getClass();
      paramIBinder = new ArrayList();
      c.drainTo(paramIBinder);
      b.g0(e0.a(a), null, new i0(paramComponentName, paramIBinder, null), 3);
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
      paramComponentName = a;
      b = null;
      paramComponentName.getClass();
    }
  }
}

/* Location:
 * Qualified Name:     ea.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */