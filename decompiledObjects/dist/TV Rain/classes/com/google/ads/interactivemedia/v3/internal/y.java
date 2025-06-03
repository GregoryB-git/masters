package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;

public final class y
  extends w
{
  private WebView a;
  private List<e> b;
  private final String c;
  
  public y(List<e> paramList, String paramString)
  {
    b = paramList;
    c = paramString;
  }
  
  public final void a()
  {
    super.a();
    Object localObject = new WebView(o.a().b());
    a = ((WebView)localObject);
    ((WebView)localObject).getSettings().setJavaScriptEnabled(true);
    a(a);
    r.a();
    r.a(a, c);
    localObject = b.iterator();
    if (!((Iterator)localObject).hasNext()) {
      return;
    }
    localObject = (e)((Iterator)localObject).next();
    throw new NoSuchMethodError();
  }
  
  public final void b()
  {
    super.b();
    new Handler().postDelayed(new ab(this), 2000L);
    a = null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */