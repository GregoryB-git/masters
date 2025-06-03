package io.flutter.plugins.firebase.messaging;

import aa.z;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import f;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class FlutterFirebaseMessagingBackgroundExecutor
  implements MethodChannel.MethodCallHandler
{
  private static final String CALLBACK_HANDLE_KEY = "callback_handle";
  private static final String TAG = "FLTFireBGExecutor";
  private static final String USER_CALLBACK_HANDLE_KEY = "user_callback_handle";
  private MethodChannel backgroundChannel;
  private FlutterEngine backgroundFlutterEngine;
  private final AtomicBoolean isCallbackDispatcherReady = new AtomicBoolean(false);
  
  private long getPluginCallbackHandle()
  {
    return ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
  }
  
  private long getUserCallbackHandle()
  {
    return ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
  }
  
  private void initializeMethodChannel(BinaryMessenger paramBinaryMessenger)
  {
    paramBinaryMessenger = new MethodChannel(paramBinaryMessenger, "plugins.flutter.io/firebase_messaging_background");
    backgroundChannel = paramBinaryMessenger;
    paramBinaryMessenger.setMethodCallHandler(this);
  }
  
  private void onInitialized()
  {
    isCallbackDispatcherReady.set(true);
    FlutterFirebaseMessagingBackgroundService.onInitialized();
  }
  
  public static void setCallbackDispatcher(long paramLong)
  {
    Context localContext = ContextHolder.getApplicationContext();
    if (localContext == null)
    {
      Log.e("FLTFireBGExecutor", "Context is null, cannot continue.");
      return;
    }
    localContext.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", paramLong).apply();
  }
  
  public static void setUserCallbackHandle(long paramLong)
  {
    ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", paramLong).apply();
  }
  
  public void executeDartCallbackInBackgroundIsolate(Intent paramIntent, final CountDownLatch paramCountDownLatch)
  {
    if (backgroundFlutterEngine == null)
    {
      Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
      return;
    }
    MethodChannel.Result local1 = null;
    if (paramCountDownLatch != null) {
      local1 = new MethodChannel.Result()
      {
        public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
        {
          paramCountDownLatch.countDown();
        }
        
        public void notImplemented()
        {
          paramCountDownLatch.countDown();
        }
        
        public void success(Object paramAnonymousObject)
        {
          paramCountDownLatch.countDown();
        }
      };
    }
    paramCountDownLatch = paramIntent.getByteArrayExtra("notification");
    if (paramCountDownLatch != null) {
      paramIntent = Parcel.obtain();
    }
    try
    {
      paramIntent.unmarshall(paramCountDownLatch, 0, paramCountDownLatch.length);
      paramIntent.setDataPosition(0);
      paramCountDownLatch = FlutterFirebaseMessagingUtils.remoteMessageToMap((z)z.CREATOR.createFromParcel(paramIntent));
      MethodChannel localMethodChannel = backgroundChannel;
      HashMap local2 = new io/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingBackgroundExecutor$2;
      local2.<init>(this, paramCountDownLatch);
      localMethodChannel.invokeMethod("MessagingBackground#onMessage", local2, local1);
      paramIntent.recycle();
    }
    finally
    {
      paramIntent.recycle();
    }
  }
  
  public boolean isDartBackgroundHandlerRegistered()
  {
    boolean bool;
    if (getPluginCallbackHandle() != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isNotRunning()
  {
    return isCallbackDispatcherReady.get() ^ true;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    paramMethodCall = method;
    try
    {
      if (paramMethodCall.equals("MessagingBackground#initialized"))
      {
        onInitialized();
        paramResult.success(Boolean.TRUE);
      }
      else
      {
        paramResult.notImplemented();
      }
    }
    catch (PluginRegistrantException localPluginRegistrantException)
    {
      paramMethodCall = f.l("Flutter FCM error: ");
      paramMethodCall.append(localPluginRegistrantException.getMessage());
      paramResult.error("error", paramMethodCall.toString(), null);
    }
  }
  
  public void startBackgroundIsolate()
  {
    if (isNotRunning())
    {
      long l = getPluginCallbackHandle();
      if (l != 0L) {
        startBackgroundIsolate(l, null);
      }
    }
  }
  
  public void startBackgroundIsolate(long paramLong, FlutterShellArgs paramFlutterShellArgs)
  {
    if (backgroundFlutterEngine != null)
    {
      Log.e("FLTFireBGExecutor", "Background isolate already started.");
      return;
    }
    FlutterLoader localFlutterLoader = FlutterInjector.instance().flutterLoader();
    Handler localHandler = new Handler(Looper.getMainLooper());
    localHandler.post(new b(this, localFlutterLoader, localHandler, paramFlutterShellArgs, paramLong));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundExecutor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */