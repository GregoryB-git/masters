package com.facebook.core.internal.logging.dumpsys;

import android.webkit.ValueCallback;
import java.util.Map;

class WebViewDumpHelper$1
  implements ValueCallback<String>
{
  public WebViewDumpHelper$1(WebViewDumpHelper paramWebViewDumpHelper, WebViewDumpHelper.WebViewData paramWebViewData) {}
  
  public void onReceiveValue(String paramString)
  {
    WebViewDumpHelper.access$000(this$0).put(val$data.key, paramString);
  }
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.WebViewDumpHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */