package g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public abstract class g$m
{
  public a a;
  
  public g$m(g paramg) {}
  
  public final void a()
  {
    a locala = a;
    if (locala != null) {}
    try
    {
      b.s.unregisterReceiver(locala);
      a = null;
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  public abstract IntentFilter b();
  
  public abstract int c();
  
  public abstract void d();
  
  public final void e()
  {
    a();
    IntentFilter localIntentFilter = b();
    if ((localIntentFilter != null) && (localIntentFilter.countActions() != 0))
    {
      if (a == null) {
        a = new a();
      }
      b.s.registerReceiver(a, localIntentFilter);
    }
  }
  
  public final class a
    extends BroadcastReceiver
  {
    public a() {}
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      d();
    }
  }
}

/* Location:
 * Qualified Name:     g.g.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */