package sa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class c
  extends BroadcastReceiver
{
  public c(e.a parama) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction())) {
      a.g("onBecomingNoisy", new Object[0]);
    }
  }
}

/* Location:
 * Qualified Name:     sa.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */