package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import c2.j;
import c2.k;
import c2.k.a;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;

class WebMessageChannel$2
  extends k.a
{
  public WebMessageChannel$2(WebMessageChannel paramWebMessageChannel1, WebMessageChannel paramWebMessageChannel2, int paramInt) {}
  
  public void onMessage(k paramk, j paramj)
  {
    super.onMessage(paramk, paramj);
    WebMessageChannel localWebMessageChannel = val$webMessageChannel;
    int i = val$index;
    if (paramj != null) {
      paramk = WebMessageCompatExt.fromMapWebMessageCompat(paramj);
    } else {
      paramk = null;
    }
    localWebMessageChannel.onMessage(i, paramk);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */