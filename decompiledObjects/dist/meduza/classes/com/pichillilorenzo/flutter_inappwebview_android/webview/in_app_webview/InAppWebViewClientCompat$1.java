package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback;
import g;
import java.util.Map;

class InAppWebViewClientCompat$1
  extends WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback
{
  public InAppWebViewClientCompat$1(InAppWebViewClientCompat paramInAppWebViewClientCompat, InAppWebView paramInAppWebView, String paramString, Map paramMap, boolean paramBoolean) {}
  
  public void defaultBehaviour(NavigationActionPolicy paramNavigationActionPolicy)
  {
    InAppWebViewClientCompat.access$000(this$0, val$webView, val$url, val$headers, val$isForMainFrame);
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "IAWebViewClientCompat");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(NavigationActionPolicy paramNavigationActionPolicy)
  {
    if (InAppWebViewClientCompat.7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[paramNavigationActionPolicy.ordinal()] == 1) {
      InAppWebViewClientCompat.access$000(this$0, val$webView, val$url, val$headers, val$isForMainFrame);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */