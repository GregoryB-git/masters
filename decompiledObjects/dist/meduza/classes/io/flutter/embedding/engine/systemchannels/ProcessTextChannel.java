package io.flutter.embedding.engine.systemchannels;

import android.content.pm.PackageManager;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;
import java.util.Map;

public class ProcessTextChannel
{
  private static final String CHANNEL_NAME = "flutter/processtext";
  private static final String METHOD_PROCESS_TEXT_ACTION = "ProcessText.processTextAction";
  private static final String METHOD_QUERY_TEXT_ACTIONS = "ProcessText.queryTextActions";
  private static final String TAG = "ProcessTextChannel";
  public final MethodChannel channel;
  public final PackageManager packageManager;
  public final MethodChannel.MethodCallHandler parsingMethodHandler;
  private ProcessTextMethodHandler processTextMethodHandler;
  
  public ProcessTextChannel(DartExecutor paramDartExecutor, PackageManager paramPackageManager)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (ProcessTextChannel.access$000(ProcessTextChannel.this) == null) {
          return;
        }
        String str = method;
        paramAnonymousMethodCall = arguments;
        str.getClass();
        if (!str.equals("ProcessText.processTextAction"))
        {
          if (!str.equals("ProcessText.queryTextActions")) {
            paramAnonymousResult.notImplemented();
          } else {
            try
            {
              paramAnonymousResult.success(ProcessTextChannel.access$000(ProcessTextChannel.this).queryTextActions());
            }
            catch (IllegalStateException paramAnonymousMethodCall)
            {
              paramAnonymousResult.error("error", paramAnonymousMethodCall.getMessage(), null);
            }
          }
        }
        else
        {
          ArrayList localArrayList = (ArrayList)paramAnonymousMethodCall;
          str = (String)localArrayList.get(0);
          paramAnonymousMethodCall = (String)localArrayList.get(1);
          boolean bool = ((Boolean)localArrayList.get(2)).booleanValue();
          ProcessTextChannel.access$000(ProcessTextChannel.this).processTextAction(str, paramAnonymousMethodCall, bool, paramAnonymousResult);
        }
      }
    };
    parsingMethodHandler = local1;
    packageManager = paramPackageManager;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/processtext", StandardMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  public void setMethodHandler(ProcessTextMethodHandler paramProcessTextMethodHandler)
  {
    processTextMethodHandler = paramProcessTextMethodHandler;
  }
  
  public static abstract interface ProcessTextMethodHandler
  {
    public abstract void processTextAction(String paramString1, String paramString2, boolean paramBoolean, MethodChannel.Result paramResult);
    
    public abstract Map<String, String> queryTextActions();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.ProcessTextChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */