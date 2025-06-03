package com.google.android.exoplayer2.source.smoothstreaming;

import b5.b;

public final class a$b
  extends b
{
  public final g5.a.b e;
  
  public a$b(g5.a.b paramb, int paramInt)
  {
    super(paramInt, k - 1);
    e = paramb;
  }
  
  public final long a()
  {
    c();
    g5.a.b localb = e;
    int i = (int)d;
    return o[i];
  }
  
  public final long b()
  {
    long l = a();
    return e.b((int)d) + l;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */