package k7;

import android.os.IBinder;
import android.os.IInterface;

public final class l
  extends e
{
  public l(m paramm) {}
  
  public final void a()
  {
    n localn = b.a;
    b.a("unlinkToDeath", new Object[0]);
    m.asBinder().unlinkToDeath(j, 0);
    localn = b.a;
    m = null;
    g = false;
  }
}

/* Location:
 * Qualified Name:     k7.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */