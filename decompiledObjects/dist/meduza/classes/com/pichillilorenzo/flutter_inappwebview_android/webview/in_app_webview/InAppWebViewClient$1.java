package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback;
import g;
import java.util.Map;

class InAppWebViewClient$1
  extends WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback
{
  public InAppWebViewClient$1(InAppWebViewClient paramInAppWebViewClient, InAppWebView paramInAppWebView, String paramString, Map paramMap, boolean paramBoolean) {}
  
  public void defaultBehaviour(NavigationActionPolicy paramNavigationActionPolicy)
  {
    InAppWebViewClient.access$000(this$0, val$webView, val$url, val$headers, val$isForMainFrame);
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "IAWebViewClient");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(NavigationActionPolicy paramNavigationActionPolicy)
  {
    if (InAppWebViewClient.7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[paramNavigationActionPolicy.ordinal()] == 1) {
      InAppWebViewClient.access$000(this$0, val$webView, val$url, val$headers, val$isForMainFrame);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */