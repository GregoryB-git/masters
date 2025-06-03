package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class uz<T>
  implements ut
{
  public final tx a;
  public final int b;
  private final vd c;
  private final uy<? extends T> d;
  private volatile T e;
  
  public uz(tt paramtt, Uri paramUri, int paramInt, uy<? extends T> paramuy)
  {
    this(paramtt, new tx(paramUri, 1), paramInt, paramuy);
  }
  
  private uz(tt paramtt, tx paramtx, int paramInt, uy<? extends T> paramuy)
  {
    c = new vd(paramtt);
    a = paramtx;
    b = paramInt;
    d = paramuy;
  }
  
  public final void a() {}
  
  public final void b()
    throws IOException
  {
    c.d();
    tu localtu = new tu(c, a);
    try
    {
      localtu.a();
      Uri localUri = (Uri)rp.a(c.a());
      e = d.a(localUri, localtu);
      return;
    }
    finally
    {
      wl.a(localtu);
    }
  }
  
  public final T c()
  {
    return (T)e;
  }
  
  public final long d()
  {
    return c.e();
  }
  
  public final Uri e()
  {
    return c.f();
  }
  
  public final Map<String, List<String>> f()
  {
    return c.g();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.uz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */