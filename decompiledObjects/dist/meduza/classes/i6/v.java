package i6;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

public final class v
{
  public final Messenger a;
  public final k b;
  
  public v(IBinder paramIBinder)
  {
    String str = paramIBinder.getInterfaceDescriptor();
    if (Objects.equals(str, "android.os.IMessenger"))
    {
      a = new Messenger(paramIBinder);
      b = null;
      return;
    }
    if (Objects.equals(str, "com.google.android.gms.iid.IMessengerCompat"))
    {
      b = new k(paramIBinder);
      a = null;
      return;
    }
    Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(str)));
    throw new RemoteException();
  }
}

/* Location:
 * Qualified Name:     i6.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */