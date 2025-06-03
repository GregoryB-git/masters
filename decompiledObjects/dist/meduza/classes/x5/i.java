package x5;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import v3.i0;
import v5.b0;
import v5.j;
import v5.j.a;
import v5.m;
import v5.u;

public final class i
  implements w5.i, a
{
  public final AtomicBoolean a = new AtomicBoolean();
  public final AtomicBoolean b = new AtomicBoolean(true);
  public final g c = new g();
  public final c d = new c();
  public final b0<Long> e = new b0();
  public final b0<e> f = new b0();
  public final float[] o = new float[16];
  public final float[] p = new float[16];
  public int q;
  public SurfaceTexture r;
  public volatile int s = 0;
  public int t = -1;
  public byte[] u;
  
  public final void a(long paramLong, float[] paramArrayOfFloat)
  {
    d.c.a(paramArrayOfFloat, paramLong);
  }
  
  public final SurfaceTexture b()
  {
    try
    {
      GLES20.glClearColor(0.5F, 0.5F, 0.5F, 1.0F);
      j.a();
      c.a();
      j.a();
      q = j.d();
    }
    catch (j.a locala)
    {
      m.d("SceneRenderer", "Failed to initialize the renderer", locala);
    }
    SurfaceTexture localSurfaceTexture = new SurfaceTexture(q);
    r = localSurfaceTexture;
    localSurfaceTexture.setOnFrameAvailableListener(new h(this));
    return r;
  }
  
  public final void c(long paramLong1, long paramLong2, i0 parami0, MediaFormat paramMediaFormat)
  {
    e.a(Long.valueOf(paramLong1), paramLong2);
    paramMediaFormat = D;
    int i = E;
    parami0 = u;
    int j = t;
    u = paramMediaFormat;
    int k = i;
    if (i == -1) {
      k = s;
    }
    t = k;
    if ((j != k) || (!Arrays.equals(parami0, u)))
    {
      byte[] arrayOfByte = u;
      paramMediaFormat = null;
      parami0 = paramMediaFormat;
      if (arrayOfByte != null)
      {
        j = t;
        parami0 = new u(arrayOfByte);
      }
    }
    try
    {
      parami0.H(4);
      k = parami0.f();
      parami0.G(0);
      if (k == 1886547818) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        parami0.H(8);
        k = b;
        m = c;
        for (;;)
        {
          if (k >= m) {
            break label283;
          }
          i = parami0.f() + k;
          if ((i <= k) || (i > m)) {
            break label283;
          }
          k = parami0.f();
          if ((k == 2037673328) || (k == 1836279920)) {
            break;
          }
          parami0.G(i);
          k = i;
        }
        parami0.F(i);
        parami0 = f.a(parami0);
      }
      else
      {
        parami0 = f.a(parami0);
      }
    }
    catch (ArrayIndexOutOfBoundsException parami0)
    {
      int m;
      label283:
      float f1;
      float f2;
      float f3;
      float f4;
      int n;
      for (;;) {}
    }
    parami0 = null;
    if (parami0 == null)
    {
      parami0 = paramMediaFormat;
    }
    else
    {
      k = parami0.size();
      if (k != 1)
      {
        if (k != 2) {
          parami0 = paramMediaFormat;
        } else {
          parami0 = new e((e.a)parami0.get(0), (e.a)parami0.get(1), j);
        }
      }
      else
      {
        parami0 = (e.a)parami0.get(0);
        parami0 = new e(parami0, parami0, j);
      }
    }
    if ((parami0 == null) || (!g.b(parami0)))
    {
      i = t;
      f1 = (float)Math.toRadians(180.0F);
      f2 = (float)Math.toRadians(360.0F);
      f3 = f1 / 36;
      f4 = f2 / 72;
      paramMediaFormat = new float['㹰'];
      parami0 = new float['⦠'];
      n = 0;
      k = n;
      m = k;
      while (n < 36)
      {
        float f5 = n;
        float f6 = f1 / 2.0F;
        float f7 = f5 * f3 - f6;
        int i1 = n + 1;
        f5 = i1 * f3 - f6;
        j = 0;
        int i2 = k;
        f6 = f4;
        f4 = f5;
        k = i1;
        f5 = f1;
        while (j < 73)
        {
          int i3 = 0;
          int i4 = 2;
          i1 = j;
          f1 = f7;
          for (j = i4; i3 < j; j = 2)
          {
            if (i3 == 0) {
              f7 = f1;
            } else {
              f7 = f4;
            }
            float f8 = i1 * f6;
            float f9 = f2 / 2.0F;
            j = i2 + 1;
            double d1 = 50.0F;
            double d2 = f8 + 3.1415927F - f9;
            double d3 = Math.sin(d2);
            double d4 = f7;
            paramMediaFormat[i2] = (-(float)(Math.cos(d4) * (d3 * d1)));
            i2 = j + 1;
            paramMediaFormat[j] = ((float)(Math.sin(d4) * d1));
            j = i2 + 1;
            d3 = Math.cos(d2);
            paramMediaFormat[i2] = ((float)(Math.cos(d4) * (d3 * d1)));
            i2 = m + 1;
            parami0[m] = (f8 / f2);
            m = i2 + 1;
            parami0[i2] = ((n + i3) * f3 / f5);
            if ((i1 == 0) && (i3 == 0)) {
              break label763;
            }
            if ((i1 == 72) && (i3 == 1))
            {
              label763:
              System.arraycopy(paramMediaFormat, j - 3, paramMediaFormat, j, 3);
              j += 3;
              System.arraycopy(parami0, m - 2, parami0, m, 2);
              m += 2;
            }
            i2 = j;
            i3++;
          }
          j = i1 + 1;
          f7 = f1;
        }
        f1 = f5;
        f4 = f6;
        n = k;
        k = i2;
      }
      parami0 = new e.a(new e.b[] { new e.b(0, paramMediaFormat, parami0, 1) });
      parami0 = new e(parami0, parami0, i);
    }
    f.a(parami0, paramLong2);
  }
  
  public final void f()
  {
    e.b();
    c localc = d;
    c.b();
    d = false;
    b.set(true);
  }
}

/* Location:
 * Qualified Name:     x5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */