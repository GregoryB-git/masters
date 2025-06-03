package g1;

import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.IInterface;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.ArrayList;
import java.util.Iterator;

public final class f
  implements Runnable
{
  public f(c.e parame, MediaSessionCompat.Token paramToken) {}
  
  public final void run()
  {
    c.e locale = b;
    MediaSessionCompat.Token localToken = a;
    if (!a.isEmpty())
    {
      IMediaSession localIMediaSession = localToken.a();
      if (localIMediaSession != null)
      {
        Iterator localIterator = a.iterator();
        while (localIterator.hasNext()) {
          ((Bundle)localIterator.next()).putBinder("extra_session_binder", localIMediaSession.asBinder());
        }
      }
      a.clear();
    }
    b.setSessionToken((MediaSession.Token)b);
  }
}

/* Location:
 * Qualified Name:     g1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */