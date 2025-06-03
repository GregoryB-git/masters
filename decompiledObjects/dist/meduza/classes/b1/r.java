package b1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ec.i;

public class r
  extends Service
  implements o
{
  public final m0 a = new m0(this);
  
  public final k getLifecycle()
  {
    return a.a;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    i.e(paramIntent, "intent");
    a.a(k.a.ON_START);
    return null;
  }
  
  public void onCreate()
  {
    a.a(k.a.ON_CREATE);
    super.onCreate();
  }
  
  public void onDestroy()
  {
    m0 localm0 = a;
    localm0.a(k.a.ON_STOP);
    localm0.a(k.a.ON_DESTROY);
    super.onDestroy();
  }
  
  public final void onStart(Intent paramIntent, int paramInt)
  {
    a.a(k.a.ON_START);
    super.onStart(paramIntent, paramInt);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     b1.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */