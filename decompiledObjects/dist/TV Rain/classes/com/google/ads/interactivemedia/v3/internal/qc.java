package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

public abstract class qc
{
  public final bw a;
  public final String b;
  public final long c;
  public final List<pz> d;
  private final qd e;
  
  private qc(long paramLong, bw parambw, String paramString, qh paramqh, List<pz> paramList)
  {
    a = parambw;
    b = paramString;
    if (paramList == null) {
      parambw = Collections.emptyList();
    } else {
      parambw = Collections.unmodifiableList(paramList);
    }
    d = parambw;
    e = paramqh.a(this);
    c = wl.c(f, 1000000L, e);
  }
  
  public final qd c()
  {
    return e;
  }
  
  public abstract qd d();
  
  public abstract pp e();
  
  public abstract String f();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */