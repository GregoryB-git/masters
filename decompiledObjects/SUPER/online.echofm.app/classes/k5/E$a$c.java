package k5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class E$a$c
  extends BroadcastReceiver
{
  public E$a$c(E.a parama) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    a.A("onScoAudioStateUpdated", new Object[] { Integer.valueOf(paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)) });
  }
}

/* Location:
 * Qualified Name:     k5.E.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */