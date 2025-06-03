package k0;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import g0.o;

public final class i1
{
  public final Context a;
  public PowerManager.WakeLock b;
  public boolean c;
  public boolean d;
  
  public i1(Context paramContext)
  {
    a = paramContext.getApplicationContext();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (b == null))
    {
      Object localObject = (PowerManager)a.getSystemService("power");
      if (localObject == null)
      {
        o.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
        return;
      }
      localObject = ((PowerManager)localObject).newWakeLock(1, "ExoPlayer:WakeLockManager");
      b = ((PowerManager.WakeLock)localObject);
      ((PowerManager.WakeLock)localObject).setReferenceCounted(false);
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
    PowerManager.WakeLock localWakeLock = b;
    if (localWakeLock == null) {
      return;
    }
    if ((c) && (d)) {
      localWakeLock.acquire();
    } else {
      localWakeLock.release();
    }
  }
}

/* Location:
 * Qualified Name:     k0.i1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */