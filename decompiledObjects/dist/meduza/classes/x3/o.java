package x3;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import v5.e0;

public final class o
{
  public long A;
  public long B;
  public long C;
  public long D;
  public boolean E;
  public long F;
  public long G;
  public final a a;
  public final long[] b;
  public AudioTrack c;
  public int d;
  public int e;
  public n f;
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
  
  public o(s.j paramj)
  {
    a = paramj;
    if (e0.a >= 18) {}
    try
    {
      n = AudioTrack.class.getMethod("getLatency", null);
      b = new long[10];
      return;
    }
    catch (NoSuchMethodException paramj)
    {
      for (;;) {}
    }
  }
  
  public final long a()
  {
    long l1 = SystemClock.elapsedRealtime();
    long l2 = y;
    if (l2 != -9223372036854775807L)
    {
      l2 = e0.t(l1 * 1000L - l2, j) * g / 1000000L;
      return Math.min(B, A + l2);
    }
    if (l1 - s >= 5L)
    {
      AudioTrack localAudioTrack = c;
      localAudioTrack.getClass();
      int i1 = localAudioTrack.getPlayState();
      if (i1 != 1)
      {
        long l3 = 0xFFFFFFFF & localAudioTrack.getPlaybackHeadPosition();
        l2 = l3;
        if (h)
        {
          if ((i1 == 2) && (l3 == 0L)) {
            v = t;
          }
          l2 = l3 + v;
        }
        if (e0.a <= 29)
        {
          if ((l2 == 0L) && (t > 0L) && (i1 == 3))
          {
            if (z == -9223372036854775807L) {
              z = l1;
            }
          }
          else {
            z = -9223372036854775807L;
          }
        }
        else
        {
          if (t > l2) {
            u += 1L;
          }
          t = l2;
        }
      }
      s = l1;
    }
    return t + (u << 32);
  }
  
  public final boolean b(long paramLong)
  {
    long l1 = a();
    boolean bool = false;
    if (paramLong <= l1)
    {
      if (h)
      {
        AudioTrack localAudioTrack = c;
        localAudioTrack.getClass();
        if ((localAudioTrack.getPlayState() == 2) && (a() == 0L))
        {
          i1 = 1;
          break label60;
        }
      }
      int i1 = 0;
      label60:
      if (i1 == 0) {}
    }
    else
    {
      bool = true;
    }
    return bool;
  }
  
  public final void c()
  {
    l = 0L;
    x = 0;
    w = 0;
    m = 0L;
    D = 0L;
    G = 0L;
    k = false;
  }
  
  public final void d(AudioTrack paramAudioTrack, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    c = paramAudioTrack;
    d = paramInt2;
    e = paramInt3;
    f = new n(paramAudioTrack);
    g = paramAudioTrack.getSampleRate();
    boolean bool = true;
    if (paramBoolean)
    {
      int i1;
      if ((e0.a < 23) && ((paramInt1 == 5) || (paramInt1 == 6))) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0)
      {
        paramBoolean = bool;
        break label85;
      }
    }
    paramBoolean = false;
    label85:
    h = paramBoolean;
    paramBoolean = e0.F(paramInt1);
    q = paramBoolean;
    long l1;
    if (paramBoolean) {
      l1 = paramInt3 / paramInt2 * 1000000L / g;
    } else {
      l1 = -9223372036854775807L;
    }
    i = l1;
    t = 0L;
    u = 0L;
    v = 0L;
    p = false;
    y = -9223372036854775807L;
    z = -9223372036854775807L;
    r = 0L;
    o = 0L;
    j = 1.0F;
  }
  
  public static abstract interface a
  {
    public abstract void a(long paramLong);
    
    public abstract void b(int paramInt, long paramLong);
    
    public abstract void c(long paramLong);
    
    public abstract void d(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
    
    public abstract void e(long paramLong1, long paramLong2, long paramLong3, long paramLong4);
  }
}

/* Location:
 * Qualified Name:     x3.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */