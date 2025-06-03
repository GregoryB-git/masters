package s5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import v3.f1;

public final class c$d
  extends BroadcastReceiver
{
  public c$d(c paramc) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    c localc = a;
    paramContext = p;
    if ((paramContext != null) && (q) && (paramIntent.getIntExtra("INSTANCE_ID", m) == a.m))
    {
      paramIntent = paramIntent.getAction();
      if ("com.google.android.exoplayer.play".equals(paramIntent))
      {
        if (paramContext.d() == 1) {
          paramContext.a();
        } else if (paramContext.d() == 4) {
          paramContext.w(paramContext.F());
        }
        paramContext.b();
      }
      else if ("com.google.android.exoplayer.pause".equals(paramIntent))
      {
        paramContext.pause();
      }
      else if ("com.google.android.exoplayer.prev".equals(paramIntent))
      {
        paramContext.t();
      }
      else if ("com.google.android.exoplayer.rewind".equals(paramIntent))
      {
        paramContext.O();
      }
      else if ("com.google.android.exoplayer.ffwd".equals(paramIntent))
      {
        paramContext.N();
      }
      else if ("com.google.android.exoplayer.next".equals(paramIntent))
      {
        paramContext.M();
      }
      else if ("com.google.android.exoplayer.stop".equals(paramIntent))
      {
        paramContext.o(true);
      }
      else if ("com.google.android.exoplayer.dismiss".equals(paramIntent))
      {
        a.d(true);
      }
      else if (paramIntent != null)
      {
        a.getClass();
      }
    }
  }
}

/* Location:
 * Qualified Name:     s5.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */