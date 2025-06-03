package k5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class E$a$b
  extends BroadcastReceiver
{
  public E$a$b(E.a parama) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction())) {
      a.A("onBecomingNoisy", new Object[0]);
    }
  }
}

/* Location:
 * Qualified Name:     k5.E.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */