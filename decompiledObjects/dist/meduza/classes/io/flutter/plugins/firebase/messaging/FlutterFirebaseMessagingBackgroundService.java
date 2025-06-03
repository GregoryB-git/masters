package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.plugins.firebase.firestore.streamhandler.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class FlutterFirebaseMessagingBackgroundService
  extends JobIntentService
{
  private static final String TAG = "FLTFireMsgService";
  private static FlutterFirebaseMessagingBackgroundExecutor flutterBackgroundExecutor;
  private static final List<Intent> messagingQueue = Collections.synchronizedList(new LinkedList());
  
  public static void enqueueMessageProcessing(Context paramContext, Intent paramIntent, boolean paramBoolean)
  {
    JobIntentService.enqueueWork(paramContext, FlutterFirebaseMessagingBackgroundService.class, 2020, paramIntent, paramBoolean);
  }
  
  public static void onInitialized()
  {
    Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
    synchronized (messagingQueue)
    {
      Iterator localIterator = ???.iterator();
      while (localIterator.hasNext())
      {
        Intent localIntent = (Intent)localIterator.next();
        flutterBackgroundExecutor.executeDartCallbackInBackgroundIsolate(localIntent, null);
      }
      messagingQueue.clear();
      return;
    }
  }
  
  public static void setCallbackDispatcher(long paramLong)
  {
    FlutterFirebaseMessagingBackgroundExecutor.setCallbackDispatcher(paramLong);
  }
  
  public static void setUserCallbackHandle(long paramLong)
  {
    FlutterFirebaseMessagingBackgroundExecutor.setUserCallbackHandle(paramLong);
  }
  
  public static void startBackgroundIsolate(long paramLong, FlutterShellArgs paramFlutterShellArgs)
  {
    if (flutterBackgroundExecutor != null)
    {
      Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
      return;
    }
    FlutterFirebaseMessagingBackgroundExecutor localFlutterFirebaseMessagingBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
    flutterBackgroundExecutor = localFlutterFirebaseMessagingBackgroundExecutor;
    localFlutterFirebaseMessagingBackgroundExecutor.startBackgroundIsolate(paramLong, paramFlutterShellArgs);
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (flutterBackgroundExecutor == null) {
      flutterBackgroundExecutor = new FlutterFirebaseMessagingBackgroundExecutor();
    }
    flutterBackgroundExecutor.startBackgroundIsolate();
  }
  
  public void onHandleWork(Intent paramIntent)
  {
    if (!flutterBackgroundExecutor.isDartBackgroundHandlerRegistered())
    {
      Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
      return;
    }
    synchronized (messagingQueue)
    {
      if (flutterBackgroundExecutor.isNotRunning())
      {
        Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
        ((List)???).add(paramIntent);
        return;
      }
      ??? = new CountDownLatch(1);
      new Handler(getMainLooper()).post(new b(1, paramIntent, ???));
      try
      {
        ((CountDownLatch)???).await();
      }
      catch (InterruptedException paramIntent)
      {
        Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", paramIntent);
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */