package m0;

import F0.p;
import X2.v;
import X2.v.a;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioRouting.OnRoutingChangedListener;
import android.media.AudioTrack;
import android.media.AudioTrack.Builder;
import android.media.AudioTrack.StreamEventCallback;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import d0.b.d;
import d0.q;
import e0.b.a;
import e0.b.b;
import e0.g;
import g0.M;
import g0.o;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k0.g0;
import k0.w.a;
import l0.y1;

public final class N
  implements z
{
  public static boolean n0 = false;
  public static final Object o0 = new Object();
  public static ExecutorService p0;
  public static int q0;
  public k A;
  public d0.b B;
  public j C;
  public j D;
  public d0.C E;
  public boolean F;
  public ByteBuffer G;
  public int H;
  public long I;
  public long J;
  public long K;
  public long L;
  public int M;
  public boolean N;
  public boolean O;
  public long P;
  public float Q;
  public ByteBuffer R;
  public int S;
  public ByteBuffer T;
  public byte[] U;
  public int V;
  public boolean W;
  public boolean X;
  public boolean Y;
  public boolean Z;
  public final Context a;
  public boolean a0;
  public final e0.c b;
  public int b0;
  public final boolean c;
  public d0.e c0;
  public final C d;
  public j d0;
  public final f0 e;
  public boolean e0;
  public final v f;
  public long f0;
  public final v g;
  public long g0;
  public final g0.f h;
  public boolean h0;
  public final B i;
  public boolean i0;
  public final ArrayDeque j;
  public Looper j0;
  public final boolean k;
  public long k0;
  public int l;
  public long l0;
  public n m;
  public Handler m0;
  public final l n;
  public final l o;
  public final e p;
  public final d q;
  public final w.a r;
  public y1 s;
  public z.d t;
  public g u;
  public g v;
  public e0.a w;
  public AudioTrack x;
  public e y;
  public i z;
  
  public N(f paramf)
  {
    Object localObject1 = f.a(paramf);
    a = ((Context)localObject1);
    Object localObject2 = d0.b.g;
    B = ((d0.b)localObject2);
    if (localObject1 != null) {
      localObject1 = e.e((Context)localObject1, (d0.b)localObject2, null);
    } else {
      localObject1 = f.c(paramf);
    }
    y = ((e)localObject1);
    b = f.d(paramf);
    int i1 = M.a;
    boolean bool1 = true;
    boolean bool2;
    if ((i1 >= 21) && (f.e(paramf))) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    c = bool2;
    if ((i1 >= 23) && (f.f(paramf))) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    k = bool2;
    l = 0;
    p = f.g(paramf);
    q = ((d)g0.a.e(f.h(paramf)));
    localObject1 = new g0.f(g0.c.a);
    h = ((g0.f)localObject1);
    ((g0.f)localObject1).e();
    i = new B(new m(null));
    localObject1 = new C();
    d = ((C)localObject1);
    localObject2 = new f0();
    e = ((f0)localObject2);
    f = v.b0(new g(), localObject1, localObject2);
    g = v.Z(new e0());
    Q = 1.0F;
    b0 = 0;
    c0 = new d0.e(0, 0.0F);
    localObject1 = d0.C.d;
    D = new j((d0.C)localObject1, 0L, 0L, null);
    E = ((d0.C)localObject1);
    F = false;
    j = new ArrayDeque();
    n = new l(100L);
    o = new l(100L);
    r = f.b(paramf);
  }
  
  public static int T(int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt1 = AudioTrack.getMinBufferSize(paramInt1, paramInt2, paramInt3);
    boolean bool;
    if (paramInt1 != -2) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    return paramInt1;
  }
  
  public static int U(int paramInt, ByteBuffer paramByteBuffer)
  {
    if (paramInt != 20)
    {
      if (paramInt != 30) {
        switch (paramInt)
        {
        default: 
          switch (paramInt)
          {
          default: 
            paramByteBuffer = new StringBuilder();
            paramByteBuffer.append("Unexpected audio encoding: ");
            paramByteBuffer.append(paramInt);
            throw new IllegalStateException(paramByteBuffer.toString());
          case 17: 
            return F0.c.c(paramByteBuffer);
          case 16: 
            return 1024;
          case 15: 
            return 512;
          case 14: 
            paramInt = F0.b.b(paramByteBuffer);
            if (paramInt == -1) {
              paramInt = 0;
            } else {
              paramInt = F0.b.i(paramByteBuffer, paramInt) * 16;
            }
            return paramInt;
          }
        case 11: 
        case 12: 
          return 2048;
        case 10: 
          return 1024;
        case 9: 
          paramInt = F0.I.m(M.O(paramByteBuffer, paramByteBuffer.position()));
          if (paramInt != -1) {
            return paramInt;
          }
          throw new IllegalArgumentException();
        case 5: 
        case 6: 
          return F0.b.e(paramByteBuffer);
        }
      }
      return p.f(paramByteBuffer);
    }
    return F0.K.h(paramByteBuffer);
  }
  
  public static boolean Z(int paramInt)
  {
    boolean bool;
    if (((M.a >= 24) && (paramInt == -6)) || (paramInt == -32)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean b0(AudioTrack paramAudioTrack)
  {
    boolean bool;
    if ((M.a >= 29) && (I.a(paramAudioTrack))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void l0(AudioTrack paramAudioTrack, g0.f paramf, z.d paramd, z.a parama)
  {
    paramf.c();
    Handler localHandler = new Handler(Looper.myLooper());
    synchronized (o0)
    {
      if (p0 == null) {
        p0 = M.K0("ExoPlayer:AudioTrackReleaseThread");
      }
    }
    q0 += 1;
    ExecutorService localExecutorService = p0;
    J localJ = new m0/J;
    localJ.<init>(paramAudioTrack, paramd, localHandler, parama, paramf);
    localExecutorService.execute(localJ);
  }
  
  public static void q0(AudioTrack paramAudioTrack, float paramFloat)
  {
    paramAudioTrack.setVolume(paramFloat);
  }
  
  public static void r0(AudioTrack paramAudioTrack, float paramFloat)
  {
    paramAudioTrack.setStereoVolume(paramFloat, paramFloat);
  }
  
  public static int x0(AudioTrack paramAudioTrack, ByteBuffer paramByteBuffer, int paramInt)
  {
    return paramAudioTrack.write(paramByteBuffer, paramInt, 1);
  }
  
  public void A(g0.c paramc)
  {
    i.u(paramc);
  }
  
  public void B()
  {
    N = true;
  }
  
  public void C(z.d paramd)
  {
    t = paramd;
  }
  
  public final void N(long paramLong)
  {
    if (!v0())
    {
      if (t0()) {
        localObject = b.a(E);
      } else {
        localObject = d0.C.d;
      }
      E = ((d0.C)localObject);
    }
    for (;;)
    {
      break;
      localObject = d0.C.d;
    }
    boolean bool;
    if (t0()) {
      bool = b.c(F);
    } else {
      bool = false;
    }
    F = bool;
    j.add(new j((d0.C)localObject, Math.max(0L, paramLong), v.i(W()), null));
    s0();
    Object localObject = t;
    if (localObject != null) {
      ((z.d)localObject).c(F);
    }
  }
  
  public final long O(long paramLong)
  {
    while ((!j.isEmpty()) && (paramLong >= j.getFirst()).c)) {
      D = ((j)j.remove());
    }
    long l1 = D.c;
    if (j.isEmpty())
    {
      paramLong = b.d(paramLong - l1);
      return D.b + paramLong;
    }
    j localj = (j)j.getFirst();
    paramLong = M.c0(c - paramLong, D.a.a);
    return b - paramLong;
  }
  
  public final long P(long paramLong)
  {
    long l1 = b.b();
    long l2 = v.i(l1);
    long l3 = k0;
    if (l1 > l3)
    {
      l3 = v.i(l1 - l3);
      k0 = l1;
      X(l3);
    }
    return paramLong + l2;
  }
  
  public final AudioTrack Q(g paramg)
  {
    try
    {
      localObject = paramg.a(B, b0);
      paramg = r;
      if (paramg != null) {
        paramg.m(b0((AudioTrack)localObject));
      }
    }
    catch (z.c paramg)
    {
      break label41;
    }
    return (AudioTrack)localObject;
    label41:
    Object localObject = t;
    if (localObject != null) {
      ((z.d)localObject).d(paramg);
    }
    throw paramg;
  }
  
  public final AudioTrack R()
  {
    try
    {
      AudioTrack localAudioTrack = Q((g)g0.a.e(v));
      return localAudioTrack;
    }
    catch (z.c localc1)
    {
      Object localObject = v;
      if (h > 1000000)
      {
        g localg = ((g)localObject).d(1000000);
        try
        {
          localObject = Q(localg);
          v = localg;
          return (AudioTrack)localObject;
        }
        catch (z.c localc2)
        {
          localc1.addSuppressed(localc2);
        }
      }
      e0();
      throw localc1;
    }
  }
  
  public final boolean S()
  {
    boolean bool1 = w.f();
    boolean bool2 = false;
    boolean bool3 = false;
    ByteBuffer localByteBuffer;
    if (!bool1)
    {
      localByteBuffer = T;
      if (localByteBuffer == null) {
        return true;
      }
      w0(localByteBuffer, Long.MIN_VALUE);
      if (T == null) {
        bool3 = true;
      }
      return bool3;
    }
    w.h();
    j0(Long.MIN_VALUE);
    bool3 = bool2;
    if (w.e())
    {
      localByteBuffer = T;
      if (localByteBuffer != null)
      {
        bool3 = bool2;
        if (localByteBuffer.hasRemaining()) {}
      }
      else
      {
        bool3 = true;
      }
    }
    return bool3;
  }
  
  public final long V()
  {
    g localg = v;
    long l1;
    if (c == 0) {
      l1 = I / b;
    } else {
      l1 = J;
    }
    return l1;
  }
  
  public final long W()
  {
    g localg = v;
    long l1;
    if (c == 0) {
      l1 = M.l(K, d);
    } else {
      l1 = L;
    }
    return l1;
  }
  
  public final void X(long paramLong)
  {
    l0 += paramLong;
    if (m0 == null) {
      m0 = new Handler(Looper.myLooper());
    }
    m0.removeCallbacksAndMessages(null);
    m0.postDelayed(new K(this), 100L);
  }
  
  public final boolean Y()
  {
    if (!h.d()) {
      return false;
    }
    Object localObject1 = R();
    x = ((AudioTrack)localObject1);
    if (b0((AudioTrack)localObject1))
    {
      k0(x);
      localObject2 = v;
      if (k)
      {
        localObject1 = x;
        localObject2 = a;
        H.a((AudioTrack)localObject1, E, F);
      }
    }
    int i1 = M.a;
    if (i1 >= 31)
    {
      localObject1 = s;
      if (localObject1 != null) {
        c.a(x, (y1)localObject1);
      }
    }
    b0 = x.getAudioSessionId();
    localObject1 = i;
    Object localObject2 = x;
    g localg = v;
    boolean bool;
    if (c == 2) {
      bool = true;
    } else {
      bool = false;
    }
    ((B)localObject1).s((AudioTrack)localObject2, bool, g, d, h);
    p0();
    int i2 = c0.a;
    if (i2 != 0)
    {
      x.attachAuxEffect(i2);
      x.setAuxEffectSendLevel(c0.b);
    }
    localObject1 = d0;
    if ((localObject1 != null) && (i1 >= 23))
    {
      b.a(x, (j)localObject1);
      localObject1 = z;
      if (localObject1 != null) {
        ((i)localObject1).i(d0.a);
      }
    }
    if (i1 >= 24)
    {
      localObject1 = z;
      if (localObject1 != null) {
        A = new k(x, (i)localObject1);
      }
    }
    O = true;
    localObject1 = t;
    if (localObject1 != null) {
      ((z.d)localObject1).a(v.b());
    }
    return true;
  }
  
  public boolean a(q paramq)
  {
    boolean bool;
    if (o(paramq) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean a0()
  {
    boolean bool;
    if (x != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b()
  {
    flush();
    Object localObject = f.q();
    while (((Iterator)localObject).hasNext()) {
      ((e0.b)((Iterator)localObject).next()).b();
    }
    localObject = g.q();
    while (((Iterator)localObject).hasNext()) {
      ((e0.b)((Iterator)localObject).next()).b();
    }
    localObject = w;
    if (localObject != null) {
      ((e0.a)localObject).j();
    }
    Z = false;
    h0 = false;
  }
  
  public boolean c()
  {
    boolean bool;
    if ((a0()) && ((!W) || (i()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void d(boolean paramBoolean)
  {
    F = paramBoolean;
    d0.C localC;
    if (v0()) {
      localC = d0.C.d;
    } else {
      localC = E;
    }
    n0(localC);
  }
  
  public void e()
  {
    boolean bool;
    if (M.a >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    g0.a.f(a0);
    if (!e0)
    {
      e0 = true;
      flush();
    }
  }
  
  public final void e0()
  {
    if (!v.m()) {
      return;
    }
    h0 = true;
  }
  
  public void f(AudioDeviceInfo paramAudioDeviceInfo)
  {
    if (paramAudioDeviceInfo == null) {
      localObject = null;
    } else {
      localObject = new j(paramAudioDeviceInfo);
    }
    d0 = ((j)localObject);
    Object localObject = z;
    if (localObject != null) {
      ((i)localObject).i(paramAudioDeviceInfo);
    }
    paramAudioDeviceInfo = x;
    if (paramAudioDeviceInfo != null) {
      b.a(paramAudioDeviceInfo, d0);
    }
  }
  
  public final void f0()
  {
    if (l0 >= 300000L)
    {
      t.g();
      l0 = 0L;
    }
  }
  
  public void flush()
  {
    if (a0())
    {
      m0();
      if (i.i()) {
        x.pause();
      }
      if (b0(x)) {
        ((n)g0.a.e(m)).b(x);
      }
      int i1 = M.a;
      if ((i1 < 21) && (!a0)) {
        b0 = 0;
      }
      localObject1 = v.b();
      Object localObject2 = u;
      if (localObject2 != null)
      {
        v = ((g)localObject2);
        u = null;
      }
      i.q();
      if (i1 >= 24)
      {
        localObject2 = A;
        if (localObject2 != null)
        {
          ((k)localObject2).c();
          A = null;
        }
      }
      l0(x, h, t, (z.a)localObject1);
      x = null;
    }
    o.a();
    n.a();
    k0 = 0L;
    l0 = 0L;
    Object localObject1 = m0;
    if (localObject1 != null) {
      ((Handler)g0.a.e(localObject1)).removeCallbacksAndMessages(null);
    }
  }
  
  public void g()
  {
    if ((!W) && (a0()) && (S()))
    {
      i0();
      W = true;
    }
  }
  
  public final void g0()
  {
    if ((z == null) && (a != null))
    {
      j0 = Looper.myLooper();
      i locali = new i(a, new L(this), B, d0);
      z = locali;
      y = locali.g();
    }
  }
  
  public d0.C h()
  {
    return E;
  }
  
  public void h0(e parame)
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = j0;
    if (localLooper != localObject)
    {
      String str = "null";
      if (localLooper == null) {
        parame = "null";
      } else {
        parame = localLooper.getThread().getName();
      }
      if (localObject != null) {
        str = ((Looper)localObject).getThread().getName();
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Current looper (");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(") is not the playback looper (");
      ((StringBuilder)localObject).append(parame);
      ((StringBuilder)localObject).append(")");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    if (!parame.equals(y))
    {
      y = parame;
      parame = t;
      if (parame != null) {
        parame.f();
      }
    }
  }
  
  public boolean i()
  {
    boolean bool;
    if ((a0()) && ((M.a < 29) || (!I.a(x)) || (!Y)) && (i.h(W()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void i0()
  {
    if (!X)
    {
      X = true;
      i.g(W());
      if (b0(x)) {
        Y = false;
      }
      x.stop();
      H = 0;
    }
  }
  
  public void j()
  {
    Z = false;
    if ((a0()) && ((i.p()) || (b0(x)))) {
      x.pause();
    }
  }
  
  public final void j0(long paramLong)
  {
    ByteBuffer localByteBuffer;
    if (!w.f())
    {
      localByteBuffer = R;
      if (localByteBuffer == null) {
        localByteBuffer = e0.b.a;
      }
      w0(localByteBuffer, paramLong);
      return;
    }
    while (!w.e())
    {
      do
      {
        localByteBuffer = w.d();
        if (!localByteBuffer.hasRemaining()) {
          break;
        }
        w0(localByteBuffer, paramLong);
      } while (!localByteBuffer.hasRemaining());
      return;
      localByteBuffer = R;
      if ((localByteBuffer == null) || (!localByteBuffer.hasRemaining())) {
        break;
      }
      w.i(R);
    }
  }
  
  public void k(d0.C paramC)
  {
    E = new d0.C(M.o(a, 0.1F, 8.0F), M.o(b, 0.1F, 8.0F));
    if (v0()) {
      o0();
    } else {
      n0(paramC);
    }
  }
  
  public final void k0(AudioTrack paramAudioTrack)
  {
    if (m == null) {
      m = new n();
    }
    m.a(paramAudioTrack);
  }
  
  public void l(float paramFloat)
  {
    if (Q != paramFloat)
    {
      Q = paramFloat;
      p0();
    }
  }
  
  public void m(d0.e parame)
  {
    if (c0.equals(parame)) {
      return;
    }
    int i1 = a;
    float f1 = b;
    AudioTrack localAudioTrack = x;
    if (localAudioTrack != null)
    {
      if (c0.a != i1) {
        localAudioTrack.attachAuxEffect(i1);
      }
      if (i1 != 0) {
        x.setAuxEffectSendLevel(f1);
      }
    }
    c0 = parame;
  }
  
  public final void m0()
  {
    I = 0L;
    J = 0L;
    K = 0L;
    L = 0L;
    i0 = false;
    M = 0;
    D = new j(E, 0L, 0L, null);
    P = 0L;
    C = null;
    j.clear();
    R = null;
    S = 0;
    T = null;
    X = false;
    W = false;
    Y = false;
    G = null;
    H = 0;
    e.o();
    s0();
  }
  
  public void n(int paramInt)
  {
    if (b0 != paramInt)
    {
      b0 = paramInt;
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      }
      a0 = bool;
      flush();
    }
  }
  
  public final void n0(d0.C paramC)
  {
    paramC = new j(paramC, -9223372036854775807L, -9223372036854775807L, null);
    if (a0()) {
      C = paramC;
    } else {
      D = paramC;
    }
  }
  
  public int o(q paramq)
  {
    g0();
    if ("audio/raw".equals(n))
    {
      if (!M.A0(D))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Invalid PCM encoding: ");
        localStringBuilder.append(D);
        o.h("DefaultAudioSink", localStringBuilder.toString());
        return 0;
      }
      int i1 = D;
      if ((i1 != 2) && ((!c) || (i1 != 4))) {
        return 1;
      }
      return 2;
    }
    if (y.k(paramq, B)) {
      return 2;
    }
    return 0;
  }
  
  public final void o0()
  {
    if (a0())
    {
      PlaybackParams localPlaybackParams = new PlaybackParams().allowDefaults().setSpeed(E.a).setPitch(E.b).setAudioFallbackMode(2);
      try
      {
        x.setPlaybackParams(localPlaybackParams);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        o.i("DefaultAudioSink", "Failed to set playback params", localIllegalArgumentException);
      }
      d0.C localC = new d0.C(x.getPlaybackParams().getSpeed(), x.getPlaybackParams().getPitch());
      E = localC;
      i.t(a);
    }
  }
  
  public void p()
  {
    Z = true;
    if (a0())
    {
      i.v();
      x.play();
    }
  }
  
  public final void p0()
  {
    if (a0()) {
      if (M.a >= 21) {
        q0(x, Q);
      } else {
        r0(x, Q);
      }
    }
  }
  
  public void q(int paramInt1, int paramInt2)
  {
    Object localObject = x;
    if ((localObject != null) && (b0((AudioTrack)localObject)))
    {
      localObject = v;
      if ((localObject != null) && (k)) {
        H.a(x, paramInt1, paramInt2);
      }
    }
  }
  
  public k r(q paramq)
  {
    if (h0) {
      return k.d;
    }
    return q.a(paramq, B);
  }
  
  public void release()
  {
    i locali = z;
    if (locali != null) {
      locali.j();
    }
  }
  
  public void s(d0.b paramb)
  {
    if (B.equals(paramb)) {
      return;
    }
    B = paramb;
    if (e0) {
      return;
    }
    i locali = z;
    if (locali != null) {
      locali.h(paramb);
    }
    flush();
  }
  
  public final void s0()
  {
    e0.a locala = v.i;
    w = locala;
    locala.b();
  }
  
  public void t(y1 paramy1)
  {
    s = paramy1;
  }
  
  public final boolean t0()
  {
    if (!e0)
    {
      g localg = v;
      if ((c == 0) && (!u0(a.D))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public boolean u(ByteBuffer paramByteBuffer, long paramLong, int paramInt)
  {
    Object localObject = R;
    boolean bool;
    if ((localObject != null) && (paramByteBuffer != localObject)) {
      bool = false;
    } else {
      bool = true;
    }
    g0.a.a(bool);
    if (u != null)
    {
      if (!S()) {
        return false;
      }
      if (!u.c(v))
      {
        i0();
        if (i()) {
          return false;
        }
        flush();
      }
      else
      {
        v = u;
        u = null;
        localObject = x;
        if ((localObject != null) && (b0((AudioTrack)localObject)) && (v.k))
        {
          if (x.getPlayState() == 3)
          {
            G.a(x);
            i.a();
          }
          localObject = x;
          q localq = v.a;
          H.a((AudioTrack)localObject, E, F);
          i0 = true;
        }
      }
      N(paramLong);
    }
    if (!a0()) {
      try
      {
        bool = Y();
        if (!bool) {
          return false;
        }
      }
      catch (z.c paramByteBuffer)
      {
        if (!p)
        {
          n.b(paramByteBuffer);
          return false;
        }
        throw paramByteBuffer;
      }
    }
    n.a();
    if (O)
    {
      P = Math.max(0L, paramLong);
      N = false;
      O = false;
      if (v0()) {
        o0();
      }
      N(paramLong);
      if (Z) {
        p();
      }
    }
    if (!i.k(W())) {
      return false;
    }
    if (R == null)
    {
      if (paramByteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
        bool = true;
      } else {
        bool = false;
      }
      g0.a.a(bool);
      if (!paramByteBuffer.hasRemaining()) {
        return true;
      }
      localObject = v;
      if ((c != 0) && (M == 0))
      {
        int i1 = U(g, paramByteBuffer);
        M = i1;
        if (i1 == 0) {
          return true;
        }
      }
      if (C != null)
      {
        if (!S()) {
          return false;
        }
        N(paramLong);
        C = null;
      }
      long l1 = P + v.l(V() - e.n());
      if ((!N) && (Math.abs(l1 - paramLong) > 200000L))
      {
        localObject = t;
        if (localObject != null) {
          ((z.d)localObject).d(new z.e(paramLong, l1));
        }
        N = true;
      }
      if (N)
      {
        if (!S()) {
          return false;
        }
        l1 = paramLong - l1;
        P += l1;
        N = false;
        N(paramLong);
        localObject = t;
        if ((localObject != null) && (l1 != 0L)) {
          ((z.d)localObject).h();
        }
      }
      if (v.c == 0) {
        I += paramByteBuffer.remaining();
      } else {
        J += M * paramInt;
      }
      R = paramByteBuffer;
      S = paramInt;
    }
    j0(paramLong);
    if (!R.hasRemaining())
    {
      R = null;
      S = 0;
      return true;
    }
    if (i.j(W()))
    {
      o.h("DefaultAudioSink", "Resetting stalled audio track");
      flush();
      return true;
    }
    return false;
  }
  
  public final boolean u0(int paramInt)
  {
    boolean bool;
    if ((c) && (M.z0(paramInt))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void v(int paramInt)
  {
    boolean bool;
    if (M.a >= 29) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    l = paramInt;
  }
  
  public final boolean v0()
  {
    g localg = v;
    boolean bool;
    if ((localg != null) && (j) && (M.a >= 23)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public long w(boolean paramBoolean)
  {
    if ((a0()) && (!O)) {
      return P(O(Math.min(i.d(paramBoolean), v.i(W()))));
    }
    return Long.MIN_VALUE;
  }
  
  public final void w0(ByteBuffer paramByteBuffer, long paramLong)
  {
    if (!paramByteBuffer.hasRemaining()) {
      return;
    }
    Object localObject = T;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3;
    int i1;
    if (localObject != null)
    {
      if (localObject == paramByteBuffer) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      g0.a.a(bool3);
    }
    else
    {
      T = paramByteBuffer;
      if (M.a < 21)
      {
        i1 = paramByteBuffer.remaining();
        localObject = U;
        if ((localObject == null) || (localObject.length < i1)) {
          U = new byte[i1];
        }
        i2 = paramByteBuffer.position();
        paramByteBuffer.get(U, 0, i1);
        paramByteBuffer.position(i2);
        V = 0;
      }
    }
    int i3 = paramByteBuffer.remaining();
    if (M.a < 21)
    {
      i1 = i.c(K);
      if (i1 > 0)
      {
        i1 = Math.min(i3, i1);
        i2 = x.write(U, V, i1);
        i1 = i2;
        if (i2 > 0)
        {
          V += i2;
          paramByteBuffer.position(paramByteBuffer.position() + i2);
          i1 = i2;
        }
      }
      else
      {
        i1 = 0;
      }
    }
    else if (e0)
    {
      if (paramLong != -9223372036854775807L) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      g0.a.f(bool3);
      if (paramLong == Long.MIN_VALUE) {
        paramLong = f0;
      }
      for (;;)
      {
        break;
        f0 = paramLong;
      }
      i1 = y0(x, paramByteBuffer, i3, paramLong);
    }
    else
    {
      i1 = x0(x, paramByteBuffer, i3);
    }
    g0 = SystemClock.elapsedRealtime();
    if (i1 < 0)
    {
      if (Z(i1))
      {
        if (W() > 0L)
        {
          bool3 = bool2;
          break label371;
        }
        if (b0(x))
        {
          e0();
          bool3 = bool2;
          break label371;
        }
      }
      bool3 = false;
      label371:
      paramByteBuffer = new z.f(i1, v.a, bool3);
      localObject = t;
      if (localObject != null) {
        ((z.d)localObject).d(paramByteBuffer);
      }
      if (!p)
      {
        o.b(paramByteBuffer);
        return;
      }
      y = e.c;
      throw paramByteBuffer;
    }
    o.a();
    if (b0(x))
    {
      if (L > 0L) {
        i0 = false;
      }
      if (Z)
      {
        localObject = t;
        if ((localObject != null) && (i1 < i3) && (!i0)) {
          ((z.d)localObject).i();
        }
      }
    }
    int i2 = v.c;
    if (i2 == 0) {
      K += i1;
    }
    if (i1 == i3)
    {
      if (i2 != 0)
      {
        if (paramByteBuffer == R) {
          bool3 = bool1;
        } else {
          bool3 = false;
        }
        g0.a.f(bool3);
        L += M * S;
      }
      T = null;
    }
  }
  
  public void x()
  {
    if (e0)
    {
      e0 = false;
      flush();
    }
  }
  
  public final int y0(AudioTrack paramAudioTrack, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    if (M.a >= 26) {
      return paramAudioTrack.write(paramByteBuffer, paramInt, 1, paramLong * 1000L);
    }
    if (G == null)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
      G = localByteBuffer;
      localByteBuffer.order(ByteOrder.BIG_ENDIAN);
      G.putInt(1431633921);
    }
    if (H == 0)
    {
      G.putInt(4, paramInt);
      G.putLong(8, paramLong * 1000L);
      G.position(0);
      H = paramInt;
    }
    int i1 = G.remaining();
    if (i1 > 0)
    {
      int i2 = paramAudioTrack.write(G, i1, 1);
      if (i2 < 0)
      {
        H = 0;
        return i2;
      }
      if (i2 < i1) {
        return 0;
      }
    }
    paramInt = x0(paramAudioTrack, paramByteBuffer, paramInt);
    if (paramInt < 0)
    {
      H = 0;
      return paramInt;
    }
    H -= paramInt;
    return paramInt;
  }
  
  public void z(q paramq, int paramInt, int[] paramArrayOfInt)
  {
    g0();
    int i1;
    Object localObject1;
    int i2;
    int i3;
    int i4;
    int i5;
    boolean bool1;
    int i6;
    boolean bool2;
    if ("audio/raw".equals(n))
    {
      g0.a.a(M.A0(D));
      i1 = M.g0(D, B);
      localObject1 = new v.a();
      if (u0(D))
      {
        ((v.a)localObject1).j(g);
      }
      else
      {
        ((v.a)localObject1).j(f);
        ((v.a)localObject1).i(b.e());
      }
      Object localObject2 = new e0.a(((v.a)localObject1).k());
      localObject1 = localObject2;
      if (((e0.a)localObject2).equals(w)) {
        localObject1 = w;
      }
      e.p(E, F);
      if ((M.a < 21) && (B == 8) && (paramArrayOfInt == null))
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
      d.n(paramArrayOfInt);
      paramArrayOfInt = new b.a(paramq);
      try
      {
        paramArrayOfInt = ((e0.a)localObject1).a(paramArrayOfInt);
        i3 = c;
        i4 = a;
        i5 = M.M(b);
        i2 = M.g0(i3, b);
        bool1 = k;
        i6 = 0;
        int i7 = i6;
        paramArrayOfInt = (int[])localObject1;
      }
      catch (b.b paramArrayOfInt)
      {
        throw new z.b(paramArrayOfInt, paramq);
      }
    }
    else
    {
      paramArrayOfInt = new e0.a(v.Y());
      i4 = C;
      if (l != 0) {
        localObject1 = r(paramq);
      } else {
        localObject1 = k.d;
      }
      if ((l != 0) && (a))
      {
        i3 = d0.z.f((String)g0.a.e(n), j);
        i5 = M.M(B);
        bool2 = b;
        i1 = -1;
        i2 = i1;
        i6 = 1;
        bool1 = i6;
      }
      else
      {
        localObject1 = y.i(paramq, B);
        if (localObject1 == null) {
          break label741;
        }
        i3 = ((Integer)first).intValue();
        i5 = ((Integer)second).intValue();
        bool1 = k;
        i1 = -1;
        i2 = i1;
        bool2 = false;
        i6 = 2;
      }
    }
    if (i3 != 0)
    {
      if (i5 != 0)
      {
        int i8 = i;
        int i9 = i8;
        if ("audio/vnd.dts.hd;profile=lbr".equals(n))
        {
          i9 = i8;
          if (i8 == -1) {
            i9 = 768000;
          }
        }
        if (paramInt == 0)
        {
          localObject1 = p;
          i8 = T(i4, i5, i3);
          if (i2 != -1) {
            paramInt = i2;
          } else {
            paramInt = 1;
          }
          if (bool1) {}
          for (double d1 = 8.0D;; d1 = 1.0D) {
            break;
          }
          paramInt = ((e)localObject1).a(i8, i3, i6, paramInt, i4, i9, d1);
        }
        h0 = false;
        paramq = new g(paramq, i1, i6, i2, i4, i5, i3, paramInt, paramArrayOfInt, bool1, bool2, e0);
        if (a0()) {
          u = paramq;
        } else {
          v = paramq;
        }
        return;
      }
      paramArrayOfInt = new StringBuilder();
      paramArrayOfInt.append("Invalid output channel config (mode=");
      paramArrayOfInt.append(i6);
      paramArrayOfInt.append(") for: ");
      paramArrayOfInt.append(paramq);
      throw new z.b(paramArrayOfInt.toString(), paramq);
    }
    paramArrayOfInt = new StringBuilder();
    paramArrayOfInt.append("Invalid output encoding (mode=");
    paramArrayOfInt.append(i6);
    paramArrayOfInt.append(") for: ");
    paramArrayOfInt.append(paramq);
    throw new z.b(paramArrayOfInt.toString(), paramq);
    label741:
    paramArrayOfInt = new StringBuilder();
    paramArrayOfInt.append("Unable to configure passthrough for: ");
    paramArrayOfInt.append(paramq);
    throw new z.b(paramArrayOfInt.toString(), paramq);
  }
  
  public static final abstract class b
  {
    public static void a(AudioTrack paramAudioTrack, j paramj)
    {
      if (paramj == null) {
        paramj = null;
      } else {
        paramj = a;
      }
      paramAudioTrack.setPreferredDevice(paramj);
    }
  }
  
  public static final abstract class c
  {
    public static void a(AudioTrack paramAudioTrack, y1 paramy1)
    {
      paramy1 = paramy1.a();
      if (!O.a(paramy1, g0.a())) {
        P.a(paramAudioTrack, paramy1);
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract k a(q paramq, d0.b paramb);
  }
  
  public static abstract interface e
  {
    public static final e a = new a0.a().h();
    
    public abstract int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, double paramDouble);
  }
  
  public static final class f
  {
    public final Context a;
    public e b;
    public e0.c c;
    public boolean d;
    public boolean e;
    public boolean f;
    public N.e g;
    public N.d h;
    public w.a i;
    
    public f(Context paramContext)
    {
      a = paramContext;
      b = e.c;
      g = N.e.a;
    }
    
    public N i()
    {
      g0.a.f(f ^ true);
      f = true;
      if (c == null) {
        c = new N.h(new e0.b[0]);
      }
      if (h == null) {
        h = new E(a);
      }
      return new N(this, null);
    }
    
    public f j(boolean paramBoolean)
    {
      e = paramBoolean;
      return this;
    }
    
    public f k(boolean paramBoolean)
    {
      d = paramBoolean;
      return this;
    }
  }
  
  public static final class g
  {
    public final q a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final e0.a i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    
    public g(q paramq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, e0.a parama, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      a = paramq;
      b = paramInt1;
      c = paramInt2;
      d = paramInt3;
      e = paramInt4;
      f = paramInt5;
      g = paramInt6;
      h = paramInt7;
      i = parama;
      j = paramBoolean1;
      k = paramBoolean2;
      l = paramBoolean3;
    }
    
    public static AudioAttributes j(d0.b paramb, boolean paramBoolean)
    {
      if (paramBoolean) {
        return k();
      }
      return aa;
    }
    
    public static AudioAttributes k()
    {
      return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }
    
    /* Error */
    public AudioTrack a(d0.b paramb, int paramInt)
    {
      // Byte code:
      //   0: aload_0
      //   1: aload_1
      //   2: iload_2
      //   3: invokevirtual 91	m0/N$g:e	(Ld0/b;I)Landroid/media/AudioTrack;
      //   6: astore_1
      //   7: aload_1
      //   8: invokevirtual 97	android/media/AudioTrack:getState	()I
      //   11: istore_2
      //   12: iload_2
      //   13: iconst_1
      //   14: if_icmpne +5 -> 19
      //   17: aload_1
      //   18: areturn
      //   19: aload_1
      //   20: invokevirtual 100	android/media/AudioTrack:release	()V
      //   23: new 102	m0/z$c
      //   26: dup
      //   27: iload_2
      //   28: aload_0
      //   29: getfield 37	m0/N$g:e	I
      //   32: aload_0
      //   33: getfield 39	m0/N$g:f	I
      //   36: aload_0
      //   37: getfield 43	m0/N$g:h	I
      //   40: aload_0
      //   41: getfield 29	m0/N$g:a	Ld0/q;
      //   44: aload_0
      //   45: invokevirtual 106	m0/N$g:m	()Z
      //   48: aconst_null
      //   49: invokespecial 109	m0/z$c:<init>	(IIIILd0/q;ZLjava/lang/Exception;)V
      //   52: athrow
      //   53: astore_1
      //   54: goto +7 -> 61
      //   57: astore_1
      //   58: goto -4 -> 54
      //   61: new 102	m0/z$c
      //   64: dup
      //   65: iconst_0
      //   66: aload_0
      //   67: getfield 37	m0/N$g:e	I
      //   70: aload_0
      //   71: getfield 39	m0/N$g:f	I
      //   74: aload_0
      //   75: getfield 43	m0/N$g:h	I
      //   78: aload_0
      //   79: getfield 29	m0/N$g:a	Ld0/q;
      //   82: aload_0
      //   83: invokevirtual 106	m0/N$g:m	()Z
      //   86: aload_1
      //   87: invokespecial 109	m0/z$c:<init>	(IIIILd0/q;ZLjava/lang/Exception;)V
      //   90: athrow
      //   91: astore_1
      //   92: goto -69 -> 23
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	95	0	this	g
      //   0	95	1	paramb	d0.b
      //   0	95	2	paramInt	int
      // Exception table:
      //   from	to	target	type
      //   0	7	53	java/lang/IllegalArgumentException
      //   0	7	57	java/lang/UnsupportedOperationException
      //   19	23	91	java/lang/Exception
    }
    
    public z.a b()
    {
      int m = g;
      int n = e;
      int i1 = f;
      boolean bool1 = l;
      int i2 = c;
      boolean bool2 = true;
      if (i2 != 1) {
        bool2 = false;
      }
      return new z.a(m, n, i1, bool1, bool2, h);
    }
    
    public boolean c(g paramg)
    {
      boolean bool;
      if ((c == c) && (g == g) && (e == e) && (f == f) && (d == d) && (j == j) && (k == k)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public g d(int paramInt)
    {
      return new g(a, b, c, d, e, f, g, paramInt, i, j, k, l);
    }
    
    public final AudioTrack e(d0.b paramb, int paramInt)
    {
      int m = M.a;
      if (m >= 29) {
        return g(paramb, paramInt);
      }
      if (m >= 21) {
        return f(paramb, paramInt);
      }
      return h(paramb, paramInt);
    }
    
    public final AudioTrack f(d0.b paramb, int paramInt)
    {
      return new AudioTrack(j(paramb, l), M.L(e, f, g), h, 1, paramInt);
    }
    
    public final AudioTrack g(d0.b paramb, int paramInt)
    {
      AudioFormat localAudioFormat = M.L(e, f, g);
      paramb = j(paramb, l);
      paramb = new AudioTrack.Builder().setAudioAttributes(paramb).setAudioFormat(localAudioFormat);
      boolean bool = true;
      paramb = paramb.setTransferMode(1).setBufferSizeInBytes(h).setSessionId(paramInt);
      if (c != 1) {
        bool = false;
      }
      return Q.a(paramb, bool).build();
    }
    
    public final AudioTrack h(d0.b paramb, int paramInt)
    {
      int m = M.k0(c);
      paramb = new android/media/AudioTrack;
      int n = e;
      int i1 = f;
      int i2 = g;
      int i3 = h;
      if (paramInt == 0)
      {
        paramb.<init>(m, n, i1, i2, i3, 1);
        return paramb;
      }
      paramb.<init>(m, n, i1, i2, i3, 1, paramInt);
      return paramb;
    }
    
    public long i(long paramLong)
    {
      return M.V0(paramLong, e);
    }
    
    public long l(long paramLong)
    {
      return M.V0(paramLong, a.C);
    }
    
    public boolean m()
    {
      int m = c;
      boolean bool = true;
      if (m != 1) {
        bool = false;
      }
      return bool;
    }
  }
  
  public static class h
    implements e0.c
  {
    public final e0.b[] a;
    public final d0 b;
    public final e0.f c;
    
    public h(e0.b... paramVarArgs)
    {
      this(paramVarArgs, new d0(), new e0.f());
    }
    
    public h(e0.b[] paramArrayOfb, d0 paramd0, e0.f paramf)
    {
      e0.b[] arrayOfb = new e0.b[paramArrayOfb.length + 2];
      a = arrayOfb;
      System.arraycopy(paramArrayOfb, 0, arrayOfb, 0, paramArrayOfb.length);
      b = paramd0;
      c = paramf;
      arrayOfb[paramArrayOfb.length] = paramd0;
      arrayOfb[(paramArrayOfb.length + 1)] = paramf;
    }
    
    public d0.C a(d0.C paramC)
    {
      c.j(a);
      c.i(b);
      return paramC;
    }
    
    public long b()
    {
      return b.v();
    }
    
    public boolean c(boolean paramBoolean)
    {
      b.E(paramBoolean);
      return paramBoolean;
    }
    
    public long d(long paramLong)
    {
      long l = paramLong;
      if (c.a()) {
        l = c.h(paramLong);
      }
      return l;
    }
    
    public e0.b[] e()
    {
      return a;
    }
  }
  
  public static final class i
    extends RuntimeException
  {
    public i(String paramString)
    {
      super();
    }
  }
  
  public static final class j
  {
    public final d0.C a;
    public final long b;
    public final long c;
    
    public j(d0.C paramC, long paramLong1, long paramLong2)
    {
      a = paramC;
      b = paramLong1;
      c = paramLong2;
    }
  }
  
  public static final class k
  {
    public final AudioTrack a;
    public final i b;
    public AudioRouting.OnRoutingChangedListener c;
    
    public k(AudioTrack paramAudioTrack, i parami)
    {
      a = paramAudioTrack;
      b = parami;
      c = new W(this);
      parami = new Handler(Looper.myLooper());
      S.a(paramAudioTrack, c, parami);
    }
    
    private void b(AudioRouting paramAudioRouting)
    {
      if (c == null) {
        return;
      }
      if (V.a(paramAudioRouting) != null) {
        b.i(V.a(paramAudioRouting));
      }
    }
    
    public void c()
    {
      U.a(a, T.a(g0.a.e(c)));
      c = null;
    }
  }
  
  public static final class l
  {
    public final long a;
    public Exception b;
    public long c;
    
    public l(long paramLong)
    {
      a = paramLong;
    }
    
    public void a()
    {
      b = null;
    }
    
    public void b(Exception paramException)
    {
      long l = SystemClock.elapsedRealtime();
      if (b == null)
      {
        b = paramException;
        c = (a + l);
      }
      if (l >= c)
      {
        Exception localException = b;
        if (localException != paramException) {
          localException.addSuppressed(paramException);
        }
        paramException = b;
        a();
        throw paramException;
      }
    }
  }
  
  public final class m
    implements B.a
  {
    public m() {}
    
    public void a(int paramInt, long paramLong)
    {
      if (N.H(N.this) != null)
      {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = N.M(N.this);
        N.H(N.this).k(paramInt, paramLong, l1 - l2);
      }
    }
    
    public void b(long paramLong)
    {
      if (N.H(N.this) != null) {
        N.H(N.this).b(paramLong);
      }
    }
    
    public void c(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Spurious audio timestamp (frame position mismatch): ");
      ((StringBuilder)localObject).append(paramLong1);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong2);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong3);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong4);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(N.K(N.this));
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(N.L(N.this));
      localObject = ((StringBuilder)localObject).toString();
      if (!N.n0)
      {
        o.h("DefaultAudioSink", (String)localObject);
        return;
      }
      throw new N.i((String)localObject, null);
    }
    
    public void d(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
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
      ((StringBuilder)localObject).append(N.K(N.this));
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(N.L(N.this));
      localObject = ((StringBuilder)localObject).toString();
      if (!N.n0)
      {
        o.h("DefaultAudioSink", (String)localObject);
        return;
      }
      throw new N.i((String)localObject, null);
    }
    
    public void e(long paramLong)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ignoring impossibly large audio latency: ");
      localStringBuilder.append(paramLong);
      o.h("DefaultAudioSink", localStringBuilder.toString());
    }
  }
  
  public final class n
  {
    public final Handler a = new Handler(Looper.myLooper());
    public final AudioTrack.StreamEventCallback b = new a(N.this);
    
    public n() {}
    
    public void a(AudioTrack paramAudioTrack)
    {
      Handler localHandler = a;
      Objects.requireNonNull(localHandler);
      Y.a(paramAudioTrack, new Z(localHandler), b);
    }
    
    public void b(AudioTrack paramAudioTrack)
    {
      X.a(paramAudioTrack, b);
      a.removeCallbacksAndMessages(null);
    }
    
    public class a
      extends AudioTrack.StreamEventCallback
    {
      public a(N paramN) {}
      
      public void onDataRequest(AudioTrack paramAudioTrack, int paramInt)
      {
        if (!paramAudioTrack.equals(N.G(N.this))) {
          return;
        }
        if ((N.H(N.this) != null) && (N.I(N.this))) {
          N.H(N.this).j();
        }
      }
      
      public void onPresentationEnded(AudioTrack paramAudioTrack)
      {
        if (!paramAudioTrack.equals(N.G(N.this))) {
          return;
        }
        N.J(N.this, true);
      }
      
      public void onTearDown(AudioTrack paramAudioTrack)
      {
        if (!paramAudioTrack.equals(N.G(N.this))) {
          return;
        }
        if ((N.H(N.this) != null) && (N.I(N.this))) {
          N.H(N.this).j();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     m0.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */