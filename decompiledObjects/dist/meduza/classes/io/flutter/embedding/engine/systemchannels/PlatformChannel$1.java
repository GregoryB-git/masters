package io.flutter.embedding.engine.systemchannels;

import f;
import io.flutter.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class PlatformChannel$1
  implements MethodChannel.MethodCallHandler
{
  public PlatformChannel$1(PlatformChannel paramPlatformChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (PlatformChannel.access$000(this$0) == null) {
      return;
    }
    Object localObject1 = method;
    Object localObject2 = arguments;
    paramMethodCall = new StringBuilder();
    paramMethodCall.append("Received '");
    paramMethodCall.append((String)localObject1);
    paramMethodCall.append("' message.");
    Log.v("PlatformChannel", paramMethodCall.toString());
    int i = -1;
    try
    {
      boolean bool;
      switch (((String)localObject1).hashCode())
      {
      default: 
        break;
      case 2119655719: 
        if (((String)localObject1).equals("SystemChrome.setPreferredOrientations")) {
          i = 2;
        }
        break;
      case 1674312266: 
        if (((String)localObject1).equals("SystemChrome.setEnabledSystemUIOverlays")) {
          i = 4;
        }
        break;
      case 1514180520: 
        if (((String)localObject1).equals("Clipboard.getData")) {
          i = 11;
        }
        break;
      case 1390477857: 
        if (((String)localObject1).equals("SystemChrome.setSystemUIOverlayStyle")) {
          i = 8;
        }
        break;
      case 1128339786: 
        if (((String)localObject1).equals("SystemChrome.setEnabledSystemUIMode")) {
          i = 5;
        }
        break;
      case 875995648: 
        if (((String)localObject1).equals("Clipboard.hasStrings")) {
          i = 13;
        }
        break;
      case 241845679: 
        if (((String)localObject1).equals("SystemChrome.restoreSystemUIOverlays")) {
          i = 7;
        }
        break;
      case -215273374: 
        if (((String)localObject1).equals("SystemSound.play")) {
          i = 0;
        }
        break;
      case -247230243: 
        if (((String)localObject1).equals("HapticFeedback.vibrate")) {
          i = 1;
        }
        break;
      case -548468504: 
        if (((String)localObject1).equals("SystemChrome.setApplicationSwitcherDescription")) {
          i = 3;
        }
        break;
      case -577225884: 
        if (((String)localObject1).equals("SystemChrome.setSystemUIChangeListener")) {
          i = 6;
        }
        break;
      case -720677196: 
        if (((String)localObject1).equals("Clipboard.setData")) {
          i = 12;
        }
        break;
      case -766342101: 
        if (((String)localObject1).equals("SystemNavigator.pop")) {
          i = 10;
        }
        break;
      case -931781241: 
        if (((String)localObject1).equals("Share.invoke")) {
          i = 14;
        }
        break;
      case -1501580720: 
        bool = ((String)localObject1).equals("SystemNavigator.setFrameworkHandlesBack");
        if (bool) {
          i = 9;
        }
        break;
      }
      switch (i)
      {
      default: 
        paramResult.notImplemented();
        break;
      case 14: 
        paramMethodCall = (String)localObject2;
        PlatformChannel.access$000(this$0).share(paramMethodCall);
        break;
      case 13: 
        bool = PlatformChannel.access$000(this$0).clipboardHasStrings();
        paramMethodCall = new org/json/JSONObject;
        paramMethodCall.<init>();
        paramMethodCall.put("value", bool);
        paramResult.success(paramMethodCall);
        break;
      case 12: 
        paramMethodCall = ((JSONObject)localObject2).getString("text");
        PlatformChannel.access$000(this$0).setClipboardData(paramMethodCall);
        break;
      case 11: 
        localObject1 = (String)localObject2;
        if (localObject1 != null) {
          try
          {
            paramMethodCall = PlatformChannel.ClipboardContentFormat.fromValue((String)localObject1);
          }
          catch (NoSuchFieldException paramMethodCall)
          {
            paramMethodCall = new java/lang/StringBuilder;
            paramMethodCall.<init>();
            paramMethodCall.append("No such clipboard content format: ");
            paramMethodCall.append((String)localObject1);
            paramResult.error("error", paramMethodCall.toString(), null);
          }
        } else {
          paramMethodCall = null;
        }
        paramMethodCall = PlatformChannel.access$000(this$0).getClipboardData(paramMethodCall);
        if (paramMethodCall != null)
        {
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>();
          ((JSONObject)localObject1).put("text", paramMethodCall);
          paramResult.success(localObject1);
        }
        break;
      case 10: 
        PlatformChannel.access$000(this$0).popSystemNavigator();
        break;
      case 9: 
        bool = ((Boolean)localObject2).booleanValue();
        PlatformChannel.access$000(this$0).setFrameworkHandlesBack(bool);
        break;
      case 8: 
        try
        {
          paramMethodCall = PlatformChannel.access$500(this$0, (JSONObject)localObject2);
          PlatformChannel.access$000(this$0).setSystemUiOverlayStyle(paramMethodCall);
          paramResult.success(null);
        }
        catch (NoSuchFieldException paramMethodCall) {}catch (JSONException paramMethodCall) {}
      }
      for (;;)
      {
        paramMethodCall = paramMethodCall.getMessage();
        break;
        PlatformChannel.access$000(this$0).restoreSystemUiOverlays();
        break label828;
        PlatformChannel.access$000(this$0).setSystemUiChangeListener();
        label828:
        paramResult.success(null);
        return;
        try
        {
          paramMethodCall = PlatformChannel.access$400(this$0, (String)localObject2);
          PlatformChannel.access$000(this$0).showSystemUiMode(paramMethodCall);
          paramResult.success(null);
        }
        catch (NoSuchFieldException paramMethodCall)
        {
          continue;
        }
        catch (JSONException paramMethodCall) {}
        continue;
        try
        {
          paramMethodCall = PlatformChannel.access$300(this$0, (JSONArray)localObject2);
          PlatformChannel.access$000(this$0).showSystemOverlays(paramMethodCall);
          paramResult.success(null);
        }
        catch (NoSuchFieldException paramMethodCall)
        {
          continue;
        }
        catch (JSONException paramMethodCall) {}
        continue;
        try
        {
          paramMethodCall = PlatformChannel.access$200(this$0, (JSONObject)localObject2);
          PlatformChannel.access$000(this$0).setApplicationSwitcherDescription(paramMethodCall);
          paramResult.success(null);
        }
        catch (JSONException paramMethodCall) {}
        continue;
        try
        {
          i = PlatformChannel.access$100(this$0, (JSONArray)localObject2);
          PlatformChannel.access$000(this$0).setPreferredOrientations(i);
          paramResult.success(null);
        }
        catch (NoSuchFieldException paramMethodCall)
        {
          continue;
        }
        catch (JSONException paramMethodCall) {}
        continue;
        try
        {
          paramMethodCall = PlatformChannel.HapticFeedbackType.fromValue((String)localObject2);
          PlatformChannel.access$000(this$0).vibrateHapticFeedback(paramMethodCall);
          paramResult.success(null);
        }
        catch (NoSuchFieldException paramMethodCall) {}
        continue;
        try
        {
          paramMethodCall = PlatformChannel.SoundType.fromValue((String)localObject2);
          PlatformChannel.access$000(this$0).playSystemSound(paramMethodCall);
          paramResult.success(null);
        }
        catch (NoSuchFieldException paramMethodCall) {}
      }
      paramResult.error("error", paramMethodCall, null);
    }
    catch (JSONException paramMethodCall)
    {
      localObject1 = f.l("JSON error: ");
      ((StringBuilder)localObject1).append(paramMethodCall.getMessage());
      paramResult.error("error", ((StringBuilder)localObject1).toString(), null);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */