package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;

public final class rc
{
  private final qw a;
  private qz b;
  private se c;
  private sg d;
  private ly e;
  private fj<?> f;
  private un g;
  
  private rc(qw paramqw)
  {
    a = ((qw)rp.a(paramqw));
    c = new rp();
    d = rs.a;
    b = qz.a;
    f = h.h();
    g = new un();
    e = new ly();
  }
  
  public rc(ts paramts)
  {
    this(new qw(paramts));
  }
  
  public final rd a(Uri paramUri)
  {
    qw localqw = a;
    qz localqz = b;
    ly locally = e;
    fj localfj = f;
    un localun = g;
    return new rd(paramUri, localqw, localqz, locally, localfj, localun, d.a(localqw, localun, c), false, false, null, (byte)0);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */