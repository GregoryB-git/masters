package com.pichillilorenzo.flutter_inappwebview_android;

import android.webkit.ValueCallback;
import io.flutter.plugin.common.MethodChannel.Result;

class MyWebStorage$3
  implements ValueCallback<Long>
{
  public void onReceiveValue(Long paramLong)
  {
    val$result.success(paramLong);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */