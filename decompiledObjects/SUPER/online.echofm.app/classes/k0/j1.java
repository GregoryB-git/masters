package k0;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import g0.o;

public final class j1
{
  public final Context a;
  public WifiManager.WifiLock b;
  public boolean c;
  public boolean d;
  
  public j1(Context paramContext)
  {
    a = paramContext.getApplicationContext();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (b == null))
    {
      Object localObject = (WifiManager)a.getApplicationContext().getSystemService("wifi");
      if (localObject == null)
      {
        o.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
        return;
      }
      localObject = ((WifiManager)localObject).createWifiLock(3, "ExoPlayer:WifiLockManager");
      b = ((WifiManager.WifiLock)localObject);
      ((WifiManager.WifiLock)localObject).setReferenceCounted(false);
    }
    c = paramBoolean;
    c();
  }
  
  public void b(boolean paramBoolean)
  {
    d = paramBoolean;
    c();
  }
  
  public final void c()
  {
    WifiManager.WifiLock localWifiLock = b;
    if (localWifiLock == null) {
      return;
    }
    if ((c) && (d)) {
      localWifiLock.acquire();
    } else {
      localWifiLock.release();
    }
  }
}

/* Location:
 * Qualified Name:     k0.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */