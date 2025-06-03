package x;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public abstract class a$g
{
  public static Intent a(Context paramContext, BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, Handler paramHandler, int paramInt)
  {
    return paramContext.registerReceiver(paramBroadcastReceiver, paramIntentFilter, paramString, paramHandler, paramInt);
  }
}

/* Location:
 * Qualified Name:     x.a.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */