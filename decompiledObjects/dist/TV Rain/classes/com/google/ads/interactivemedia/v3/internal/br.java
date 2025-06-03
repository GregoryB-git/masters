package com.google.ads.interactivemedia.v3.internal;

final class br
{
  private cd a;
  private int b;
  private boolean c;
  private int d;
  
  public final void a(int paramInt)
  {
    b += paramInt;
  }
  
  public final boolean a(cd paramcd)
  {
    return (paramcd != a) || (b > 0) || (c);
  }
  
  public final void b(int paramInt)
  {
    boolean bool1 = c;
    boolean bool2 = true;
    if ((bool1) && (d != 4))
    {
      if (paramInt != 4) {
        bool2 = false;
      }
      rp.b(bool2);
      return;
    }
    c = true;
    d = paramInt;
  }
  
  public final void b(cd paramcd)
  {
    a = paramcd;
    b = 0;
    c = false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.br
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */