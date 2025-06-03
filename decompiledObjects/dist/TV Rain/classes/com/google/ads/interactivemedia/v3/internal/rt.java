package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

public class rt
  implements se
{
  private final se a;
  private final List<lp> b;
  private final ts c;
  private final int d;
  
  public rt(ts paramts)
  {
    this(paramts, 1);
  }
  
  public rt(ts paramts, int paramInt)
  {
    c = paramts;
    d = 1;
  }
  
  public os a(ux paramux, aaa paramaaa, int paramInt1, int[] paramArrayOfInt, sy paramsy, int paramInt2, long paramLong, boolean paramBoolean, List<bw> paramList, px parampx, vc paramvc)
  {
    tt localtt = c.a();
    if (paramvc != null) {
      localtt.a(paramvc);
    }
    return new po(paramux, paramaaa, paramInt1, paramArrayOfInt, paramsy, paramInt2, localtt, paramLong, d, paramBoolean, paramList, parampx);
  }
  
  public final uy<rz> a()
  {
    return new lm(a.a(), b);
  }
  
  public final uy<rz> a(rw paramrw)
  {
    return new lm(a.a(paramrw), b);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */