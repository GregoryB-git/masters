package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;

class InAppWebView$DownloadStartListener
  implements DownloadListener
{
  public InAppWebView$DownloadStartListener(InAppWebView paramInAppWebView) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    paramString1 = new DownloadStartRequest(paramString1, paramString2, paramString3, paramString4, paramLong, URLUtil.guessFileName(paramString1, paramString3, paramString4), null);
    paramString2 = this$0.channelDelegate;
    if (paramString2 != null) {
      paramString2.onDownloadStartRequest(paramString1);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.DownloadStartListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */