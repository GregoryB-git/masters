package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ec.i;
import java.util.concurrent.Executor;

public final class MultiInstanceInvalidationClient$b
  implements ServiceConnection
{
  public MultiInstanceInvalidationClient$b(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient) {}
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    i.e(paramComponentName, "name");
    i.e(paramIBinder, "service");
    a.f = IMultiInstanceInvalidationService.Stub.asInterface(paramIBinder);
    paramComponentName = a;
    c.execute(i);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    i.e(paramComponentName, "name");
    paramComponentName = a;
    c.execute(j);
    a.f = null;
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */