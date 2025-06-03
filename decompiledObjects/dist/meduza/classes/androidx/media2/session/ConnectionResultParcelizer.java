package androidx.media2.session;

import android.app.PendingIntent;
import android.os.IBinder;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer.TrackInfo;
import androidx.media2.common.VideoSize;
import b2.c;
import java.util.ArrayList;
import java.util.List;

public final class ConnectionResultParcelizer
{
  public static ConnectionResult read(c paramc)
  {
    ConnectionResult localConnectionResult = new ConnectionResult();
    a = paramc.o(a, 0);
    Object localObject = c;
    if (paramc.l(1)) {
      localObject = paramc.v();
    }
    c = ((IBinder)localObject);
    m = paramc.o(m, 10);
    n = paramc.o(n, 11);
    o = ((ParcelImplListSlice)paramc.s(o, 12));
    p = ((SessionCommandGroup)paramc.x(p, 13));
    q = paramc.o(q, 14);
    r = paramc.o(r, 15);
    s = paramc.o(s, 16);
    t = paramc.h(17, t);
    u = ((VideoSize)paramc.x(u, 18));
    localObject = v;
    if (paramc.l(19)) {
      localObject = (List)paramc.k(new ArrayList());
    }
    v = ((List)localObject);
    d = ((PendingIntent)paramc.s(d, 2));
    w = ((SessionPlayer.TrackInfo)paramc.x(w, 20));
    x = ((SessionPlayer.TrackInfo)paramc.x(x, 21));
    y = ((SessionPlayer.TrackInfo)paramc.x(y, 23));
    z = ((SessionPlayer.TrackInfo)paramc.x(z, 24));
    A = ((MediaMetadata)paramc.x(A, 25));
    B = paramc.o(B, 26);
    e = paramc.o(e, 3);
    g = ((MediaItem)paramc.x(g, 4));
    h = paramc.q(5, h);
    i = paramc.q(6, i);
    float f = j;
    if (paramc.l(7)) {
      f = paramc.m();
    }
    j = f;
    k = paramc.q(8, k);
    l = ((MediaController.PlaybackInfo)paramc.x(l, 9));
    b = IMediaSession.Stub.asInterface(c);
    f = g;
    return localConnectionResult;
  }
  
  public static void write(ConnectionResult paramConnectionResult, c paramc)
  {
    paramc.getClass();
    synchronized (b)
    {
      if (c == null)
      {
        c = ((IBinder)b);
        g = a.a(paramConnectionResult.f);
      }
      paramc.I(a, 0);
      ??? = c;
      paramc.y(1);
      paramc.P((IBinder)???);
      paramc.I(m, 10);
      paramc.I(n, 11);
      paramc.M(o, 12);
      paramc.R(p, 13);
      paramc.I(q, 14);
      paramc.I(r, 15);
      paramc.I(s, 16);
      paramc.B(17, t);
      paramc.R(u, 18);
      paramc.F(19, v);
      paramc.M(d, 2);
      paramc.R(w, 20);
      paramc.R(x, 21);
      paramc.R(y, 23);
      paramc.R(z, 24);
      paramc.R(A, 25);
      paramc.I(B, 26);
      paramc.I(e, 3);
      paramc.R(g, 4);
      paramc.J(5, h);
      paramc.J(6, i);
      float f = j;
      paramc.y(7);
      paramc.G(f);
      paramc.J(8, k);
      paramc.R(l, 9);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media2.session.ConnectionResultParcelizer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */