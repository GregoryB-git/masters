package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

final class ab
  implements Runnable
{
  private WebView a;
  
  public ab(y paramy)
  {
    a = y.a(paramy);
  }
  
  public final void run()
  {
    a.destroy();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */