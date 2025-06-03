package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.WebView;
import c2.q;
import c2.r;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.RenderProcessResponsiveCallback;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.RenderProcessUnresponsiveCallback;
import g;
import x6.b;

public class InAppWebViewRenderProcessClient
  extends r
{
  public static final String LOG_TAG = "IAWRenderProcessClient";
  
  public void dispose() {}
  
  public void onRenderProcessResponsive(WebView paramWebView, final q paramq)
  {
    paramWebView = (InAppWebView)paramWebView;
    WebViewChannelDelegate.RenderProcessResponsiveCallback local2 = new WebViewChannelDelegate.RenderProcessResponsiveCallback()
    {
      public void defaultBehaviour(Integer paramAnonymousInteger) {}
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        j.t(paramAnonymousString1, paramAnonymousString2, "IAWRenderProcessClient");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(Integer paramAnonymousInteger)
      {
        if (paramq != null)
        {
          if ((paramAnonymousInteger.intValue() == 0) && (b.c0("WEB_VIEW_RENDERER_TERMINATE"))) {
            paramq.a();
          }
          return false;
        }
        return true;
      }
    };
    paramq = channelDelegate;
    if (paramq != null) {
      paramq.onRenderProcessResponsive(paramWebView.getUrl(), local2);
    } else {
      local2.defaultBehaviour(null);
    }
  }
  
  public void onRenderProcessUnresponsive(WebView paramWebView, final q paramq)
  {
    paramWebView = (InAppWebView)paramWebView;
    WebViewChannelDelegate.RenderProcessUnresponsiveCallback local1 = new WebViewChannelDelegate.RenderProcessUnresponsiveCallback()
    {
      public void defaultBehaviour(Integer paramAnonymousInteger) {}
      
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
        if (paramAnonymousString2 == null) {
          paramAnonymousString2 = "";
        }
        j.t(paramAnonymousString1, paramAnonymousString2, "IAWRenderProcessClient");
        defaultBehaviour(null);
      }
      
      public boolean nonNullSuccess(Integer paramAnonymousInteger)
      {
        if (paramq != null)
        {
          if ((paramAnonymousInteger.intValue() == 0) && (b.c0("WEB_VIEW_RENDERER_TERMINATE"))) {
            paramq.a();
          }
          return false;
        }
        return true;
      }
    };
    paramq = channelDelegate;
    if (paramq != null) {
      paramq.onRenderProcessUnresponsive(paramWebView.getUrl(), local1);
    } else {
      local1.defaultBehaviour(null);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */