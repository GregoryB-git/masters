package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class b
{
  public final Context a;
  public final a b;
  public boolean c;
  
  public b(Context paramContext, Handler paramHandler, b paramb)
  {
    a = paramContext.getApplicationContext();
    b = new a(paramHandler, paramb);
  }
  
  public void b(boolean paramBoolean)
  {
    if ((paramBoolean) && (!c)) {
      a.registerReceiver(b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }
    for (paramBoolean = true;; paramBoolean = false)
    {
      c = paramBoolean;
      break;
      if ((paramBoolean) || (!c)) {
        break;
      }
      a.unregisterReceiver(b);
    }
  }
  
  public final class a
    extends BroadcastReceiver
    implements Runnable
  {
    public final b.b o;
    public final Handler p;
    
    public a(Handler paramHandler, b.b paramb)
    {
      p = paramHandler;
      o = paramb;
    }
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction())) {
        p.post(this);
      }
    }
    
    public void run()
    {
      if (b.a(b.this)) {
        o.E();
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void E();
  }
}

/* Location:
 * Qualified Name:     k0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */