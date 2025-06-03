package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;

public class WebViewChannelDelegate$PrintRequestCallback
  extends BaseCallbackResultImpl<Boolean>
{
  public Boolean decodeResult(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof Boolean)) && (((Boolean)paramObject).booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.PrintRequestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */