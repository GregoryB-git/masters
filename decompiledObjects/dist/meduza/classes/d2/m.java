package d2;

import aa.u;
import aa.v;
import aa.w;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import c2.r;
import java.util.concurrent.Executor;

public final class m
{
  @Deprecated
  public static int a(WebSettings paramWebSettings)
  {
    return w.b(paramWebSettings);
  }
  
  public static WebViewRenderProcess b(WebView paramWebView)
  {
    return v.g(paramWebView);
  }
  
  public static WebViewRenderProcessClient c(WebView paramWebView)
  {
    return v.h(paramWebView);
  }
  
  @Deprecated
  public static void d(WebSettings paramWebSettings, int paramInt)
  {
    w.o(paramWebSettings, paramInt);
  }
  
  public static void e(WebView paramWebView, r paramr)
  {
    if (paramr != null) {
      paramr = new m0(paramr);
    } else {
      paramr = null;
    }
    u.o(paramWebView, paramr);
  }
  
  public static void f(WebView paramWebView, Executor paramExecutor, r paramr)
  {
    if (paramr != null) {
      paramr = new m0(paramr);
    } else {
      paramr = null;
    }
    u.p(paramWebView, paramExecutor, paramr);
  }
  
  public static boolean g(WebViewRenderProcess paramWebViewRenderProcess)
  {
    return paramWebViewRenderProcess.terminate();
  }
}

/* Location:
 * Qualified Name:     d2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */