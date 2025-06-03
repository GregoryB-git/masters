package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.WebView.FindListener;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;

class InAppWebView$1
  implements WebView.FindListener
{
  public InAppWebView$1(InAppWebView paramInAppWebView) {}
  
  public void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject = this$0.findInteractionController;
    if (localObject != null)
    {
      localObject = channelDelegate;
      if (localObject != null) {
        ((FindInteractionChannelDelegate)localObject).onFindResultReceived(paramInt1, paramInt2, paramBoolean);
      }
    }
    localObject = this$0.channelDelegate;
    if (localObject != null) {
      ((WebViewChannelDelegate)localObject).onFindResultReceived(paramInt1, paramInt2, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */