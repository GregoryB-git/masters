package A2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

public final class X
  implements ServiceConnection
{
  public final int a;
  
  public X(c paramc, int paramInt)
  {
    a = paramInt;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = b;
    if (paramIBinder == null)
    {
      c.d0(paramComponentName, 16);
      return;
    }
    c localc;
    synchronized (c.W(paramComponentName))
    {
      localc = b;
      paramComponentName = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
      if ((paramComponentName != null) && ((paramComponentName instanceof k))) {
        paramComponentName = (k)paramComponentName;
      }
    }
    paramComponentName = new M(paramIBinder);
    c.a0(localc, paramComponentName);
    b.e0(0, null, a);
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (c.W(b))
    {
      c.a0(b, null);
      paramComponentName = b.l;
      paramComponentName.sendMessage(paramComponentName.obtainMessage(6, a, 1));
      return;
    }
  }
}

/* Location:
 * Qualified Name:     A2.X
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */