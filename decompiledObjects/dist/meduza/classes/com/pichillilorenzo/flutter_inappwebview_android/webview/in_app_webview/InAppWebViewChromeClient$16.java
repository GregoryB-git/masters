package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.CreateWindowCallback;
import g;
import java.util.Map;

class InAppWebViewChromeClient$16
  extends WebViewChannelDelegate.CreateWindowCallback
{
  public InAppWebViewChromeClient$16(InAppWebViewChromeClient paramInAppWebViewChromeClient, int paramInt) {}
  
  public void defaultBehaviour(Boolean paramBoolean)
  {
    paramBoolean = this$0.plugin;
    if (paramBoolean != null)
    {
      paramBoolean = inAppWebViewManager;
      if (paramBoolean != null) {
        windowWebViewMessages.remove(Integer.valueOf(val$finalWindowId));
      }
    }
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "IABWebChromeClient");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(Boolean paramBoolean)
  {
    return paramBoolean.booleanValue() ^ true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.16
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */