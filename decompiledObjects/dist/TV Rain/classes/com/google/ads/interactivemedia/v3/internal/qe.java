package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.List;

public final class qe
  extends qc
{
  private final String e;
  private final qd f;
  private final qn g;
  
  public qe(long paramLong1, bw parambw, String paramString1, qk paramqk, List<pz> paramList, String paramString2, long paramLong2)
  {
    super(paramLong1, parambw, paramString1, paramqk, paramList, (byte)0);
    Uri.parse(paramString1);
    paramLong1 = b;
    paramString1 = null;
    if (paramLong1 <= 0L) {
      parambw = null;
    } else {
      parambw = new qd(null, a, paramLong1);
    }
    f = parambw;
    e = paramString2;
    if (parambw != null) {
      parambw = paramString1;
    } else {
      parambw = new qn(new qd(null, 0L, -1L));
    }
    g = parambw;
  }
  
  public final qd d()
  {
    return f;
  }
  
  public final pp e()
  {
    return g;
  }
  
  public final String f()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */