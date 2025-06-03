package hb;

import java.io.IOException;
import jb.c;

public final class p$b
{
  public final xc.f a = new xc.f();
  public final int b;
  public int c;
  public int d;
  public final p.a e;
  public boolean f = false;
  
  public p$b(p paramp, int paramInt1, int paramInt2, h.b paramb)
  {
    b = paramInt1;
    c = paramInt2;
    e = paramb;
  }
  
  public final int a(int paramInt)
  {
    if ((paramInt > 0) && (Integer.MAX_VALUE - paramInt < c))
    {
      StringBuilder localStringBuilder = f.l("Window size overflow for stream: ");
      localStringBuilder.append(b);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    paramInt = c + paramInt;
    c = paramInt;
    return paramInt;
  }
  
  public final int b()
  {
    return Math.min(c, g.d.c);
  }
  
  public final void c(int paramInt, xc.f paramf, boolean paramBoolean)
  {
    for (;;)
    {
      int i = Math.min(paramInt, g.b.t0());
      b localb = g.d;
      int j = -i;
      localb.a(j);
      a(j);
      try
      {
        boolean bool;
        if ((b == i) && (paramBoolean)) {
          bool = true;
        } else {
          bool = false;
        }
        g.b.u(bool, b, paramf, i);
        e.b(i);
        i = paramInt - i;
        paramInt = i;
        if (i > 0) {
          continue;
        }
        return;
      }
      catch (IOException paramf)
      {
        throw new RuntimeException(paramf);
      }
    }
  }
}

/* Location:
 * Qualified Name:     hb.p.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */