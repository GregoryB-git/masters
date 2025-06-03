package io.flutter.embedding.engine.systemchannels;

import android.window.BackEvent;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackGestureChannel
{
  private static final String TAG = "BackGestureChannel";
  public final MethodChannel channel;
  private final MethodChannel.MethodCallHandler defaultHandler;
  
  public BackGestureChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        paramAnonymousResult.success(null);
      }
    };
    defaultHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/backgesture", StandardMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  private Map<String, Object> backEventToJsonMap(BackEvent paramBackEvent)
  {
    HashMap localHashMap = new HashMap(3);
    float f1 = paramBackEvent.getTouchX();
    float f2 = paramBackEvent.getTouchY();
    List localList;
    if ((!Float.isNaN(f1)) && (!Float.isNaN(f2))) {
      localList = Arrays.asList(new Float[] { Float.valueOf(f1), Float.valueOf(f2) });
    } else {
      localList = null;
    }
    localHashMap.put("touchOffset", localList);
    localHashMap.put("progress", Float.valueOf(paramBackEvent.getProgress()));
    localHashMap.put("swipeEdge", Integer.valueOf(paramBackEvent.getSwipeEdge()));
    return localHashMap;
  }
  
  public void cancelBackGesture()
  {
    Log.v("BackGestureChannel", "Sending message to cancel back gesture");
    channel.invokeMethod("cancelBackGesture", null);
  }
  
  public void commitBackGesture()
  {
    Log.v("BackGestureChannel", "Sending message to commit back gesture");
    channel.invokeMethod("commitBackGesture", null);
  }
  
  public void setMethodCallHandler(MethodChannel.MethodCallHandler paramMethodCallHandler)
  {
    channel.setMethodCallHandler(paramMethodCallHandler);
  }
  
  public void startBackGesture(BackEvent paramBackEvent)
  {
    Log.v("BackGestureChannel", "Sending message to start back gesture");
    channel.invokeMethod("startBackGesture", backEventToJsonMap(paramBackEvent));
  }
  
  public void updateBackGestureProgress(BackEvent paramBackEvent)
  {
    Log.v("BackGestureChannel", "Sending message to update back gesture progress");
    channel.invokeMethod("updateBackGestureProgress", backEventToJsonMap(paramBackEvent));
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.BackGestureChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */