package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.impl.data.b;

public final class afp
{
  private b a;
  private final WebView b;
  private final ViewGroup c;
  
  public afp(WebView paramWebView, ViewGroup paramViewGroup)
  {
    b = paramWebView;
    c = paramViewGroup;
  }
  
  @Deprecated
  public final void a()
  {
    b.setVisibility(4);
    a = null;
  }
  
  @Deprecated
  public final void a(b paramb)
  {
    if (a != null) {
      b();
    }
    if (paramb.isLinear())
    {
      a = paramb;
      paramb = (ViewGroup)b.getParent();
      if (paramb != null)
      {
        b.setVisibility(4);
        paramb.removeView(b);
      }
      c.addView(b, new ViewGroup.LayoutParams(-1, -1));
      b.setVisibility(0);
    }
  }
  
  @Deprecated
  public final void b()
  {
    a();
    c.removeView(b);
  }
  
  public final void c()
  {
    int i;
    if ((ViewGroup)b.getParent() != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      c.addView(b, new ViewGroup.LayoutParams(-1, -1));
    }
    b.setVisibility(0);
    c.bringChildToFront(b);
  }
  
  public final void d()
  {
    b.setVisibility(4);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */