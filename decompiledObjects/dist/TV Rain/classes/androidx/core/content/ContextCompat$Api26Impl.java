package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import f0;

@RequiresApi(26)
class ContextCompat$Api26Impl
{
  @DoNotInline
  public static Intent registerReceiver(Context paramContext, @Nullable BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    if (((paramInt & 0x4) != 0) && (paramString == null)) {
      return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, ContextCompat.obtainAndCheckReceiverPermission(paramContext), paramHandler);
    }
    return f0.j(paramContext, paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt & 0x1);
  }
  
  @DoNotInline
  public static ComponentName startForegroundService(Context paramContext, Intent paramIntent)
  {
    return f0.i(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.ContextCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */