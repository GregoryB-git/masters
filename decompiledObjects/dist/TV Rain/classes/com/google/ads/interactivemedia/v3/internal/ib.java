package com.google.ads.interactivemedia.v3.internal;

final class ib
{
  public hl a;
  public long b;
  public long c;
  public int d;
  public int e;
  public long[] f;
  public int[] g;
  public int[] h;
  public int[] i;
  public long[] j;
  public boolean[] k;
  public boolean l;
  public boolean[] m;
  public hy n;
  public int o;
  public vy p;
  public boolean q;
  public long r;
  
  public final void a(int paramInt)
  {
    vy localvy = p;
    if ((localvy == null) || (localvy.c() < paramInt)) {
      p = new vy(paramInt);
    }
    o = paramInt;
    l = true;
    q = true;
  }
  
  public final long b(int paramInt)
  {
    return j[paramInt] + i[paramInt];
  }
  
  public final boolean c(int paramInt)
  {
    return (l) && (m[paramInt] != 0);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ib
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */