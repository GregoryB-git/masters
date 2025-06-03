package com.google.ads.interactivemedia.v3.internal;

public final class tg
{
  public final int a;
  public final cl[] b;
  public final td c;
  public final Object d;
  
  public tg(cl[] paramArrayOfcl, sy[] paramArrayOfsy, Object paramObject)
  {
    b = paramArrayOfcl;
    c = new td(paramArrayOfsy);
    d = paramObject;
    a = paramArrayOfcl.length;
  }
  
  public final boolean a(int paramInt)
  {
    return b[paramInt] != null;
  }
  
  public final boolean a(tg paramtg, int paramInt)
  {
    if (paramtg == null) {
      return false;
    }
    return (wl.a(b[paramInt], b[paramInt])) && (wl.a(c.a(paramInt), c.a(paramInt)));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.tg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */