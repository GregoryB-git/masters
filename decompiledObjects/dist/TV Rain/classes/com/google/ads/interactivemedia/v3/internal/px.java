package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class px
  implements gi
{
  private final nv b;
  private final by c;
  private final ez d;
  
  public px(ps paramps, nv paramnv)
  {
    b = paramnv;
    c = new by();
    d = new ez();
  }
  
  public final int a(fz paramfz, int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    return b.a(paramfz, paramInt, paramBoolean);
  }
  
  public final void a()
  {
    b.a();
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, gl paramgl)
  {
    b.a(paramLong, paramInt1, paramInt2, paramInt3, paramgl);
    while (b.d())
    {
      d.a();
      paramInt1 = b.a(c, d, false, false, false, 0L);
      String str = null;
      if (paramInt1 == -4)
      {
        d.h();
        paramgl = d;
      }
      else
      {
        paramgl = null;
      }
      if (paramgl != null)
      {
        paramLong = c;
        ps.a(a);
        paramgl = (ByteBuffer)rp.a(b);
        paramgl = kj.a(new vy(paramgl.array(), paramgl.limit()));
        paramInt2 = 0;
        if (paramgl == null) {
          paramgl = str;
        } else {
          paramgl = new kd(new kd.a[] { paramgl });
        }
        if (paramgl != null)
        {
          kh localkh = (kh)paramgl.a(0);
          str = a;
          paramgl = b;
          paramInt1 = paramInt2;
          if ("urn:mpeg:dash:event:2012".equals(str)) {
            if ((!"1".equals(paramgl)) && (!"2".equals(paramgl)))
            {
              paramInt1 = paramInt2;
              if (!"3".equals(paramgl)) {}
            }
            else
            {
              paramInt1 = 1;
            }
          }
          if (paramInt1 != 0)
          {
            long l = ps.a(localkh);
            if (l != -9223372036854775807L)
            {
              paramgl = new pv(paramLong, l);
              ps.b(a).sendMessage(ps.b(a).obtainMessage(1, paramgl));
            }
          }
        }
      }
    }
    b.m();
  }
  
  public final void a(bw parambw)
  {
    b.a(parambw);
  }
  
  public final void a(vy paramvy, int paramInt)
  {
    b.a(paramvy, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.px
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */