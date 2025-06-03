package u7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import r.b;
import r.g.e;

public final class f$c
  extends BroadcastReceiver
{
  public static AtomicReference<c> b = new AtomicReference();
  public final Context a;
  
  public f$c(Context paramContext)
  {
    a = paramContext;
  }
  
  public final void onReceive(Context arg1, Intent paramIntent)
  {
    synchronized (f.k)
    {
      paramIntent = ((g.e)f.l.values()).iterator();
      while (paramIntent.hasNext()) {
        ((f)paramIntent.next()).h();
      }
      a.unregisterReceiver(this);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     u7.f.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */