package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;

public class NavigationChannel
{
  private static final String TAG = "NavigationChannel";
  public final MethodChannel channel;
  private final MethodChannel.MethodCallHandler defaultHandler;
  
  public NavigationChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        paramAnonymousResult.success(null);
      }
    };
    defaultHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/navigation", JSONMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  public void popRoute()
  {
    Log.v("NavigationChannel", "Sending message to pop route.");
    channel.invokeMethod("popRoute", null);
  }
  
  public void pushRoute(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending message to push route '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    Log.v("NavigationChannel", localStringBuilder.toString());
    channel.invokeMethod("pushRoute", paramString);
  }
  
  public void pushRouteInformation(String paramString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Sending message to push route information '");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("'");
    Log.v("NavigationChannel", ((StringBuilder)localObject).toString());
    localObject = new HashMap();
    ((HashMap)localObject).put("location", paramString);
    channel.invokeMethod("pushRouteInformation", localObject);
  }
  
  public void setInitialRoute(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending message to set initial route to '");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    Log.v("NavigationChannel", localStringBuilder.toString());
    channel.invokeMethod("setInitialRoute", paramString);
  }
  
  public void setMethodCallHandler(MethodChannel.MethodCallHandler paramMethodCallHandler)
  {
    channel.setMethodCallHandler(paramMethodCallHandler);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.NavigationChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */