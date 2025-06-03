package v3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public final class b$a
  extends BroadcastReceiver
  implements Runnable
{
  public final b.b a;
  public final Handler b;
  
  public b$a(b paramb, Handler paramHandler, d0.b paramb1)
  {
    b = paramHandler;
    a = paramb1;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction())) {
      b.post(this);
    }
  }
  
  public final void run()
  {
    if (c.c) {
      a).a.r0(-1, 3, false);
    }
  }
}

/* Location:
 * Qualified Name:     v3.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */