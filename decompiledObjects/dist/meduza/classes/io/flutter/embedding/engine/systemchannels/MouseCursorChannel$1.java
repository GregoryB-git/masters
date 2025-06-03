package io.flutter.embedding.engine.systemchannels;

import f;
import io.flutter.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;

class MouseCursorChannel$1
  implements MethodChannel.MethodCallHandler
{
  public MouseCursorChannel$1(MouseCursorChannel paramMouseCursorChannel) {}
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (MouseCursorChannel.access$000(this$0) == null) {
      return;
    }
    String str = method;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Received '");
    localStringBuilder.append(str);
    localStringBuilder.append("' message.");
    Log.v("MouseCursorChannel", localStringBuilder.toString());
    int i = -1;
    try
    {
      if ((str.hashCode() == -1307105544) && (str.equals("activateSystemCursor"))) {
        i = 0;
      }
      if (i == 0)
      {
        paramMethodCall = (String)((HashMap)arguments).get("kind");
        try
        {
          MouseCursorChannel.access$000(this$0).activateSystemCursor(paramMethodCall);
          paramResult.success(Boolean.TRUE);
        }
        catch (Exception paramMethodCall)
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Error when setting cursors: ");
          localStringBuilder.append(paramMethodCall.getMessage());
          paramResult.error("error", localStringBuilder.toString(), null);
        }
      }
      return;
    }
    catch (Exception paramMethodCall)
    {
      localStringBuilder = f.l("Unhandled error: ");
      localStringBuilder.append(paramMethodCall.getMessage());
      paramResult.error("error", localStringBuilder.toString(), null);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.MouseCursorChannel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */