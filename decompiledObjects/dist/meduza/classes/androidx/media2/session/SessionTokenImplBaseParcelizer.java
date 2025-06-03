package androidx.media2.session;

import android.content.ComponentName;
import android.os.IBinder;
import b2.c;

public final class SessionTokenImplBaseParcelizer
{
  public static SessionTokenImplBase read(c paramc)
  {
    SessionTokenImplBase localSessionTokenImplBase = new SessionTokenImplBase();
    a = paramc.o(a, 1);
    b = paramc.o(b, 2);
    c = paramc.u(3, c);
    d = paramc.u(4, d);
    IBinder localIBinder = e;
    if (paramc.l(5)) {
      localIBinder = paramc.v();
    }
    e = localIBinder;
    f = ((ComponentName)paramc.s(f, 6));
    g = paramc.h(7, g);
    return localSessionTokenImplBase;
  }
  
  public static void write(SessionTokenImplBase paramSessionTokenImplBase, c paramc)
  {
    paramc.getClass();
    paramc.I(a, 1);
    paramc.I(b, 2);
    paramc.O(3, c);
    paramc.O(4, d);
    IBinder localIBinder = e;
    paramc.y(5);
    paramc.P(localIBinder);
    paramc.M(f, 6);
    paramc.B(7, g);
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.SessionTokenImplBaseParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */