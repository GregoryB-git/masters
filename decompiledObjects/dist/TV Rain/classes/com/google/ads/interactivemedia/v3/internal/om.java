package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class om
  implements gi
{
  public bw a;
  private final int b;
  private final int c;
  private final bw d;
  private final fx e;
  private gi f;
  private long g;
  
  public om(int paramInt1, int paramInt2, bw parambw)
  {
    b = paramInt1;
    c = paramInt2;
    d = parambw;
    e = new fx();
  }
  
  public final int a(fz paramfz, int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    return f.a(paramfz, paramInt, paramBoolean);
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, gl paramgl)
  {
    long l = g;
    if ((l != -9223372036854775807L) && (paramLong >= l)) {
      f = e;
    }
    f.a(paramLong, paramInt1, paramInt2, paramInt3, paramgl);
  }
  
  public final void a(bw parambw)
  {
    bw localbw1 = d;
    bw localbw2 = parambw;
    if (localbw1 != null) {
      localbw2 = parambw.a(localbw1);
    }
    a = localbw2;
    f.a(localbw2);
  }
  
  public final void a(op paramop, long paramLong)
  {
    if (paramop == null)
    {
      f = e;
      return;
    }
    g = paramLong;
    paramop = paramop.a(c);
    f = paramop;
    bw localbw = a;
    if (localbw != null) {
      paramop.a(localbw);
    }
  }
  
  public final void a(vy paramvy, int paramInt)
  {
    f.a(paramvy, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.om
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */