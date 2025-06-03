package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import java.util.Map;

public class WebViewChannelDelegate$JsPromptCallback
  extends BaseCallbackResultImpl<JsPromptResponse>
{
  public JsPromptResponse decodeResult(Object paramObject)
  {
    return JsPromptResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsPromptCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */