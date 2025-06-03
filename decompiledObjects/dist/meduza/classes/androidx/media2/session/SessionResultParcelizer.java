package androidx.media2.session;

import androidx.media2.common.MediaItem;
import b2.c;

public final class SessionResultParcelizer
{
  public static SessionResult read(c paramc)
  {
    SessionResult localSessionResult = new SessionResult();
    a = paramc.o(a, 1);
    b = paramc.q(2, b);
    c = paramc.h(3, c);
    paramc = (MediaItem)paramc.x(e, 4);
    e = paramc;
    d = paramc;
    return localSessionResult;
  }
  
  public static void write(SessionResult paramSessionResult, c paramc)
  {
    paramc.getClass();
    MediaItem localMediaItem = d;
    if (localMediaItem != null) {
      try
      {
        if (e == null) {
          e = a.a(d);
        }
      }
      finally {}
    }
    paramc.I(a, 1);
    paramc.J(2, b);
    paramc.B(3, c);
    paramc.R(e, 4);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionResultParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */