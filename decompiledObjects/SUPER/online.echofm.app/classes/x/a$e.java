package x;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public abstract class a$e
{
  public static Intent a(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    if (((paramInt & 0x4) != 0) && (paramString == null)) {
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, a.g(paramContext), paramHandler);
    }
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt & 0x1);
  }
  
  public static ComponentName b(Context paramContext, Intent paramIntent)
  {
    return paramContext.startForegroundService(paramIntent);
  }
}

/* Location:
 * Qualified Name:     x.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */