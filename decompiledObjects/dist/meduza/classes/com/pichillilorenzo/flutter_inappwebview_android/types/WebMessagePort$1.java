package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.ValueCallback;

class WebMessagePort$1
  implements ValueCallback<String>
{
  public void onReceiveValue(String paramString)
  {
    paramString = val$callback;
    if (paramString != null) {
      paramString.onReceiveValue(null);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */