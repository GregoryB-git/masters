package io.flutter.embedding.engine.systemchannels;

import f;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;

public class MouseCursorChannel
{
  private static final String TAG = "MouseCursorChannel";
  public final MethodChannel channel;
  private MouseCursorMethodHandler mouseCursorMethodHandler;
  private final MethodChannel.MethodCallHandler parsingMethodCallHandler;
  
  public MouseCursorChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (MouseCursorChannel.access$000(MouseCursorChannel.this) == null) {
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
            paramAnonymousMethodCall = (String)((HashMap)arguments).get("kind");
            try
            {
              MouseCursorChannel.access$000(MouseCursorChannel.this).activateSystemCursor(paramAnonymousMethodCall);
              paramAnonymousResult.success(Boolean.TRUE);
            }
            catch (Exception paramAnonymousMethodCall)
            {
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append("Error when setting cursors: ");
              localStringBuilder.append(paramAnonymousMethodCall.getMessage());
              paramAnonymousResult.error("error", localStringBuilder.toString(), null);
            }
          }
          return;
        }
        catch (Exception paramAnonymousMethodCall)
        {
          localStringBuilder = f.l("Unhandled error: ");
          localStringBuilder.append(paramAnonymousMethodCall.getMessage());
          paramAnonymousResult.error("error", localStringBuilder.toString(), null);
        }
      }
    };
    parsingMethodCallHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/mousecursor", StandardMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  public void setMethodHandler(MouseCursorMethodHandler paramMouseCursorMethodHandler)
  {
    mouseCursorMethodHandler = paramMouseCursorMethodHandler;
  }
  
  public void synthesizeMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    parsingMethodCallHandler.onMethodCall(paramMethodCall, paramResult);
  }
  
  public static abstract interface MouseCursorMethodHandler
  {
    public abstract void activateSystemCursor(String paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.MouseCursorChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */