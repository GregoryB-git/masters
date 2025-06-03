package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;

public class PrintJobChannelDelegate
  extends ChannelDelegateImpl
{
  private PrintJobController printJobController;
  
  public PrintJobChannelDelegate(PrintJobController paramPrintJobController, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    printJobController = paramPrintJobController;
  }
  
  public void dispose()
  {
    super.dispose();
    printJobController = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    paramMethodCall = method;
    paramMethodCall.getClass();
    int i = paramMethodCall.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1671767583: 
      if (paramMethodCall.equals("dispose")) {
        j = 3;
      }
      break;
    case 1097506319: 
      if (paramMethodCall.equals("restart")) {
        j = 2;
      }
      break;
    case -75444956: 
      if (paramMethodCall.equals("getInfo")) {
        j = 1;
      }
      break;
    case -1367724422: 
      if (paramMethodCall.equals("cancel")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 3: 
      paramMethodCall = printJobController;
      if (paramMethodCall == null) {
        break label273;
      }
      paramMethodCall.dispose();
      break;
    case 2: 
      paramMethodCall = printJobController;
      if (paramMethodCall == null) {
        break label273;
      }
      paramMethodCall.restart();
      break;
    case 1: 
      Object localObject1 = printJobController;
      Object localObject2 = null;
      paramMethodCall = (MethodCall)localObject2;
      if (localObject1 != null)
      {
        localObject1 = ((PrintJobController)localObject1).getInfo();
        paramMethodCall = (MethodCall)localObject2;
        if (localObject1 != null) {
          paramMethodCall = ((PrintJobInfoExt)localObject1).toMap();
        }
      }
      paramResult.success(paramMethodCall);
      break;
    case 0: 
      paramMethodCall = printJobController;
      if (paramMethodCall == null) {
        break label273;
      }
      paramMethodCall.cancel();
    }
    paramMethodCall = Boolean.TRUE;
    break label277;
    label273:
    paramMethodCall = Boolean.FALSE;
    label277:
    paramResult.success(paramMethodCall);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */