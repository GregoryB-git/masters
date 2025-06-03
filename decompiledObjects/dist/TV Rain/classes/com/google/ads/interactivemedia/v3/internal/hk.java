package com.google.ads.interactivemedia.v3.internal;

class hk
{
  public final int a;
  public int b;
  public int c;
  public long d;
  private final boolean e;
  private final vy f;
  private final vy g;
  private int h;
  private int i;
  
  public hk(vy paramvy1, vy paramvy2, boolean paramBoolean)
  {
    g = paramvy1;
    f = paramvy2;
    e = paramBoolean;
    paramvy2.c(12);
    a = paramvy2.p();
    paramvy1.c(12);
    i = paramvy1.p();
    int j = paramvy1.l();
    paramBoolean = true;
    if (j != 1) {
      paramBoolean = false;
    }
    rp.b(paramBoolean, "first_chunk must be 1");
    b = -1;
  }
  
  public boolean a()
  {
    int j = b + 1;
    b = j;
    if (j == a) {
      return false;
    }
    long l;
    if (e) {
      l = f.q();
    } else {
      l = f.j();
    }
    d = l;
    if (b == h)
    {
      c = g.p();
      g.d(4);
      j = i - 1;
      i = j;
      if (j > 0) {
        j = g.p() - 1;
      } else {
        j = -1;
      }
      h = j;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.hk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */