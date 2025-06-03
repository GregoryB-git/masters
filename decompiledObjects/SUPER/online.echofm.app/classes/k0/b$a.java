package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public final class b$a
  extends BroadcastReceiver
  implements Runnable
{
  public final b.b o;
  public final Handler p;
  
  public b$a(b paramb, Handler paramHandler, b.b paramb1)
  {
    p = paramHandler;
    o = paramb1;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction())) {
      p.post(this);
    }
  }
  
  public void run()
  {
    if (b.a(q)) {
      o.E();
    }
  }
}

/* Location:
 * Qualified Name:     k0.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */