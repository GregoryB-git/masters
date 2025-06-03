package g;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

public final class g$l
  extends g.m
{
  public final PowerManager c;
  
  public g$l(g paramg, Context paramContext)
  {
    super(paramg);
    c = ((PowerManager)paramContext.getApplicationContext().getSystemService("power"));
  }
  
  public final IntentFilter b()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
    return localIntentFilter;
  }
  
  public final int c()
  {
    int i;
    if (c.isPowerSaveMode()) {
      i = 2;
    } else {
      i = 1;
    }
    return i;
  }
  
  public final void d()
  {
    d.E(true, true);
  }
}

/* Location:
 * Qualified Name:     g.g.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */