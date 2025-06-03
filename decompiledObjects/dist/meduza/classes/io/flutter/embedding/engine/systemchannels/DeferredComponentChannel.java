package io.flutter.embedding.engine.systemchannels;

import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DeferredComponentChannel
{
  private static final String TAG = "DeferredComponentChannel";
  private final MethodChannel channel;
  private Map<String, List<MethodChannel.Result>> componentNameToResults;
  private DeferredComponentManager deferredComponentManager;
  public final MethodChannel.MethodCallHandler parsingMethodHandler;
  
  public DeferredComponentChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (DeferredComponentChannel.access$000(DeferredComponentChannel.this) == null) {
          return;
        }
        String str = method;
        Map localMap = (Map)paramAnonymousMethodCall.arguments();
        paramAnonymousMethodCall = new StringBuilder();
        paramAnonymousMethodCall.append("Received '");
        paramAnonymousMethodCall.append(str);
        paramAnonymousMethodCall.append("' message.");
        Log.v("DeferredComponentChannel", paramAnonymousMethodCall.toString());
        int i = ((Integer)localMap.get("loadingUnitId")).intValue();
        paramAnonymousMethodCall = (String)localMap.get("componentName");
        str.getClass();
        int j = -1;
        switch (str.hashCode())
        {
        default: 
          break;
        case 520962947: 
          if (str.equals("installDeferredComponent")) {
            j = 2;
          }
          break;
        case 399701758: 
          if (str.equals("getDeferredComponentInstallState")) {
            j = 1;
          }
          break;
        case -1004447972: 
          if (str.equals("uninstallDeferredComponent")) {
            j = 0;
          }
          break;
        }
        switch (j)
        {
        default: 
          paramAnonymousResult.notImplemented();
          break;
        case 2: 
          DeferredComponentChannel.access$000(DeferredComponentChannel.this).installDeferredComponent(i, paramAnonymousMethodCall);
          if (!DeferredComponentChannel.access$100(DeferredComponentChannel.this).containsKey(paramAnonymousMethodCall)) {
            DeferredComponentChannel.access$100(DeferredComponentChannel.this).put(paramAnonymousMethodCall, new ArrayList());
          }
          ((List)DeferredComponentChannel.access$100(DeferredComponentChannel.this).get(paramAnonymousMethodCall)).add(paramAnonymousResult);
          break;
        case 1: 
        case 0: 
          for (paramAnonymousMethodCall = DeferredComponentChannel.access$000(DeferredComponentChannel.this).getDeferredComponentInstallState(i, paramAnonymousMethodCall);; paramAnonymousMethodCall = null)
          {
            paramAnonymousResult.success(paramAnonymousMethodCall);
            break;
            DeferredComponentChannel.access$000(DeferredComponentChannel.this).uninstallDeferredComponent(i, paramAnonymousMethodCall);
          }
        }
      }
    };
    parsingMethodHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/deferredcomponent", StandardMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
    deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
    componentNameToResults = new HashMap();
  }
  
  public void completeInstallError(String paramString1, String paramString2)
  {
    if (componentNameToResults.containsKey(paramString1))
    {
      Iterator localIterator = ((List)componentNameToResults.get(paramString1)).iterator();
      while (localIterator.hasNext()) {
        ((MethodChannel.Result)localIterator.next()).error("DeferredComponent Install failure", paramString2, null);
      }
      ((List)componentNameToResults.get(paramString1)).clear();
    }
  }
  
  public void completeInstallSuccess(String paramString)
  {
    if (componentNameToResults.containsKey(paramString))
    {
      Iterator localIterator = ((List)componentNameToResults.get(paramString)).iterator();
      while (localIterator.hasNext()) {
        ((MethodChannel.Result)localIterator.next()).success(null);
      }
      ((List)componentNameToResults.get(paramString)).clear();
    }
  }
  
  public void setDeferredComponentManager(DeferredComponentManager paramDeferredComponentManager)
  {
    deferredComponentManager = paramDeferredComponentManager;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.DeferredComponentChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */