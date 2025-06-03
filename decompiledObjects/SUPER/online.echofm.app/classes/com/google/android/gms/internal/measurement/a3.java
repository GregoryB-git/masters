package com.google.android.gms.internal.measurement;

import W2.g;
import android.net.Uri;

public final class a3
{
  public final String a;
  public final Uri b;
  public final String c;
  public final String d;
  public final boolean e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final g i;
  
  public a3(Uri paramUri)
  {
    this(null, paramUri, "", "", false, false, false, false, null);
  }
  
  public a3(String paramString1, Uri paramUri, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, g paramg)
  {
    a = paramString1;
    b = paramUri;
    c = paramString2;
    d = paramString3;
    e = paramBoolean1;
    f = paramBoolean2;
    g = paramBoolean3;
    h = paramBoolean4;
    i = paramg;
  }
  
  public final S2 a(String paramString, double paramDouble)
  {
    return S2.c(this, paramString, Double.valueOf(-3.0D), true);
  }
  
  public final S2 b(String paramString, long paramLong)
  {
    return S2.d(this, paramString, Long.valueOf(paramLong), true);
  }
  
  public final S2 c(String paramString1, String paramString2)
  {
    return S2.e(this, paramString1, paramString2, true);
  }
  
  public final S2 d(String paramString, boolean paramBoolean)
  {
    return S2.b(this, paramString, Boolean.valueOf(paramBoolean), true);
  }
  
  public final a3 e()
  {
    return new a3(a, b, c, d, e, f, true, h, i);
  }
  
  public final a3 f()
  {
    if (c.isEmpty())
    {
      g localg = i;
      if (localg == null) {
        return new a3(a, b, c, d, true, f, g, h, localg);
      }
      throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }
    throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.a3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */