package androidx.webkit;

import android.app.PendingIntent;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c2.d;
import c2.l;
import d2.c;
import d2.g0;
import d2.h0;
import d2.i0;
import d2.j0.a;
import d2.v;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class WebViewClientCompat
  extends WebViewClient
  implements WebViewClientBoundaryInterface
{
  private static final String[] sSupportedFeatures = { "VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT" };
  
  public final String[] getSupportedFeatures()
  {
    return sSupportedFeatures;
  }
  
  public void onPageCommitVisible(WebView paramWebView, String paramString) {}
  
  public final void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceError paramWebResourceError)
  {
    onReceivedError(paramWebView, paramWebResourceRequest, new g0(paramWebResourceError));
  }
  
  public void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, l paraml)
  {
    if ((x6.b.c0("WEB_RESOURCE_ERROR_GET_CODE")) && (x6.b.c0("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) && (d2.b.b(paramWebResourceRequest)))
    {
      Object localObject1 = (g0)paraml;
      localObject1.getClass();
      i0.o.getClass();
      if (a == null)
      {
        localObject2 = j0.a.a;
        InvocationHandler localInvocationHandler = Proxy.getInvocationHandler(b);
        a = ((WebResourceError)((WebkitToCompatConverterBoundaryInterface)b).convertWebResourceError(localInvocationHandler));
      }
      int i = c.f(a);
      Object localObject2 = (g0)paraml;
      i0.n.getClass();
      if (a == null)
      {
        localObject1 = j0.a.a;
        paraml = Proxy.getInvocationHandler(b);
        a = ((WebResourceError)((WebkitToCompatConverterBoundaryInterface)b).convertWebResourceError(paraml));
      }
      onReceivedError(paramWebView, i, c.e(a).toString(), d2.b.a(paramWebResourceRequest).toString());
    }
  }
  
  public final void onReceivedError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, InvocationHandler paramInvocationHandler)
  {
    onReceivedError(paramWebView, paramWebResourceRequest, new g0(paramInvocationHandler));
  }
  
  public void onReceivedHttpError(WebView paramWebView, WebResourceRequest paramWebResourceRequest, WebResourceResponse paramWebResourceResponse) {}
  
  public final void onSafeBrowsingHit(WebView paramWebView, WebResourceRequest paramWebResourceRequest, int paramInt, SafeBrowsingResponse paramSafeBrowsingResponse)
  {
    onSafeBrowsingHit(paramWebView, paramWebResourceRequest, paramInt, new v(paramSafeBrowsingResponse));
  }
  
  public void onSafeBrowsingHit(WebView paramWebView, WebResourceRequest paramWebResourceRequest, int paramInt, d paramd)
  {
    if (x6.b.c0("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"))
    {
      paramd.a(true);
      return;
    }
    throw i0.a();
  }
  
  public final void onSafeBrowsingHit(WebView paramWebView, WebResourceRequest paramWebResourceRequest, int paramInt, InvocationHandler paramInvocationHandler)
  {
    onSafeBrowsingHit(paramWebView, paramWebResourceRequest, paramInt, new v(paramInvocationHandler));
  }
  
  public boolean onWebAuthnIntent(WebView paramWebView, PendingIntent paramPendingIntent, InvocationHandler paramInvocationHandler)
  {
    return false;
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    return shouldOverrideUrlLoading(paramWebView, d2.b.a(paramWebResourceRequest).toString());
  }
}

/* Location:
 * Qualified Name:     androidx.webkit.WebViewClientCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */