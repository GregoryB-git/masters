package com.pichillilorenzo.flutter_inappwebview_android.process_global_config;

import androidx.webkit.ProcessGlobalConfig;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.Map;

public class ProcessGlobalConfigManager
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "ProcessGlobalConfigM";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_processglobalconfig";
  public InAppWebViewFlutterPlugin plugin;
  
  public ProcessGlobalConfigManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_processglobalconfig"));
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
    if (!((String)localObject).equals("apply"))
    {
      paramResult.notImplemented();
    }
    else
    {
      localObject = plugin;
      if ((localObject != null) && (activity != null))
      {
        paramMethodCall = new ProcessGlobalConfigSettings().parse((Map)paramMethodCall.argument("settings"));
        try
        {
          ProcessGlobalConfig.a(paramMethodCall.toProcessGlobalConfig(plugin.activity));
          paramResult.success(Boolean.TRUE);
        }
        catch (Exception paramMethodCall)
        {
          paramResult.error("ProcessGlobalConfigM", "", paramMethodCall);
        }
      }
      else
      {
        paramResult.success(Boolean.FALSE);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.process_global_config.ProcessGlobalConfigManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */