package com.google.ads.interactivemedia.v3.internal;

public class uj
  implements ts
{
  private final uk a = new uk();
  private final String b;
  private final vc c;
  private final int d;
  private final int e;
  private final boolean f;
  
  public uj() {}
  
  public uj(String paramString, vc paramvc)
  {
    this(paramString, paramvc, 8000, 8000, false);
  }
  
  public uj(String paramString, vc paramvc, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this();
    b = rp.a(paramString);
    c = paramvc;
    d = 8000;
    e = 8000;
    f = false;
  }
  
  public uc b(uk paramuk)
  {
    paramuk = new uc(b, d, e, f, paramuk);
    vc localvc = c;
    if (localvc != null) {
      paramuk.a(localvc);
    }
    return paramuk;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.uj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */