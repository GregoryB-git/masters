package android.support.v4.media.session;

import a0.f;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.Reference;

public class MediaSessionCompat$b$a
  extends Handler
{
  public MediaSessionCompat$b$a(MediaSessionCompat.b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (what == 1) {
      synchronized (a.a)
      {
        MediaSessionCompat.c localc = (MediaSessionCompat.c)a.d.get();
        MediaSessionCompat.b localb = a;
        a locala = e;
        if ((localc != null) && (localb == localc.o()) && (locala != null))
        {
          localc.d((f)obj);
          a.a(localc, locala);
          localc.d(null);
        }
        else {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */