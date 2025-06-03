package v3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public final class b
{
  public final Context a;
  public final a b;
  public boolean c;
  
  public b(Context paramContext, Handler paramHandler, d0.b paramb)
  {
    a = paramContext.getApplicationContext();
    b = new a(paramHandler, paramb);
  }
  
  public final void a()
  {
    if (c)
    {
      a.unregisterReceiver(b);
      c = false;
    }
  }
  
  public final class a
    extends BroadcastReceiver
    implements Runnable
  {
    public final b.b a;
    public final Handler b;
    
    public a(Handler paramHandler, d0.b paramb)
    {
      b = paramHandler;
      a = paramb;
    }
    
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction())) {
        b.post(this);
      }
    }
    
    public final void run()
    {
      if (c) {
        a).a.r0(-1, 3, false);
      }
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     v3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */