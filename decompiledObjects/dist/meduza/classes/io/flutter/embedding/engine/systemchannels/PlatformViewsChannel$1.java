package io.flutter.embedding.engine.systemchannels;

import f;
import io.flutter.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

class PlatformViewsChannel$1
  implements MethodChannel.MethodCallHandler
{
  public PlatformViewsChannel$1(PlatformViewsChannel paramPlatformViewsChannel) {}
  
  private void clearFocus(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    int i = ((Integer)paramMethodCall.arguments()).intValue();
    try
    {
      PlatformViewsChannel.access$000(this$0).clearFocus(i);
      paramResult.success(null);
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", PlatformViewsChannel.access$100(paramMethodCall), null);
    }
  }
  
  private void create(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Map localMap = (Map)paramMethodCall.arguments();
    boolean bool = localMap.containsKey("hybrid");
    int i = 1;
    int j;
    if ((bool) && (((Boolean)localMap.get("hybrid")).booleanValue())) {
      j = 1;
    } else {
      j = 0;
    }
    if (localMap.containsKey("params")) {
      paramMethodCall = ByteBuffer.wrap((byte[])localMap.get("params"));
    } else {
      paramMethodCall = null;
    }
    if (j != 0) {}
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = new io/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewCreationRequest;
        ((PlatformViewsChannel.PlatformViewCreationRequest)localObject).<init>(((Integer)localMap.get("id")).intValue(), (String)localMap.get("viewType"), 0.0D, 0.0D, 0.0D, 0.0D, ((Integer)localMap.get("direction")).intValue(), PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, paramMethodCall);
        PlatformViewsChannel.access$000(this$0).createForPlatformViewLayer((PlatformViewsChannel.PlatformViewCreationRequest)localObject);
        paramResult.success(null);
      }
      catch (IllegalStateException paramMethodCall)
      {
        break;
      }
      if ((localMap.containsKey("hybridFallback")) && (((Boolean)localMap.get("hybridFallback")).booleanValue())) {
        j = i;
      } else {
        j = 0;
      }
      if (j != 0) {
        localObject = PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK;
      } else {
        localObject = PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK;
      }
      PlatformViewsChannel.PlatformViewCreationRequest localPlatformViewCreationRequest = new io/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewCreationRequest;
      i = ((Integer)localMap.get("id")).intValue();
      String str = (String)localMap.get("viewType");
      bool = localMap.containsKey("top");
      double d1 = 0.0D;
      double d2;
      if (bool) {
        d2 = ((Double)localMap.get("top")).doubleValue();
      } else {
        d2 = 0.0D;
      }
      if (localMap.containsKey("left")) {
        d1 = ((Double)localMap.get("left")).doubleValue();
      }
      localPlatformViewCreationRequest.<init>(i, str, d2, d1, ((Double)localMap.get("width")).doubleValue(), ((Double)localMap.get("height")).doubleValue(), ((Integer)localMap.get("direction")).intValue(), (PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode)localObject, paramMethodCall);
      long l = PlatformViewsChannel.access$000(this$0).createForTextureLayer(localPlatformViewCreationRequest);
      if (l == -2L)
      {
        if (j == 0)
        {
          paramMethodCall = new java/lang/AssertionError;
          paramMethodCall.<init>("Platform view attempted to fall back to hybrid mode when not requested.");
          throw paramMethodCall;
        }
      }
      else
      {
        paramResult.success(Long.valueOf(l));
        return;
      }
    }
    paramResult.error("error", PlatformViewsChannel.access$100(paramMethodCall), null);
  }
  
  private void dispose(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    int i = ((Integer)((Map)paramMethodCall.arguments()).get("id")).intValue();
    try
    {
      PlatformViewsChannel.access$000(this$0).dispose(i);
      paramResult.success(null);
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", PlatformViewsChannel.access$100(paramMethodCall), null);
    }
  }
  
  private void offset(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    paramMethodCall = (Map)paramMethodCall.arguments();
    try
    {
      PlatformViewsChannel.access$000(this$0).offset(((Integer)paramMethodCall.get("id")).intValue(), ((Double)paramMethodCall.get("top")).doubleValue(), ((Double)paramMethodCall.get("left")).doubleValue());
      paramResult.success(null);
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", PlatformViewsChannel.access$100(paramMethodCall), null);
    }
  }
  
  private void resize(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    paramMethodCall = (Map)paramMethodCall.arguments();
    PlatformViewsChannel.PlatformViewResizeRequest localPlatformViewResizeRequest = new PlatformViewsChannel.PlatformViewResizeRequest(((Integer)paramMethodCall.get("id")).intValue(), ((Double)paramMethodCall.get("width")).doubleValue(), ((Double)paramMethodCall.get("height")).doubleValue());
    try
    {
      PlatformViewsChannel.PlatformViewsHandler localPlatformViewsHandler = PlatformViewsChannel.access$000(this$0);
      paramMethodCall = new io/flutter/embedding/engine/systemchannels/b;
      paramMethodCall.<init>(paramResult);
      localPlatformViewsHandler.resize(localPlatformViewResizeRequest, paramMethodCall);
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", PlatformViewsChannel.access$100(paramMethodCall), null);
    }
  }
  
  private void setDirection(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    paramMethodCall = (Map)paramMethodCall.arguments();
    int i = ((Integer)paramMethodCall.get("id")).intValue();
    int j = ((Integer)paramMethodCall.get("direction")).intValue();
    try
    {
      PlatformViewsChannel.access$000(this$0).setDirection(i, j);
      paramResult.success(null);
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", PlatformViewsChannel.access$100(paramMethodCall), null);
    }
  }
  
  private void synchronizeToNativeViewHierarchy(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    boolean bool = ((Boolean)paramMethodCall.arguments()).booleanValue();
    try
    {
      PlatformViewsChannel.access$000(this$0).synchronizeToNativeViewHierarchy(bool);
      paramResult.success(null);
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", PlatformViewsChannel.access$100(paramMethodCall), null);
    }
  }
  
  private void touch(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    paramMethodCall = (List)paramMethodCall.arguments();
    paramMethodCall = new PlatformViewsChannel.PlatformViewTouch(((Integer)paramMethodCall.get(0)).intValue(), (Number)paramMethodCall.get(1), (Number)paramMethodCall.get(2), ((Integer)paramMethodCall.get(3)).intValue(), ((Integer)paramMethodCall.get(4)).intValue(), paramMethodCall.get(5), paramMethodCall.get(6), ((Integer)paramMethodCall.get(7)).intValue(), ((Integer)paramMethodCall.get(8)).intValue(), (float)((Double)paramMethodCall.get(9)).doubleValue(), (float)((Double)paramMethodCall.get(10)).doubleValue(), ((Integer)paramMethodCall.get(11)).intValue(), ((Integer)paramMethodCall.get(12)).intValue(), ((Integer)paramMethodCall.get(13)).intValue(), ((Integer)paramMethodCall.get(14)).intValue(), ((Number)paramMethodCall.get(15)).longValue());
    try
    {
      PlatformViewsChannel.access$000(this$0).onTouch(paramMethodCall);
      try
      {
        paramResult.success(null);
      }
      catch (IllegalStateException paramMethodCall) {}
      paramResult.error("error", PlatformViewsChannel.access$100(paramMethodCall), null);
    }
    catch (IllegalStateException paramMethodCall) {}
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (PlatformViewsChannel.access$000(this$0) == null) {
      return;
    }
    Object localObject = f.l("Received '");
    ((StringBuilder)localObject).append(method);
    ((StringBuilder)localObject).append("' message.");
    Log.v("PlatformViewsChannel", ((StringBuilder)localObject).toString());
    localObject = method;
    localObject.getClass();
    ((String)localObject).hashCode();
    int i = -1;
    switch (((String)localObject).hashCode())
    {
    default: 
      break;
    case 1671767583: 
      if (((String)localObject).equals("dispose")) {
        i = 7;
      }
      break;
    case 576796989: 
      if (((String)localObject).equals("setDirection")) {
        i = 6;
      }
      break;
    case 110550847: 
      if (((String)localObject).equals("touch")) {
        i = 5;
      }
      break;
    case -308988850: 
      if (((String)localObject).equals("synchronizeToNativeViewHierarchy")) {
        i = 4;
      }
      break;
    case -756050293: 
      if (((String)localObject).equals("clearFocus")) {
        i = 3;
      }
      break;
    case -934437708: 
      if (((String)localObject).equals("resize")) {
        i = 2;
      }
      break;
    case -1019779949: 
      if (((String)localObject).equals("offset")) {
        i = 1;
      }
      break;
    case -1352294148: 
      if (((String)localObject).equals("create")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 7: 
      dispose(paramMethodCall, paramResult);
      break;
    case 6: 
      setDirection(paramMethodCall, paramResult);
      break;
    case 5: 
      touch(paramMethodCall, paramResult);
      break;
    case 4: 
      synchronizeToNativeViewHierarchy(paramMethodCall, paramResult);
      break;
    case 3: 
      clearFocus(paramMethodCall, paramResult);
      break;
    case 2: 
      resize(paramMethodCall, paramResult);
      break;
    case 1: 
      offset(paramMethodCall, paramResult);
      break;
    case 0: 
      create(paramMethodCall, paramResult);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */