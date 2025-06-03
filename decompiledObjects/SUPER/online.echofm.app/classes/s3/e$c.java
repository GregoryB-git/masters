package s3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import t0.f;

public class e$c
  extends BroadcastReceiver
{
  public static AtomicReference b = new AtomicReference();
  public final Context a;
  
  public e$c(Context paramContext)
  {
    a = paramContext;
  }
  
  public static void b(Context paramContext)
  {
    if (b.get() == null)
    {
      c localc = new c(paramContext);
      if (f.a(b, null, localc)) {
        paramContext.registerReceiver(localc, new IntentFilter("android.intent.action.USER_UNLOCKED"));
      }
    }
  }
  
  public void c()
  {
    a.unregisterReceiver(this);
  }
  
  public void onReceive(Context arg1, Intent paramIntent)
  {
    synchronized ()
    {
      paramIntent = e.l.values().iterator();
      if (paramIntent.hasNext()) {
        e.d((e)paramIntent.next());
      }
    }
  }
}

/* Location:
 * Qualified Name:     s3.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */