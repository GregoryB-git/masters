package x3;

import aa.v;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioFormat.Builder;
import android.media.AudioTrack;
import android.media.AudioTrack.Builder;
import android.media.AudioTrack.StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import e0.h0;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import v3.e1;
import v3.i0;
import v3.j1.a;
import v5.e0;
import w3.a0.a;

public final class s
  implements m
{
  public static final Object d0 = new Object();
  public static ExecutorService e0;
  public static int f0;
  public int A;
  public long B;
  public long C;
  public long D;
  public long E;
  public int F;
  public boolean G;
  public boolean H;
  public long I;
  public float J;
  public f[] K;
  public ByteBuffer[] L;
  public ByteBuffer M;
  public int N;
  public ByteBuffer O;
  public byte[] P;
  public int Q;
  public int R;
  public boolean S;
  public boolean T;
  public boolean U;
  public boolean V;
  public int W;
  public p X;
  public c Y;
  public boolean Z;
  public final e a;
  public long a0;
  public final g b;
  public boolean b0;
  public final boolean c;
  public boolean c0;
  public final r d;
  public final d0 e;
  public final f[] f;
  public final f[] g;
  public final b5.g h;
  public final o i;
  public final ArrayDeque<h> j;
  public final boolean k;
  public final int l;
  public k m;
  public final i<m.b> n;
  public final i<m.e> o;
  public final u p;
  public w3.a0 q;
  public m.c r;
  public f s;
  public f t;
  public AudioTrack u;
  public d v;
  public h w;
  public h x;
  public e1 y;
  public ByteBuffer z;
  
  public s(e parame)
  {
    a = a;
    g localg = b;
    b = localg;
    int i1 = e0.a;
    boolean bool;
    if ((i1 >= 21) && (c)) {
      bool = true;
    } else {
      bool = false;
    }
    c = bool;
    if ((i1 >= 23) && (d)) {
      bool = true;
    } else {
      bool = false;
    }
    k = bool;
    if (i1 >= 29) {
      i1 = e;
    } else {
      i1 = 0;
    }
    l = i1;
    p = f;
    parame = new b5.g();
    h = parame;
    parame.a();
    i = new o(new j());
    r localr = new r();
    d = localr;
    d0 locald0 = new d0();
    e = locald0;
    parame = new ArrayList();
    Collections.addAll(parame, new q[] { new z(), localr, locald0 });
    Collections.addAll(parame, a);
    f = ((f[])parame.toArray(new f[0]));
    g = new f[] { new w() };
    J = 1.0F;
    v = d.o;
    W = 0;
    X = new p();
    parame = e1.d;
    x = new h(parame, false, 0L, 0L);
    y = parame;
    R = -1;
    K = new f[0];
    L = new ByteBuffer[0];
    j = new ArrayDeque();
    n = new i();
    o = new i();
  }
  
  public static boolean D(AudioTrack paramAudioTrack)
  {
    boolean bool;
    if ((e0.a >= 29) && (v.r(paramAudioTrack))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static AudioFormat x(int paramInt1, int paramInt2, int paramInt3)
  {
    return new AudioFormat.Builder().setSampleRate(paramInt1).setChannelMask(paramInt2).setEncoding(paramInt3).build();
  }
  
  public final long A()
  {
    f localf = t;
    long l1;
    if (c == 0) {
      l1 = D / d;
    } else {
      l1 = E;
    }
    return l1;
  }
  
  public final boolean B()
  {
    Object localObject2;
    synchronized (h)
    {
      boolean bool = a;
      int i1 = 0;
      if (!bool) {
        return false;
      }
      try
      {
        Object localObject3 = t;
        localObject3.getClass();
        try
        {
          localObject3 = ((f)localObject3).a(Z, v, W);
        }
        catch (m.b localb2)
        {
          ??? = r;
          if (??? != null) {
            ((x.b)???).a(localb2);
          }
          throw localb2;
        }
        Object localObject4;
        Object localObject6;
        int i2;
        m.c localc;
        localObject5 = finally;
      }
      catch (m.b localb1)
      {
        localObject4 = t;
        if (h > 1000000)
        {
          localObject6 = new f(a, b, c, d, e, f, g, 1000000, i);
          try
          {
            localObject4 = ((f)localObject6).a(Z, v, W);
            try
            {
              t = ((f)localObject6);
              u = ((AudioTrack)localObject4);
              if (D((AudioTrack)localObject4))
              {
                localObject2 = u;
                if (m == null) {
                  m = new k();
                }
                localObject6 = m;
                localObject4 = a;
                Objects.requireNonNull(localObject4);
                aa.u.l((AudioTrack)localObject2, new t(localObject4, 0), b);
                if (l != 3)
                {
                  localObject2 = u;
                  localObject4 = t.a;
                  aa.u.k((AudioTrack)localObject2, J, K);
                }
              }
              i1 = e0.a;
              if (i1 >= 31)
              {
                localObject4 = q;
                if (localObject4 != null) {
                  b.a(u, (w3.a0)localObject4);
                }
              }
              W = u.getAudioSessionId();
              localObject2 = i;
              localObject4 = u;
              localObject6 = t;
              if (c == 2) {
                bool = true;
              } else {
                bool = false;
              }
              ((o)localObject2).d((AudioTrack)localObject4, bool, g, d, h);
              J();
              i2 = X.a;
              if (i2 != 0)
              {
                u.attachAuxEffect(i2);
                u.setAuxEffectSendLevel(X.b);
              }
              localObject4 = Y;
              if ((localObject4 != null) && (i1 >= 23)) {
                a.a(u, (c)localObject4);
              }
              H = true;
              return true;
            }
            catch (m.b localb3) {}
            ((Throwable)localObject2).addSuppressed(localc);
          }
          catch (m.b localb4)
          {
            localc = r;
            if (localc != null) {
              ((x.b)localc).a(localb4);
            }
            throw localb4;
          }
        }
        if (t.c == 1) {
          i1 = 1;
        }
        if (i1 != 0) {
          b0 = true;
        }
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public final boolean C()
  {
    boolean bool;
    if (u != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void E()
  {
    if (!T)
    {
      T = true;
      o localo = i;
      long l1 = A();
      A = localo.a();
      y = (SystemClock.elapsedRealtime() * 1000L);
      B = l1;
      u.stop();
      A = 0;
    }
  }
  
  public final void F(long paramLong)
  {
    int i1 = K.length;
    int i2 = i1;
    while (i2 >= 0)
    {
      ByteBuffer localByteBuffer;
      if (i2 > 0)
      {
        localByteBuffer = L[(i2 - 1)];
      }
      else
      {
        localByteBuffer = M;
        if (localByteBuffer == null) {
          localByteBuffer = f.a;
        }
      }
      if (i2 == i1)
      {
        M(localByteBuffer, paramLong);
      }
      else
      {
        Object localObject = K[i2];
        if (i2 > R) {
          ((f)localObject).b(localByteBuffer);
        }
        localObject = ((f)localObject).a();
        L[i2] = localObject;
        if (((Buffer)localObject).hasRemaining())
        {
          i2++;
          continue;
        }
      }
      if (localByteBuffer.hasRemaining()) {
        return;
      }
      i2--;
    }
  }
  
  public final void G()
  {
    B = 0L;
    C = 0L;
    D = 0L;
    E = 0L;
    int i1 = 0;
    c0 = false;
    F = 0;
    x = new h(ya, yb, 0L, 0L);
    I = 0L;
    w = null;
    j.clear();
    M = null;
    N = 0;
    O = null;
    T = false;
    S = false;
    R = -1;
    z = null;
    A = 0;
    e.o = 0L;
    for (;;)
    {
      Object localObject = K;
      if (i1 >= localObject.length) {
        break;
      }
      localObject = localObject[i1];
      ((f)localObject).flush();
      L[i1] = ((f)localObject).a();
      i1++;
    }
  }
  
  public final void H(e1 parame1, boolean paramBoolean)
  {
    h localh = y();
    if ((!parame1.equals(a)) || (paramBoolean != b))
    {
      parame1 = new h(parame1, paramBoolean, -9223372036854775807L, -9223372036854775807L);
      if (C()) {
        w = parame1;
      } else {
        x = parame1;
      }
    }
  }
  
  public final void I(e1 parame1)
  {
    e1 locale1 = parame1;
    if (C())
    {
      parame1 = new PlaybackParams().allowDefaults().setSpeed(a).setPitch(b).setAudioFallbackMode(2);
      try
      {
        u.setPlaybackParams(parame1);
      }
      catch (IllegalArgumentException parame1)
      {
        v5.m.g("DefaultAudioSink", "Failed to set playback params", parame1);
      }
      locale1 = new e1(u.getPlaybackParams().getSpeed(), u.getPlaybackParams().getPitch());
      parame1 = i;
      j = a;
      n localn = f;
      if (localn != null) {
        localn.a();
      }
      parame1.c();
    }
    y = locale1;
  }
  
  public final void J()
  {
    if (C()) {
      if (e0.a >= 21)
      {
        u.setVolume(J);
      }
      else
      {
        AudioTrack localAudioTrack = u;
        float f1 = J;
        localAudioTrack.setStereoVolume(f1, f1);
      }
    }
  }
  
  public final boolean K()
  {
    boolean bool1 = Z;
    boolean bool2 = true;
    if ((!bool1) && ("audio/raw".equals(t.a.t)))
    {
      int i1 = t.a.I;
      if (c)
      {
        i2 = e0.a;
        if ((i1 != 536870912) && (i1 != 805306368) && (i1 != 4)) {
          i2 = 0;
        } else {
          i2 = 1;
        }
        if (i2 != 0)
        {
          i2 = 1;
          break label98;
        }
      }
      int i2 = 0;
      label98:
      if (i2 == 0) {}
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public final boolean L(i0 parami0, d paramd)
  {
    int i1 = e0.a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i1 >= 29) {
      if (l == 0)
      {
        bool2 = bool1;
      }
      else
      {
        Object localObject = t;
        localObject.getClass();
        int i2 = v5.p.d((String)localObject, q);
        if (i2 == 0) {
          return false;
        }
        int i3 = e0.o(G);
        if (i3 == 0) {
          return false;
        }
        localObject = x(H, i3, i2);
        paramd = aa;
        if (i1 >= 31) {
          i1 = h0.c((AudioFormat)localObject, paramd);
        } else if (!aa.u.x((AudioFormat)localObject, paramd)) {
          i1 = 0;
        } else if ((i1 == 30) && (e0.d.startsWith("Pixel"))) {
          i1 = 2;
        } else {
          i1 = 1;
        }
        bool2 = bool1;
        if (i1 != 0)
        {
          if (i1 != 1)
          {
            if (i1 == 2) {
              return true;
            }
            throw new IllegalStateException();
          }
          if ((J == 0) && (K == 0)) {
            i1 = 0;
          } else {
            i1 = 1;
          }
          if (l == 1) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i1 != 0)
          {
            bool2 = bool1;
            if (i2 != 0) {}
          }
          else
          {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public final void M(ByteBuffer paramByteBuffer, long paramLong)
  {
    if (!paramByteBuffer.hasRemaining()) {
      return;
    }
    Object localObject = O;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3;
    if (localObject != null)
    {
      if (localObject == paramByteBuffer) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      x6.b.q(bool3);
    }
    else
    {
      O = paramByteBuffer;
      if (e0.a < 21)
      {
        i1 = paramByteBuffer.remaining();
        localObject = P;
        if ((localObject == null) || (localObject.length < i1)) {
          P = new byte[i1];
        }
        i2 = paramByteBuffer.position();
        paramByteBuffer.get(P, 0, i1);
        paramByteBuffer.position(i2);
        Q = 0;
      }
    }
    int i3 = paramByteBuffer.remaining();
    int i4 = e0.a;
    if (i4 < 21)
    {
      localObject = i;
      i1 = (int)(D - ((o)localObject).a() * d);
      i1 = e - i1;
      if (i1 > 0)
      {
        i1 = Math.min(i3, i1);
        i2 = u.write(P, Q, i1);
        i1 = i2;
        if (i2 <= 0) {
          break label507;
        }
        Q += i2;
        paramByteBuffer.position(paramByteBuffer.position() + i2);
        i1 = i2;
        break label507;
      }
    }
    AudioTrack localAudioTrack;
    do
    {
      i1 = 0;
      break label507;
      if (!Z) {
        break label494;
      }
      if (paramLong != -9223372036854775807L) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      x6.b.H(bool3);
      localAudioTrack = u;
      if (i4 >= 26)
      {
        i1 = localAudioTrack.write(paramByteBuffer, i3, 1, paramLong * 1000L);
        break label507;
      }
      if (z == null)
      {
        localObject = ByteBuffer.allocate(16);
        z = ((ByteBuffer)localObject);
        ((ByteBuffer)localObject).order(ByteOrder.BIG_ENDIAN);
        z.putInt(1431633921);
      }
      if (A == 0)
      {
        z.putInt(4, i3);
        z.putLong(8, paramLong * 1000L);
        z.position(0);
        A = i3;
      }
      i2 = z.remaining();
      if (i2 <= 0) {
        break;
      }
      i1 = localAudioTrack.write(z, i2, 1);
      if (i1 < 0)
      {
        A = 0;
        break label507;
      }
    } while (i1 < i2);
    int i1 = localAudioTrack.write(paramByteBuffer, i3, 1);
    if (i1 < 0)
    {
      A = 0;
    }
    else
    {
      A -= i1;
      break label507;
      label494:
      i1 = u.write(paramByteBuffer, i3, 1);
    }
    label507:
    a0 = SystemClock.elapsedRealtime();
    if (i1 < 0)
    {
      if (((i4 >= 24) && (i1 == -6)) || (i1 == -32)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if ((i2 != 0) && (E > 0L)) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      paramByteBuffer = new m.e(i1, t.a, bool3);
      localObject = r;
      if (localObject != null) {
        ((x.b)localObject).a(paramByteBuffer);
      }
      if (!b)
      {
        o.a(paramByteBuffer);
        return;
      }
      throw paramByteBuffer;
    }
    o.a = null;
    if (D(u))
    {
      if (E > 0L) {
        c0 = false;
      }
      if (U)
      {
        localObject = r;
        if ((localObject != null) && (i1 < i3) && (!c0))
        {
          localObject = a.V0;
          if (localObject != null) {
            ((j1.a)localObject).a();
          }
        }
      }
    }
    int i2 = t.c;
    if (i2 == 0) {
      D += i1;
    }
    if (i1 == i3)
    {
      if (i2 != 0)
      {
        if (paramByteBuffer == M) {
          bool3 = bool1;
        } else {
          bool3 = false;
        }
        x6.b.H(bool3);
        paramLong = E;
        E = (F * N + paramLong);
      }
      O = null;
    }
  }
  
  public final boolean a(i0 parami0)
  {
    boolean bool;
    if (u(parami0) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b()
  {
    U = true;
    if (C())
    {
      n localn = i.f;
      localn.getClass();
      localn.a();
      u.play();
    }
  }
  
  public final void c(e1 parame1)
  {
    parame1 = new e1(e0.h(a, 0.1F, 8.0F), e0.h(b, 0.1F, 8.0F));
    if ((k) && (e0.a >= 23)) {
      I(parame1);
    } else {
      H(parame1, yb);
    }
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((C()) && ((!S) || (h()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void e(i0 parami0, int[] paramArrayOfInt)
  {
    int i1;
    int i2;
    label96:
    Object localObject1;
    int i3;
    boolean bool;
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    if ("audio/raw".equals(t))
    {
      x6.b.q(e0.F(I));
      i1 = e0.w(I, G);
      i2 = I;
      if (c)
      {
        if ((i2 != 536870912) && (i2 != 805306368) && (i2 != 4)) {
          i2 = 0;
        } else {
          i2 = 1;
        }
        if (i2 != 0)
        {
          i2 = 1;
          break label96;
        }
      }
      i2 = 0;
      if (i2 != 0) {
        localObject1 = g;
      } else {
        localObject1 = f;
      }
      Object localObject2 = e;
      i2 = J;
      i3 = K;
      i = i2;
      j = i3;
      if ((e0.a < 21) && (G == 8) && (paramArrayOfInt == null))
      {
        localObject2 = new int[6];
        for (i2 = 0;; i2++)
        {
          paramArrayOfInt = (int[])localObject2;
          if (i2 >= 6) {
            break;
          }
          localObject2[i2] = i2;
        }
      }
      d.i = paramArrayOfInt;
      paramArrayOfInt = new f.a(H, G, I);
      i3 = localObject1.length;
      i2 = 0;
      while (i2 < i3)
      {
        Object localObject3 = localObject1[i2];
        try
        {
          localObject2 = ((f)localObject3).e(paramArrayOfInt);
          bool = ((f)localObject3).isActive();
          if (bool) {
            paramArrayOfInt = (int[])localObject2;
          }
          i2++;
        }
        catch (f.b paramArrayOfInt)
        {
          throw new m.a(paramArrayOfInt, parami0);
        }
      }
      i4 = c;
      i5 = a;
      i6 = e0.o(b);
      i2 = e0.w(i4, b);
      paramArrayOfInt = (int[])localObject1;
      i7 = 0;
    }
    else
    {
      i8 = H;
      if (L(parami0, v))
      {
        paramArrayOfInt = t;
        paramArrayOfInt.getClass();
        i5 = v5.p.d(paramArrayOfInt, q);
        i2 = e0.o(G);
        i3 = 1;
      }
      else
      {
        paramArrayOfInt = a.a(parami0);
        if (paramArrayOfInt == null) {
          break label899;
        }
        i5 = ((Integer)first).intValue();
        i2 = ((Integer)second).intValue();
        i3 = 2;
      }
      paramArrayOfInt = new f[0];
      i1 = -1;
      i4 = i5;
      i5 = i1;
      i7 = i3;
      i6 = i2;
      i2 = i5;
      i5 = i8;
    }
    if (i4 != 0)
    {
      if (i6 != 0)
      {
        localObject1 = p;
        int i9 = AudioTrack.getMinBufferSize(i5, i6, i4);
        if (i9 != -2) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.H(bool);
        if (i2 != -1) {
          i8 = i2;
        } else {
          i8 = 1;
        }
        int i10 = p;
        double d1;
        if (k) {
          d1 = 8.0D;
        } else {
          d1 = 1.0D;
        }
        localObject1.getClass();
        i3 = 250000;
        if (i7 != 0)
        {
          if (i7 != 1)
          {
            if (i7 == 2)
            {
              if (i4 == 5) {
                i3 = 500000;
              }
              if (i10 != -1) {
                i10 = q7.b.a(i10, 8, RoundingMode.CEILING);
              } else {
                i10 = u.a(i4);
              }
              i3 = r7.a.C(i3 * i10 / 1000000L);
            }
            else
            {
              throw new IllegalArgumentException();
            }
          }
          else
          {
            i3 = u.a(i4);
            i3 = r7.a.C(50000000 * i3 / 1000000L);
          }
        }
        else
        {
          long l1 = 250000;
          long l2 = i5;
          long l3 = i8;
          i3 = e0.i(i9 * 4, r7.a.C(l1 * l2 * l3 / 1000000L), r7.a.C(750000 * l2 * l3 / 1000000L));
        }
        i3 = (Math.max(i9, (int)(i3 * d1)) + i8 - 1) / i8;
        b0 = false;
        parami0 = new f(parami0, i1, i7, i2, i5, i6, i4, i3 * i8, paramArrayOfInt);
        if (C()) {
          s = parami0;
        } else {
          t = parami0;
        }
        return;
      }
      paramArrayOfInt = new StringBuilder();
      paramArrayOfInt.append("Invalid output channel config (mode=");
      paramArrayOfInt.append(i7);
      paramArrayOfInt.append(") for: ");
      paramArrayOfInt.append(parami0);
      throw new m.a(paramArrayOfInt.toString(), parami0);
    }
    paramArrayOfInt = new StringBuilder();
    paramArrayOfInt.append("Invalid output encoding (mode=");
    paramArrayOfInt.append(i7);
    paramArrayOfInt.append(") for: ");
    paramArrayOfInt.append(parami0);
    throw new m.a(paramArrayOfInt.toString(), parami0);
    label899:
    paramArrayOfInt = new StringBuilder();
    paramArrayOfInt.append("Unable to configure passthrough for: ");
    paramArrayOfInt.append(parami0);
    throw new m.a(paramArrayOfInt.toString(), parami0);
  }
  
  public final e1 f()
  {
    e1 locale1;
    if (k) {
      locale1 = y;
    } else {
      locale1 = ya;
    }
    return locale1;
  }
  
  public final void flush()
  {
    if (C())
    {
      G();
      ??? = i.c;
      ???.getClass();
      int i1;
      if (((AudioTrack)???).getPlayState() == 3) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        u.pause();
      }
      if (D(u))
      {
        ??? = m;
        ???.getClass();
        aa.w.m(u, b);
        a.removeCallbacksAndMessages(null);
      }
      if ((e0.a < 21) && (!V)) {
        W = 0;
      }
      ??? = s;
      if (??? != null)
      {
        t = ((f)???);
        s = null;
      }
      ??? = i;
      ((o)???).c();
      c = null;
      f = null;
      AudioTrack localAudioTrack = u;
      synchronized (h)
      {
        a = false;
        synchronized (d0)
        {
          if (e0 == null)
          {
            localObject5 = new t0/a;
            ((t0.a)localObject5).<init>("ExoPlayer:AudioTrackReleaseThread", 1);
            e0 = Executors.newSingleThreadExecutor((ThreadFactory)localObject5);
          }
        }
        f0 += 1;
        Object localObject5 = e0;
        x0.f localf = new x0/f;
        localf.<init>(9, localAudioTrack, localObject2);
        ((Executor)localObject5).execute(localf);
        u = null;
        break label268;
        throw ((Throwable)localObject2);
      }
    }
    label268:
    o.a = null;
    n.a = null;
  }
  
  public final void g()
  {
    if ((!S) && (C()) && (w()))
    {
      E();
      S = true;
    }
  }
  
  public final boolean h()
  {
    boolean bool;
    if ((C()) && (i.b(A()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void i(int paramInt)
  {
    if (W != paramInt)
    {
      W = paramInt;
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      }
      V = bool;
      flush();
    }
  }
  
  public final void j(p paramp)
  {
    if (X.equals(paramp)) {
      return;
    }
    int i1 = a;
    float f1 = b;
    AudioTrack localAudioTrack = u;
    if (localAudioTrack != null)
    {
      if (X.a != i1) {
        localAudioTrack.attachAuxEffect(i1);
      }
      if (i1 != 0) {
        u.setAuxEffectSendLevel(f1);
      }
    }
    X = paramp;
  }
  
  public final boolean k(long paramLong, ByteBuffer paramByteBuffer, int paramInt)
  {
    Object localObject1 = M;
    if ((localObject1 != null) && (paramByteBuffer != localObject1)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    x6.b.q(bool1);
    localObject1 = s;
    int i1 = 3;
    if (localObject1 != null)
    {
      if (!w()) {
        return false;
      }
      localObject1 = s;
      localObject2 = t;
      localObject1.getClass();
      if ((c == c) && (g == g) && (e == e) && (f == f) && (d == d)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if (i2 == 0)
      {
        E();
        if (h()) {
          return false;
        }
        flush();
      }
      else
      {
        t = s;
        s = null;
        if ((D(u)) && (l != 3))
        {
          if (u.getPlayState() == 3) {
            aa.w.l(u);
          }
          localObject2 = u;
          localObject1 = t.a;
          aa.u.k((AudioTrack)localObject2, J, K);
          c0 = true;
        }
      }
      v(paramLong);
    }
    if (!C()) {
      try
      {
        bool1 = B();
        if (!bool1) {
          return false;
        }
      }
      catch (m.b paramByteBuffer)
      {
        if (!b)
        {
          n.a(paramByteBuffer);
          return false;
        }
        throw paramByteBuffer;
      }
    }
    n.a = null;
    if (H)
    {
      I = Math.max(0L, paramLong);
      G = false;
      H = false;
      if ((k) && (e0.a >= 23)) {
        I(y);
      }
      v(paramLong);
      if (U) {
        b();
      }
    }
    Object localObject2 = i;
    long l1 = A();
    localObject1 = c;
    localObject1.getClass();
    int i2 = ((AudioTrack)localObject1).getPlayState();
    if (h)
    {
      if (i2 == 2) {
        p = false;
      } else {
        if ((i2 != 1) || (((o)localObject2).a() != 0L)) {
          break label453;
        }
      }
      i2 = 0;
      break label518;
    }
    label453:
    boolean bool1 = p;
    boolean bool2 = ((o)localObject2).b(l1);
    p = bool2;
    if ((bool1) && (!bool2) && (i2 != 1)) {
      a.b(e, e0.R(i));
    }
    i2 = 1;
    label518:
    if (i2 == 0) {
      return false;
    }
    if (M == null)
    {
      if (paramByteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      x6.b.q(bool1);
      if (!paramByteBuffer.hasRemaining()) {
        return true;
      }
      localObject1 = t;
      if ((c != 0) && (F == 0))
      {
        i2 = g;
        switch (i2)
        {
        case 13: 
        case 19: 
        default: 
          throw new IllegalStateException(f.h("Unexpected audio encoding: ", i2));
        case 20: 
          byte b1 = paramByteBuffer.get(0);
          int i3;
          if (paramByteBuffer.limit() > 1)
          {
            i2 = paramByteBuffer.get(1);
            i3 = i2;
          }
          else
          {
            i2 = 0;
            i3 = i2;
          }
          i2 = (int)(b.a0.v(b1, i3) * 48000L / 1000000L);
          break;
        case 17: 
          localObject1 = new byte[16];
          i2 = paramByteBuffer.position();
          paramByteBuffer.get((byte[])localObject1);
          paramByteBuffer.position(i2);
          i2 = bv5.t16c;
          break;
        case 15: 
          i2 = 512;
          break;
        case 14: 
          int i4 = paramByteBuffer.position();
          int i5 = paramByteBuffer.limit();
          for (i2 = i4; i2 <= i5 - 10; i2++)
          {
            i1 = e0.a;
            i1 = paramByteBuffer.getInt(i2 + 4);
            if (paramByteBuffer.order() != ByteOrder.BIG_ENDIAN) {
              i1 = Integer.reverseBytes(i1);
            }
            if ((i1 & 0xFFFFFFFE) == -126718022)
            {
              i2 -= i4;
              break label892;
            }
          }
          i2 = -1;
          if (i2 == -1)
          {
            i2 = 0;
          }
          else
          {
            if ((paramByteBuffer.get(paramByteBuffer.position() + i2 + 7) & 0xFF) == 187) {
              i1 = 1;
            } else {
              i1 = 0;
            }
            i4 = paramByteBuffer.position();
            if (i1 != 0) {
              i1 = 9;
            } else {
              i1 = 8;
            }
            i2 = (40 << (paramByteBuffer.get(i4 + i2 + i1) >> 4 & 0x7)) * 16;
          }
          break;
        case 11: 
        case 12: 
          i2 = 2048;
          break;
        case 10: 
        case 16: 
          i2 = 1024;
          break;
        case 9: 
          i1 = paramByteBuffer.position();
          i2 = e0.a;
          i2 = paramByteBuffer.getInt(i1);
          if (paramByteBuffer.order() != ByteOrder.BIG_ENDIAN) {
            i2 = Integer.reverseBytes(i2);
          }
          i2 = y.b(i2);
          if (i2 == -1) {
            throw new IllegalArgumentException();
          }
          break;
        case 7: 
        case 8: 
          i1 = paramByteBuffer.position();
          i2 = paramByteBuffer.get(i1);
          if (i2 != -2)
          {
            if (i2 != -1)
            {
              if (i2 != 31)
              {
                i2 = (paramByteBuffer.get(i1 + 4) & 0x1) << 6;
                i1 += 5;
                break label1192;
              }
              i2 = (paramByteBuffer.get(i1 + 5) & 0x7) << 4;
              i1 += 6;
            }
            else
            {
              i2 = (paramByteBuffer.get(i1 + 4) & 0x7) << 4;
              i1 += 7;
            }
            i1 = paramByteBuffer.get(i1) & 0x3C;
            break label1204;
          }
          else
          {
            i2 = (paramByteBuffer.get(i1 + 5) & 0x1) << 6;
            i1 += 4;
          }
          i1 = paramByteBuffer.get(i1) & 0xFC;
          i2 = ((i1 >> 2 | i2) + 1) * 32;
          break;
        case 5: 
        case 6: 
        case 18: 
          label892:
          label1192:
          label1204:
          if ((paramByteBuffer.get(paramByteBuffer.position() + 5) & 0xF8) >> 3 > 10) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (i2 != 0)
          {
            if ((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0xC0) >> 6 == 3) {
              i2 = i1;
            } else {
              i2 = (paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4;
            }
            i2 = b.a[i2] * 256;
          }
          else
          {
            i2 = 1536;
          }
          break;
        }
        F = i2;
        if (i2 == 0) {
          return true;
        }
      }
      if (w != null)
      {
        if (!w()) {
          return false;
        }
        v(paramLong);
        w = null;
      }
      l1 = I;
      localObject1 = t;
      l1 = (z() - e.o) * 1000000L / a.H + l1;
      if ((!G) && (Math.abs(l1 - paramLong) > 200000L))
      {
        localObject2 = r;
        if (localObject2 != null)
        {
          localObject1 = new m.d(paramLong, l1);
          ((x.b)localObject2).a((Exception)localObject1);
        }
        G = true;
      }
      if (G)
      {
        if (!w()) {
          return false;
        }
        l1 = paramLong - l1;
        I += l1;
        G = false;
        v(paramLong);
        localObject1 = r;
        if ((localObject1 != null) && (l1 != 0L)) {
          a.T0 = true;
        }
      }
      if (t.c == 0)
      {
        B += paramByteBuffer.remaining();
      }
      else
      {
        l1 = C;
        C = (F * paramInt + l1);
      }
      M = paramByteBuffer;
      N = paramInt;
    }
    F(paramLong);
    if (!M.hasRemaining())
    {
      M = null;
      N = 0;
      return true;
    }
    paramByteBuffer = i;
    paramLong = A();
    if ((z != -9223372036854775807L) && (paramLong > 0L) && (SystemClock.elapsedRealtime() - z >= 200L)) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (paramInt != 0)
    {
      v5.m.f("DefaultAudioSink", "Resetting stalled audio track");
      flush();
      return true;
    }
    return false;
  }
  
  /* Error */
  public final long l(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 492	x3/s:C	()Z
    //   4: ifeq +1568 -> 1572
    //   7: aload_0
    //   8: getfield 398	x3/s:H	Z
    //   11: ifeq +6 -> 17
    //   14: goto +1558 -> 1572
    //   17: aload_0
    //   18: getfield 170	x3/s:i	Lx3/o;
    //   21: astore_2
    //   22: aload_2
    //   23: getfield 855	x3/o:c	Landroid/media/AudioTrack;
    //   26: astore_3
    //   27: aload_3
    //   28: invokevirtual 296	java/lang/Object:getClass	()Ljava/lang/Class;
    //   31: pop
    //   32: aload_3
    //   33: invokevirtual 858	android/media/AudioTrack:getPlayState	()I
    //   36: iconst_3
    //   37: if_icmpne +815 -> 852
    //   40: invokestatic 1039	java/lang/System:nanoTime	()J
    //   43: ldc2_w 420
    //   46: ldiv
    //   47: lstore 4
    //   49: lload 4
    //   51: aload_2
    //   52: getfield 1041	x3/o:m	J
    //   55: lsub
    //   56: ldc2_w 1042
    //   59: lcmp
    //   60: iflt +141 -> 201
    //   63: aload_2
    //   64: invokevirtual 412	x3/o:a	()J
    //   67: ldc2_w 806
    //   70: lmul
    //   71: aload_2
    //   72: getfield 1044	x3/o:g	I
    //   75: i2l
    //   76: ldiv
    //   77: lstore 6
    //   79: lload 6
    //   81: lconst_0
    //   82: lcmp
    //   83: ifne +6 -> 89
    //   86: goto +766 -> 852
    //   89: aload_2
    //   90: getfield 1047	x3/o:b	[J
    //   93: aload_2
    //   94: getfield 1049	x3/o:w	I
    //   97: lload 6
    //   99: aload_2
    //   100: getfield 544	x3/o:j	F
    //   103: invokestatic 1052	v5/e0:x	(JF)J
    //   106: lload 4
    //   108: lsub
    //   109: lastore
    //   110: aload_2
    //   111: aload_2
    //   112: getfield 1049	x3/o:w	I
    //   115: iconst_1
    //   116: iadd
    //   117: bipush 10
    //   119: irem
    //   120: putfield 1049	x3/o:w	I
    //   123: aload_2
    //   124: getfield 1054	x3/o:x	I
    //   127: istore 8
    //   129: iload 8
    //   131: bipush 10
    //   133: if_icmpge +11 -> 144
    //   136: aload_2
    //   137: iload 8
    //   139: iconst_1
    //   140: iadd
    //   141: putfield 1054	x3/o:x	I
    //   144: aload_2
    //   145: lload 4
    //   147: putfield 1041	x3/o:m	J
    //   150: aload_2
    //   151: lconst_0
    //   152: putfield 1056	x3/o:l	J
    //   155: iconst_0
    //   156: istore 8
    //   158: aload_2
    //   159: getfield 1054	x3/o:x	I
    //   162: istore 9
    //   164: iload 8
    //   166: iload 9
    //   168: if_icmpge +33 -> 201
    //   171: aload_2
    //   172: getfield 1056	x3/o:l	J
    //   175: lstore 6
    //   177: aload_2
    //   178: aload_2
    //   179: getfield 1047	x3/o:b	[J
    //   182: iload 8
    //   184: laload
    //   185: iload 9
    //   187: i2l
    //   188: ldiv
    //   189: lload 6
    //   191: ladd
    //   192: putfield 1056	x3/o:l	J
    //   195: iinc 8 1
    //   198: goto -40 -> 158
    //   201: aload_2
    //   202: getfield 931	x3/o:h	Z
    //   205: ifeq +6 -> 211
    //   208: goto +644 -> 852
    //   211: aload_2
    //   212: getfield 547	x3/o:f	Lx3/n;
    //   215: astore_3
    //   216: aload_3
    //   217: invokevirtual 296	java/lang/Object:getClass	()Ljava/lang/Class;
    //   220: pop
    //   221: aload_3
    //   222: getfield 1059	x3/n:a	Lx3/n$a;
    //   225: astore 10
    //   227: aload 10
    //   229: ifnull +306 -> 535
    //   232: lload 4
    //   234: aload_3
    //   235: getfield 1061	x3/n:e	J
    //   238: lsub
    //   239: aload_3
    //   240: getfield 1063	x3/n:d	J
    //   243: lcmp
    //   244: ifge +6 -> 250
    //   247: goto +288 -> 535
    //   250: aload_3
    //   251: lload 4
    //   253: putfield 1061	x3/n:e	J
    //   256: aload 10
    //   258: getfield 1067	x3/n$a:a	Landroid/media/AudioTrack;
    //   261: aload 10
    //   263: getfield 1070	x3/n$a:b	Landroid/media/AudioTimestamp;
    //   266: invokevirtual 1074	android/media/AudioTrack:getTimestamp	(Landroid/media/AudioTimestamp;)Z
    //   269: istore 11
    //   271: iload 11
    //   273: ifeq +59 -> 332
    //   276: aload 10
    //   278: getfield 1070	x3/n$a:b	Landroid/media/AudioTimestamp;
    //   281: getfield 1079	android/media/AudioTimestamp:framePosition	J
    //   284: lstore 6
    //   286: aload 10
    //   288: getfield 1080	x3/n$a:d	J
    //   291: lload 6
    //   293: lcmp
    //   294: ifle +15 -> 309
    //   297: aload 10
    //   299: aload 10
    //   301: getfield 1082	x3/n$a:c	J
    //   304: lconst_1
    //   305: ladd
    //   306: putfield 1082	x3/n$a:c	J
    //   309: aload 10
    //   311: lload 6
    //   313: putfield 1080	x3/n$a:d	J
    //   316: aload 10
    //   318: lload 6
    //   320: aload 10
    //   322: getfield 1082	x3/n$a:c	J
    //   325: bipush 32
    //   327: lshl
    //   328: ladd
    //   329: putfield 1083	x3/n$a:e	J
    //   332: aload_3
    //   333: getfield 1084	x3/n:b	I
    //   336: istore 8
    //   338: iload 8
    //   340: ifeq +113 -> 453
    //   343: iload 8
    //   345: iconst_1
    //   346: if_icmpeq +60 -> 406
    //   349: iload 8
    //   351: iconst_2
    //   352: if_icmpeq +42 -> 394
    //   355: iload 8
    //   357: iconst_3
    //   358: if_icmpeq +24 -> 382
    //   361: iload 8
    //   363: iconst_4
    //   364: if_icmpne +10 -> 374
    //   367: iload 11
    //   369: istore 12
    //   371: goto +167 -> 538
    //   374: new 614	java/lang/IllegalStateException
    //   377: dup
    //   378: invokespecial 615	java/lang/IllegalStateException:<init>	()V
    //   381: athrow
    //   382: iload 11
    //   384: istore 12
    //   386: iload 11
    //   388: ifeq +150 -> 538
    //   391: goto +51 -> 442
    //   394: iload 11
    //   396: istore 12
    //   398: iload 11
    //   400: ifne +138 -> 538
    //   403: goto +39 -> 442
    //   406: iload 11
    //   408: ifeq +34 -> 442
    //   411: iload 11
    //   413: istore 12
    //   415: aload_3
    //   416: getfield 1059	x3/n:a	Lx3/n$a;
    //   419: getfield 1083	x3/n$a:e	J
    //   422: aload_3
    //   423: getfield 1086	x3/n:f	J
    //   426: lcmp
    //   427: ifle +111 -> 538
    //   430: aload_3
    //   431: iconst_2
    //   432: invokevirtual 1088	x3/n:b	(I)V
    //   435: iload 11
    //   437: istore 12
    //   439: goto +99 -> 538
    //   442: aload_3
    //   443: invokevirtual 551	x3/n:a	()V
    //   446: iload 11
    //   448: istore 12
    //   450: goto +88 -> 538
    //   453: iload 11
    //   455: ifeq +50 -> 505
    //   458: aload_3
    //   459: getfield 1059	x3/n:a	Lx3/n$a;
    //   462: astore 10
    //   464: aload 10
    //   466: getfield 1070	x3/n$a:b	Landroid/media/AudioTimestamp;
    //   469: getfield 1090	android/media/AudioTimestamp:nanoTime	J
    //   472: ldc2_w 420
    //   475: ldiv
    //   476: aload_3
    //   477: getfield 1091	x3/n:c	J
    //   480: lcmp
    //   481: iflt +54 -> 535
    //   484: aload_3
    //   485: aload 10
    //   487: getfield 1083	x3/n$a:e	J
    //   490: putfield 1086	x3/n:f	J
    //   493: aload_3
    //   494: iconst_1
    //   495: invokevirtual 1088	x3/n:b	(I)V
    //   498: iload 11
    //   500: istore 12
    //   502: goto +36 -> 538
    //   505: iload 11
    //   507: istore 12
    //   509: lload 4
    //   511: aload_3
    //   512: getfield 1091	x3/n:c	J
    //   515: lsub
    //   516: ldc2_w 1092
    //   519: lcmp
    //   520: ifle +18 -> 538
    //   523: aload_3
    //   524: iconst_3
    //   525: invokevirtual 1088	x3/n:b	(I)V
    //   528: iload 11
    //   530: istore 12
    //   532: goto +6 -> 538
    //   535: iconst_0
    //   536: istore 12
    //   538: iload 12
    //   540: ifne +6 -> 546
    //   543: goto +169 -> 712
    //   546: aload_3
    //   547: getfield 1059	x3/n:a	Lx3/n$a;
    //   550: astore 10
    //   552: aload 10
    //   554: ifnull +20 -> 574
    //   557: aload 10
    //   559: getfield 1070	x3/n$a:b	Landroid/media/AudioTimestamp;
    //   562: getfield 1090	android/media/AudioTimestamp:nanoTime	J
    //   565: ldc2_w 420
    //   568: ldiv
    //   569: lstore 6
    //   571: goto +8 -> 579
    //   574: ldc2_w 489
    //   577: lstore 6
    //   579: aload 10
    //   581: ifnull +13 -> 594
    //   584: aload 10
    //   586: getfield 1083	x3/n$a:e	J
    //   589: lstore 13
    //   591: goto +8 -> 599
    //   594: ldc2_w 1094
    //   597: lstore 13
    //   599: aload_2
    //   600: invokevirtual 412	x3/o:a	()J
    //   603: ldc2_w 806
    //   606: lmul
    //   607: aload_2
    //   608: getfield 1044	x3/o:g	I
    //   611: i2l
    //   612: ldiv
    //   613: lstore 15
    //   615: lload 6
    //   617: lload 4
    //   619: lsub
    //   620: invokestatic 1010	java/lang/Math:abs	(J)J
    //   623: ldc2_w 1096
    //   626: lcmp
    //   627: ifle +23 -> 650
    //   630: aload_2
    //   631: getfield 936	x3/o:a	Lx3/o$a;
    //   634: lload 13
    //   636: lload 6
    //   638: lload 4
    //   640: lload 15
    //   642: invokeinterface 1100 9 0
    //   647: goto +45 -> 692
    //   650: lload 13
    //   652: ldc2_w 806
    //   655: lmul
    //   656: aload_2
    //   657: getfield 1044	x3/o:g	I
    //   660: i2l
    //   661: ldiv
    //   662: lload 15
    //   664: lsub
    //   665: invokestatic 1010	java/lang/Math:abs	(J)J
    //   668: ldc2_w 1096
    //   671: lcmp
    //   672: ifle +28 -> 700
    //   675: aload_2
    //   676: getfield 936	x3/o:a	Lx3/o$a;
    //   679: lload 13
    //   681: lload 6
    //   683: lload 4
    //   685: lload 15
    //   687: invokeinterface 1102 9 0
    //   692: aload_3
    //   693: iconst_4
    //   694: invokevirtual 1088	x3/n:b	(I)V
    //   697: goto +15 -> 712
    //   700: aload_3
    //   701: getfield 1084	x3/n:b	I
    //   704: iconst_4
    //   705: if_icmpne +7 -> 712
    //   708: aload_3
    //   709: invokevirtual 551	x3/n:a	()V
    //   712: aload_2
    //   713: getfield 1104	x3/o:q	Z
    //   716: ifeq +136 -> 852
    //   719: aload_2
    //   720: getfield 1107	x3/o:n	Ljava/lang/reflect/Method;
    //   723: astore 10
    //   725: aload 10
    //   727: ifnull +125 -> 852
    //   730: lload 4
    //   732: aload_2
    //   733: getfield 1109	x3/o:r	J
    //   736: lsub
    //   737: ldc2_w 1092
    //   740: lcmp
    //   741: iflt +111 -> 852
    //   744: aload_2
    //   745: getfield 855	x3/o:c	Landroid/media/AudioTrack;
    //   748: astore_3
    //   749: aload_3
    //   750: invokevirtual 296	java/lang/Object:getClass	()Ljava/lang/Class;
    //   753: pop
    //   754: aload 10
    //   756: aload_3
    //   757: iconst_0
    //   758: anewarray 4	java/lang/Object
    //   761: invokevirtual 1115	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   764: checkcast 774	java/lang/Integer
    //   767: astore_3
    //   768: getstatic 137	v5/e0:a	I
    //   771: istore 8
    //   773: aload_3
    //   774: invokevirtual 777	java/lang/Integer:intValue	()I
    //   777: i2l
    //   778: ldc2_w 420
    //   781: lmul
    //   782: aload_2
    //   783: getfield 938	x3/o:i	J
    //   786: lsub
    //   787: lstore 6
    //   789: aload_2
    //   790: lload 6
    //   792: putfield 1116	x3/o:o	J
    //   795: lload 6
    //   797: lconst_0
    //   798: invokestatic 925	java/lang/Math:max	(JJ)J
    //   801: lstore 6
    //   803: aload_2
    //   804: lload 6
    //   806: putfield 1116	x3/o:o	J
    //   809: lload 6
    //   811: ldc2_w 1096
    //   814: lcmp
    //   815: ifle +28 -> 843
    //   818: aload_2
    //   819: getfield 936	x3/o:a	Lx3/o$a;
    //   822: lload 6
    //   824: invokeinterface 1118 3 0
    //   829: aload_2
    //   830: lconst_0
    //   831: putfield 1116	x3/o:o	J
    //   834: goto +9 -> 843
    //   837: astore_3
    //   838: aload_2
    //   839: aconst_null
    //   840: putfield 1107	x3/o:n	Ljava/lang/reflect/Method;
    //   843: aload_2
    //   844: lload 4
    //   846: putfield 1109	x3/o:r	J
    //   849: goto +3 -> 852
    //   852: iconst_0
    //   853: istore 12
    //   855: invokestatic 1039	java/lang/System:nanoTime	()J
    //   858: ldc2_w 420
    //   861: ldiv
    //   862: lstore 4
    //   864: aload_2
    //   865: getfield 547	x3/o:f	Lx3/n;
    //   868: astore_3
    //   869: aload_3
    //   870: invokevirtual 296	java/lang/Object:getClass	()Ljava/lang/Class;
    //   873: pop
    //   874: aload_3
    //   875: getfield 1084	x3/n:b	I
    //   878: iconst_2
    //   879: if_icmpne +6 -> 885
    //   882: iconst_1
    //   883: istore 12
    //   885: iload 12
    //   887: ifeq +85 -> 972
    //   890: aload_3
    //   891: getfield 1059	x3/n:a	Lx3/n$a;
    //   894: astore_3
    //   895: aload_3
    //   896: ifnull +12 -> 908
    //   899: aload_3
    //   900: getfield 1083	x3/n$a:e	J
    //   903: lstore 6
    //   905: goto +8 -> 913
    //   908: ldc2_w 1094
    //   911: lstore 6
    //   913: lload 6
    //   915: ldc2_w 806
    //   918: lmul
    //   919: aload_2
    //   920: getfield 1044	x3/o:g	I
    //   923: i2l
    //   924: ldiv
    //   925: lstore 13
    //   927: aload_3
    //   928: ifnull +19 -> 947
    //   931: aload_3
    //   932: getfield 1070	x3/n$a:b	Landroid/media/AudioTimestamp;
    //   935: getfield 1090	android/media/AudioTimestamp:nanoTime	J
    //   938: ldc2_w 420
    //   941: ldiv
    //   942: lstore 6
    //   944: goto +8 -> 952
    //   947: ldc2_w 489
    //   950: lstore 6
    //   952: lload 4
    //   954: lload 6
    //   956: lsub
    //   957: aload_2
    //   958: getfield 544	x3/o:j	F
    //   961: invokestatic 1120	v5/e0:t	(JF)J
    //   964: lload 13
    //   966: ladd
    //   967: lstore 6
    //   969: goto +66 -> 1035
    //   972: aload_2
    //   973: getfield 1054	x3/o:x	I
    //   976: ifne +22 -> 998
    //   979: aload_2
    //   980: invokevirtual 412	x3/o:a	()J
    //   983: ldc2_w 806
    //   986: lmul
    //   987: aload_2
    //   988: getfield 1044	x3/o:g	I
    //   991: i2l
    //   992: ldiv
    //   993: lstore 13
    //   995: goto +19 -> 1014
    //   998: aload_2
    //   999: getfield 1056	x3/o:l	J
    //   1002: lload 4
    //   1004: ladd
    //   1005: aload_2
    //   1006: getfield 544	x3/o:j	F
    //   1009: invokestatic 1120	v5/e0:t	(JF)J
    //   1012: lstore 13
    //   1014: lload 13
    //   1016: lstore 6
    //   1018: iload_1
    //   1019: ifne +16 -> 1035
    //   1022: lconst_0
    //   1023: lload 13
    //   1025: aload_2
    //   1026: getfield 1116	x3/o:o	J
    //   1029: lsub
    //   1030: invokestatic 925	java/lang/Math:max	(JJ)J
    //   1033: lstore 6
    //   1035: aload_2
    //   1036: getfield 1122	x3/o:E	Z
    //   1039: iload 12
    //   1041: if_icmpeq +19 -> 1060
    //   1044: aload_2
    //   1045: aload_2
    //   1046: getfield 1123	x3/o:D	J
    //   1049: putfield 1125	x3/o:G	J
    //   1052: aload_2
    //   1053: aload_2
    //   1054: getfield 1126	x3/o:C	J
    //   1057: putfield 1128	x3/o:F	J
    //   1060: lload 4
    //   1062: aload_2
    //   1063: getfield 1125	x3/o:G	J
    //   1066: lsub
    //   1067: lstore 15
    //   1069: lload 6
    //   1071: lstore 13
    //   1073: lload 15
    //   1075: ldc2_w 806
    //   1078: lcmp
    //   1079: ifge +56 -> 1135
    //   1082: aload_2
    //   1083: getfield 1128	x3/o:F	J
    //   1086: lstore 17
    //   1088: lload 15
    //   1090: aload_2
    //   1091: getfield 544	x3/o:j	F
    //   1094: invokestatic 1120	v5/e0:t	(JF)J
    //   1097: lstore 13
    //   1099: lload 15
    //   1101: ldc2_w 420
    //   1104: lmul
    //   1105: ldc2_w 806
    //   1108: ldiv
    //   1109: lstore 15
    //   1111: ldc2_w 420
    //   1114: lload 15
    //   1116: lsub
    //   1117: lload 13
    //   1119: lload 17
    //   1121: ladd
    //   1122: lmul
    //   1123: lload 6
    //   1125: lload 15
    //   1127: lmul
    //   1128: ladd
    //   1129: ldc2_w 420
    //   1132: ldiv
    //   1133: lstore 13
    //   1135: aload_2
    //   1136: getfield 1129	x3/o:k	Z
    //   1139: ifne +65 -> 1204
    //   1142: aload_2
    //   1143: getfield 1126	x3/o:C	J
    //   1146: lstore 6
    //   1148: lload 13
    //   1150: lload 6
    //   1152: lcmp
    //   1153: ifle +51 -> 1204
    //   1156: aload_2
    //   1157: iconst_1
    //   1158: putfield 1129	x3/o:k	Z
    //   1161: lload 13
    //   1163: lload 6
    //   1165: lsub
    //   1166: invokestatic 941	v5/e0:R	(J)J
    //   1169: aload_2
    //   1170: getfield 544	x3/o:j	F
    //   1173: invokestatic 1052	v5/e0:x	(JF)J
    //   1176: lstore 15
    //   1178: invokestatic 1132	java/lang/System:currentTimeMillis	()J
    //   1181: lstore 6
    //   1183: lload 15
    //   1185: invokestatic 941	v5/e0:R	(J)J
    //   1188: lstore 15
    //   1190: aload_2
    //   1191: getfield 936	x3/o:a	Lx3/o$a;
    //   1194: lload 6
    //   1196: lload 15
    //   1198: lsub
    //   1199: invokeinterface 1134 3 0
    //   1204: aload_2
    //   1205: lload 4
    //   1207: putfield 1123	x3/o:D	J
    //   1210: aload_2
    //   1211: lload 13
    //   1213: putfield 1126	x3/o:C	J
    //   1216: aload_2
    //   1217: iload 12
    //   1219: putfield 1122	x3/o:E	Z
    //   1222: aload_0
    //   1223: getfield 280	x3/s:t	Lx3/s$f;
    //   1226: astore_2
    //   1227: lload 13
    //   1229: aload_0
    //   1230: invokevirtual 410	x3/s:A	()J
    //   1233: ldc2_w 806
    //   1236: lmul
    //   1237: aload_2
    //   1238: getfield 317	x3/s$f:e	I
    //   1241: i2l
    //   1242: ldiv
    //   1243: invokestatic 1136	java/lang/Math:min	(JJ)J
    //   1246: lstore 6
    //   1248: aload_0
    //   1249: getfield 249	x3/s:j	Ljava/util/ArrayDeque;
    //   1252: invokevirtual 1139	java/util/ArrayDeque:isEmpty	()Z
    //   1255: ifne +39 -> 1294
    //   1258: lload 6
    //   1260: aload_0
    //   1261: getfield 249	x3/s:j	Ljava/util/ArrayDeque;
    //   1264: invokevirtual 1143	java/util/ArrayDeque:getFirst	()Ljava/lang/Object;
    //   1267: checkcast 29	x3/s$h
    //   1270: getfield 1144	x3/s$h:d	J
    //   1273: lcmp
    //   1274: iflt +20 -> 1294
    //   1277: aload_0
    //   1278: aload_0
    //   1279: getfield 249	x3/s:j	Ljava/util/ArrayDeque;
    //   1282: invokevirtual 1147	java/util/ArrayDeque:remove	()Ljava/lang/Object;
    //   1285: checkcast 29	x3/s$h
    //   1288: putfield 234	x3/s:x	Lx3/s$h;
    //   1291: goto -43 -> 1248
    //   1294: aload_0
    //   1295: getfield 234	x3/s:x	Lx3/s$h;
    //   1298: astore_2
    //   1299: lload 6
    //   1301: aload_2
    //   1302: getfield 1144	x3/s$h:d	J
    //   1305: lsub
    //   1306: lstore 4
    //   1308: aload_2
    //   1309: getfield 461	x3/s$h:a	Lv3/e1;
    //   1312: getstatic 229	v3/e1:d	Lv3/e1;
    //   1315: invokevirtual 488	v3/e1:equals	(Ljava/lang/Object;)Z
    //   1318: ifeq +18 -> 1336
    //   1321: aload_0
    //   1322: getfield 234	x3/s:x	Lx3/s$h;
    //   1325: getfield 1148	x3/s$h:c	J
    //   1328: lload 4
    //   1330: ladd
    //   1331: lstore 6
    //   1333: goto +207 -> 1540
    //   1336: aload_0
    //   1337: getfield 249	x3/s:j	Ljava/util/ArrayDeque;
    //   1340: invokevirtual 1139	java/util/ArrayDeque:isEmpty	()Z
    //   1343: ifeq +155 -> 1498
    //   1346: aload_0
    //   1347: getfield 133	x3/s:b	Lx3/g;
    //   1350: checkcast 26	x3/s$g
    //   1353: getfield 1151	x3/s$g:c	Lx3/c0;
    //   1356: astore_3
    //   1357: aload_3
    //   1358: getfield 1154	x3/c0:o	J
    //   1361: ldc2_w 1155
    //   1364: lcmp
    //   1365: iflt +106 -> 1471
    //   1368: aload_3
    //   1369: getfield 1158	x3/c0:n	J
    //   1372: lstore 6
    //   1374: aload_3
    //   1375: getfield 1161	x3/c0:j	Lx3/b0;
    //   1378: astore_2
    //   1379: aload_2
    //   1380: invokevirtual 296	java/lang/Object:getClass	()Ljava/lang/Class;
    //   1383: pop
    //   1384: lload 6
    //   1386: aload_2
    //   1387: getfield 1165	x3/b0:k	I
    //   1390: aload_2
    //   1391: getfield 1166	x3/b0:b	I
    //   1394: imul
    //   1395: iconst_2
    //   1396: imul
    //   1397: i2l
    //   1398: lsub
    //   1399: lstore 13
    //   1401: aload_3
    //   1402: getfield 1169	x3/c0:h	Lx3/f$a;
    //   1405: getfield 759	x3/f$a:a	I
    //   1408: istore 9
    //   1410: aload_3
    //   1411: getfield 1171	x3/c0:g	Lx3/f$a;
    //   1414: getfield 759	x3/f$a:a	I
    //   1417: istore 8
    //   1419: iload 9
    //   1421: iload 8
    //   1423: if_icmpne +12 -> 1435
    //   1426: aload_3
    //   1427: getfield 1154	x3/c0:o	J
    //   1430: lstore 6
    //   1432: goto +25 -> 1457
    //   1435: iload 9
    //   1437: i2l
    //   1438: lstore 15
    //   1440: aload_3
    //   1441: getfield 1154	x3/c0:o	J
    //   1444: iload 8
    //   1446: i2l
    //   1447: lmul
    //   1448: lstore 6
    //   1450: lload 13
    //   1452: lload 15
    //   1454: lmul
    //   1455: lstore 13
    //   1457: lload 4
    //   1459: lload 13
    //   1461: lload 6
    //   1463: invokestatic 1174	v5/e0:O	(JJJ)J
    //   1466: lstore 6
    //   1468: goto +15 -> 1483
    //   1471: aload_3
    //   1472: getfield 1176	x3/c0:c	F
    //   1475: f2d
    //   1476: lload 4
    //   1478: l2d
    //   1479: dmul
    //   1480: d2l
    //   1481: lstore 6
    //   1483: lload 6
    //   1485: aload_0
    //   1486: getfield 234	x3/s:x	Lx3/s$h;
    //   1489: getfield 1148	x3/s$h:c	J
    //   1492: ladd
    //   1493: lstore 6
    //   1495: goto +45 -> 1540
    //   1498: aload_0
    //   1499: getfield 249	x3/s:j	Ljava/util/ArrayDeque;
    //   1502: invokevirtual 1143	java/util/ArrayDeque:getFirst	()Ljava/lang/Object;
    //   1505: checkcast 29	x3/s$h
    //   1508: astore_2
    //   1509: aload_2
    //   1510: getfield 1144	x3/s$h:d	J
    //   1513: lload 6
    //   1515: lsub
    //   1516: aload_0
    //   1517: getfield 234	x3/s:x	Lx3/s$h;
    //   1520: getfield 461	x3/s$h:a	Lv3/e1;
    //   1523: getfield 504	v3/e1:a	F
    //   1526: invokestatic 1120	v5/e0:t	(JF)J
    //   1529: lstore 6
    //   1531: aload_2
    //   1532: getfield 1148	x3/s$h:c	J
    //   1535: lload 6
    //   1537: lsub
    //   1538: lstore 6
    //   1540: aload_0
    //   1541: getfield 280	x3/s:t	Lx3/s$f;
    //   1544: astore_2
    //   1545: aload_0
    //   1546: getfield 133	x3/s:b	Lx3/g;
    //   1549: checkcast 26	x3/s$g
    //   1552: getfield 1179	x3/s$g:b	Lx3/a0;
    //   1555: getfield 1183	x3/a0:t	J
    //   1558: ldc2_w 806
    //   1561: lmul
    //   1562: aload_2
    //   1563: getfield 317	x3/s$f:e	I
    //   1566: i2l
    //   1567: ldiv
    //   1568: lload 6
    //   1570: ladd
    //   1571: lreturn
    //   1572: ldc2_w 1184
    //   1575: lreturn
    //   1576: astore_3
    //   1577: goto -739 -> 838
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1580	0	this	s
    //   0	1580	1	paramBoolean	boolean
    //   21	1542	2	localObject1	Object
    //   26	748	3	localObject2	Object
    //   837	1	3	localException1	Exception
    //   868	604	3	localObject3	Object
    //   1576	1	3	localException2	Exception
    //   47	1430	4	l1	long
    //   77	1492	6	l2	long
    //   127	1318	8	i1	int
    //   162	1274	9	i2	int
    //   225	530	10	localObject4	Object
    //   269	260	11	bool1	boolean
    //   369	849	12	bool2	boolean
    //   589	871	13	l3	long
    //   613	840	15	l4	long
    //   1086	34	17	l5	long
    // Exception table:
    //   from	to	target	type
    //   744	754	837	java/lang/Exception
    //   754	809	1576	java/lang/Exception
    //   818	834	1576	java/lang/Exception
  }
  
  public final void m()
  {
    if (Z)
    {
      Z = false;
      flush();
    }
  }
  
  public final void n()
  {
    G = true;
  }
  
  public final void o(float paramFloat)
  {
    if (J != paramFloat)
    {
      J = paramFloat;
      J();
    }
  }
  
  public final void p(w3.a0 parama0)
  {
    q = parama0;
  }
  
  public final void pause()
  {
    int i1 = 0;
    U = false;
    if (C())
    {
      Object localObject = i;
      ((o)localObject).c();
      if (y == -9223372036854775807L)
      {
        localObject = f;
        localObject.getClass();
        ((n)localObject).a();
        i1 = 1;
      }
      if (i1 != 0) {
        u.pause();
      }
    }
  }
  
  public final void q()
  {
    boolean bool;
    if (e0.a >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    x6.b.H(bool);
    x6.b.H(V);
    if (!Z)
    {
      Z = true;
      flush();
    }
  }
  
  public final void reset()
  {
    flush();
    f[] arrayOff = f;
    int i1 = arrayOff.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOff[i2].reset();
    }
    arrayOff = g;
    i1 = arrayOff.length;
    for (i2 = 0; i2 < i1; i2++) {
      arrayOff[i2].reset();
    }
    U = false;
    b0 = false;
  }
  
  public final void s(d paramd)
  {
    if (v.equals(paramd)) {
      return;
    }
    v = paramd;
    if (Z) {
      return;
    }
    flush();
  }
  
  public final void setPreferredDevice(AudioDeviceInfo paramAudioDeviceInfo)
  {
    if (paramAudioDeviceInfo == null) {
      paramAudioDeviceInfo = null;
    } else {
      paramAudioDeviceInfo = new c(paramAudioDeviceInfo);
    }
    Y = paramAudioDeviceInfo;
    AudioTrack localAudioTrack = u;
    if (localAudioTrack != null) {
      a.a(localAudioTrack, paramAudioDeviceInfo);
    }
  }
  
  public final void t(boolean paramBoolean)
  {
    H(ya, paramBoolean);
  }
  
  public final int u(i0 parami0)
  {
    boolean bool = "audio/raw".equals(t);
    int i1 = 1;
    if (bool)
    {
      if (!e0.F(I))
      {
        StringBuilder localStringBuilder = f.l("Invalid PCM encoding: ");
        localStringBuilder.append(I);
        v5.m.f("DefaultAudioSink", localStringBuilder.toString());
        return 0;
      }
      i1 = I;
      if ((i1 != 2) && ((!c) || (i1 != 4))) {
        return 1;
      }
      return 2;
    }
    if ((!b0) && (L(parami0, v))) {
      return 2;
    }
    if (a.a(parami0) == null) {
      i1 = 0;
    }
    if (i1 != 0) {
      return 2;
    }
    return 0;
  }
  
  public final void v(long paramLong)
  {
    if (K())
    {
      localObject1 = b;
      localObject2 = ya;
      localObject3 = c;
      float f1 = a;
      if (c != f1)
      {
        c = f1;
        i = true;
      }
      f1 = b;
      localObject1 = localObject2;
      if (d != f1)
      {
        d = f1;
        i = true;
        localObject1 = localObject2;
      }
    }
    else
    {
      localObject1 = e1.d;
    }
    boolean bool;
    if (K())
    {
      localObject2 = b;
      bool = yb;
      b.m = bool;
    }
    else
    {
      bool = false;
    }
    Object localObject3 = j;
    paramLong = Math.max(0L, paramLong);
    Object localObject2 = t;
    ((ArrayDeque)localObject3).add(new h((e1)localObject1, bool, paramLong, A() * 1000000L / e));
    localObject2 = t.i;
    Object localObject1 = new ArrayList();
    int i1 = localObject2.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      localObject3 = localObject2[i2];
      if (((f)localObject3).isActive()) {
        ((ArrayList)localObject1).add(localObject3);
      } else {
        ((f)localObject3).flush();
      }
    }
    i2 = ((ArrayList)localObject1).size();
    K = ((f[])((ArrayList)localObject1).toArray(new f[i2]));
    L = new ByteBuffer[i2];
    for (i2 = 0;; i2++)
    {
      localObject1 = K;
      if (i2 >= localObject1.length) {
        break;
      }
      localObject1 = localObject1[i2];
      ((f)localObject1).flush();
      L[i2] = ((f)localObject1).a();
    }
    localObject1 = r;
    if (localObject1 != null)
    {
      localObject1 = a.L0;
      localObject2 = a;
      if (localObject2 != null) {
        ((Handler)localObject2).post(new j(0, localObject1, bool));
      }
    }
  }
  
  public final boolean w()
  {
    if (R == -1) {}
    for (R = 0;; R += 1)
    {
      int i1 = 1;
      break label20;
      i1 = 0;
      label20:
      int i2 = R;
      localObject = K;
      if (i2 >= localObject.length) {
        break;
      }
      localObject = localObject[i2];
      if (i1 != 0) {
        ((f)localObject).c();
      }
      F(-9223372036854775807L);
      if (!((f)localObject).d()) {
        return false;
      }
    }
    Object localObject = O;
    if (localObject != null)
    {
      M((ByteBuffer)localObject, -9223372036854775807L);
      if (O != null) {
        return false;
      }
    }
    R = -1;
    return true;
  }
  
  public final h y()
  {
    h localh = w;
    if (localh == null) {
      if (!j.isEmpty()) {
        localh = (h)j.getLast();
      } else {
        localh = x;
      }
    }
    return localh;
  }
  
  public final long z()
  {
    f localf = t;
    long l1;
    if (c == 0) {
      l1 = B / b;
    } else {
      l1 = C;
    }
    return l1;
  }
  
  public static final class a
  {
    public static void a(AudioTrack paramAudioTrack, s.c paramc)
    {
      if (paramc == null) {
        paramc = null;
      } else {
        paramc = a;
      }
      paramAudioTrack.setPreferredDevice(paramc);
    }
  }
  
  public static final class b
  {
    public static void a(AudioTrack paramAudioTrack, w3.a0 parama0)
    {
      parama0 = a;
      parama0.getClass();
      parama0 = a;
      if (!parama0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
        paramAudioTrack.setLogSessionId(parama0);
      }
    }
  }
  
  public static final class c
  {
    public final AudioDeviceInfo a;
    
    public c(AudioDeviceInfo paramAudioDeviceInfo)
    {
      a = paramAudioDeviceInfo;
    }
  }
  
  public static abstract interface d
  {
    public static final u a = new u(new u.a());
  }
  
  public static final class e
  {
    public e a = e.c;
    public s.g b;
    public boolean c;
    public boolean d;
    public int e = 0;
    public u f = s.d.a;
  }
  
  public static final class f
  {
    public final i0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final f[] i;
    
    public f(i0 parami0, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, f[] paramArrayOff)
    {
      a = parami0;
      b = paramInt1;
      c = paramInt2;
      d = paramInt3;
      e = paramInt4;
      f = paramInt5;
      g = paramInt6;
      h = paramInt7;
      i = paramArrayOff;
    }
    
    public static AudioAttributes c(d paramd, boolean paramBoolean)
    {
      if (paramBoolean) {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
      }
      return aa;
    }
    
    /* Error */
    public final AudioTrack a(boolean paramBoolean, d paramd, int paramInt)
    {
      // Byte code:
      //   0: aload_0
      //   1: iload_1
      //   2: aload_2
      //   3: iload_3
      //   4: invokevirtual 79	x3/s$f:b	(ZLx3/d;I)Landroid/media/AudioTrack;
      //   7: astore_2
      //   8: aload_2
      //   9: invokevirtual 85	android/media/AudioTrack:getState	()I
      //   12: istore_3
      //   13: iload_3
      //   14: iconst_1
      //   15: if_icmpne +5 -> 20
      //   18: aload_2
      //   19: areturn
      //   20: aload_2
      //   21: invokevirtual 88	android/media/AudioTrack:release	()V
      //   24: aload_0
      //   25: getfield 33	x3/s$f:e	I
      //   28: istore 4
      //   30: aload_0
      //   31: getfield 35	x3/s$f:f	I
      //   34: istore 5
      //   36: aload_0
      //   37: getfield 39	x3/s$f:h	I
      //   40: istore 6
      //   42: aload_0
      //   43: getfield 25	x3/s$f:a	Lv3/i0;
      //   46: astore_2
      //   47: aload_0
      //   48: getfield 29	x3/s$f:c	I
      //   51: iconst_1
      //   52: if_icmpne +8 -> 60
      //   55: iconst_1
      //   56: istore_1
      //   57: goto +5 -> 62
      //   60: iconst_0
      //   61: istore_1
      //   62: new 90	x3/m$b
      //   65: dup
      //   66: iload_3
      //   67: iload 4
      //   69: iload 5
      //   71: iload 6
      //   73: aload_2
      //   74: iload_1
      //   75: aconst_null
      //   76: invokespecial 93	x3/m$b:<init>	(IIIILv3/i0;ZLjava/lang/RuntimeException;)V
      //   79: athrow
      //   80: astore_2
      //   81: goto +4 -> 85
      //   84: astore_2
      //   85: aload_0
      //   86: getfield 33	x3/s$f:e	I
      //   89: istore 5
      //   91: aload_0
      //   92: getfield 35	x3/s$f:f	I
      //   95: istore 4
      //   97: aload_0
      //   98: getfield 39	x3/s$f:h	I
      //   101: istore_3
      //   102: aload_0
      //   103: getfield 25	x3/s$f:a	Lv3/i0;
      //   106: astore 7
      //   108: aload_0
      //   109: getfield 29	x3/s$f:c	I
      //   112: iconst_1
      //   113: if_icmpne +8 -> 121
      //   116: iconst_1
      //   117: istore_1
      //   118: goto +5 -> 123
      //   121: iconst_0
      //   122: istore_1
      //   123: new 90	x3/m$b
      //   126: dup
      //   127: iconst_0
      //   128: iload 5
      //   130: iload 4
      //   132: iload_3
      //   133: aload 7
      //   135: iload_1
      //   136: aload_2
      //   137: invokespecial 93	x3/m$b:<init>	(IIIILv3/i0;ZLjava/lang/RuntimeException;)V
      //   140: athrow
      //   141: astore_2
      //   142: goto -118 -> 24
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	145	0	this	f
      //   0	145	1	paramBoolean	boolean
      //   0	145	2	paramd	d
      //   0	145	3	paramInt	int
      //   28	103	4	j	int
      //   34	95	5	k	int
      //   40	32	6	m	int
      //   106	28	7	locali0	i0
      // Exception table:
      //   from	to	target	type
      //   0	8	80	java/lang/IllegalArgumentException
      //   0	8	84	java/lang/UnsupportedOperationException
      //   20	24	141	java/lang/Exception
    }
    
    public final AudioTrack b(boolean paramBoolean, d paramd, int paramInt)
    {
      int j = e0.a;
      if (j >= 29)
      {
        AudioFormat localAudioFormat = s.x(e, f, g);
        paramd = c(paramd, paramBoolean);
        paramd = new AudioTrack.Builder().setAudioAttributes(paramd).setAudioFormat(localAudioFormat);
        paramBoolean = true;
        paramd = paramd.setTransferMode(1).setBufferSizeInBytes(h).setSessionId(paramInt);
        if (c != 1) {
          paramBoolean = false;
        }
        return v.d(paramd, paramBoolean).build();
      }
      if (j >= 21) {
        return new AudioTrack(c(paramd, paramBoolean), s.x(e, f, g), h, 1, paramInt);
      }
      int k = e0.y(c);
      paramd = new android/media/AudioTrack;
      int m = e;
      int n = f;
      j = g;
      int i1 = h;
      if (paramInt == 0) {
        paramd.<init>(k, m, n, j, i1, 1);
      } else {
        paramd.<init>(k, m, n, j, i1, 1, paramInt);
      }
      return paramd;
    }
  }
  
  public static final class g
    implements g
  {
    public final f[] a;
    public final a0 b;
    public final c0 c;
    
    public g(f... paramVarArgs)
    {
      f[] arrayOff = new f[paramVarArgs.length + 2];
      a = arrayOff;
      System.arraycopy(paramVarArgs, 0, arrayOff, 0, paramVarArgs.length);
      b = locala0;
      c = localc0;
      arrayOff[paramVarArgs.length] = locala0;
      arrayOff[(paramVarArgs.length + 1)] = localc0;
    }
  }
  
  public static final class h
  {
    public final e1 a;
    public final boolean b;
    public final long c;
    public final long d;
    
    public h(e1 parame1, boolean paramBoolean, long paramLong1, long paramLong2)
    {
      a = parame1;
      b = paramBoolean;
      c = paramLong1;
      d = paramLong2;
    }
  }
  
  public static final class i<T extends Exception>
  {
    public T a;
    public long b;
    
    public final void a(T paramT)
    {
      long l = SystemClock.elapsedRealtime();
      if (a == null)
      {
        a = paramT;
        b = (100L + l);
      }
      if (l >= b)
      {
        Exception localException = a;
        if (localException != paramT) {
          localException.addSuppressed(paramT);
        }
        paramT = a;
        a = null;
        throw paramT;
      }
    }
  }
  
  public final class j
    implements o.a
  {
    public j() {}
    
    public final void a(long paramLong)
    {
      Object localObject = r;
      if (localObject != null)
      {
        localObject = a.L0;
        Handler localHandler = a;
        if (localHandler != null) {
          localHandler.post(new h((l.a)localObject, paramLong));
        }
      }
    }
    
    public final void b(int paramInt, long paramLong)
    {
      if (r != null)
      {
        long l1 = SystemClock.elapsedRealtime();
        Object localObject = s.this;
        long l2 = a0;
        l.a locala = r).a.L0;
        localObject = a;
        if (localObject != null) {
          ((Handler)localObject).post(new k(locala, paramInt, paramLong, l1 - l2));
        }
      }
    }
    
    public final void c(long paramLong)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ignoring impossibly large audio latency: ");
      localStringBuilder.append(paramLong);
      v5.m.f("DefaultAudioSink", localStringBuilder.toString());
    }
    
    public final void d(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      Object localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Spurious audio timestamp (frame position mismatch): ");
      ((StringBuilder)localObject1).append(paramLong1);
      ((StringBuilder)localObject1).append(", ");
      ((StringBuilder)localObject1).append(paramLong2);
      ((StringBuilder)localObject1).append(", ");
      ((StringBuilder)localObject1).append(paramLong3);
      ((StringBuilder)localObject1).append(", ");
      ((StringBuilder)localObject1).append(paramLong4);
      ((StringBuilder)localObject1).append(", ");
      ((StringBuilder)localObject1).append(z());
      ((StringBuilder)localObject1).append(", ");
      ((StringBuilder)localObject1).append(A());
      localObject1 = ((StringBuilder)localObject1).toString();
      Object localObject2 = s.d0;
      v5.m.f("DefaultAudioSink", (String)localObject1);
    }
    
    public final void e(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Spurious audio timestamp (system clock mismatch): ");
      ((StringBuilder)localObject).append(paramLong1);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong2);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong3);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong4);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(z());
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(A());
      String str = ((StringBuilder)localObject).toString();
      localObject = s.d0;
      v5.m.f("DefaultAudioSink", str);
    }
  }
  
  public final class k
  {
    public final Handler a = new Handler(Looper.myLooper());
    public final a b = new a();
    
    public k() {}
    
    public final class a
      extends AudioTrack.StreamEventCallback
    {
      public a() {}
      
      public final void onDataRequest(AudioTrack paramAudioTrack, int paramInt)
      {
        if (!paramAudioTrack.equals(u)) {
          return;
        }
        paramAudioTrack = s.this;
        m.c localc = r;
        if ((localc != null) && (U))
        {
          paramAudioTrack = a.V0;
          if (paramAudioTrack != null) {
            paramAudioTrack.b();
          }
        }
      }
      
      public final void onTearDown(AudioTrack paramAudioTrack)
      {
        if (!paramAudioTrack.equals(u)) {
          return;
        }
        s locals = s.this;
        paramAudioTrack = r;
        if ((paramAudioTrack != null) && (U))
        {
          paramAudioTrack = a.V0;
          if (paramAudioTrack != null) {
            paramAudioTrack.b();
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     x3.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */