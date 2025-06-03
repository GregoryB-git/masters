package a0;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import t.h;

public class d$n$b
  implements Runnable
{
  public d$n$b(d.n paramn, d.o paramo) {}
  
  public void run()
  {
    Object localObject = o.asBinder();
    localObject = (d.f)p.a.s.remove(localObject);
    if (localObject != null) {
      f.asBinder().unlinkToDeath((IBinder.DeathRecipient)localObject, 0);
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */