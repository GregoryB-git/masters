package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

final class jh
  implements iz
{
  private final vz a = new vz(new byte[4]);
  
  public jh(je paramje) {}
  
  public final void a(vy paramvy)
  {
    if (paramvy.e() != 0) {
      return;
    }
    paramvy.d(7);
    int i = paramvy.b() / 4;
    for (int j = 0; j < i; j++)
    {
      paramvy.a(a, 4);
      int k = a.c(16);
      a.b(3);
      if (k == 0)
      {
        a.b(13);
      }
      else
      {
        k = a.c(13);
        je.a(b).put(k, new iy(new jg(b, k)));
        je.b(b);
      }
    }
    if (je.c(b) != 2) {
      je.a(b).remove(0);
    }
  }
  
  public final void a(wi paramwi, fy paramfy, jn paramjn) {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */