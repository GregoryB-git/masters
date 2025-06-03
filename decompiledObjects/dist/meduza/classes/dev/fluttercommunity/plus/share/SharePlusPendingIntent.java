package dev.fluttercommunity.plus.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import ec.i;

public final class SharePlusPendingIntent
  extends BroadcastReceiver
{
  public static String a = "";
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    i.e(paramContext, "context");
    i.e(paramIntent, "intent");
    if (Build.VERSION.SDK_INT >= 33) {
      paramContext = paramIntent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
    } else {
      paramContext = paramIntent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
    }
    paramContext = (ComponentName)paramContext;
    if (paramContext != null) {
      a = paramContext.flattenToString();
    }
  }
}

/* Location:
 * Qualified Name:     dev.fluttercommunity.plus.share.SharePlusPendingIntent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */