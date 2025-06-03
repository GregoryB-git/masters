package io.flutter.embedding.engine.systemchannels;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import org.json.JSONException;
import org.json.JSONObject;

class LocalizationChannel$1
  implements MethodChannel.MethodCallHandler
{
  public LocalizationChannel$1(LocalizationChannel paramLocalizationChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (LocalizationChannel.access$000(this$0) == null) {
      return;
    }
    String str = method;
    str.getClass();
    if (!str.equals("Localization.getStringResource"))
    {
      paramResult.notImplemented();
    }
    else
    {
      paramMethodCall = (JSONObject)paramMethodCall.arguments();
      try
      {
        str = paramMethodCall.getString("key");
        if (paramMethodCall.has("locale")) {
          paramMethodCall = paramMethodCall.getString("locale");
        } else {
          paramMethodCall = null;
        }
        paramResult.success(LocalizationChannel.access$000(this$0).getStringResource(str, paramMethodCall));
      }
      catch (JSONException paramMethodCall)
      {
        paramResult.error("error", paramMethodCall.getMessage(), null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */