package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

public final class rd
  extends mq
  implements sk
{
  private final qz a;
  private final Uri b;
  private final qw c;
  private final ly d;
  private final fj<?> e;
  private final un f;
  private final boolean g;
  private final boolean h;
  private final sd i;
  private final Object j;
  private vc k;
  
  static
  {
    bt.a("goog.exo.hls");
  }
  
  private rd(Uri paramUri, qw paramqw, qz paramqz, ly paramly, fj<?> paramfj, un paramun, sd paramsd, boolean paramBoolean1, boolean paramBoolean2, Object paramObject)
  {
    b = paramUri;
    c = paramqw;
    a = paramqz;
    d = paramly;
    e = paramfj;
    f = paramun;
    i = paramsd;
    g = paramBoolean1;
    h = paramBoolean2;
    j = paramObject;
  }
  
  public final mo a(mt parammt, tk paramtk, long paramLong)
  {
    parammt = b(parammt);
    return new ri(a, i, c, k, e, f, parammt, paramtk, d, g, h);
  }
  
  public final void a()
    throws IOException
  {
    i.d();
  }
  
  public final void a(mo parammo)
  {
    ((ri)parammo).g();
  }
  
  public final void a(rx paramrx)
  {
    long l1;
    if (j) {
      l1 = av.a(c);
    } else {
      l1 = -9223372036854775807L;
    }
    int m = a;
    long l2;
    if ((m != 2) && (m != 1)) {
      l2 = -9223372036854775807L;
    } else {
      l2 = l1;
    }
    long l3 = b;
    rb localrb = new rb(i.b(), paramrx);
    long l5;
    if (i.e())
    {
      long l4 = c - i.c();
      if (i) {
        l5 = l4 + m;
      } else {
        l5 = -9223372036854775807L;
      }
      List localList = l;
      if (l3 == -9223372036854775807L) {
        if (localList.isEmpty()) {
          l3 = 0L;
        } else {
          l3 = getmax0size3e;
        }
      }
      paramrx = new oa(l2, l1, l5, m, l4, l3, true, i ^ true, localrb, j);
    }
    else
    {
      if (l3 == -9223372036854775807L) {
        l3 = 0L;
      }
      l5 = m;
      paramrx = new oa(l2, l1, l5, l5, 0L, l3, true, false, localrb, j);
    }
    a(paramrx);
  }
  
  public final void a(vc paramvc)
  {
    k = paramvc;
    paramvc = b(null);
    i.a(b, paramvc, this);
  }
  
  public final void d()
  {
    i.a();
  }
  
  public final Object e()
  {
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */