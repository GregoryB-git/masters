package v;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import d2.e;

public final class a$d
{
  public static Intent a(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    if (((paramInt & 0x4) != 0) && (paramString == null)) {
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, a.obtainAndCheckReceiverPermission(paramContext), paramHandler);
    }
    return e.e(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt & 0x1);
  }
  
  public static ComponentName b(Context paramContext, Intent paramIntent)
  {
    return com.google.android.gms.internal.base.a.h(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     v.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */