package m0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class i$e
  extends BroadcastReceiver
{
  public i$e(i parami) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!isInitialStickyBroadcast())
    {
      i locali = a;
      i.d(locali, e.f(paramContext, paramIntent, i.a(locali), i.b(a)));
    }
  }
}

/* Location:
 * Qualified Name:     m0.i.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */