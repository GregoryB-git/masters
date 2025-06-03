package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class vd
  implements tt
{
  private final tt a;
  private long b;
  private Uri c;
  private Map<String, List<String>> d;
  
  public vd(tt paramtt)
  {
    a = ((tt)rp.a(paramtt));
    c = Uri.EMPTY;
    d = Collections.emptyMap();
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt1 = a.a(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      b += paramInt1;
    }
    return paramInt1;
  }
  
  public final long a(tx paramtx)
    throws IOException
  {
    c = a;
    d = Collections.emptyMap();
    long l = a.a(paramtx);
    c = ((Uri)rp.a(a()));
    d = b();
    return l;
  }
  
  public final Uri a()
  {
    return a.a();
  }
  
  public final void a(vc paramvc)
  {
    a.a(paramvc);
  }
  
  public final Map<String, List<String>> b()
  {
    return a.b();
  }
  
  public final void c()
    throws IOException
  {
    a.c();
  }
  
  public final void d()
  {
    b = 0L;
  }
  
  public final long e()
  {
    return b;
  }
  
  public final Uri f()
  {
    return c;
  }
  
  public final Map<String, List<String>> g()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.vd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */