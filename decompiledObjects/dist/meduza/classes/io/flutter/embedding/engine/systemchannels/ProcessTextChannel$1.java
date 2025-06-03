package io.flutter.embedding.engine.systemchannels;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;

class ProcessTextChannel$1
  implements MethodChannel.MethodCallHandler
{
  public ProcessTextChannel$1(ProcessTextChannel paramProcessTextChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (ProcessTextChannel.access$000(this$0) == null) {
      return;
    }
    String str = method;
    paramMethodCall = arguments;
    str.getClass();
    if (!str.equals("ProcessText.processTextAction"))
    {
      if (!str.equals("ProcessText.queryTextActions")) {
        paramResult.notImplemented();
      } else {
        try
        {
          paramResult.success(ProcessTextChannel.access$000(this$0).queryTextActions());
        }
        catch (IllegalStateException paramMethodCall)
        {
          paramResult.error("error", paramMethodCall.getMessage(), null);
        }
      }
    }
    else
    {
      ArrayList localArrayList = (ArrayList)paramMethodCall;
      str = (String)localArrayList.get(0);
      paramMethodCall = (String)localArrayList.get(1);
      boolean bool = ((Boolean)localArrayList.get(2)).booleanValue();
      ProcessTextChannel.access$000(this$0).processTextAction(str, paramMethodCall, bool, paramResult);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.ProcessTextChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */