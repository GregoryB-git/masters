package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import c2.i;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.Executors;
import x6.b;

public class TracingControllerChannelDelegate
  extends ChannelDelegateImpl
{
  private TracingControllerManager tracingControllerManager;
  
  public TracingControllerChannelDelegate(TracingControllerManager paramTracingControllerManager, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    tracingControllerManager = paramTracingControllerManager;
  }
  
  public void dispose()
  {
    super.dispose();
    tracingControllerManager = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    TracingControllerManager.init();
    i locali = TracingControllerManager.tracingController;
    Object localObject = method;
    localObject.getClass();
    int i = ((String)localObject).hashCode();
    if (i != -1647175624)
    {
      if (i != 3540994)
      {
        if ((i == 109757538) && (((String)localObject).equals("start")))
        {
          i = 2;
          break label107;
        }
      }
      else if (((String)localObject).equals("stop"))
      {
        i = 1;
        break label107;
      }
    }
    else {
      if (((String)localObject).equals("isTracing")) {
        break label104;
      }
    }
    i = -1;
    break label107;
    label104:
    i = 0;
    label107:
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          paramResult.notImplemented();
          return;
        }
        if ((locali != null) && (b.c0("TRACING_CONTROLLER_BASIC_USAGE")))
        {
          paramMethodCall = (Map)paramMethodCall.argument("settings");
          localObject = new TracingSettings();
          ((TracingSettings)localObject).parse(paramMethodCall);
          locali.b(TracingControllerManager.buildTracingConfig((TracingSettings)localObject));
          paramMethodCall = Boolean.TRUE;
          break label277;
        }
      }
      else if ((locali != null) && (b.c0("TRACING_CONTROLLER_BASIC_USAGE")))
      {
        localObject = (String)paramMethodCall.argument("filePath");
        if (localObject != null) {}
        try
        {
          paramMethodCall = new java/io/FileOutputStream;
          paramMethodCall.<init>((String)localObject);
          break label230;
          paramMethodCall = null;
          label230:
          paramResult.success(Boolean.valueOf(locali.c(paramMethodCall, Executors.newSingleThreadExecutor())));
        }
        catch (FileNotFoundException paramMethodCall)
        {
          paramMethodCall.printStackTrace();
          break label273;
        }
      }
    }
    else if (locali != null)
    {
      paramMethodCall = Boolean.valueOf(locali.a());
      break label277;
    }
    label273:
    paramMethodCall = Boolean.FALSE;
    label277:
    paramResult.success(paramMethodCall);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.tracing.TracingControllerChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */