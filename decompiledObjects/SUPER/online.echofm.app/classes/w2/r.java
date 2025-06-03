package w2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public final class r
{
  public final Messenger a;
  public final h b;
  
  public r(IBinder paramIBinder)
  {
    String str = paramIBinder.getInterfaceDescriptor();
    if ("android.os.IMessenger".equals(str))
    {
      a = new Messenger(paramIBinder);
      b = null;
      return;
    }
    if ("com.google.android.gms.iid.IMessengerCompat".equals(str))
    {
      b = new h(paramIBinder);
      a = null;
      return;
    }
    paramIBinder = String.valueOf(str);
    if (paramIBinder.length() != 0) {
      paramIBinder = "Invalid interface descriptor: ".concat(paramIBinder);
    } else {
      paramIBinder = new String("Invalid interface descriptor: ");
    }
    Log.w("MessengerIpcClient", paramIBinder);
    throw new RemoteException();
  }
  
  public final void a(Message paramMessage)
  {
    Object localObject = a;
    if (localObject != null)
    {
      ((Messenger)localObject).send(paramMessage);
      return;
    }
    localObject = b;
    if (localObject != null)
    {
      ((h)localObject).b(paramMessage);
      return;
    }
    throw new IllegalStateException("Both messengers are null");
  }
}

/* Location:
 * Qualified Name:     w2.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */