package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import c2.q;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.RenderProcessResponsiveCallback;
import g;
import x6.b;

class InAppWebViewRenderProcessClient$2
  extends WebViewChannelDelegate.RenderProcessResponsiveCallback
{
  public InAppWebViewRenderProcessClient$2(InAppWebViewRenderProcessClient paramInAppWebViewRenderProcessClient, q paramq) {}
  
  public void defaultBehaviour(Integer paramInteger) {}
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "IAWRenderProcessClient");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(Integer paramInteger)
  {
    if (val$renderer != null)
    {
      if ((paramInteger.intValue() == 0) && (b.c0("WEB_VIEW_RENDERER_TERMINATE"))) {
        val$renderer.a();
      }
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */