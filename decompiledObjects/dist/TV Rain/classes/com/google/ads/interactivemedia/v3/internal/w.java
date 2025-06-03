package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.Reference;

public class w
{
  private as a;
  private z b;
  private long c;
  
  public w()
  {
    e();
    a = new as(null);
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  public w(WebView paramWebView)
  {
    this();
    if ((paramWebView != null) && (!paramWebView.getSettings().getJavaScriptEnabled())) {
      paramWebView.getSettings().setJavaScriptEnabled(true);
    }
    a(paramWebView);
  }
  
  public void a() {}
  
  public final void a(float paramFloat)
  {
    r.a().a(c(), paramFloat);
  }
  
  public final void a(WebView paramWebView)
  {
    a = new as(paramWebView);
  }
  
  public final void a(String paramString, long paramLong)
  {
    if (paramLong >= c)
    {
      b = z.b;
      r.a().b(c(), paramString);
    }
  }
  
  public void b()
  {
    a.clear();
  }
  
  public final void b(String paramString, long paramLong)
  {
    if (paramLong >= c)
    {
      z localz1 = b;
      z localz2 = z.c;
      if (localz1 != localz2)
      {
        b = localz2;
        r.a().b(c(), paramString);
      }
    }
  }
  
  public final WebView c()
  {
    return (WebView)a.get();
  }
  
  public final boolean d()
  {
    return a.get() != null;
  }
  
  public final void e()
  {
    c = h.f();
    b = z.a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */