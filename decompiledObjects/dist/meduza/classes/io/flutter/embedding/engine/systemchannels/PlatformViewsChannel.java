package io.flutter.embedding.engine.systemchannels;

import f;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public class PlatformViewsChannel
{
  private static final String TAG = "PlatformViewsChannel";
  private final MethodChannel channel;
  private PlatformViewsHandler handler;
  private final MethodChannel.MethodCallHandler parsingHandler;
  
  public PlatformViewsChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      private void clearFocus(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        int i = ((Integer)paramAnonymousMethodCall.arguments()).intValue();
        try
        {
          PlatformViewsChannel.access$000(PlatformViewsChannel.this).clearFocus(i);
          paramAnonymousResult.success(null);
        }
        catch (IllegalStateException paramAnonymousMethodCall)
        {
          paramAnonymousResult.error("error", PlatformViewsChannel.access$100(paramAnonymousMethodCall), null);
        }
      }
      
      private void create(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        Map localMap = (Map)paramAnonymousMethodCall.arguments();
        boolean bool = localMap.containsKey("hybrid");
        int i = 1;
        int j;
        if ((bool) && (((Boolean)localMap.get("hybrid")).booleanValue())) {
          j = 1;
        } else {
          j = 0;
        }
        if (localMap.containsKey("params")) {
          paramAnonymousMethodCall = ByteBuffer.wrap((byte[])localMap.get("params"));
        } else {
          paramAnonymousMethodCall = null;
        }
        if (j != 0) {}
        for (;;)
        {
          Object localObject;
          try
          {
            localObject = new io/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewCreationRequest;
            ((PlatformViewsChannel.PlatformViewCreationRequest)localObject).<init>(((Integer)localMap.get("id")).intValue(), (String)localMap.get("viewType"), 0.0D, 0.0D, 0.0D, 0.0D, ((Integer)localMap.get("direction")).intValue(), PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, paramAnonymousMethodCall);
            PlatformViewsChannel.access$000(PlatformViewsChannel.this).createForPlatformViewLayer((PlatformViewsChannel.PlatformViewCreationRequest)localObject);
            paramAnonymousResult.success(null);
          }
          catch (IllegalStateException paramAnonymousMethodCall)
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
          localPlatformViewCreationRequest.<init>(i, str, d2, d1, ((Double)localMap.get("width")).doubleValue(), ((Double)localMap.get("height")).doubleValue(), ((Integer)localMap.get("direction")).intValue(), (PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode)localObject, paramAnonymousMethodCall);
          long l = PlatformViewsChannel.access$000(PlatformViewsChannel.this).createForTextureLayer(localPlatformViewCreationRequest);
          if (l == -2L)
          {
            if (j == 0)
            {
              paramAnonymousMethodCall = new java/lang/AssertionError;
              paramAnonymousMethodCall.<init>("Platform view attempted to fall back to hybrid mode when not requested.");
              throw paramAnonymousMethodCall;
            }
          }
          else
          {
            paramAnonymousResult.success(Long.valueOf(l));
            return;
          }
        }
        paramAnonymousResult.error("error", PlatformViewsChannel.access$100(paramAnonymousMethodCall), null);
      }
      
      private void dispose(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        int i = ((Integer)((Map)paramAnonymousMethodCall.arguments()).get("id")).intValue();
        try
        {
          PlatformViewsChannel.access$000(PlatformViewsChannel.this).dispose(i);
          paramAnonymousResult.success(null);
        }
        catch (IllegalStateException paramAnonymousMethodCall)
        {
          paramAnonymousResult.error("error", PlatformViewsChannel.access$100(paramAnonymousMethodCall), null);
        }
      }
      
      private void offset(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        paramAnonymousMethodCall = (Map)paramAnonymousMethodCall.arguments();
        try
        {
          PlatformViewsChannel.access$000(PlatformViewsChannel.this).offset(((Integer)paramAnonymousMethodCall.get("id")).intValue(), ((Double)paramAnonymousMethodCall.get("top")).doubleValue(), ((Double)paramAnonymousMethodCall.get("left")).doubleValue());
          paramAnonymousResult.success(null);
        }
        catch (IllegalStateException paramAnonymousMethodCall)
        {
          paramAnonymousResult.error("error", PlatformViewsChannel.access$100(paramAnonymousMethodCall), null);
        }
      }
      
      private void resize(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        paramAnonymousMethodCall = (Map)paramAnonymousMethodCall.arguments();
        PlatformViewsChannel.PlatformViewResizeRequest localPlatformViewResizeRequest = new PlatformViewsChannel.PlatformViewResizeRequest(((Integer)paramAnonymousMethodCall.get("id")).intValue(), ((Double)paramAnonymousMethodCall.get("width")).doubleValue(), ((Double)paramAnonymousMethodCall.get("height")).doubleValue());
        try
        {
          PlatformViewsChannel.PlatformViewsHandler localPlatformViewsHandler = PlatformViewsChannel.access$000(PlatformViewsChannel.this);
          paramAnonymousMethodCall = new io/flutter/embedding/engine/systemchannels/b;
          paramAnonymousMethodCall.<init>(paramAnonymousResult);
          localPlatformViewsHandler.resize(localPlatformViewResizeRequest, paramAnonymousMethodCall);
        }
        catch (IllegalStateException paramAnonymousMethodCall)
        {
          paramAnonymousResult.error("error", PlatformViewsChannel.access$100(paramAnonymousMethodCall), null);
        }
      }
      
      private void setDirection(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        paramAnonymousMethodCall = (Map)paramAnonymousMethodCall.arguments();
        int i = ((Integer)paramAnonymousMethodCall.get("id")).intValue();
        int j = ((Integer)paramAnonymousMethodCall.get("direction")).intValue();
        try
        {
          PlatformViewsChannel.access$000(PlatformViewsChannel.this).setDirection(i, j);
          paramAnonymousResult.success(null);
        }
        catch (IllegalStateException paramAnonymousMethodCall)
        {
          paramAnonymousResult.error("error", PlatformViewsChannel.access$100(paramAnonymousMethodCall), null);
        }
      }
      
      private void synchronizeToNativeViewHierarchy(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        boolean bool = ((Boolean)paramAnonymousMethodCall.arguments()).booleanValue();
        try
        {
          PlatformViewsChannel.access$000(PlatformViewsChannel.this).synchronizeToNativeViewHierarchy(bool);
          paramAnonymousResult.success(null);
        }
        catch (IllegalStateException paramAnonymousMethodCall)
        {
          paramAnonymousResult.error("error", PlatformViewsChannel.access$100(paramAnonymousMethodCall), null);
        }
      }
      
      private void touch(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        paramAnonymousMethodCall = (List)paramAnonymousMethodCall.arguments();
        paramAnonymousMethodCall = new PlatformViewsChannel.PlatformViewTouch(((Integer)paramAnonymousMethodCall.get(0)).intValue(), (Number)paramAnonymousMethodCall.get(1), (Number)paramAnonymousMethodCall.get(2), ((Integer)paramAnonymousMethodCall.get(3)).intValue(), ((Integer)paramAnonymousMethodCall.get(4)).intValue(), paramAnonymousMethodCall.get(5), paramAnonymousMethodCall.get(6), ((Integer)paramAnonymousMethodCall.get(7)).intValue(), ((Integer)paramAnonymousMethodCall.get(8)).intValue(), (float)((Double)paramAnonymousMethodCall.get(9)).doubleValue(), (float)((Double)paramAnonymousMethodCall.get(10)).doubleValue(), ((Integer)paramAnonymousMethodCall.get(11)).intValue(), ((Integer)paramAnonymousMethodCall.get(12)).intValue(), ((Integer)paramAnonymousMethodCall.get(13)).intValue(), ((Integer)paramAnonymousMethodCall.get(14)).intValue(), ((Number)paramAnonymousMethodCall.get(15)).longValue());
        try
        {
          PlatformViewsChannel.access$000(PlatformViewsChannel.this).onTouch(paramAnonymousMethodCall);
          try
          {
            paramAnonymousResult.success(null);
          }
          catch (IllegalStateException paramAnonymousMethodCall) {}
          paramAnonymousResult.error("error", PlatformViewsChannel.access$100(paramAnonymousMethodCall), null);
        }
        catch (IllegalStateException paramAnonymousMethodCall) {}
      }
      
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (PlatformViewsChannel.access$000(PlatformViewsChannel.this) == null) {
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
          paramAnonymousResult.notImplemented();
          break;
        case 7: 
          dispose(paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 6: 
          setDirection(paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 5: 
          touch(paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 4: 
          synchronizeToNativeViewHierarchy(paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 3: 
          clearFocus(paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 2: 
          resize(paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 1: 
          offset(paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 0: 
          create(paramAnonymousMethodCall, paramAnonymousResult);
        }
      }
    };
    parsingHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  private static String detailedExceptionString(Exception paramException)
  {
    return Log.getStackTraceString(paramException);
  }
  
  public void invokeViewFocused(int paramInt)
  {
    MethodChannel localMethodChannel = channel;
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("viewFocused", Integer.valueOf(paramInt));
  }
  
  public void setPlatformViewsHandler(PlatformViewsHandler paramPlatformViewsHandler)
  {
    handler = paramPlatformViewsHandler;
  }
  
  public static abstract interface PlatformViewBufferResized
  {
    public abstract void run(PlatformViewsChannel.PlatformViewBufferSize paramPlatformViewBufferSize);
  }
  
  public static class PlatformViewBufferSize
  {
    public final int height;
    public final int width;
    
    public PlatformViewBufferSize(int paramInt1, int paramInt2)
    {
      width = paramInt1;
      height = paramInt2;
    }
  }
  
  public static class PlatformViewCreationRequest
  {
    public final int direction;
    public final RequestedDisplayMode displayMode;
    public final double logicalHeight;
    public final double logicalLeft;
    public final double logicalTop;
    public final double logicalWidth;
    public final ByteBuffer params;
    public final int viewId;
    public final String viewType;
    
    public PlatformViewCreationRequest(int paramInt1, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, RequestedDisplayMode paramRequestedDisplayMode, ByteBuffer paramByteBuffer)
    {
      viewId = paramInt1;
      viewType = paramString;
      logicalTop = paramDouble1;
      logicalLeft = paramDouble2;
      logicalWidth = paramDouble3;
      logicalHeight = paramDouble4;
      direction = paramInt2;
      displayMode = paramRequestedDisplayMode;
      params = paramByteBuffer;
    }
    
    public PlatformViewCreationRequest(int paramInt1, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, ByteBuffer paramByteBuffer)
    {
      this(paramInt1, paramString, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramInt2, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, paramByteBuffer);
    }
    
    public static enum RequestedDisplayMode
    {
      static
      {
        TEXTURE_WITH_HYBRID_FALLBACK = new RequestedDisplayMode("TEXTURE_WITH_HYBRID_FALLBACK", 1);
        HYBRID_ONLY = new RequestedDisplayMode("HYBRID_ONLY", 2);
      }
      
      private RequestedDisplayMode() {}
    }
  }
  
  public static class PlatformViewResizeRequest
  {
    public final double newLogicalHeight;
    public final double newLogicalWidth;
    public final int viewId;
    
    public PlatformViewResizeRequest(int paramInt, double paramDouble1, double paramDouble2)
    {
      viewId = paramInt;
      newLogicalWidth = paramDouble1;
      newLogicalHeight = paramDouble2;
    }
  }
  
  public static class PlatformViewTouch
  {
    public final int action;
    public final int buttonState;
    public final int deviceId;
    public final Number downTime;
    public final int edgeFlags;
    public final Number eventTime;
    public final int flags;
    public final int metaState;
    public final long motionEventId;
    public final int pointerCount;
    public final Object rawPointerCoords;
    public final Object rawPointerPropertiesList;
    public final int source;
    public final int viewId;
    public final float xPrecision;
    public final float yPrecision;
    
    public PlatformViewTouch(int paramInt1, Number paramNumber1, Number paramNumber2, int paramInt2, int paramInt3, Object paramObject1, Object paramObject2, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong)
    {
      viewId = paramInt1;
      downTime = paramNumber1;
      eventTime = paramNumber2;
      action = paramInt2;
      pointerCount = paramInt3;
      rawPointerPropertiesList = paramObject1;
      rawPointerCoords = paramObject2;
      metaState = paramInt4;
      buttonState = paramInt5;
      xPrecision = paramFloat1;
      yPrecision = paramFloat2;
      deviceId = paramInt6;
      edgeFlags = paramInt7;
      source = paramInt8;
      flags = paramInt9;
      motionEventId = paramLong;
    }
  }
  
  public static abstract interface PlatformViewsHandler
  {
    public static final long NON_TEXTURE_FALLBACK = -2L;
    
    public abstract void clearFocus(int paramInt);
    
    public abstract void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest);
    
    public abstract long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest);
    
    public abstract void dispose(int paramInt);
    
    public abstract void offset(int paramInt, double paramDouble1, double paramDouble2);
    
    public abstract void onTouch(PlatformViewsChannel.PlatformViewTouch paramPlatformViewTouch);
    
    public abstract void resize(PlatformViewsChannel.PlatformViewResizeRequest paramPlatformViewResizeRequest, PlatformViewsChannel.PlatformViewBufferResized paramPlatformViewBufferResized);
    
    public abstract void setDirection(int paramInt1, int paramInt2);
    
    public abstract void synchronizeToNativeViewHierarchy(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformViewsChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */