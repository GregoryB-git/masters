package g1;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import r.h;

public final class l
  implements Runnable
{
  public l(c.k paramk, c.m paramm) {}
  
  public final void run()
  {
    Object localObject = ((c.m)a).a();
    localObject = (c.c)b.a.d.remove(localObject);
    if (localObject != null) {
      ((c.m)d).a().unlinkToDeath((IBinder.DeathRecipient)localObject, 0);
    }
  }
}

/* Location:
 * Qualified Name:     g1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */