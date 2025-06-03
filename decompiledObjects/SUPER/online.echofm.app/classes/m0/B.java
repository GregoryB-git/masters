package m0;

import android.media.AudioTrack;
import g0.M;
import g0.a;
import g0.c;
import java.lang.reflect.Method;

public final class B
{
  public long A;
  public long B;
  public long C;
  public long D;
  public boolean E;
  public long F;
  public long G;
  public boolean H;
  public long I;
  public c J;
  public final a a;
  public final long[] b;
  public AudioTrack c;
  public int d;
  public int e;
  public A f;
  public int g;
  public boolean h;
  public long i;
  public float j;
  public boolean k;
  public long l;
  public long m;
  public Method n;
  public long o;
  public boolean p;
  public boolean q;
  public long r;
  public long s;
  public long t;
  public long u;
  public long v;
  public int w;
  public int x;
  public long y;
  public long z;
  
  public B(a parama)
  {
    a = ((a)a.e(parama));
    try
    {
      n = AudioTrack.class.getMethod("getLatency", null);
      b = new long[10];
      J = c.a;
      return;
    }
    catch (NoSuchMethodException parama)
    {
      for (;;) {}
    }
  }
  
  public static boolean o(int paramInt)
  {
    boolean bool;
    if ((M.a < 23) && ((paramInt == 5) || (paramInt == 6))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a()
  {
    H = true;
    A localA = f;
    if (localA != null) {
      localA.b();
    }
  }
  
  public final boolean b()
  {
    boolean bool;
    if ((h) && (((AudioTrack)a.e(c)).getPlayState() == 2) && (e() == 0L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int c(long paramLong)
  {
    int i1 = (int)(paramLong - e() * d);
    return e - i1;
  }
  
  public long d(boolean paramBoolean)
  {
    if (((AudioTrack)a.e(c)).getPlayState() == 3) {
      m();
    }
    long l1 = J.c() / 1000L;
    A localA = (A)a.e(f);
    boolean bool = localA.e();
    long l2;
    if (bool)
    {
      l2 = M.V0(localA.c(), g) + M.c0(l1 - localA.d(), j);
    }
    else
    {
      if (x == 0) {
        l3 = f();
      } else {
        l3 = M.c0(l + l1, j);
      }
      l2 = l3;
      if (!paramBoolean) {
        l2 = Math.max(0L, l3 - o);
      }
    }
    if (E != bool)
    {
      G = D;
      F = C;
    }
    long l4 = l1 - G;
    long l3 = l2;
    if (l4 < 1000000L)
    {
      l3 = F;
      long l5 = M.c0(l4, j);
      l4 = l4 * 1000L / 1000000L;
      l3 = (l2 * l4 + (1000L - l4) * (l3 + l5)) / 1000L;
    }
    if (!k)
    {
      l2 = C;
      if (l3 > l2)
      {
        k = true;
        l4 = M.h0(M.i1(l3 - l2), j);
        l2 = J.a();
        l4 = M.i1(l4);
        a.b(l2 - l4);
      }
    }
    D = l1;
    C = l3;
    E = bool;
    return l3;
  }
  
  public final long e()
  {
    long l1 = J.b();
    if (y != -9223372036854775807L)
    {
      if (((AudioTrack)a.e(c)).getPlayState() == 2) {
        return A;
      }
      l1 = M.F(M.c0(M.J0(l1) - y, j), g);
      return Math.min(B, A + l1);
    }
    if (l1 - s >= 5L)
    {
      w(l1);
      s = l1;
    }
    return t + I + (u << 32);
  }
  
  public final long f()
  {
    return M.V0(e(), g);
  }
  
  public void g(long paramLong)
  {
    A = e();
    y = M.J0(J.b());
    B = paramLong;
  }
  
  public boolean h(long paramLong)
  {
    boolean bool = false;
    if ((paramLong > M.F(d(false), g)) || (b())) {
      bool = true;
    }
    return bool;
  }
  
  public boolean i()
  {
    boolean bool;
    if (((AudioTrack)a.e(c)).getPlayState() == 3) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean j(long paramLong)
  {
    boolean bool;
    if ((z != -9223372036854775807L) && (paramLong > 0L) && (J.b() - z >= 200L)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean k(long paramLong)
  {
    int i1 = ((AudioTrack)a.e(c)).getPlayState();
    if (h)
    {
      if (i1 == 2)
      {
        p = false;
        return false;
      }
      if ((i1 == 1) && (e() == 0L)) {
        return false;
      }
    }
    boolean bool1 = p;
    boolean bool2 = h(paramLong);
    p = bool2;
    if ((bool1) && (!bool2) && (i1 != 1)) {
      a.a(e, M.i1(i));
    }
    return true;
  }
  
  public final void l(long paramLong)
  {
    A localA = (A)a.e(f);
    if (!localA.f(paramLong)) {
      return;
    }
    long l1 = localA.d();
    long l2 = localA.c();
    long l3 = f();
    if (Math.abs(l1 - paramLong) > 5000000L) {
      a.d(l2, l1, paramLong, l3);
    }
    for (;;)
    {
      localA.g();
      return;
      if (Math.abs(M.V0(l2, g) - l3) <= 5000000L) {
        break;
      }
      a.c(l2, l1, paramLong, l3);
    }
    localA.a();
  }
  
  public final void m()
  {
    long l1 = J.c() / 1000L;
    if (l1 - m >= 30000L)
    {
      long l2 = f();
      if (l2 == 0L) {
        return;
      }
      b[w] = (M.h0(l2, j) - l1);
      w = ((w + 1) % 10);
      int i1 = x;
      if (i1 < 10) {
        x = (i1 + 1);
      }
      m = l1;
      l = 0L;
      for (i1 = 0;; i1++)
      {
        int i2 = x;
        if (i1 >= i2) {
          break;
        }
        l += b[i1] / i2;
      }
    }
    if (h) {
      return;
    }
    l(l1);
    n(l1);
  }
  
  public final void n(long paramLong)
  {
    if (q)
    {
      Method localMethod = n;
      if ((localMethod != null) && (paramLong - r >= 500000L))
      {
        try
        {
          long l1 = ((Integer)M.i((Integer)localMethod.invoke(a.e(c), new Object[0]))).intValue() * 1000L - i;
          o = l1;
          l1 = Math.max(l1, 0L);
          o = l1;
          if (l1 > 5000000L)
          {
            a.e(l1);
            o = 0L;
          }
        }
        catch (Exception localException)
        {
          n = null;
        }
        r = paramLong;
      }
    }
  }
  
  public boolean p()
  {
    r();
    if (y == -9223372036854775807L)
    {
      ((A)a.e(f)).h();
      return true;
    }
    A = e();
    return false;
  }
  
  public void q()
  {
    r();
    c = null;
    f = null;
  }
  
  public final void r()
  {
    l = 0L;
    x = 0;
    w = 0;
    m = 0L;
    D = 0L;
    G = 0L;
    k = false;
  }
  
  public void s(AudioTrack paramAudioTrack, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    c = paramAudioTrack;
    d = paramInt2;
    e = paramInt3;
    f = new A(paramAudioTrack);
    g = paramAudioTrack.getSampleRate();
    if ((paramBoolean) && (o(paramInt1))) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    h = paramBoolean;
    paramBoolean = M.A0(paramInt1);
    q = paramBoolean;
    long l1;
    if (paramBoolean) {
      l1 = M.V0(paramInt3 / paramInt2, g);
    } else {
      l1 = -9223372036854775807L;
    }
    i = l1;
    t = 0L;
    u = 0L;
    H = false;
    I = 0L;
    v = 0L;
    p = false;
    y = -9223372036854775807L;
    z = -9223372036854775807L;
    r = 0L;
    o = 0L;
    j = 1.0F;
  }
  
  public void t(float paramFloat)
  {
    j = paramFloat;
    A localA = f;
    if (localA != null) {
      localA.h();
    }
    r();
  }
  
  public void u(c paramc)
  {
    J = paramc;
  }
  
  public void v()
  {
    if (y != -9223372036854775807L) {
      y = M.J0(J.b());
    }
    ((A)a.e(f)).h();
  }
  
  public final void w(long paramLong)
  {
    AudioTrack localAudioTrack = (AudioTrack)a.e(c);
    int i1 = localAudioTrack.getPlayState();
    if (i1 == 1) {
      return;
    }
    long l1 = localAudioTrack.getPlaybackHeadPosition() & 0xFFFFFFFF;
    long l2 = l1;
    if (h)
    {
      if ((i1 == 2) && (l1 == 0L)) {
        v = t;
      }
      l2 = l1 + v;
    }
    if (M.a <= 29)
    {
      if ((l2 == 0L) && (t > 0L) && (i1 == 3))
      {
        if (z == -9223372036854775807L) {
          z = paramLong;
        }
        return;
      }
      z = -9223372036854775807L;
    }
    paramLong = t;
    if (paramLong > l2) {
      if (H)
      {
        I += paramLong;
        H = false;
      }
      else
      {
        u += 1L;
      }
    }
    t = l2;
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt, long paramLong);
    
    public abstract void b(long paramLong);
    
    public abstract void c(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
    
    public abstract void d(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
    
    public abstract void e(long paramLong);
  }
}

/* Location:
 * Qualified Name:     m0.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */