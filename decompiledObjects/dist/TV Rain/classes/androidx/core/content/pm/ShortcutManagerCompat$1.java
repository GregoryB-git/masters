package androidx.core.content.pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;

class ShortcutManagerCompat$1
  extends BroadcastReceiver
{
  public ShortcutManagerCompat$1(IntentSender paramIntentSender) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      val$callback.sendIntent(paramContext, 0, null, null, null);
      return;
    }
    catch (IntentSender.SendIntentException paramContext)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.ShortcutManagerCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */