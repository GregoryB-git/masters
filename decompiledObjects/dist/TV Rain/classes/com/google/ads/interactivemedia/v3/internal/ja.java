package com.google.ads.interactivemedia.v3.internal;

public final class ja
  implements iz
{
  private wi a;
  private gi b;
  private boolean c;
  
  public final void a(vy paramvy)
  {
    if (!c)
    {
      if (a.c() == -9223372036854775807L) {
        return;
      }
      b.a(bw.a(null, "application/x-scte35", a.c()));
      c = true;
    }
    int i = paramvy.b();
    b.a(paramvy, i);
    b.a(a.b(), 1, i, 0, null);
  }
  
  public final void a(wi paramwi, fy paramfy, jn paramjn)
  {
    a = paramwi;
    paramjn.a();
    paramwi = paramfy.a(paramjn.b(), 4);
    b = paramwi;
    paramwi.a(bw.a(paramjn.c(), "application/x-scte35", null, -1, null));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ja
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */