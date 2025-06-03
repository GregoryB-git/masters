package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;
import java.util.Map;

public class RestorationChannel
{
  private static final String TAG = "RestorationChannel";
  private MethodChannel channel;
  private boolean engineHasProvidedData = false;
  private boolean frameworkHasRequestedData = false;
  private final MethodChannel.MethodCallHandler handler;
  private MethodChannel.Result pendingFrameworkRestorationChannelRequest;
  private byte[] restorationData;
  public final boolean waitForRestorationData;
  
  public RestorationChannel(DartExecutor paramDartExecutor, boolean paramBoolean)
  {
    this(new MethodChannel(paramDartExecutor, "flutter/restoration", StandardMethodCodec.INSTANCE), paramBoolean);
  }
  
  public RestorationChannel(MethodChannel paramMethodChannel, boolean paramBoolean)
  {
    MethodChannel.MethodCallHandler local2 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        String str = method;
        paramAnonymousMethodCall = arguments;
        str.getClass();
        if (!str.equals("get"))
        {
          if (!str.equals("put")) {
            paramAnonymousResult.notImplemented();
          } else {
            RestorationChannel.access$002(RestorationChannel.this, (byte[])paramAnonymousMethodCall);
          }
        }
        else {
          for (paramAnonymousMethodCall = null;; paramAnonymousMethodCall = RestorationChannel.access$300(paramAnonymousMethodCall, RestorationChannel.access$000(paramAnonymousMethodCall)))
          {
            paramAnonymousResult.success(paramAnonymousMethodCall);
            break;
            RestorationChannel.access$102(RestorationChannel.this, true);
            if (!RestorationChannel.access$200(RestorationChannel.this))
            {
              paramAnonymousMethodCall = RestorationChannel.this;
              if (waitForRestorationData)
              {
                RestorationChannel.access$402(paramAnonymousMethodCall, paramAnonymousResult);
                break;
              }
            }
            paramAnonymousMethodCall = RestorationChannel.this;
          }
        }
      }
    };
    handler = local2;
    channel = paramMethodChannel;
    waitForRestorationData = paramBoolean;
    paramMethodChannel.setMethodCallHandler(local2);
  }
  
  private Map<String, Object> packageData(byte[] paramArrayOfByte)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("enabled", Boolean.TRUE);
    localHashMap.put("data", paramArrayOfByte);
    return localHashMap;
  }
  
  public void clearData()
  {
    restorationData = null;
  }
  
  public byte[] getRestorationData()
  {
    return restorationData;
  }
  
  public void setRestorationData(final byte[] paramArrayOfByte)
  {
    engineHasProvidedData = true;
    MethodChannel.Result localResult = pendingFrameworkRestorationChannelRequest;
    if (localResult != null)
    {
      localResult.success(packageData(paramArrayOfByte));
      pendingFrameworkRestorationChannelRequest = null;
    }
    while (!frameworkHasRequestedData)
    {
      restorationData = paramArrayOfByte;
      break;
    }
    channel.invokeMethod("push", packageData(paramArrayOfByte), new MethodChannel.Result()
    {
      public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
      {
        paramAnonymousObject = new StringBuilder();
        ((StringBuilder)paramAnonymousObject).append("Error ");
        ((StringBuilder)paramAnonymousObject).append(paramAnonymousString1);
        ((StringBuilder)paramAnonymousObject).append(" while sending restoration data to framework: ");
        ((StringBuilder)paramAnonymousObject).append(paramAnonymousString2);
        Log.e("RestorationChannel", ((StringBuilder)paramAnonymousObject).toString());
      }
      
      public void notImplemented() {}
      
      public void success(Object paramAnonymousObject)
      {
        RestorationChannel.access$002(this$0, paramArrayOfByte);
      }
    });
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.RestorationChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */