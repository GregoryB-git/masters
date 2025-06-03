package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import c2.d;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.SafeBrowsingHitCallback;
import d2.a;
import d2.a.f;
import d2.i0;
import d2.v;
import g;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import x6.b;

class InAppWebViewClientCompat$5
  extends WebViewChannelDelegate.SafeBrowsingHitCallback
{
  public InAppWebViewClientCompat$5(InAppWebViewClientCompat paramInAppWebViewClientCompat, d paramd, WebView paramWebView, WebResourceRequest paramWebResourceRequest, int paramInt) {}
  
  public void defaultBehaviour(SafeBrowsingResponse paramSafeBrowsingResponse)
  {
    InAppWebViewClientCompat.access$601(this$0, val$view, val$request, val$threatType, val$callback);
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    a0.j.t(paramString1, paramString2, "IAWebViewClientCompat");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(SafeBrowsingResponse paramSafeBrowsingResponse)
  {
    Object localObject = paramSafeBrowsingResponse.getAction();
    if (localObject != null)
    {
      boolean bool = paramSafeBrowsingResponse.isReport();
      int i = ((Integer)localObject).intValue();
      if (i != 0)
      {
        if (i != 1)
        {
          if (b.c0("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            val$callback.a(bool);
          } else {
            return true;
          }
        }
        else if (b.c0("SAFE_BROWSING_RESPONSE_PROCEED"))
        {
          paramSafeBrowsingResponse = (v)val$callback;
          paramSafeBrowsingResponse.getClass();
          localObject = i0.q;
          if (((a.f)localObject).c()) {
            d2.j.c(paramSafeBrowsingResponse.c(), bool);
          } else if (((a)localObject).d()) {
            paramSafeBrowsingResponse.b().proceed(bool);
          } else {
            throw i0.a();
          }
        }
        else
        {
          return true;
        }
      }
      else
      {
        if (!b.c0("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY")) {
          break label187;
        }
        paramSafeBrowsingResponse = (v)val$callback;
        paramSafeBrowsingResponse.getClass();
        localObject = i0.p;
        if (((a.f)localObject).c())
        {
          d2.j.a(paramSafeBrowsingResponse.c(), bool);
        }
        else
        {
          if (!((a)localObject).d()) {
            break label183;
          }
          paramSafeBrowsingResponse.b().backToSafety(bool);
        }
      }
      return false;
      label183:
      throw i0.a();
    }
    label187:
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */