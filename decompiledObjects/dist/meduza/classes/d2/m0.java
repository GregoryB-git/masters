package d2;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import c2.r;
import java.util.WeakHashMap;

public final class m0
  extends WebViewRenderProcessClient
{
  public r a;
  
  public m0(r paramr)
  {
    a = paramr;
  }
  
  public final void onRenderProcessResponsive(WebView paramWebView, WebViewRenderProcess paramWebViewRenderProcess)
  {
    r localr = a;
    WeakHashMap localWeakHashMap = o0.c;
    o0 localo0 = (o0)localWeakHashMap.get(paramWebViewRenderProcess);
    if (localo0 != null)
    {
      paramWebViewRenderProcess = localo0;
    }
    else
    {
      localo0 = new o0(paramWebViewRenderProcess);
      localWeakHashMap.put(paramWebViewRenderProcess, localo0);
      paramWebViewRenderProcess = localo0;
    }
    localr.onRenderProcessResponsive(paramWebView, paramWebViewRenderProcess);
  }
  
  public final void onRenderProcessUnresponsive(WebView paramWebView, WebViewRenderProcess paramWebViewRenderProcess)
  {
    r localr = a;
    WeakHashMap localWeakHashMap = o0.c;
    o0 localo0 = (o0)localWeakHashMap.get(paramWebViewRenderProcess);
    if (localo0 != null)
    {
      paramWebViewRenderProcess = localo0;
    }
    else
    {
      localo0 = new o0(paramWebViewRenderProcess);
      localWeakHashMap.put(paramWebViewRenderProcess, localo0);
      paramWebViewRenderProcess = localo0;
    }
    localr.onRenderProcessUnresponsive(paramWebView, paramWebViewRenderProcess);
  }
}

/* Location:
 * Qualified Name:     d2.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */