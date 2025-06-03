package sa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class d
  extends BroadcastReceiver
{
  public d(e.a parama) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    a.g("onScoAudioStateUpdated", new Object[] { Integer.valueOf(paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)) });
  }
}

/* Location:
 * Qualified Name:     sa.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */