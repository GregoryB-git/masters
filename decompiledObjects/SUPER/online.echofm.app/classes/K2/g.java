package K2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import x.a;

public abstract class g
  extends a
{
  public static Intent l(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    if (e.a())
    {
      int i;
      if (true != e.a()) {
        i = 0;
      } else {
        i = 2;
      }
      return f.a(paramContext, paramBroadcastReceiver, paramIntentFilter, i);
    }
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter);
  }
}

/* Location:
 * Qualified Name:     K2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */