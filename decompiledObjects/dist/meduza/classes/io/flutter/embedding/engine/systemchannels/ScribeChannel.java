package io.flutter.embedding.engine.systemchannels;

import android.os.Build.VERSION;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

public class ScribeChannel
{
  public static final String METHOD_IS_FEATURE_AVAILABLE = "Scribe.isFeatureAvailable";
  public static final String METHOD_IS_STYLUS_HANDWRITING_AVAILABLE = "Scribe.isStylusHandwritingAvailable";
  public static final String METHOD_START_STYLUS_HANDWRITING = "Scribe.startStylusHandwriting";
  private static final String TAG = "ScribeChannel";
  public final MethodChannel channel;
  public final MethodChannel.MethodCallHandler parsingMethodHandler;
  private ScribeMethodHandler scribeMethodHandler;
  
  public ScribeChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (ScribeChannel.access$000(ScribeChannel.this) == null)
        {
          Log.v("ScribeChannel", "No ScribeMethodHandler registered. Scribe call not handled.");
          return;
        }
        String str = method;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Received '");
        localStringBuilder.append(str);
        localStringBuilder.append("' message.");
        Log.v("ScribeChannel", localStringBuilder.toString());
        str.getClass();
        int i = -1;
        switch (str.hashCode())
        {
        default: 
          break;
        case 2119738044: 
          if (str.equals("Scribe.isStylusHandwritingAvailable")) {
            i = 2;
          }
          break;
        case 1759284829: 
          if (str.equals("Scribe.startStylusHandwriting")) {
            i = 1;
          }
          break;
        case -705821951: 
          if (str.equals("Scribe.isFeatureAvailable")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          paramAnonymousResult.notImplemented();
          break;
        case 2: 
          ScribeChannel.access$200(ScribeChannel.this, paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 1: 
          ScribeChannel.access$300(ScribeChannel.this, paramAnonymousMethodCall, paramAnonymousResult);
          break;
        case 0: 
          ScribeChannel.access$100(ScribeChannel.this, paramAnonymousMethodCall, paramAnonymousResult);
        }
      }
    };
    parsingMethodHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/scribe", JSONMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  private void isFeatureAvailable(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    try
    {
      paramResult.success(Boolean.valueOf(scribeMethodHandler.isFeatureAvailable()));
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", paramMethodCall.getMessage(), null);
    }
  }
  
  private void isStylusHandwritingAvailable(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (Build.VERSION.SDK_INT < 34)
    {
      paramResult.error("error", "Requires API level 34 or higher.", null);
      return;
    }
    try
    {
      paramResult.success(Boolean.valueOf(scribeMethodHandler.isStylusHandwritingAvailable()));
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", paramMethodCall.getMessage(), null);
    }
  }
  
  private void startStylusHandwriting(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (Build.VERSION.SDK_INT < 33)
    {
      paramResult.error("error", "Requires API level 33 or higher.", null);
      return;
    }
    try
    {
      scribeMethodHandler.startStylusHandwriting();
      paramResult.success(null);
    }
    catch (IllegalStateException paramMethodCall)
    {
      paramResult.error("error", paramMethodCall.getMessage(), null);
    }
  }
  
  public void setScribeMethodHandler(ScribeMethodHandler paramScribeMethodHandler)
  {
    scribeMethodHandler = paramScribeMethodHandler;
  }
  
  public static abstract interface ScribeMethodHandler
  {
    public abstract boolean isFeatureAvailable();
    
    public abstract boolean isStylusHandwritingAvailable();
    
    public abstract void startStylusHandwriting();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.ScribeChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */