package com.pichillilorenzo.flutter_inappwebview_android;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import x6.b;

public class WebViewFeatureManager
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "WebViewFeatureManager";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webviewfeature";
  public InAppWebViewFlutterPlugin plugin;
  
  public WebViewFeatureManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_webviewfeature"));
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public void dispose()
  {
    super.dispose();
    plugin = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = method;
    localObject.getClass();
    if (!((String)localObject).equals("isStartupFeatureSupported")) {
      if (!((String)localObject).equals("isFeatureSupported"))
      {
        paramResult.notImplemented();
        return;
      }
    }
    for (boolean bool = b.c0((String)paramMethodCall.argument("feature"));; bool = b.e0(plugin.activity, paramMethodCall))
    {
      paramResult.success(Boolean.valueOf(bool));
      break;
      localObject = plugin;
      if ((localObject == null) || (activity == null)) {
        break;
      }
      paramMethodCall = (String)paramMethodCall.argument("startupFeature");
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.WebViewFeatureManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */