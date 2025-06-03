package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;

class SpellCheckChannel$1
  implements MethodChannel.MethodCallHandler
{
  public SpellCheckChannel$1(SpellCheckChannel paramSpellCheckChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (SpellCheckChannel.access$000(this$0) == null)
    {
      Log.v("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
      return;
    }
    Object localObject = method;
    paramMethodCall = arguments;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Received '");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("' message.");
    Log.v("SpellCheckChannel", localStringBuilder.toString());
    localObject.getClass();
    if (!((String)localObject).equals("SpellCheck.initiateSpellCheck")) {
      paramResult.notImplemented();
    } else {
      try
      {
        localObject = (ArrayList)paramMethodCall;
        paramMethodCall = (String)((ArrayList)localObject).get(0);
        localObject = (String)((ArrayList)localObject).get(1);
        SpellCheckChannel.access$000(this$0).initiateSpellCheck(paramMethodCall, (String)localObject, paramResult);
      }
      catch (IllegalStateException paramMethodCall)
      {
        paramResult.error("error", paramMethodCall.getMessage(), null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SpellCheckChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */