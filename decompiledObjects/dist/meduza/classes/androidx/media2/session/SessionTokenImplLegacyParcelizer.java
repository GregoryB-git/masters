package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession.Stub;
import android.support.v4.media.session.MediaSessionCompat.Token;
import b2.a;
import b2.c;
import b2.e;

public final class SessionTokenImplLegacyParcelizer
{
  public static SessionTokenImplLegacy read(c paramc)
  {
    SessionTokenImplLegacy localSessionTokenImplLegacy = new SessionTokenImplLegacy();
    b = paramc.h(1, b);
    c = paramc.o(c, 2);
    d = paramc.o(d, 3);
    e = ((ComponentName)paramc.s(e, 4));
    f = paramc.u(5, f);
    g = paramc.h(6, g);
    Object localObject = b;
    IMediaSession localIMediaSession;
    if (localObject != null)
    {
      ((Bundle)localObject).setClassLoader(MediaSessionCompat.Token.class.getClassLoader());
      localIMediaSession = IMediaSession.Stub.asInterface(((Bundle)localObject).getBinder("android.support.v4.media.session.EXTRA_BINDER"));
      paramc = a.b((Bundle)localObject);
      localObject = (MediaSessionCompat.Token)((Bundle)localObject).getParcelable("android.support.v4.media.session.TOKEN");
      if (localObject != null) {}
    }
    else
    {
      paramc = null;
      break label159;
    }
    paramc = new MediaSessionCompat.Token(b, localIMediaSession, paramc);
    label159:
    a = paramc;
    return localSessionTokenImplLegacy;
  }
  
  public static void write(SessionTokenImplLegacy paramSessionTokenImplLegacy, c paramc)
  {
    paramc.getClass();
    MediaSessionCompat.Token localToken1 = a;
    if (localToken1 != null) {
      try
      {
        Object localObject1 = a;
        synchronized (a)
        {
          localObject1 = d;
          MediaSessionCompat.Token localToken2 = a;
          synchronized (a)
          {
            d = null;
            b = a.b();
            localToken2 = a;
            synchronized (a)
            {
              d = ((e)localObject1);
            }
          }
        }
        b = null;
      }
      finally {}
    }
    paramc.B(1, b);
    paramc.I(c, 2);
    paramc.I(d, 3);
    paramc.M(e, 4);
    paramc.O(5, f);
    paramc.B(6, g);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionTokenImplLegacyParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */