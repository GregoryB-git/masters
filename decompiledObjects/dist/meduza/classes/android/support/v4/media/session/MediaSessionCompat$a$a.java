package android.support.v4.media.session;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import g1.t;
import java.lang.ref.Reference;

public final class MediaSessionCompat$a$a
  extends Handler
{
  public MediaSessionCompat$a$a(MediaSessionCompat.a parama, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (what == 1) {
      synchronized (a.a)
      {
        MediaSessionCompat.b localb = (MediaSessionCompat.b)a.d.get();
        MediaSessionCompat.a locala = a;
        a locala1 = e;
        if ((localb != null) && (locala == localb.a()) && (locala1 != null))
        {
          localb.b((t)obj);
          a.B(localb, locala1);
          localb.b(null);
        }
        else {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */