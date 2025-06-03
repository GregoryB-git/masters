package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;

public final class nr
  extends mq
  implements nn
{
  private final Uri a;
  private final ts b;
  private final gb c;
  private final fj<?> d;
  private final un e;
  private final String f;
  private final int g;
  private final Object h;
  private long i;
  private boolean j;
  private vc k;
  
  public nr(Uri paramUri, ts paramts, gb paramgb, fj<?> paramfj, un paramun, String paramString, int paramInt, Object paramObject)
  {
    a = paramUri;
    b = paramts;
    c = paramgb;
    d = paramfj;
    e = paramun;
    f = paramString;
    g = paramInt;
    i = -9223372036854775807L;
    h = paramObject;
  }
  
  private final void b(long paramLong, boolean paramBoolean)
  {
    i = paramLong;
    j = paramBoolean;
    a(new oa(i, j, false, null, h));
  }
  
  public final mo a(mt parammt, tk paramtk, long paramLong)
  {
    tt localtt = b.a();
    vc localvc = k;
    if (localvc != null) {
      localtt.a(localvc);
    }
    return new nj(a, localtt, c.a(), d, e, b(parammt), this, paramtk, f, g);
  }
  
  public final void a()
    throws IOException
  {}
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    long l = paramLong;
    if (paramLong == -9223372036854775807L) {
      l = i;
    }
    if ((i == l) && (j == paramBoolean)) {
      return;
    }
    b(l, paramBoolean);
  }
  
  public final void a(mo parammo)
  {
    ((nj)parammo).f();
  }
  
  public final void a(vc paramvc)
  {
    k = paramvc;
    b(i, j);
  }
  
  public final void d() {}
  
  public final Object e()
  {
    return h;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.nr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */