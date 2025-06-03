package com.pichillilorenzo.flutter_inappwebview_android.webview;

import io.flutter.plugin.platform.PlatformView;
import java.util.HashMap;

public abstract interface PlatformWebView
  extends PlatformView
{
  public abstract void makeInitialLoad(HashMap<String, Object> paramHashMap);
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */