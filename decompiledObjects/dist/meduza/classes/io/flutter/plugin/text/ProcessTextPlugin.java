package io.flutter.plugin.text;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.ResolveInfoFlags;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProcessTextPlugin
  implements FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener, ProcessTextChannel.ProcessTextMethodHandler
{
  private static final String TAG = "ProcessTextPlugin";
  private ActivityPluginBinding activityBinding;
  private final PackageManager packageManager;
  private final ProcessTextChannel processTextChannel;
  private Map<Integer, MethodChannel.Result> requestsByCode = new HashMap();
  private Map<String, ResolveInfo> resolveInfosById;
  
  public ProcessTextPlugin(ProcessTextChannel paramProcessTextChannel)
  {
    processTextChannel = paramProcessTextChannel;
    packageManager = packageManager;
    paramProcessTextChannel.setMethodHandler(this);
  }
  
  private void cacheResolveInfos()
  {
    resolveInfosById = new HashMap();
    int i = Build.VERSION.SDK_INT;
    Object localObject = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    if (i >= 33) {
      localObject = packageManager.queryIntentActivities((Intent)localObject, PackageManager.ResolveInfoFlags.of(0L));
    } else {
      localObject = packageManager.queryIntentActivities((Intent)localObject, 0);
    }
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
      localObject = activityInfo.name;
      localResolveInfo.loadLabel(packageManager).toString();
      resolveInfosById.put(localObject, localResolveInfo);
    }
  }
  
  public void destroy()
  {
    processTextChannel.setMethodHandler(null);
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (!requestsByCode.containsKey(Integer.valueOf(paramInt1))) {
      return false;
    }
    String str = null;
    if (paramInt2 == -1) {
      str = paramIntent.getStringExtra("android.intent.extra.PROCESS_TEXT");
    }
    ((MethodChannel.Result)requestsByCode.remove(Integer.valueOf(paramInt1))).success(str);
    return true;
  }
  
  public void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    activityBinding = paramActivityPluginBinding;
    paramActivityPluginBinding.addActivityResultListener(this);
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding) {}
  
  public void onDetachedFromActivity()
  {
    activityBinding.removeActivityResultListener(this);
    activityBinding = null;
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    activityBinding.removeActivityResultListener(this);
    activityBinding = null;
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding) {}
  
  public void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    activityBinding = paramActivityPluginBinding;
    paramActivityPluginBinding.addActivityResultListener(this);
  }
  
  public void processTextAction(String paramString1, String paramString2, boolean paramBoolean, MethodChannel.Result paramResult)
  {
    if (activityBinding == null)
    {
      paramResult.error("error", "Plugin not bound to an Activity", null);
      return;
    }
    Object localObject = resolveInfosById;
    if (localObject == null)
    {
      paramResult.error("error", "Can not process text actions before calling queryTextActions", null);
      return;
    }
    localObject = (ResolveInfo)((Map)localObject).get(paramString1);
    if (localObject == null)
    {
      paramResult.error("error", "Text processing activity not found", null);
      return;
    }
    paramString1 = Integer.valueOf(paramResult.hashCode());
    requestsByCode.put(paramString1, paramResult);
    paramResult = new Intent();
    localObject = activityInfo;
    paramResult.setClassName(packageName, name);
    paramResult.setAction("android.intent.action.PROCESS_TEXT");
    paramResult.setType("text/plain");
    paramResult.putExtra("android.intent.extra.PROCESS_TEXT", paramString2);
    paramResult.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", paramBoolean);
    activityBinding.getActivity().startActivityForResult(paramResult, paramString1.intValue());
  }
  
  public Map<String, String> queryTextActions()
  {
    if (resolveInfosById == null) {
      cacheResolveInfos();
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = resolveInfosById.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, ((ResolveInfo)resolveInfosById.get(str)).loadLabel(packageManager).toString());
    }
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.text.ProcessTextPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */