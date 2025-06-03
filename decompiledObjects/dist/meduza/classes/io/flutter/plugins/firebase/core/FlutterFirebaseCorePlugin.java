package io.flutter.plugins.firebase.core;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l8.m;
import u7.j;
import v3.x0;

public class FlutterFirebaseCorePlugin
  implements FlutterPlugin, GeneratedAndroidFirebaseCore.FirebaseCoreHostApi, GeneratedAndroidFirebaseCore.FirebaseAppHostApi
{
  public static Map<String, String> customAuthDomain = new HashMap();
  private Context applicationContext;
  private boolean coreInitialized = false;
  
  private Task<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> firebaseAppToMap(u7.f paramf)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.g(this, paramf, localTaskCompletionSource, 11));
    return localTaskCompletionSource.getTask();
  }
  
  private GeneratedAndroidFirebaseCore.PigeonFirebaseOptions firebaseOptionsToMap(j paramj)
  {
    GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder localBuilder = new GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder();
    localBuilder.setApiKey(a);
    localBuilder.setAppId(b);
    String str = e;
    if (str != null) {
      localBuilder.setMessagingSenderId(str);
    }
    str = g;
    if (str != null) {
      localBuilder.setProjectId(str);
    }
    localBuilder.setDatabaseURL(c);
    localBuilder.setStorageBucket(f);
    localBuilder.setTrackingId(d);
    return localBuilder.build();
  }
  
  private void lambda$firebaseAppToMap$0(u7.f paramf, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder localBuilder = new io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonInitializeResponse$Builder;
      localBuilder.<init>();
      paramf.a();
      localBuilder.setName(b);
      paramf.a();
      localBuilder.setOptions(firebaseOptionsToMap(c));
      localBuilder.setIsAutomaticDataCollectionEnabled(Boolean.valueOf(paramf.k()));
      localBuilder.setPluginConstants((Map)Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(paramf)));
      paramTaskCompletionSource.setResult(localBuilder.build());
    }
    catch (Exception paramf)
    {
      paramTaskCompletionSource.setException(paramf);
    }
  }
  
  /* Error */
  private void lambda$initializeApp$2(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions paramPigeonFirebaseOptions, String paramString, TaskCompletionSource paramTaskCompletionSource)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 226	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getApiKey	()Ljava/lang/String;
    //   4: astore 4
    //   6: ldc -28
    //   8: aload 4
    //   10: invokestatic 233	m6/j:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: aload_1
    //   14: invokevirtual 236	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getAppId	()Ljava/lang/String;
    //   17: astore 5
    //   19: ldc -18
    //   21: aload 5
    //   23: invokestatic 233	m6/j:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   26: aload_1
    //   27: invokevirtual 241	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getDatabaseURL	()Ljava/lang/String;
    //   30: astore 6
    //   32: aload_1
    //   33: invokevirtual 244	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getMessagingSenderId	()Ljava/lang/String;
    //   36: astore 7
    //   38: aload_1
    //   39: invokevirtual 247	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getProjectId	()Ljava/lang/String;
    //   42: astore 8
    //   44: aload_1
    //   45: invokevirtual 250	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getStorageBucket	()Ljava/lang/String;
    //   48: astore 9
    //   50: aload_1
    //   51: invokevirtual 253	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getTrackingId	()Ljava/lang/String;
    //   54: astore 10
    //   56: new 97	u7/j
    //   59: astore 11
    //   61: aload 11
    //   63: aload 5
    //   65: aload 4
    //   67: aload 6
    //   69: aload 10
    //   71: aload 7
    //   73: aload 9
    //   75: aload 8
    //   77: invokespecial 256	u7/j:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   80: invokestatic 261	android/os/Looper:prepare	()V
    //   83: aload_1
    //   84: invokevirtual 264	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getAuthDomain	()Ljava/lang/String;
    //   87: ifnull +17 -> 104
    //   90: getstatic 26	io/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin:customAuthDomain	Ljava/util/Map;
    //   93: aload_2
    //   94: aload_1
    //   95: invokevirtual 264	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonFirebaseOptions:getAuthDomain	()Ljava/lang/String;
    //   98: invokeinterface 268 3 0
    //   103: pop
    //   104: aload_3
    //   105: aload_0
    //   106: aload_0
    //   107: getfield 270	io/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin:applicationContext	Landroid/content/Context;
    //   110: aload 11
    //   112: aload_2
    //   113: invokestatic 274	u7/f:j	(Landroid/content/Context;Lu7/j;Ljava/lang/String;)Lu7/f;
    //   116: invokespecial 276	io/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin:firebaseAppToMap	(Lu7/f;)Lcom/google/android/gms/tasks/Task;
    //   119: invokestatic 211	com/google/android/gms/tasks/Tasks:await	(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    //   122: checkcast 278	io/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$PigeonInitializeResponse
    //   125: invokevirtual 163	com/google/android/gms/tasks/TaskCompletionSource:setResult	(Ljava/lang/Object;)V
    //   128: goto +9 -> 137
    //   131: astore_1
    //   132: aload_3
    //   133: aload_1
    //   134: invokevirtual 167	com/google/android/gms/tasks/TaskCompletionSource:setException	(Ljava/lang/Exception;)V
    //   137: return
    //   138: astore 10
    //   140: goto -57 -> 83
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	FlutterFirebaseCorePlugin
    //   0	143	1	paramPigeonFirebaseOptions	GeneratedAndroidFirebaseCore.PigeonFirebaseOptions
    //   0	143	2	paramString	String
    //   0	143	3	paramTaskCompletionSource	TaskCompletionSource
    //   4	62	4	str1	String
    //   17	47	5	str2	String
    //   30	38	6	str3	String
    //   36	36	7	str4	String
    //   42	34	8	str5	String
    //   48	26	9	str6	String
    //   54	16	10	str7	String
    //   138	1	10	localException	Exception
    //   59	52	11	localj	j
    // Exception table:
    //   from	to	target	type
    //   0	80	131	java/lang/Exception
    //   83	104	131	java/lang/Exception
    //   104	128	131	java/lang/Exception
    //   80	83	138	java/lang/Exception
  }
  
  private void lambda$initializeCore$3(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      if (!coreInitialized) {
        coreInitialized = true;
      } else {
        Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
      }
      synchronized (u7.f.k)
      {
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(u7.f.l.values());
        ??? = new java/util/ArrayList;
        ((ArrayList)???).<init>(((ArrayList)localObject2).size());
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((ArrayList)???).add((GeneratedAndroidFirebaseCore.PigeonInitializeResponse)Tasks.await(firebaseAppToMap((u7.f)((Iterator)localObject2).next())));
        }
        paramTaskCompletionSource.setResult(???);
      }
      return;
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private static void lambda$setAutomaticResourceManagementEnabled$6(String paramString, Boolean paramBoolean, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      paramString = u7.f.f(paramString);
      boolean bool1 = paramBoolean.booleanValue();
      paramString.a();
      if (e.compareAndSet(bool1 ^ true, bool1))
      {
        boolean bool2 = ea.get();
        if ((bool1) && (bool2))
        {
          bool1 = true;
        }
        else
        {
          if ((bool1) || (!bool2)) {
            break label69;
          }
          bool1 = false;
        }
        paramString.l(bool1);
      }
      label69:
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramString)
    {
      paramTaskCompletionSource.setException(paramString);
    }
  }
  
  private <T> void listenToResponse(TaskCompletionSource<T> paramTaskCompletionSource, GeneratedAndroidFirebaseCore.Result<T> paramResult)
  {
    paramTaskCompletionSource.getTask().addOnCompleteListener(new e(paramResult, 2));
  }
  
  public void delete(String paramString, GeneratedAndroidFirebaseCore.Result<Void> paramResult)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(25, paramString, localTaskCompletionSource));
    listenToResponse(localTaskCompletionSource, paramResult);
  }
  
  public void initializeApp(String paramString, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions paramPigeonFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> paramResult)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, paramPigeonFirebaseOptions, paramString, localTaskCompletionSource));
    listenToResponse(localTaskCompletionSource, paramResult);
  }
  
  public void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>> paramResult)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(26, this, localTaskCompletionSource));
    listenToResponse(localTaskCompletionSource, paramResult);
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi._CC.e(paramFlutterPluginBinding.getBinaryMessenger(), this);
    GeneratedAndroidFirebaseCore.FirebaseAppHostApi._CC.e(paramFlutterPluginBinding.getBinaryMessenger(), this);
    applicationContext = paramFlutterPluginBinding.getApplicationContext();
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    applicationContext = null;
    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi._CC.e(paramFlutterPluginBinding.getBinaryMessenger(), null);
    GeneratedAndroidFirebaseCore.FirebaseAppHostApi._CC.e(paramFlutterPluginBinding.getBinaryMessenger(), null);
  }
  
  public void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonFirebaseOptions> paramResult)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new w.g(29, this, localTaskCompletionSource));
    listenToResponse(localTaskCompletionSource, paramResult);
  }
  
  public void setAutomaticDataCollectionEnabled(String paramString, Boolean paramBoolean, GeneratedAndroidFirebaseCore.Result<Void> paramResult)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0(paramString, paramBoolean, localTaskCompletionSource, 10));
    listenToResponse(localTaskCompletionSource, paramResult);
  }
  
  public void setAutomaticResourceManagementEnabled(String paramString, Boolean paramBoolean, GeneratedAndroidFirebaseCore.Result<Void> paramResult)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.g(paramString, paramBoolean, localTaskCompletionSource, 12));
    listenToResponse(localTaskCompletionSource, paramResult);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */