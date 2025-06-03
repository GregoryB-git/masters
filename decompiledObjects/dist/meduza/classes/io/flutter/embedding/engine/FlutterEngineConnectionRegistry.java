package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b1.k;
import io.flutter.Log;
import io.flutter.embedding.android.ExclusiveAppComponent;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityControlSurface;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.embedding.engine.plugins.service.ServiceAware;
import io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener;
import io.flutter.embedding.engine.plugins.service.ServiceControlSurface;
import io.flutter.embedding.engine.plugins.service.ServicePluginBinding;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import io.flutter.plugin.common.PluginRegistry.NewIntentListener;
import io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener;
import io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener;
import io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class FlutterEngineConnectionRegistry
  implements PluginRegistry, ActivityControlSurface, ServiceControlSurface, BroadcastReceiverControlSurface, ContentProviderControlSurface
{
  private static final String TAG = "FlutterEngineCxnRegstry";
  private final Map<Class<? extends FlutterPlugin>, ActivityAware> activityAwarePlugins = new HashMap();
  private FlutterEngineActivityPluginBinding activityPluginBinding;
  private BroadcastReceiver broadcastReceiver;
  private final Map<Class<? extends FlutterPlugin>, BroadcastReceiverAware> broadcastReceiverAwarePlugins = new HashMap();
  private FlutterEngineBroadcastReceiverPluginBinding broadcastReceiverPluginBinding;
  private ContentProvider contentProvider;
  private final Map<Class<? extends FlutterPlugin>, ContentProviderAware> contentProviderAwarePlugins = new HashMap();
  private FlutterEngineContentProviderPluginBinding contentProviderPluginBinding;
  private ExclusiveAppComponent<Activity> exclusiveActivity;
  private final FlutterEngine flutterEngine;
  private boolean isWaitingForActivityReattachment = false;
  private final FlutterPlugin.FlutterPluginBinding pluginBinding;
  private final Map<Class<? extends FlutterPlugin>, FlutterPlugin> plugins = new HashMap();
  private Service service;
  private final Map<Class<? extends FlutterPlugin>, ServiceAware> serviceAwarePlugins = new HashMap();
  private FlutterEngineServicePluginBinding servicePluginBinding;
  
  public FlutterEngineConnectionRegistry(Context paramContext, FlutterEngine paramFlutterEngine, FlutterLoader paramFlutterLoader, FlutterEngineGroup paramFlutterEngineGroup)
  {
    flutterEngine = paramFlutterEngine;
    pluginBinding = new FlutterPlugin.FlutterPluginBinding(paramContext, paramFlutterEngine, paramFlutterEngine.getDartExecutor(), paramFlutterEngine.getRenderer(), paramFlutterEngine.getPlatformViewsController().getRegistry(), new DefaultFlutterAssets(paramFlutterLoader, null), paramFlutterEngineGroup);
  }
  
  private void attachToActivityInternal(Activity paramActivity, k paramk)
  {
    activityPluginBinding = new FlutterEngineActivityPluginBinding(paramActivity, paramk);
    boolean bool;
    if (paramActivity.getIntent() != null) {
      bool = paramActivity.getIntent().getBooleanExtra("enable-software-rendering", false);
    } else {
      bool = false;
    }
    flutterEngine.getPlatformViewsController().setSoftwareRendering(bool);
    flutterEngine.getPlatformViewsController().attach(paramActivity, flutterEngine.getRenderer(), flutterEngine.getDartExecutor());
    paramActivity = activityAwarePlugins.values().iterator();
    while (paramActivity.hasNext())
    {
      paramk = (ActivityAware)paramActivity.next();
      if (isWaitingForActivityReattachment) {
        paramk.onReattachedToActivityForConfigChanges(activityPluginBinding);
      } else {
        paramk.onAttachedToActivity(activityPluginBinding);
      }
    }
    isWaitingForActivityReattachment = false;
  }
  
  private Activity attachedActivity()
  {
    Object localObject = exclusiveActivity;
    if (localObject != null) {
      localObject = (Activity)((ExclusiveAppComponent)localObject).getAppComponent();
    } else {
      localObject = null;
    }
    return (Activity)localObject;
  }
  
  private void detachFromActivityInternal()
  {
    flutterEngine.getPlatformViewsController().detach();
    exclusiveActivity = null;
    activityPluginBinding = null;
  }
  
  private void detachFromAppComponent()
  {
    if (isAttachedToActivity()) {
      detachFromActivity();
    } else if (isAttachedToService()) {
      detachFromService();
    } else if (isAttachedToBroadcastReceiver()) {
      detachFromBroadcastReceiver();
    } else if (isAttachedToContentProvider()) {
      detachFromContentProvider();
    }
  }
  
  private boolean isAttachedToActivity()
  {
    boolean bool;
    if (exclusiveActivity != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isAttachedToBroadcastReceiver()
  {
    boolean bool;
    if (broadcastReceiver != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isAttachedToContentProvider()
  {
    boolean bool;
    if (contentProvider != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isAttachedToService()
  {
    boolean bool;
    if (service != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public void add(FlutterPlugin paramFlutterPlugin)
  {
    // Byte code:
    //   0: ldc -27
    //   2: invokestatic 235	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5: astore_2
    //   6: aload_2
    //   7: aload_1
    //   8: invokevirtual 239	java/lang/Object:getClass	()Ljava/lang/Class;
    //   11: invokevirtual 245	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   14: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: pop
    //   18: aload_2
    //   19: invokevirtual 253	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   22: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   25: astore_2
    //   26: aload_0
    //   27: aload_1
    //   28: invokevirtual 239	java/lang/Object:getClass	()Ljava/lang/Class;
    //   31: invokevirtual 263	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:has	(Ljava/lang/Class;)Z
    //   34: istore_3
    //   35: iload_3
    //   36: ifeq +76 -> 112
    //   39: new 247	java/lang/StringBuilder
    //   42: astore 4
    //   44: aload 4
    //   46: invokespecial 264	java/lang/StringBuilder:<init>	()V
    //   49: aload 4
    //   51: ldc_w 266
    //   54: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload 4
    //   60: aload_1
    //   61: invokevirtual 269	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: aload 4
    //   67: ldc_w 271
    //   70: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload 4
    //   76: aload_0
    //   77: getfield 91	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:flutterEngine	Lio/flutter/embedding/engine/FlutterEngine;
    //   80: invokevirtual 269	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload 4
    //   86: ldc_w 273
    //   89: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: pop
    //   93: ldc 35
    //   95: aload 4
    //   97: invokevirtual 253	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   100: invokestatic 279	io/flutter/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: aload_2
    //   104: ifnull +7 -> 111
    //   107: aload_2
    //   108: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   111: return
    //   112: new 247	java/lang/StringBuilder
    //   115: astore 4
    //   117: aload 4
    //   119: invokespecial 264	java/lang/StringBuilder:<init>	()V
    //   122: aload 4
    //   124: ldc_w 284
    //   127: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: pop
    //   131: aload 4
    //   133: aload_1
    //   134: invokevirtual 269	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: ldc 35
    //   140: aload 4
    //   142: invokevirtual 253	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 287	io/flutter/Log:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: aload_0
    //   149: getfield 79	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:plugins	Ljava/util/Map;
    //   152: aload_1
    //   153: invokevirtual 239	java/lang/Object:getClass	()Ljava/lang/Class;
    //   156: aload_1
    //   157: invokeinterface 291 3 0
    //   162: pop
    //   163: aload_1
    //   164: aload_0
    //   165: getfield 121	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:pluginBinding	Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;
    //   168: invokeinterface 297 2 0
    //   173: aload_1
    //   174: instanceof 174
    //   177: ifeq +43 -> 220
    //   180: aload_1
    //   181: checkcast 174	io/flutter/embedding/engine/plugins/activity/ActivityAware
    //   184: astore 4
    //   186: aload_0
    //   187: getfield 81	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityAwarePlugins	Ljava/util/Map;
    //   190: aload_1
    //   191: invokevirtual 239	java/lang/Object:getClass	()Ljava/lang/Class;
    //   194: aload 4
    //   196: invokeinterface 291 3 0
    //   201: pop
    //   202: aload_0
    //   203: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   206: ifeq +14 -> 220
    //   209: aload 4
    //   211: aload_0
    //   212: getfield 128	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;
    //   215: invokeinterface 181 2 0
    //   220: aload_1
    //   221: instanceof 299
    //   224: ifeq +43 -> 267
    //   227: aload_1
    //   228: checkcast 299	io/flutter/embedding/engine/plugins/service/ServiceAware
    //   231: astore 4
    //   233: aload_0
    //   234: getfield 85	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:serviceAwarePlugins	Ljava/util/Map;
    //   237: aload_1
    //   238: invokevirtual 239	java/lang/Object:getClass	()Ljava/lang/Class;
    //   241: aload 4
    //   243: invokeinterface 291 3 0
    //   248: pop
    //   249: aload_0
    //   250: invokespecial 204	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToService	()Z
    //   253: ifeq +14 -> 267
    //   256: aload 4
    //   258: aload_0
    //   259: getfield 301	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:servicePluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;
    //   262: invokeinterface 305 2 0
    //   267: aload_1
    //   268: instanceof 307
    //   271: ifeq +43 -> 314
    //   274: aload_1
    //   275: checkcast 307	io/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware
    //   278: astore 4
    //   280: aload_0
    //   281: getfield 87	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:broadcastReceiverAwarePlugins	Ljava/util/Map;
    //   284: aload_1
    //   285: invokevirtual 239	java/lang/Object:getClass	()Ljava/lang/Class;
    //   288: aload 4
    //   290: invokeinterface 291 3 0
    //   295: pop
    //   296: aload_0
    //   297: invokespecial 210	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToBroadcastReceiver	()Z
    //   300: ifeq +14 -> 314
    //   303: aload 4
    //   305: aload_0
    //   306: getfield 309	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:broadcastReceiverPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;
    //   309: invokeinterface 313 2 0
    //   314: aload_1
    //   315: instanceof 315
    //   318: ifeq +43 -> 361
    //   321: aload_1
    //   322: checkcast 315	io/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware
    //   325: astore 4
    //   327: aload_0
    //   328: getfield 89	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:contentProviderAwarePlugins	Ljava/util/Map;
    //   331: aload_1
    //   332: invokevirtual 239	java/lang/Object:getClass	()Ljava/lang/Class;
    //   335: aload 4
    //   337: invokeinterface 291 3 0
    //   342: pop
    //   343: aload_0
    //   344: invokespecial 216	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToContentProvider	()Z
    //   347: ifeq +14 -> 361
    //   350: aload 4
    //   352: aload_0
    //   353: getfield 317	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:contentProviderPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;
    //   356: invokeinterface 321 2 0
    //   361: aload_2
    //   362: ifnull +7 -> 369
    //   365: aload_2
    //   366: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   369: return
    //   370: astore_1
    //   371: aload_2
    //   372: ifnull +16 -> 388
    //   375: aload_2
    //   376: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   379: goto +9 -> 388
    //   382: astore_2
    //   383: aload_1
    //   384: aload_2
    //   385: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   388: aload_1
    //   389: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	390	0	this	FlutterEngineConnectionRegistry
    //   0	390	1	paramFlutterPlugin	FlutterPlugin
    //   5	371	2	localObject1	Object
    //   382	3	2	localThrowable	Throwable
    //   34	2	3	bool	boolean
    //   42	309	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   26	35	370	finally
    //   39	103	370	finally
    //   112	220	370	finally
    //   220	267	370	finally
    //   267	314	370	finally
    //   314	361	370	finally
    //   375	379	382	finally
  }
  
  public void add(Set<FlutterPlugin> paramSet)
  {
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      add((FlutterPlugin)paramSet.next());
    }
  }
  
  /* Error */
  public void attachToActivity(ExclusiveAppComponent<Activity> paramExclusiveAppComponent, k paramk)
  {
    // Byte code:
    //   0: ldc_w 339
    //   3: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   6: astore_3
    //   7: aload_0
    //   8: getfield 185	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:exclusiveActivity	Lio/flutter/embedding/android/ExclusiveAppComponent;
    //   11: astore 4
    //   13: aload 4
    //   15: ifnull +10 -> 25
    //   18: aload 4
    //   20: invokeinterface 342 1 0
    //   25: aload_0
    //   26: invokespecial 344	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:detachFromAppComponent	()V
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 185	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:exclusiveActivity	Lio/flutter/embedding/android/ExclusiveAppComponent;
    //   34: aload_0
    //   35: aload_1
    //   36: invokeinterface 190 1 0
    //   41: checkcast 130	android/app/Activity
    //   44: aload_2
    //   45: invokespecial 346	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:attachToActivityInternal	(Landroid/app/Activity;Lb1/k;)V
    //   48: aload_3
    //   49: ifnull +7 -> 56
    //   52: aload_3
    //   53: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   56: return
    //   57: astore_1
    //   58: aload_3
    //   59: ifnull +16 -> 75
    //   62: aload_3
    //   63: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   66: goto +9 -> 75
    //   69: astore_2
    //   70: aload_1
    //   71: aload_2
    //   72: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   75: aload_1
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	FlutterEngineConnectionRegistry
    //   0	77	1	paramExclusiveAppComponent	ExclusiveAppComponent<Activity>
    //   0	77	2	paramk	k
    //   6	57	3	localTraceSection	io.flutter.util.TraceSection
    //   11	8	4	localExclusiveAppComponent	ExclusiveAppComponent
    // Exception table:
    //   from	to	target	type
    //   7	13	57	finally
    //   18	25	57	finally
    //   25	48	57	finally
    //   62	66	69	finally
  }
  
  /* Error */
  public void attachToBroadcastReceiver(BroadcastReceiver paramBroadcastReceiver, k paramk)
  {
    // Byte code:
    //   0: ldc_w 351
    //   3: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   6: astore_2
    //   7: aload_0
    //   8: invokespecial 344	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:detachFromAppComponent	()V
    //   11: aload_0
    //   12: aload_1
    //   13: putfield 221	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:broadcastReceiver	Landroid/content/BroadcastReceiver;
    //   16: new 24	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding
    //   19: astore_3
    //   20: aload_3
    //   21: aload_1
    //   22: invokespecial 354	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding:<init>	(Landroid/content/BroadcastReceiver;)V
    //   25: aload_0
    //   26: aload_3
    //   27: putfield 309	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:broadcastReceiverPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;
    //   30: aload_0
    //   31: getfield 87	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:broadcastReceiverAwarePlugins	Ljava/util/Map;
    //   34: invokeinterface 156 1 0
    //   39: invokeinterface 162 1 0
    //   44: astore_1
    //   45: aload_1
    //   46: invokeinterface 168 1 0
    //   51: ifeq +24 -> 75
    //   54: aload_1
    //   55: invokeinterface 172 1 0
    //   60: checkcast 307	io/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware
    //   63: aload_0
    //   64: getfield 309	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:broadcastReceiverPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding;
    //   67: invokeinterface 313 2 0
    //   72: goto -27 -> 45
    //   75: aload_2
    //   76: ifnull +7 -> 83
    //   79: aload_2
    //   80: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   83: return
    //   84: astore_1
    //   85: aload_2
    //   86: ifnull +16 -> 102
    //   89: aload_2
    //   90: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   93: goto +9 -> 102
    //   96: astore_2
    //   97: aload_1
    //   98: aload_2
    //   99: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	FlutterEngineConnectionRegistry
    //   0	104	1	paramBroadcastReceiver	BroadcastReceiver
    //   0	104	2	paramk	k
    //   19	8	3	localFlutterEngineBroadcastReceiverPluginBinding	FlutterEngineBroadcastReceiverPluginBinding
    // Exception table:
    //   from	to	target	type
    //   7	45	84	finally
    //   45	72	84	finally
    //   89	93	96	finally
  }
  
  /* Error */
  public void attachToContentProvider(ContentProvider paramContentProvider, k paramk)
  {
    // Byte code:
    //   0: ldc_w 358
    //   3: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   6: astore_2
    //   7: aload_0
    //   8: invokespecial 344	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:detachFromAppComponent	()V
    //   11: aload_0
    //   12: aload_1
    //   13: putfield 223	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:contentProvider	Landroid/content/ContentProvider;
    //   16: new 27	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding
    //   19: astore_3
    //   20: aload_3
    //   21: aload_1
    //   22: invokespecial 361	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding:<init>	(Landroid/content/ContentProvider;)V
    //   25: aload_0
    //   26: aload_3
    //   27: putfield 317	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:contentProviderPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;
    //   30: aload_0
    //   31: getfield 89	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:contentProviderAwarePlugins	Ljava/util/Map;
    //   34: invokeinterface 156 1 0
    //   39: invokeinterface 162 1 0
    //   44: astore_1
    //   45: aload_1
    //   46: invokeinterface 168 1 0
    //   51: ifeq +24 -> 75
    //   54: aload_1
    //   55: invokeinterface 172 1 0
    //   60: checkcast 315	io/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware
    //   63: aload_0
    //   64: getfield 317	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:contentProviderPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding;
    //   67: invokeinterface 321 2 0
    //   72: goto -27 -> 45
    //   75: aload_2
    //   76: ifnull +7 -> 83
    //   79: aload_2
    //   80: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   83: return
    //   84: astore_1
    //   85: aload_2
    //   86: ifnull +16 -> 102
    //   89: aload_2
    //   90: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   93: goto +9 -> 102
    //   96: astore_2
    //   97: aload_1
    //   98: aload_2
    //   99: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   102: aload_1
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	FlutterEngineConnectionRegistry
    //   0	104	1	paramContentProvider	ContentProvider
    //   0	104	2	paramk	k
    //   19	8	3	localFlutterEngineContentProviderPluginBinding	FlutterEngineContentProviderPluginBinding
    // Exception table:
    //   from	to	target	type
    //   7	45	84	finally
    //   45	72	84	finally
    //   89	93	96	finally
  }
  
  /* Error */
  public void attachToService(Service paramService, k paramk, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 365
    //   3: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   6: astore 4
    //   8: aload_0
    //   9: invokespecial 344	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:detachFromAppComponent	()V
    //   12: aload_0
    //   13: aload_1
    //   14: putfield 225	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:service	Landroid/app/Service;
    //   17: new 30	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding
    //   20: astore 5
    //   22: aload 5
    //   24: aload_1
    //   25: aload_2
    //   26: invokespecial 368	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding:<init>	(Landroid/app/Service;Lb1/k;)V
    //   29: aload_0
    //   30: aload 5
    //   32: putfield 301	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:servicePluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;
    //   35: aload_0
    //   36: getfield 85	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:serviceAwarePlugins	Ljava/util/Map;
    //   39: invokeinterface 156 1 0
    //   44: invokeinterface 162 1 0
    //   49: astore_1
    //   50: aload_1
    //   51: invokeinterface 168 1 0
    //   56: ifeq +24 -> 80
    //   59: aload_1
    //   60: invokeinterface 172 1 0
    //   65: checkcast 299	io/flutter/embedding/engine/plugins/service/ServiceAware
    //   68: aload_0
    //   69: getfield 301	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:servicePluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;
    //   72: invokeinterface 305 2 0
    //   77: goto -27 -> 50
    //   80: aload 4
    //   82: ifnull +8 -> 90
    //   85: aload 4
    //   87: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   90: return
    //   91: astore_1
    //   92: aload 4
    //   94: ifnull +17 -> 111
    //   97: aload 4
    //   99: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   102: goto +9 -> 111
    //   105: astore_2
    //   106: aload_1
    //   107: aload_2
    //   108: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   111: aload_1
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	FlutterEngineConnectionRegistry
    //   0	113	1	paramService	Service
    //   0	113	2	paramk	k
    //   0	113	3	paramBoolean	boolean
    //   6	92	4	localTraceSection	io.flutter.util.TraceSection
    //   20	11	5	localFlutterEngineServicePluginBinding	FlutterEngineServicePluginBinding
    // Exception table:
    //   from	to	target	type
    //   8	50	91	finally
    //   50	77	91	finally
    //   97	102	105	finally
  }
  
  public void destroy()
  {
    Log.v("FlutterEngineCxnRegstry", "Destroying.");
    detachFromAppComponent();
    removeAll();
  }
  
  /* Error */
  public void detachFromActivity()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   4: ifeq +86 -> 90
    //   7: ldc_w 376
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 81	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityAwarePlugins	Ljava/util/Map;
    //   18: invokeinterface 156 1 0
    //   23: invokeinterface 162 1 0
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface 168 1 0
    //   35: ifeq +20 -> 55
    //   38: aload_2
    //   39: invokeinterface 172 1 0
    //   44: checkcast 174	io/flutter/embedding/engine/plugins/activity/ActivityAware
    //   47: invokeinterface 379 1 0
    //   52: goto -23 -> 29
    //   55: aload_0
    //   56: invokespecial 381	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:detachFromActivityInternal	()V
    //   59: aload_1
    //   60: ifnull +38 -> 98
    //   63: aload_1
    //   64: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   67: goto +31 -> 98
    //   70: astore_2
    //   71: aload_1
    //   72: ifnull +16 -> 88
    //   75: aload_1
    //   76: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   79: goto +9 -> 88
    //   82: astore_1
    //   83: aload_2
    //   84: aload_1
    //   85: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   88: aload_2
    //   89: athrow
    //   90: ldc 35
    //   92: ldc_w 383
    //   95: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   98: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	FlutterEngineConnectionRegistry
    //   13	63	1	localTraceSection	io.flutter.util.TraceSection
    //   82	3	1	localThrowable	Throwable
    //   28	11	2	localIterator	Iterator
    //   70	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	29	70	finally
    //   29	52	70	finally
    //   55	59	70	finally
    //   75	79	82	finally
  }
  
  /* Error */
  public void detachFromActivityForConfigChanges()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   4: ifeq +91 -> 95
    //   7: ldc_w 389
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_1
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 83	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isWaitingForActivityReattachment	Z
    //   19: aload_0
    //   20: getfield 81	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityAwarePlugins	Ljava/util/Map;
    //   23: invokeinterface 156 1 0
    //   28: invokeinterface 162 1 0
    //   33: astore_2
    //   34: aload_2
    //   35: invokeinterface 168 1 0
    //   40: ifeq +20 -> 60
    //   43: aload_2
    //   44: invokeinterface 172 1 0
    //   49: checkcast 174	io/flutter/embedding/engine/plugins/activity/ActivityAware
    //   52: invokeinterface 392 1 0
    //   57: goto -23 -> 34
    //   60: aload_0
    //   61: invokespecial 381	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:detachFromActivityInternal	()V
    //   64: aload_1
    //   65: ifnull +38 -> 103
    //   68: aload_1
    //   69: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   72: goto +31 -> 103
    //   75: astore_2
    //   76: aload_1
    //   77: ifnull +16 -> 93
    //   80: aload_1
    //   81: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   84: goto +9 -> 93
    //   87: astore_1
    //   88: aload_2
    //   89: aload_1
    //   90: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   93: aload_2
    //   94: athrow
    //   95: ldc 35
    //   97: ldc_w 383
    //   100: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	FlutterEngineConnectionRegistry
    //   13	68	1	localTraceSection	io.flutter.util.TraceSection
    //   87	3	1	localThrowable	Throwable
    //   33	11	2	localIterator	Iterator
    //   75	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	34	75	finally
    //   34	57	75	finally
    //   60	64	75	finally
    //   80	84	87	finally
  }
  
  /* Error */
  public void detachFromBroadcastReceiver()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 210	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToBroadcastReceiver	()Z
    //   4: ifeq +82 -> 86
    //   7: ldc_w 394
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 87	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:broadcastReceiverAwarePlugins	Ljava/util/Map;
    //   18: invokeinterface 156 1 0
    //   23: invokeinterface 162 1 0
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface 168 1 0
    //   35: ifeq +20 -> 55
    //   38: aload_2
    //   39: invokeinterface 172 1 0
    //   44: checkcast 307	io/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware
    //   47: invokeinterface 397 1 0
    //   52: goto -23 -> 29
    //   55: aload_1
    //   56: ifnull +38 -> 94
    //   59: aload_1
    //   60: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   63: goto +31 -> 94
    //   66: astore_2
    //   67: aload_1
    //   68: ifnull +16 -> 84
    //   71: aload_1
    //   72: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   75: goto +9 -> 84
    //   78: astore_1
    //   79: aload_2
    //   80: aload_1
    //   81: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   84: aload_2
    //   85: athrow
    //   86: ldc 35
    //   88: ldc_w 399
    //   91: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	FlutterEngineConnectionRegistry
    //   13	59	1	localTraceSection	io.flutter.util.TraceSection
    //   78	3	1	localThrowable	Throwable
    //   28	11	2	localIterator	Iterator
    //   66	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	29	66	finally
    //   29	52	66	finally
    //   71	75	78	finally
  }
  
  /* Error */
  public void detachFromContentProvider()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 216	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToContentProvider	()Z
    //   4: ifeq +82 -> 86
    //   7: ldc_w 401
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 89	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:contentProviderAwarePlugins	Ljava/util/Map;
    //   18: invokeinterface 156 1 0
    //   23: invokeinterface 162 1 0
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface 168 1 0
    //   35: ifeq +20 -> 55
    //   38: aload_2
    //   39: invokeinterface 172 1 0
    //   44: checkcast 315	io/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware
    //   47: invokeinterface 404 1 0
    //   52: goto -23 -> 29
    //   55: aload_1
    //   56: ifnull +38 -> 94
    //   59: aload_1
    //   60: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   63: goto +31 -> 94
    //   66: astore_2
    //   67: aload_1
    //   68: ifnull +16 -> 84
    //   71: aload_1
    //   72: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   75: goto +9 -> 84
    //   78: astore_1
    //   79: aload_2
    //   80: aload_1
    //   81: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   84: aload_2
    //   85: athrow
    //   86: ldc 35
    //   88: ldc_w 406
    //   91: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	95	0	this	FlutterEngineConnectionRegistry
    //   13	59	1	localTraceSection	io.flutter.util.TraceSection
    //   78	3	1	localThrowable	Throwable
    //   28	11	2	localIterator	Iterator
    //   66	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	29	66	finally
    //   29	52	66	finally
    //   71	75	78	finally
  }
  
  /* Error */
  public void detachFromService()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 204	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToService	()Z
    //   4: ifeq +92 -> 96
    //   7: ldc_w 408
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 85	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:serviceAwarePlugins	Ljava/util/Map;
    //   18: invokeinterface 156 1 0
    //   23: invokeinterface 162 1 0
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface 168 1 0
    //   35: ifeq +20 -> 55
    //   38: aload_2
    //   39: invokeinterface 172 1 0
    //   44: checkcast 299	io/flutter/embedding/engine/plugins/service/ServiceAware
    //   47: invokeinterface 411 1 0
    //   52: goto -23 -> 29
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 225	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:service	Landroid/app/Service;
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 301	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:servicePluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;
    //   65: aload_1
    //   66: ifnull +38 -> 104
    //   69: aload_1
    //   70: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   73: goto +31 -> 104
    //   76: astore_2
    //   77: aload_1
    //   78: ifnull +16 -> 94
    //   81: aload_1
    //   82: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   85: goto +9 -> 94
    //   88: astore_1
    //   89: aload_2
    //   90: aload_1
    //   91: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   94: aload_2
    //   95: athrow
    //   96: ldc 35
    //   98: ldc_w 413
    //   101: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	FlutterEngineConnectionRegistry
    //   13	69	1	localTraceSection	io.flutter.util.TraceSection
    //   88	3	1	localThrowable	Throwable
    //   28	11	2	localIterator	Iterator
    //   76	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	29	76	finally
    //   29	52	76	finally
    //   55	65	76	finally
    //   81	85	88	finally
  }
  
  public FlutterPlugin get(Class<? extends FlutterPlugin> paramClass)
  {
    return (FlutterPlugin)plugins.get(paramClass);
  }
  
  public boolean has(Class<? extends FlutterPlugin> paramClass)
  {
    return plugins.containsKey(paramClass);
  }
  
  /* Error */
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   4: ifeq +60 -> 64
    //   7: ldc_w 428
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore 4
    //   15: aload_0
    //   16: getfield 128	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;
    //   19: iload_1
    //   20: iload_2
    //   21: aload_3
    //   22: invokevirtual 430	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding:onActivityResult	(IILandroid/content/Intent;)Z
    //   25: istore 5
    //   27: aload 4
    //   29: ifnull +8 -> 37
    //   32: aload 4
    //   34: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   37: iload 5
    //   39: ireturn
    //   40: astore_3
    //   41: aload 4
    //   43: ifnull +19 -> 62
    //   46: aload 4
    //   48: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   51: goto +11 -> 62
    //   54: astore 4
    //   56: aload_3
    //   57: aload 4
    //   59: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   62: aload_3
    //   63: athrow
    //   64: ldc 35
    //   66: ldc_w 432
    //   69: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: iconst_0
    //   73: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	FlutterEngineConnectionRegistry
    //   0	74	1	paramInt1	int
    //   0	74	2	paramInt2	int
    //   0	74	3	paramIntent	Intent
    //   13	34	4	localTraceSection	io.flutter.util.TraceSection
    //   54	4	4	localThrowable	Throwable
    //   25	13	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   15	27	40	finally
    //   46	51	54	finally
  }
  
  /* Error */
  public void onMoveToBackground()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 204	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToService	()Z
    //   4: ifeq +48 -> 52
    //   7: ldc_w 435
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 301	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:servicePluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;
    //   18: invokevirtual 437	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding:onMoveToBackground	()V
    //   21: aload_1
    //   22: ifnull +30 -> 52
    //   25: aload_1
    //   26: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   29: goto +23 -> 52
    //   32: astore_2
    //   33: aload_1
    //   34: ifnull +16 -> 50
    //   37: aload_1
    //   38: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   41: goto +9 -> 50
    //   44: astore_1
    //   45: aload_2
    //   46: aload_1
    //   47: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   50: aload_2
    //   51: athrow
    //   52: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	FlutterEngineConnectionRegistry
    //   13	25	1	localTraceSection	io.flutter.util.TraceSection
    //   44	3	1	localThrowable	Throwable
    //   32	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	21	32	finally
    //   37	41	44	finally
  }
  
  /* Error */
  public void onMoveToForeground()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 204	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToService	()Z
    //   4: ifeq +48 -> 52
    //   7: ldc_w 440
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 301	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:servicePluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding;
    //   18: invokevirtual 442	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineServicePluginBinding:onMoveToForeground	()V
    //   21: aload_1
    //   22: ifnull +30 -> 52
    //   25: aload_1
    //   26: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   29: goto +23 -> 52
    //   32: astore_2
    //   33: aload_1
    //   34: ifnull +16 -> 50
    //   37: aload_1
    //   38: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   41: goto +9 -> 50
    //   44: astore_1
    //   45: aload_2
    //   46: aload_1
    //   47: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   50: aload_2
    //   51: athrow
    //   52: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	this	FlutterEngineConnectionRegistry
    //   13	25	1	localTraceSection	io.flutter.util.TraceSection
    //   44	3	1	localThrowable	Throwable
    //   32	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	21	32	finally
    //   37	41	44	finally
  }
  
  /* Error */
  public void onNewIntent(Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   4: ifeq +49 -> 53
    //   7: ldc_w 446
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield 128	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;
    //   18: aload_1
    //   19: invokevirtual 448	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding:onNewIntent	(Landroid/content/Intent;)V
    //   22: aload_2
    //   23: ifnull +38 -> 61
    //   26: aload_2
    //   27: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   30: goto +31 -> 61
    //   33: astore_1
    //   34: aload_2
    //   35: ifnull +16 -> 51
    //   38: aload_2
    //   39: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   42: goto +9 -> 51
    //   45: astore_2
    //   46: aload_1
    //   47: aload_2
    //   48: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   51: aload_1
    //   52: athrow
    //   53: ldc 35
    //   55: ldc_w 450
    //   58: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	FlutterEngineConnectionRegistry
    //   0	62	1	paramIntent	Intent
    //   13	26	2	localTraceSection	io.flutter.util.TraceSection
    //   45	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   14	22	33	finally
    //   38	42	45	finally
  }
  
  /* Error */
  public boolean onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   4: ifeq +58 -> 62
    //   7: ldc_w 454
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore 4
    //   15: aload_0
    //   16: getfield 128	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;
    //   19: iload_1
    //   20: aload_2
    //   21: aload_3
    //   22: invokevirtual 456	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding:onRequestPermissionsResult	(I[Ljava/lang/String;[I)Z
    //   25: istore 5
    //   27: aload 4
    //   29: ifnull +8 -> 37
    //   32: aload 4
    //   34: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   37: iload 5
    //   39: ireturn
    //   40: astore_2
    //   41: aload 4
    //   43: ifnull +17 -> 60
    //   46: aload 4
    //   48: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   51: goto +9 -> 60
    //   54: astore_3
    //   55: aload_2
    //   56: aload_3
    //   57: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   60: aload_2
    //   61: athrow
    //   62: ldc 35
    //   64: ldc_w 458
    //   67: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: iconst_0
    //   71: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	FlutterEngineConnectionRegistry
    //   0	72	1	paramInt	int
    //   0	72	2	paramArrayOfString	String[]
    //   0	72	3	paramArrayOfInt	int[]
    //   13	34	4	localTraceSection	io.flutter.util.TraceSection
    //   25	13	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   15	27	40	finally
    //   46	51	54	finally
  }
  
  /* Error */
  public void onRestoreInstanceState(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   4: ifeq +49 -> 53
    //   7: ldc_w 462
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield 128	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;
    //   18: aload_1
    //   19: invokevirtual 464	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding:onRestoreInstanceState	(Landroid/os/Bundle;)V
    //   22: aload_2
    //   23: ifnull +38 -> 61
    //   26: aload_2
    //   27: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   30: goto +31 -> 61
    //   33: astore_1
    //   34: aload_2
    //   35: ifnull +16 -> 51
    //   38: aload_2
    //   39: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   42: goto +9 -> 51
    //   45: astore_2
    //   46: aload_1
    //   47: aload_2
    //   48: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   51: aload_1
    //   52: athrow
    //   53: ldc 35
    //   55: ldc_w 466
    //   58: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	FlutterEngineConnectionRegistry
    //   0	62	1	paramBundle	Bundle
    //   13	26	2	localTraceSection	io.flutter.util.TraceSection
    //   45	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   14	22	33	finally
    //   38	42	45	finally
  }
  
  /* Error */
  public void onSaveInstanceState(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   4: ifeq +49 -> 53
    //   7: ldc_w 469
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield 128	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;
    //   18: aload_1
    //   19: invokevirtual 471	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding:onSaveInstanceState	(Landroid/os/Bundle;)V
    //   22: aload_2
    //   23: ifnull +38 -> 61
    //   26: aload_2
    //   27: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   30: goto +31 -> 61
    //   33: astore_1
    //   34: aload_2
    //   35: ifnull +16 -> 51
    //   38: aload_2
    //   39: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   42: goto +9 -> 51
    //   45: astore_2
    //   46: aload_1
    //   47: aload_2
    //   48: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   51: aload_1
    //   52: athrow
    //   53: ldc 35
    //   55: ldc_w 473
    //   58: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	FlutterEngineConnectionRegistry
    //   0	62	1	paramBundle	Bundle
    //   13	26	2	localTraceSection	io.flutter.util.TraceSection
    //   45	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   14	22	33	finally
    //   38	42	45	finally
  }
  
  /* Error */
  public void onUserLeaveHint()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   4: ifeq +48 -> 52
    //   7: ldc_w 476
    //   10: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 128	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityPluginBinding	Lio/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding;
    //   18: invokevirtual 478	io/flutter/embedding/engine/FlutterEngineConnectionRegistry$FlutterEngineActivityPluginBinding:onUserLeaveHint	()V
    //   21: aload_1
    //   22: ifnull +38 -> 60
    //   25: aload_1
    //   26: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   29: goto +31 -> 60
    //   32: astore_2
    //   33: aload_1
    //   34: ifnull +16 -> 50
    //   37: aload_1
    //   38: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   41: goto +9 -> 50
    //   44: astore_1
    //   45: aload_2
    //   46: aload_1
    //   47: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   50: aload_2
    //   51: athrow
    //   52: ldc 35
    //   54: ldc_w 480
    //   57: invokestatic 386	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	FlutterEngineConnectionRegistry
    //   13	25	1	localTraceSection	io.flutter.util.TraceSection
    //   44	3	1	localThrowable	Throwable
    //   32	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	21	32	finally
    //   37	41	44	finally
  }
  
  /* Error */
  public void remove(Class<? extends FlutterPlugin> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 79	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:plugins	Ljava/util/Map;
    //   4: aload_1
    //   5: invokeinterface 418 2 0
    //   10: checkcast 293	io/flutter/embedding/engine/plugins/FlutterPlugin
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +4 -> 19
    //   18: return
    //   19: ldc_w 484
    //   22: invokestatic 235	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: astore_3
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual 245	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   31: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload_3
    //   36: invokevirtual 253	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokestatic 259	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   42: astore_3
    //   43: aload_2
    //   44: instanceof 174
    //   47: ifeq +30 -> 77
    //   50: aload_0
    //   51: invokespecial 198	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToActivity	()Z
    //   54: ifeq +12 -> 66
    //   57: aload_2
    //   58: checkcast 174	io/flutter/embedding/engine/plugins/activity/ActivityAware
    //   61: invokeinterface 379 1 0
    //   66: aload_0
    //   67: getfield 81	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:activityAwarePlugins	Ljava/util/Map;
    //   70: aload_1
    //   71: invokeinterface 486 2 0
    //   76: pop
    //   77: aload_2
    //   78: instanceof 299
    //   81: ifeq +30 -> 111
    //   84: aload_0
    //   85: invokespecial 204	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToService	()Z
    //   88: ifeq +12 -> 100
    //   91: aload_2
    //   92: checkcast 299	io/flutter/embedding/engine/plugins/service/ServiceAware
    //   95: invokeinterface 411 1 0
    //   100: aload_0
    //   101: getfield 85	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:serviceAwarePlugins	Ljava/util/Map;
    //   104: aload_1
    //   105: invokeinterface 486 2 0
    //   110: pop
    //   111: aload_2
    //   112: instanceof 307
    //   115: ifeq +30 -> 145
    //   118: aload_0
    //   119: invokespecial 210	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToBroadcastReceiver	()Z
    //   122: ifeq +12 -> 134
    //   125: aload_2
    //   126: checkcast 307	io/flutter/embedding/engine/plugins/broadcastreceiver/BroadcastReceiverAware
    //   129: invokeinterface 397 1 0
    //   134: aload_0
    //   135: getfield 87	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:broadcastReceiverAwarePlugins	Ljava/util/Map;
    //   138: aload_1
    //   139: invokeinterface 486 2 0
    //   144: pop
    //   145: aload_2
    //   146: instanceof 315
    //   149: ifeq +30 -> 179
    //   152: aload_0
    //   153: invokespecial 216	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:isAttachedToContentProvider	()Z
    //   156: ifeq +12 -> 168
    //   159: aload_2
    //   160: checkcast 315	io/flutter/embedding/engine/plugins/contentprovider/ContentProviderAware
    //   163: invokeinterface 404 1 0
    //   168: aload_0
    //   169: getfield 89	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:contentProviderAwarePlugins	Ljava/util/Map;
    //   172: aload_1
    //   173: invokeinterface 486 2 0
    //   178: pop
    //   179: aload_2
    //   180: aload_0
    //   181: getfield 121	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:pluginBinding	Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;
    //   184: invokeinterface 489 2 0
    //   189: aload_0
    //   190: getfield 79	io/flutter/embedding/engine/FlutterEngineConnectionRegistry:plugins	Ljava/util/Map;
    //   193: aload_1
    //   194: invokeinterface 486 2 0
    //   199: pop
    //   200: aload_3
    //   201: ifnull +7 -> 208
    //   204: aload_3
    //   205: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   208: return
    //   209: astore_1
    //   210: aload_3
    //   211: ifnull +16 -> 227
    //   214: aload_3
    //   215: invokevirtual 282	io/flutter/util/TraceSection:close	()V
    //   218: goto +9 -> 227
    //   221: astore_2
    //   222: aload_1
    //   223: aload_2
    //   224: invokevirtual 327	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   227: aload_1
    //   228: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	FlutterEngineConnectionRegistry
    //   0	229	1	paramClass	Class<? extends FlutterPlugin>
    //   13	167	2	localFlutterPlugin	FlutterPlugin
    //   221	3	2	localThrowable	Throwable
    //   25	190	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   43	66	209	finally
    //   66	77	209	finally
    //   77	100	209	finally
    //   100	111	209	finally
    //   111	134	209	finally
    //   134	145	209	finally
    //   145	168	209	finally
    //   168	179	209	finally
    //   179	200	209	finally
    //   214	218	221	finally
  }
  
  public void remove(Set<Class<? extends FlutterPlugin>> paramSet)
  {
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      remove((Class)paramSet.next());
    }
  }
  
  public void removeAll()
  {
    remove(new HashSet(plugins.keySet()));
    plugins.clear();
  }
  
  public static class DefaultFlutterAssets
    implements FlutterPlugin.FlutterAssets
  {
    public final FlutterLoader flutterLoader;
    
    private DefaultFlutterAssets(FlutterLoader paramFlutterLoader)
    {
      flutterLoader = paramFlutterLoader;
    }
    
    public String getAssetFilePathByName(String paramString)
    {
      return flutterLoader.getLookupKeyForAsset(paramString);
    }
    
    public String getAssetFilePathByName(String paramString1, String paramString2)
    {
      return flutterLoader.getLookupKeyForAsset(paramString1, paramString2);
    }
    
    public String getAssetFilePathBySubpath(String paramString)
    {
      return flutterLoader.getLookupKeyForAsset(paramString);
    }
    
    public String getAssetFilePathBySubpath(String paramString1, String paramString2)
    {
      return flutterLoader.getLookupKeyForAsset(paramString1, paramString2);
    }
  }
  
  public static class FlutterEngineActivityPluginBinding
    implements ActivityPluginBinding
  {
    private final Activity activity;
    private final HiddenLifecycleReference hiddenLifecycleReference;
    private final Set<PluginRegistry.ActivityResultListener> onActivityResultListeners = new HashSet();
    private final Set<PluginRegistry.NewIntentListener> onNewIntentListeners = new HashSet();
    private final Set<PluginRegistry.RequestPermissionsResultListener> onRequestPermissionsResultListeners = new HashSet();
    private final Set<ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new HashSet();
    private final Set<PluginRegistry.UserLeaveHintListener> onUserLeaveHintListeners = new HashSet();
    private final Set<PluginRegistry.WindowFocusChangedListener> onWindowFocusChangedListeners = new HashSet();
    
    public FlutterEngineActivityPluginBinding(Activity paramActivity, k paramk)
    {
      activity = paramActivity;
      hiddenLifecycleReference = new HiddenLifecycleReference(paramk);
    }
    
    public void addActivityResultListener(PluginRegistry.ActivityResultListener paramActivityResultListener)
    {
      onActivityResultListeners.add(paramActivityResultListener);
    }
    
    public void addOnNewIntentListener(PluginRegistry.NewIntentListener paramNewIntentListener)
    {
      onNewIntentListeners.add(paramNewIntentListener);
    }
    
    public void addOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener paramOnSaveInstanceStateListener)
    {
      onSaveInstanceStateListeners.add(paramOnSaveInstanceStateListener);
    }
    
    public void addOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener paramUserLeaveHintListener)
    {
      onUserLeaveHintListeners.add(paramUserLeaveHintListener);
    }
    
    public void addOnWindowFocusChangedListener(PluginRegistry.WindowFocusChangedListener paramWindowFocusChangedListener)
    {
      onWindowFocusChangedListeners.add(paramWindowFocusChangedListener);
    }
    
    public void addRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener paramRequestPermissionsResultListener)
    {
      onRequestPermissionsResultListeners.add(paramRequestPermissionsResultListener);
    }
    
    public Activity getActivity()
    {
      return activity;
    }
    
    public Object getLifecycle()
    {
      return hiddenLifecycleReference;
    }
    
    public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      Iterator localIterator = new HashSet(onActivityResultListeners).iterator();
      for (boolean bool = false;; bool = true)
      {
        if (!localIterator.hasNext()) {
          break label61;
        }
        if ((!((PluginRegistry.ActivityResultListener)localIterator.next()).onActivityResult(paramInt1, paramInt2, paramIntent)) && (!bool)) {
          break;
        }
      }
      label61:
      return bool;
    }
    
    public void onNewIntent(Intent paramIntent)
    {
      Iterator localIterator = onNewIntentListeners.iterator();
      while (localIterator.hasNext()) {
        ((PluginRegistry.NewIntentListener)localIterator.next()).onNewIntent(paramIntent);
      }
    }
    
    public boolean onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
    {
      Iterator localIterator = onRequestPermissionsResultListeners.iterator();
      for (boolean bool = false;; bool = true)
      {
        if (!localIterator.hasNext()) {
          break label56;
        }
        if ((!((PluginRegistry.RequestPermissionsResultListener)localIterator.next()).onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt)) && (!bool)) {
          break;
        }
      }
      label56:
      return bool;
    }
    
    public void onRestoreInstanceState(Bundle paramBundle)
    {
      Iterator localIterator = onSaveInstanceStateListeners.iterator();
      while (localIterator.hasNext()) {
        ((ActivityPluginBinding.OnSaveInstanceStateListener)localIterator.next()).onRestoreInstanceState(paramBundle);
      }
    }
    
    public void onSaveInstanceState(Bundle paramBundle)
    {
      Iterator localIterator = onSaveInstanceStateListeners.iterator();
      while (localIterator.hasNext()) {
        ((ActivityPluginBinding.OnSaveInstanceStateListener)localIterator.next()).onSaveInstanceState(paramBundle);
      }
    }
    
    public void onUserLeaveHint()
    {
      Iterator localIterator = onUserLeaveHintListeners.iterator();
      while (localIterator.hasNext()) {
        ((PluginRegistry.UserLeaveHintListener)localIterator.next()).onUserLeaveHint();
      }
    }
    
    public void onWindowFocusChanged(boolean paramBoolean)
    {
      Iterator localIterator = onWindowFocusChangedListeners.iterator();
      while (localIterator.hasNext()) {
        ((PluginRegistry.WindowFocusChangedListener)localIterator.next()).onWindowFocusChanged(paramBoolean);
      }
    }
    
    public void removeActivityResultListener(PluginRegistry.ActivityResultListener paramActivityResultListener)
    {
      onActivityResultListeners.remove(paramActivityResultListener);
    }
    
    public void removeOnNewIntentListener(PluginRegistry.NewIntentListener paramNewIntentListener)
    {
      onNewIntentListeners.remove(paramNewIntentListener);
    }
    
    public void removeOnSaveStateListener(ActivityPluginBinding.OnSaveInstanceStateListener paramOnSaveInstanceStateListener)
    {
      onSaveInstanceStateListeners.remove(paramOnSaveInstanceStateListener);
    }
    
    public void removeOnUserLeaveHintListener(PluginRegistry.UserLeaveHintListener paramUserLeaveHintListener)
    {
      onUserLeaveHintListeners.remove(paramUserLeaveHintListener);
    }
    
    public void removeOnWindowFocusChangedListener(PluginRegistry.WindowFocusChangedListener paramWindowFocusChangedListener)
    {
      onWindowFocusChangedListeners.remove(paramWindowFocusChangedListener);
    }
    
    public void removeRequestPermissionsResultListener(PluginRegistry.RequestPermissionsResultListener paramRequestPermissionsResultListener)
    {
      onRequestPermissionsResultListeners.remove(paramRequestPermissionsResultListener);
    }
  }
  
  public static class FlutterEngineBroadcastReceiverPluginBinding
    implements BroadcastReceiverPluginBinding
  {
    private final BroadcastReceiver broadcastReceiver;
    
    public FlutterEngineBroadcastReceiverPluginBinding(BroadcastReceiver paramBroadcastReceiver)
    {
      broadcastReceiver = paramBroadcastReceiver;
    }
    
    public BroadcastReceiver getBroadcastReceiver()
    {
      return broadcastReceiver;
    }
  }
  
  public static class FlutterEngineContentProviderPluginBinding
    implements ContentProviderPluginBinding
  {
    private final ContentProvider contentProvider;
    
    public FlutterEngineContentProviderPluginBinding(ContentProvider paramContentProvider)
    {
      contentProvider = paramContentProvider;
    }
    
    public ContentProvider getContentProvider()
    {
      return contentProvider;
    }
  }
  
  public static class FlutterEngineServicePluginBinding
    implements ServicePluginBinding
  {
    private final HiddenLifecycleReference hiddenLifecycleReference;
    private final Set<ServiceAware.OnModeChangeListener> onModeChangeListeners = new HashSet();
    private final Service service;
    
    public FlutterEngineServicePluginBinding(Service paramService, k paramk)
    {
      service = paramService;
      if (paramk != null) {
        paramService = new HiddenLifecycleReference(paramk);
      } else {
        paramService = null;
      }
      hiddenLifecycleReference = paramService;
    }
    
    public void addOnModeChangeListener(ServiceAware.OnModeChangeListener paramOnModeChangeListener)
    {
      onModeChangeListeners.add(paramOnModeChangeListener);
    }
    
    public Object getLifecycle()
    {
      return hiddenLifecycleReference;
    }
    
    public Service getService()
    {
      return service;
    }
    
    public void onMoveToBackground()
    {
      Iterator localIterator = onModeChangeListeners.iterator();
      while (localIterator.hasNext()) {
        ((ServiceAware.OnModeChangeListener)localIterator.next()).onMoveToBackground();
      }
    }
    
    public void onMoveToForeground()
    {
      Iterator localIterator = onModeChangeListeners.iterator();
      while (localIterator.hasNext()) {
        ((ServiceAware.OnModeChangeListener)localIterator.next()).onMoveToForeground();
      }
    }
    
    public void removeOnModeChangeListener(ServiceAware.OnModeChangeListener paramOnModeChangeListener)
    {
      onModeChangeListeners.remove(paramOnModeChangeListener);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineConnectionRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */