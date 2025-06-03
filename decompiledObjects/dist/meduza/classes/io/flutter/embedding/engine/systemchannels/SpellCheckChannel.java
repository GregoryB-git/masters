package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;

public class SpellCheckChannel
{
  private static final String TAG = "SpellCheckChannel";
  public final MethodChannel channel;
  public final MethodChannel.MethodCallHandler parsingMethodHandler;
  private SpellCheckMethodHandler spellCheckMethodHandler;
  
  public SpellCheckChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (SpellCheckChannel.access$000(SpellCheckChannel.this) == null)
        {
          Log.v("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
          return;
        }
        Object localObject = method;
        paramAnonymousMethodCall = arguments;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Received '");
        localStringBuilder.append((String)localObject);
        localStringBuilder.append("' message.");
        Log.v("SpellCheckChannel", localStringBuilder.toString());
        localObject.getClass();
        if (!((String)localObject).equals("SpellCheck.initiateSpellCheck")) {
          paramAnonymousResult.notImplemented();
        } else {
          try
          {
            localObject = (ArrayList)paramAnonymousMethodCall;
            paramAnonymousMethodCall = (String)((ArrayList)localObject).get(0);
            localObject = (String)((ArrayList)localObject).get(1);
            SpellCheckChannel.access$000(SpellCheckChannel.this).initiateSpellCheck(paramAnonymousMethodCall, (String)localObject, paramAnonymousResult);
          }
          catch (IllegalStateException paramAnonymousMethodCall)
          {
            paramAnonymousResult.error("error", paramAnonymousMethodCall.getMessage(), null);
          }
        }
      }
    };
    parsingMethodHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/spellcheck", StandardMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  public void setSpellCheckMethodHandler(SpellCheckMethodHandler paramSpellCheckMethodHandler)
  {
    spellCheckMethodHandler = paramSpellCheckMethodHandler;
  }
  
  public static abstract interface SpellCheckMethodHandler
  {
    public abstract void initiateSpellCheck(String paramString1, String paramString2, MethodChannel.Result paramResult);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SpellCheckChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */