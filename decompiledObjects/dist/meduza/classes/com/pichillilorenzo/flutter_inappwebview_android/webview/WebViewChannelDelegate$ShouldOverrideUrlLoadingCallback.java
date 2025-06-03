package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;

public class WebViewChannelDelegate$ShouldOverrideUrlLoadingCallback
  extends BaseCallbackResultImpl<NavigationActionPolicy>
{
  public NavigationActionPolicy decodeResult(Object paramObject)
  {
    int i;
    if ((paramObject instanceof Integer)) {
      i = ((Integer)paramObject).intValue();
    } else {
      i = NavigationActionPolicy.CANCEL.rawValue();
    }
    return NavigationActionPolicy.fromValue(Integer.valueOf(i).intValue());
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */