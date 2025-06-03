package k0;

import B0.h;
import g0.a;

public final class r$b
{
  public h a;
  public int b = 50000;
  public int c = 50000;
  public int d = 2500;
  public int e = 5000;
  public int f = -1;
  public boolean g = false;
  public int h = 0;
  public boolean i = false;
  public boolean j;
  
  public r a()
  {
    a.f(j ^ true);
    j = true;
    if (a == null) {
      a = new h(true, 65536);
    }
    return new r(a, b, c, d, e, f, g, h, i);
  }
  
  public b b(int paramInt, boolean paramBoolean)
  {
    a.f(j ^ true);
    r.j(paramInt, 0, "backBufferDurationMs", "0");
    h = paramInt;
    i = paramBoolean;
    return this;
  }
  
  public b c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.f(j ^ true);
    r.j(paramInt3, 0, "bufferForPlaybackMs", "0");
    r.j(paramInt4, 0, "bufferForPlaybackAfterRebufferMs", "0");
    r.j(paramInt1, paramInt3, "minBufferMs", "bufferForPlaybackMs");
    r.j(paramInt1, paramInt4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
    r.j(paramInt2, paramInt1, "maxBufferMs", "minBufferMs");
    b = paramInt1;
    c = paramInt2;
    d = paramInt3;
    e = paramInt4;
    return this;
  }
  
  public b d(boolean paramBoolean)
  {
    a.f(j ^ true);
    g = paramBoolean;
    return this;
  }
  
  public b e(int paramInt)
  {
    a.f(j ^ true);
    f = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     k0.r.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */