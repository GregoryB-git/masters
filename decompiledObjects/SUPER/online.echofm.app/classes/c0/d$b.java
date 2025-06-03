package c0;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.b;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;

public class d$b
  extends MediaBrowserCompat.b
{
  public final Context c;
  public final Intent d;
  public final BroadcastReceiver.PendingResult e;
  public MediaBrowserCompat f;
  
  public d$b(Context paramContext, Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
  {
    c = paramContext;
    d = paramIntent;
    e = paramPendingResult;
  }
  
  public void a()
  {
    new MediaControllerCompat(c, f.c()).a((KeyEvent)d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
    e();
  }
  
  public void b()
  {
    e();
  }
  
  public void c()
  {
    e();
  }
  
  public final void e()
  {
    f.b();
    e.finish();
  }
  
  public void f(MediaBrowserCompat paramMediaBrowserCompat)
  {
    f = paramMediaBrowserCompat;
  }
}

/* Location:
 * Qualified Name:     c0.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */