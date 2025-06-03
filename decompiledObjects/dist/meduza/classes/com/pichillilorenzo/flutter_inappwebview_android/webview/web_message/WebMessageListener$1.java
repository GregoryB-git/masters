package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.net.Uri;
import android.webkit.WebView;
import c2.a;
import c2.j;
import c2.p.b;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;

class WebMessageListener$1
  implements p.b
{
  public WebMessageListener$1(WebMessageListener paramWebMessageListener) {}
  
  public void onPostMessage(WebView paramWebView, j paramj, Uri paramUri, boolean paramBoolean, a parama)
  {
    paramWebView = this$0;
    replyProxy = parama;
    parama = channelDelegate;
    if (parama != null)
    {
      paramj = WebMessageCompatExt.fromMapWebMessageCompat(paramj);
      if (paramUri.toString().equals("null")) {
        paramWebView = null;
      } else {
        paramWebView = paramUri.toString();
      }
      parama.onPostMessage(paramj, paramWebView, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */