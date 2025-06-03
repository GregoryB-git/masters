package w3;

import a4.b.c;
import a4.d;
import a4.d.b;
import a4.e.a;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaDrm.MediaDrmStateException;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent.Builder;
import android.media.metrics.PlaybackErrorEvent.Builder;
import android.media.metrics.PlaybackMetrics.Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent.Builder;
import android.media.metrics.TrackChangeEvent.Builder;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import o4.k;
import o7.a;
import o7.t;
import t5.m0.a;
import t5.v.b;
import v3.a1;
import v3.c1;
import v3.f1;
import v3.i0;
import v3.i0.a;
import v3.n;
import v3.o0;
import v3.o0.f;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v3.s1;
import v3.s1.a;
import v5.e0;
import w5.o;
import x3.m.e;
import z3.e;
import z4.q;
import z4.t.b;

public final class y
  implements b, z
{
  public boolean A;
  public final Context a;
  public final x b;
  public final PlaybackSession c;
  public final long d;
  public final r1.c e;
  public final r1.b f;
  public final HashMap<String, Long> g;
  public final HashMap<String, Long> h;
  public String i;
  public PlaybackMetrics.Builder j;
  public int k;
  public int l;
  public int m;
  public c1 n;
  public b o;
  public b p;
  public b q;
  public i0 r;
  public i0 s;
  public i0 t;
  public boolean u;
  public int v;
  public boolean w;
  public int x;
  public int y;
  public int z;
  
  public y(Context paramContext, PlaybackSession paramPlaybackSession)
  {
    a = paramContext.getApplicationContext();
    c = paramPlaybackSession;
    e = new r1.c();
    f = new r1.b();
    h = new HashMap();
    g = new HashMap();
    d = SystemClock.elapsedRealtime();
    l = 0;
    m = 0;
    paramContext = new x();
    b = paramContext;
    d = this;
  }
  
  public static int j(int paramInt)
  {
    switch (e0.r(paramInt))
    {
    default: 
      return 27;
    case 6005: 
      return 26;
    case 6004: 
      return 25;
    case 6003: 
      return 28;
    }
    return 24;
  }
  
  public final void J(f1 paramf1, b.b paramb)
  {
    if (a.b() == 0) {
      return;
    }
    int i2;
    int i3;
    Object localObject6;
    boolean bool1;
    boolean bool2;
    for (int i1 = 0;; i1++)
    {
      i2 = a.b();
      i3 = 1;
      if (i1 >= i2) {
        break;
      }
      i2 = a.a(i1);
      ??? = (b.a)b.get(i2);
      ???.getClass();
      Object localObject4;
      if (i2 == 0) {
        synchronized (b)
        {
          d.getClass();
          ??? = e;
          e = b;
          localObject4 = c.values().iterator();
          while (((Iterator)localObject4).hasNext())
          {
            Object localObject5 = (x.a)((Iterator)localObject4).next();
            if ((!((x.a)localObject5).b((r1)???, e)) || (((x.a)localObject5).a((b.a)???)))
            {
              ((Iterator)localObject4).remove();
              if (e)
              {
                if (a.equals(f)) {
                  f = null;
                }
                localObject6 = d;
                localObject5 = a;
                ((y)localObject6).n((b.a)???, (String)localObject5);
              }
            }
          }
          ((x)???).b((b.a)???);
        }
      }
      if (i2 == 11)
      {
        ??? = b;
        i2 = k;
        try
        {
          d.getClass();
          if (i2 != 0) {
            i3 = 0;
          }
          localObject6 = c.values().iterator();
          while (((Iterator)localObject6).hasNext())
          {
            localObject4 = (x.a)((Iterator)localObject6).next();
            if (((x.a)localObject4).a((b.a)???))
            {
              ((Iterator)localObject6).remove();
              if (e)
              {
                bool1 = a.equals(f);
                if ((i3 != 0) && (bool1)) {
                  bool2 = f;
                }
                if (bool1) {
                  f = null;
                }
                ??? = d;
                localObject4 = a;
                ((y)???).n((b.a)???, (String)localObject4);
              }
            }
          }
          ((x)???).b((b.a)???);
        }
        finally {}
      }
      b.c((b.a)???);
    }
    long l1 = SystemClock.elapsedRealtime();
    if (paramb.a(0))
    {
      ??? = (b.a)b.get(0);
      ???.getClass();
      if (j != null) {
        k(b, d);
      }
    }
    if ((paramb.a(2)) && (j != null))
    {
      ??? = Ba.r(0);
      while (((a)???).hasNext())
      {
        ??? = (s1.a)((a)???).next();
        for (i1 = 0; i1 < a; i1++) {
          if (e[i1] != 0)
          {
            ??? = b.d[i1].w;
            if (??? != null) {
              break label612;
            }
          }
        }
      }
      ??? = null;
      label612:
      if (??? != null)
      {
        ??? = j;
        for (i1 = 0; i1 < d; i1++)
        {
          ??? = a[i1].b;
          if (((UUID)???).equals(v3.h.d))
          {
            i1 = 3;
            break label703;
          }
          if (((UUID)???).equals(v3.h.e))
          {
            i1 = 2;
            break label703;
          }
          if (((UUID)???).equals(v3.h.c))
          {
            i1 = 6;
            break label703;
          }
        }
        i1 = 1;
        label703:
        ((PlaybackMetrics.Builder)???).setDrmType(i1);
      }
    }
    if (paramb.a(1011)) {
      z += 1;
    }
    ??? = n;
    if (??? == null)
    {
      i1 = 8;
      i3 = 7;
    }
    else
    {
      ??? = a;
      if (v == 4) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      if (a == 1001)
      {
        ??? = new a(20, 0);
      }
      else
      {
        if ((??? instanceof n))
        {
          ??? = (n)???;
          if (c == 1) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          i2 = o;
          i4 = i1;
        }
        else
        {
          i2 = 0;
          i4 = i2;
        }
        ??? = ((Throwable)???).getCause();
        ???.getClass();
        if (!(??? instanceof IOException)) {
          break label1491;
        }
        if ((??? instanceof t5.z))
        {
          ??? = new a(5, d);
        }
        else
        {
          if (((??? instanceof t5.y)) || ((??? instanceof a1))) {
            break label1456;
          }
          bool1 = ??? instanceof t5.x;
          if ((!bool1) && (!(??? instanceof m0.a)))
          {
            if (a == 1002)
            {
              ??? = new a(21, 0);
            }
            else if ((??? instanceof e.a))
            {
              ??? = ((Throwable)???).getCause();
              ???.getClass();
              i1 = e0.a;
              if ((i1 >= 21) && ((??? instanceof MediaDrm.MediaDrmStateException)))
              {
                i1 = e0.s(((MediaDrm.MediaDrmStateException)???).getDiagnosticInfo());
                ??? = new a(j(i1), i1);
              }
              else if ((i1 >= 23) && ((??? instanceof MediaDrmResetException)))
              {
                ??? = new a(27, 0);
              }
              else if ((i1 >= 18) && ((??? instanceof NotProvisionedException)))
              {
                ??? = new a(24, 0);
              }
              else if ((i1 >= 18) && ((??? instanceof DeniedByServerException)))
              {
                ??? = new a(29, 0);
              }
              else if ((??? instanceof a4.y))
              {
                ??? = new a(23, 0);
              }
              else
              {
                if ((??? instanceof b.c)) {
                  i1 = 28;
                } else {
                  i1 = 30;
                }
                ??? = new a(i1, 0);
              }
            }
            else if (((??? instanceof v.b)) && ((((Throwable)???).getCause() instanceof FileNotFoundException)))
            {
              ??? = ((Throwable)???).getCause();
              ???.getClass();
              ??? = ((Throwable)???).getCause();
              if ((e0.a >= 21) && ((??? instanceof ErrnoException)) && (errno == OsConstants.EACCES)) {
                ??? = new a(32, 0);
              } else {
                ??? = new a(31, 0);
              }
            }
            else
            {
              ??? = new a(9, 0);
            }
          }
          else {
            localObject6 = v5.s.b((Context)???);
          }
        }
      }
      synchronized (c)
      {
        i1 = d;
        if (i1 == 1)
        {
          ??? = new a(3, 0);
        }
        else
        {
          ??? = ((Throwable)???).getCause();
          if (!(??? instanceof UnknownHostException)) {
            break label1374;
          }
          ??? = new a(6, 0);
        }
        i1 = 8;
        i3 = 7;
        break label1790;
        label1374:
        if ((??? instanceof SocketTimeoutException)) {}
        for (??? = new a(7, 0);; ??? = new a(4, 0))
        {
          i3 = 7;
          i1 = 8;
          break label1581;
          if ((!bool1) || (c != 1)) {
            break;
          }
        }
        ??? = new a(8, 0);
      }
      label1456:
      if (i3 != 0) {
        i1 = 10;
      } else {
        i1 = 11;
      }
      ??? = new a(i1, 0);
      i1 = 8;
      i3 = 7;
      break label1526;
      label1491:
      i1 = 8;
      i3 = 7;
      if ((i4 != 0) && ((i2 == 0) || (i2 == 1))) {
        ??? = new a(35, 0);
      }
      for (;;)
      {
        label1526:
        break;
        if ((i4 != 0) && (i2 == 3))
        {
          ??? = new a(15, 0);
        }
        else
        {
          if ((i4 == 0) || (i2 != 2)) {
            break label1584;
          }
          ??? = new a(23, 0);
        }
      }
      label1581:
      break label1790;
      label1584:
      if ((??? instanceof o4.m.b))
      {
        ??? = new a(13, e0.s(d));
      }
      else if ((??? instanceof k))
      {
        ??? = new a(14, e0.s(a));
      }
      else if ((??? instanceof OutOfMemoryError))
      {
        ??? = new a(14, 0);
      }
      else if ((??? instanceof x3.m.b))
      {
        ??? = new a(17, a);
      }
      else if ((??? instanceof m.e))
      {
        ??? = new a(18, a);
      }
      else if ((e0.a >= 16) && ((??? instanceof MediaCodec.CryptoException)))
      {
        i2 = ((MediaCodec.CryptoException)???).getErrorCode();
        ??? = new a(j(i2), i2);
      }
      else
      {
        ??? = new a(22, 0);
      }
      label1790:
      c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(l1 - d).setErrorCode(a).setSubErrorCode(b).setException((Exception)???).build());
      A = true;
      n = null;
    }
    if (paramb.a(2))
    {
      ??? = paramf1.B();
      bool1 = ((s1)???).a(2);
      bool2 = ((s1)???).a(1);
      boolean bool3 = ((s1)???).a(3);
      if ((!bool1) && (!bool2) && (!bool3)) {
        break label2065;
      }
      if ((!bool1) && (!e0.a(r, null)))
      {
        if (r == null) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        r = null;
        p(1, l1, null, i2);
      }
      if ((!bool2) && (!e0.a(s, null)))
      {
        if (s == null) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        s = null;
        p(0, l1, null, i2);
      }
      if ((!bool3) && (!e0.a(t, null)))
      {
        if (t == null) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        t = null;
        p(2, l1, null, i2);
      }
    }
    label2065:
    int i4 = 3;
    if (g(o))
    {
      ??? = o;
      ??? = a;
      if (z != -1)
      {
        i2 = b;
        if (!e0.a(r, ???))
        {
          if ((r == null) && (i2 == 0)) {
            i2 = 1;
          }
          r = ((i0)???);
          p(1, l1, (i0)???, i2);
        }
        o = null;
      }
    }
    if (g(p))
    {
      ??? = p;
      ??? = a;
      i2 = b;
      if (!e0.a(s, ???))
      {
        if ((s == null) && (i2 == 0)) {
          i2 = 1;
        }
        s = ((i0)???);
        p(0, l1, (i0)???, i2);
      }
      p = null;
    }
    if (g(q))
    {
      ??? = q;
      ??? = a;
      i2 = b;
      if (!e0.a(t, ???))
      {
        if ((t == null) && (i2 == 0)) {
          i2 = 1;
        }
        t = ((i0)???);
        p(2, l1, (i0)???, i2);
      }
      q = null;
    }
    ??? = v5.s.b(a);
    synchronized (c)
    {
      i2 = d;
      switch (i2)
      {
      case 6: 
      case 8: 
      default: 
        i1 = 1;
        break;
      case 10: 
        i1 = i3;
        break;
      case 9: 
        break;
      case 7: 
        i1 = 3;
        break;
      case 5: 
        i1 = 6;
        break;
      case 4: 
        i1 = 5;
        break;
      case 3: 
        i1 = 4;
        break;
      case 2: 
        i1 = 2;
        break;
      case 1: 
        i1 = 9;
        break;
      case 0: 
        i1 = 0;
      }
      if (i1 != m)
      {
        m = i1;
        c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i1).setTimeSinceCreatedMillis(l1 - d).build());
      }
      if (paramf1.d() != 2) {
        u = false;
      }
      if (paramf1.v() == null) {
        w = false;
      } else if (paramb.a(10)) {
        w = true;
      }
      i1 = paramf1.d();
      if (u)
      {
        i1 = 5;
      }
      else if (w)
      {
        i1 = 13;
      }
      else if (i1 == 4)
      {
        i1 = 11;
      }
      else if (i1 == 2)
      {
        i1 = l;
        if ((i1 != 0) && (i1 != 2))
        {
          if (!paramf1.k()) {
            i1 = i3;
          } else if (paramf1.I() != 0) {
            i1 = 10;
          } else {
            i1 = 6;
          }
        }
        else {
          i1 = 2;
        }
      }
      else if (i1 == 3)
      {
        if (!paramf1.k())
        {
          i1 = 4;
        }
        else
        {
          i1 = i4;
          if (paramf1.I() != 0) {
            i1 = 9;
          }
        }
      }
      else if ((i1 == 1) && (l != 0))
      {
        i1 = 12;
      }
      else
      {
        i1 = l;
      }
      if (l != i1)
      {
        l = i1;
        A = true;
        c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(l).setTimeSinceCreatedMillis(l1 - d).build());
      }
      if (paramb.a(1028))
      {
        paramf1 = b;
        ??? = (b.a)b.get(1028);
        ???.getClass();
        try
        {
          f = null;
          paramb = c.values().iterator();
          while (paramb.hasNext())
          {
            ??? = (x.a)paramb.next();
            paramb.remove();
            if (e)
            {
              ??? = d;
              if (??? != null)
              {
                ??? = a;
                ((y)???).n((b.a)???, (String)???);
              }
            }
          }
        }
        finally {}
      }
      return;
    }
  }
  
  public final void P(b.a parama, int paramInt, long paramLong)
  {
    Object localObject1 = d;
    if (localObject1 != null)
    {
      Object localObject2 = b;
      parama = b;
      try
      {
        parama = aga, b).c, (t.b)localObject1).a;
        Long localLong = (Long)h.get(parama);
        localObject2 = (Long)g.get(parama);
        localObject1 = h;
        long l1 = 0L;
        long l2;
        if (localLong == null) {
          l2 = 0L;
        } else {
          l2 = localLong.longValue();
        }
        ((HashMap)localObject1).put(parama, Long.valueOf(l2 + paramLong));
        localObject1 = g;
        if (localObject2 == null) {
          paramLong = l1;
        } else {
          paramLong = ((Long)localObject2).longValue();
        }
        ((HashMap)localObject1).put(parama, Long.valueOf(paramLong + paramInt));
      }
      finally {}
    }
  }
  
  public final void a(e parame)
  {
    x += g;
    y += e;
  }
  
  public final void b(o paramo)
  {
    b localb = o;
    if (localb != null)
    {
      Object localObject = a;
      if (z == -1)
      {
        localObject = new i0.a((i0)localObject);
        p = a;
        q = b;
        o = new b(new i0((i0.a)localObject), b, c);
      }
    }
  }
  
  public final void d(int paramInt)
  {
    if (paramInt == 1) {
      u = true;
    }
    k = paramInt;
  }
  
  public final void e0(c1 paramc1)
  {
    n = paramc1;
  }
  
  public final boolean g(b arg1)
  {
    String str1;
    if (??? != null) {
      str1 = c;
    }
    boolean bool;
    synchronized (b)
    {
      String str2 = f;
      if (str1.equals(str2)) {
        bool = true;
      }
    }
    return bool;
  }
  
  public final void g0(q paramq)
  {
    v = a;
  }
  
  public final void i()
  {
    Object localObject1 = j;
    if ((localObject1 != null) && (A))
    {
      ((PlaybackMetrics.Builder)localObject1).setAudioUnderrunCount(z);
      j.setVideoFramesDropped(x);
      j.setVideoFramesPlayed(y);
      Object localObject2 = (Long)g.get(i);
      localObject1 = j;
      long l1;
      if (localObject2 == null) {
        l1 = 0L;
      } else {
        l1 = ((Long)localObject2).longValue();
      }
      ((PlaybackMetrics.Builder)localObject1).setNetworkTransferDurationMillis(l1);
      localObject1 = (Long)h.get(i);
      localObject2 = j;
      if (localObject1 == null) {
        l1 = 0L;
      } else {
        l1 = ((Long)localObject1).longValue();
      }
      ((PlaybackMetrics.Builder)localObject2).setNetworkBytesRead(l1);
      localObject2 = j;
      int i1;
      if ((localObject1 != null) && (((Long)localObject1).longValue() > 0L)) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      ((PlaybackMetrics.Builder)localObject2).setStreamSource(i1);
      c.reportPlaybackMetrics(j.build());
    }
    j = null;
    i = null;
    z = 0;
    x = 0;
    y = 0;
    r = null;
    s = null;
    t = null;
    A = false;
  }
  
  public final void k(r1 paramr1, t.b paramb)
  {
    PlaybackMetrics.Builder localBuilder = j;
    if (paramb == null) {
      return;
    }
    int i1 = paramr1.b(a);
    int i2 = -1;
    if (i1 == -1) {
      return;
    }
    paramb = f;
    int i3 = 0;
    int i4 = 0;
    paramr1.f(i1, paramb, false);
    paramr1.m(f.c, e);
    paramb = e.c.b;
    i1 = 2;
    if (paramb == null)
    {
      i4 = i3;
    }
    else
    {
      paramr1 = a;
      paramb = b;
      if (paramb == null)
      {
        i4 = e0.C(paramr1);
      }
      else
      {
        i3 = e0.a;
        switch (paramb.hashCode())
        {
        default: 
          break;
        case 1154777587: 
          if (paramb.equals("application/x-rtsp")) {
            i2 = 3;
          }
          break;
        case 64194685: 
          if (paramb.equals("application/dash+xml")) {
            i2 = 2;
          }
          break;
        case -156749520: 
          if (paramb.equals("application/vnd.ms-sstr+xml")) {
            i2 = 1;
          }
          break;
        case -979127466: 
          if (paramb.equals("application/x-mpegURL")) {
            i2 = 0;
          }
          break;
        }
        switch (i2)
        {
        default: 
          i4 = 4;
          break;
        case 3: 
          i4 = 3;
          break;
        case 1: 
          i4 = 1;
          break;
        case 0: 
          i4 = 2;
        }
      }
      if (i4 != 0)
      {
        if (i4 != 1)
        {
          if (i4 != 2) {
            i4 = 1;
          } else {
            i4 = 4;
          }
        }
        else {
          i4 = 5;
        }
      }
      else {
        i4 = 3;
      }
    }
    localBuilder.setStreamType(i4);
    paramr1 = e;
    if ((v != -9223372036854775807L) && (!t) && (!q) && (!paramr1.a())) {
      localBuilder.setMediaDurationMillis(e0.R(e.v));
    }
    if (e.a()) {
      i4 = i1;
    } else {
      i4 = 1;
    }
    localBuilder.setPlaybackType(i4);
    A = true;
  }
  
  public final void l(b.a parama, String paramString)
  {
    t.b localb = d;
    if ((localb != null) && (localb.a())) {
      return;
    }
    i();
    i = paramString;
    j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.7");
    k(b, d);
  }
  
  public final void n(b.a parama, String paramString)
  {
    parama = d;
    if (((parama == null) || (!parama.a())) && (paramString.equals(i))) {
      i();
    }
    g.remove(paramString);
    h.remove(paramString);
  }
  
  public final void n0(b.a parama, q paramq)
  {
    if (d == null) {
      return;
    }
    i0 locali0 = c;
    locali0.getClass();
    int i1 = d;
    x localx = b;
    r1 localr1 = b;
    parama = d;
    parama.getClass();
    try
    {
      parama = aga, b).c, parama).a;
      parama = new b(locali0, i1, parama);
      i1 = b;
      if (i1 != 0) {
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3) {
              break label144;
            }
            q = parama;
            break label144;
          }
        }
        else
        {
          p = parama;
          break label144;
        }
      }
      o = parama;
      label144:
      return;
    }
    finally {}
  }
  
  public final void p(int paramInt1, long paramLong, i0 parami0, int paramInt2)
  {
    TrackChangeEvent.Builder localBuilder = new TrackChangeEvent.Builder(paramInt1).setTimeSinceCreatedMillis(paramLong - d);
    if (parami0 != null)
    {
      localBuilder.setTrackState(1);
      if (paramInt2 != 1)
      {
        paramInt1 = 3;
        if (paramInt2 != 2) {
          if (paramInt2 != 3) {
            paramInt1 = 1;
          } else {
            paramInt1 = 4;
          }
        }
      }
      else
      {
        paramInt1 = 2;
      }
      localBuilder.setTrackChangeReason(paramInt1);
      Object localObject1 = s;
      if (localObject1 != null) {
        localBuilder.setContainerMimeType((String)localObject1);
      }
      localObject1 = t;
      if (localObject1 != null) {
        localBuilder.setSampleMimeType((String)localObject1);
      }
      localObject1 = q;
      if (localObject1 != null) {
        localBuilder.setCodecName((String)localObject1);
      }
      paramInt1 = p;
      if (paramInt1 != -1) {
        localBuilder.setBitrate(paramInt1);
      }
      paramInt1 = y;
      if (paramInt1 != -1) {
        localBuilder.setWidth(paramInt1);
      }
      paramInt1 = z;
      if (paramInt1 != -1) {
        localBuilder.setHeight(paramInt1);
      }
      paramInt1 = G;
      if (paramInt1 != -1) {
        localBuilder.setChannelCount(paramInt1);
      }
      paramInt1 = H;
      if (paramInt1 != -1) {
        localBuilder.setAudioSampleRate(paramInt1);
      }
      localObject1 = c;
      if (localObject1 != null)
      {
        paramInt1 = e0.a;
        localObject1 = ((String)localObject1).split("-", -1);
        Object localObject2 = localObject1[0];
        if (localObject1.length >= 2) {
          localObject1 = localObject1[1];
        } else {
          localObject1 = null;
        }
        localObject1 = Pair.create(localObject2, localObject1);
        localBuilder.setLanguage((String)first);
        localObject1 = second;
        if (localObject1 != null) {
          localBuilder.setLanguageRegion((String)localObject1);
        }
      }
      float f1 = A;
      if (f1 != -1.0F) {
        localBuilder.setVideoFrameRate(f1);
      }
    }
    else
    {
      localBuilder.setTrackState(0);
    }
    A = true;
    c.reportTrackChangeEvent(localBuilder.build());
  }
  
  public static final class a
  {
    public final int a;
    public final int b;
    
    public a(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
  }
  
  public static final class b
  {
    public final i0 a;
    public final int b;
    public final String c;
    
    public b(i0 parami0, int paramInt, String paramString)
    {
      a = parami0;
      b = paramInt;
      c = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     w3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */