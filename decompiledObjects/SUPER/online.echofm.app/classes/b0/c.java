package b0;

import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.widget.RemoteViews;
import w.g;
import w.h.f;

public class c
  extends h.f
{
  public int[] e = null;
  public MediaSessionCompat.Token f;
  public PendingIntent g;
  public CharSequence h;
  public int i;
  public PendingIntent j;
  public boolean k = false;
  
  public void b(g paramg)
  {
    int m = Build.VERSION.SDK_INT;
    Notification.Builder localBuilder = paramg.a();
    if (m >= 34) {}
    for (paramg = a.b(b.a(a.a(), h, i, j, Boolean.valueOf(k)), e, f);; paramg = a.b(a.a(), e, f))
    {
      a.d(localBuilder, paramg);
      break;
    }
  }
  
  public RemoteViews d(g paramg)
  {
    return null;
  }
  
  public RemoteViews e(g paramg)
  {
    return null;
  }
  
  public c h(PendingIntent paramPendingIntent)
  {
    g = paramPendingIntent;
    return this;
  }
  
  public c i(MediaSessionCompat.Token paramToken)
  {
    f = paramToken;
    return this;
  }
  
  public c j(int... paramVarArgs)
  {
    e = paramVarArgs;
    return this;
  }
  
  public c k(boolean paramBoolean)
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     b0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */