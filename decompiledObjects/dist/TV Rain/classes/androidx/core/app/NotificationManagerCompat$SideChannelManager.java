package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import z2;

class NotificationManagerCompat$SideChannelManager
  implements Handler.Callback, ServiceConnection
{
  private static final int MSG_QUEUE_TASK = 0;
  private static final int MSG_RETRY_LISTENER_QUEUE = 3;
  private static final int MSG_SERVICE_CONNECTED = 1;
  private static final int MSG_SERVICE_DISCONNECTED = 2;
  private Set<String> mCachedEnabledPackages = new HashSet();
  private final Context mContext;
  private final Handler mHandler;
  private final HandlerThread mHandlerThread;
  private final Map<ComponentName, ListenerRecord> mRecordMap = new HashMap();
  
  public NotificationManagerCompat$SideChannelManager(Context paramContext)
  {
    mContext = paramContext;
    paramContext = new HandlerThread("NotificationManagerCompat");
    mHandlerThread = paramContext;
    paramContext.start();
    mHandler = new Handler(paramContext.getLooper(), this);
  }
  
  private boolean ensureServiceBound(ListenerRecord paramListenerRecord)
  {
    if (bound) {
      return true;
    }
    Object localObject = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
    boolean bool = mContext.bindService((Intent)localObject, this, 33);
    bound = bool;
    if (bool)
    {
      retryCount = 0;
    }
    else
    {
      localObject = z2.t("Unable to bind to listener ");
      ((StringBuilder)localObject).append(componentName);
      Log.w("NotifManCompat", ((StringBuilder)localObject).toString());
      mContext.unbindService(this);
    }
    return bound;
  }
  
  private void ensureServiceUnbound(ListenerRecord paramListenerRecord)
  {
    if (bound)
    {
      mContext.unbindService(this);
      bound = false;
    }
    service = null;
  }
  
  private void handleQueueTask(NotificationManagerCompat.Task paramTask)
  {
    updateListenerMap();
    Iterator localIterator = mRecordMap.values().iterator();
    while (localIterator.hasNext())
    {
      ListenerRecord localListenerRecord = (ListenerRecord)localIterator.next();
      taskQueue.add(paramTask);
      processListenerQueue(localListenerRecord);
    }
  }
  
  private void handleRetryListenerQueue(ComponentName paramComponentName)
  {
    paramComponentName = (ListenerRecord)mRecordMap.get(paramComponentName);
    if (paramComponentName != null) {
      processListenerQueue(paramComponentName);
    }
  }
  
  private void handleServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    paramComponentName = (ListenerRecord)mRecordMap.get(paramComponentName);
    if (paramComponentName != null)
    {
      service = INotificationSideChannel.Stub.asInterface(paramIBinder);
      retryCount = 0;
      processListenerQueue(paramComponentName);
    }
  }
  
  private void handleServiceDisconnected(ComponentName paramComponentName)
  {
    paramComponentName = (ListenerRecord)mRecordMap.get(paramComponentName);
    if (paramComponentName != null) {
      ensureServiceUnbound(paramComponentName);
    }
  }
  
  private void processListenerQueue(ListenerRecord paramListenerRecord)
  {
    StringBuilder localStringBuilder1;
    if (Log.isLoggable("NotifManCompat", 3))
    {
      localStringBuilder1 = z2.t("Processing component ");
      localStringBuilder1.append(componentName);
      localStringBuilder1.append(", ");
      localStringBuilder1.append(taskQueue.size());
      localStringBuilder1.append(" queued tasks");
      Log.d("NotifManCompat", localStringBuilder1.toString());
    }
    if (taskQueue.isEmpty()) {
      return;
    }
    if ((ensureServiceBound(paramListenerRecord)) && (service != null))
    {
      for (;;)
      {
        Object localObject = (NotificationManagerCompat.Task)taskQueue.peek();
        if (localObject != null) {
          try
          {
            if (Log.isLoggable("NotifManCompat", 3))
            {
              localStringBuilder1 = new java/lang/StringBuilder;
              localStringBuilder1.<init>();
              localStringBuilder1.append("Sending task ");
              localStringBuilder1.append(localObject);
              Log.d("NotifManCompat", localStringBuilder1.toString());
            }
            ((NotificationManagerCompat.Task)localObject).send(service);
            taskQueue.remove();
          }
          catch (RemoteException localRemoteException)
          {
            localObject = z2.t("RemoteException communicating with ");
            ((StringBuilder)localObject).append(componentName);
            Log.w("NotifManCompat", ((StringBuilder)localObject).toString(), localRemoteException);
          }
          catch (DeadObjectException localDeadObjectException)
          {
            if (Log.isLoggable("NotifManCompat", 3))
            {
              StringBuilder localStringBuilder2 = z2.t("Remote service has died: ");
              localStringBuilder2.append(componentName);
              Log.d("NotifManCompat", localStringBuilder2.toString());
            }
          }
        }
      }
      if (!taskQueue.isEmpty()) {
        scheduleListenerRetry(paramListenerRecord);
      }
      return;
    }
    scheduleListenerRetry(paramListenerRecord);
  }
  
  private void scheduleListenerRetry(ListenerRecord paramListenerRecord)
  {
    if (mHandler.hasMessages(3, componentName)) {
      return;
    }
    int i = retryCount + 1;
    retryCount = i;
    StringBuilder localStringBuilder;
    if (i > 6)
    {
      localStringBuilder = z2.t("Giving up on delivering ");
      localStringBuilder.append(taskQueue.size());
      localStringBuilder.append(" tasks to ");
      localStringBuilder.append(componentName);
      localStringBuilder.append(" after ");
      localStringBuilder.append(retryCount);
      localStringBuilder.append(" retries");
      Log.w("NotifManCompat", localStringBuilder.toString());
      taskQueue.clear();
      return;
    }
    i = (1 << i - 1) * 1000;
    if (Log.isLoggable("NotifManCompat", 3))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Scheduling retry for ");
      localStringBuilder.append(i);
      localStringBuilder.append(" ms");
      Log.d("NotifManCompat", localStringBuilder.toString());
    }
    paramListenerRecord = mHandler.obtainMessage(3, componentName);
    mHandler.sendMessageDelayed(paramListenerRecord, i);
  }
  
  private void updateListenerMap()
  {
    Object localObject1 = NotificationManagerCompat.getEnabledListenerPackages(mContext);
    if (((Set)localObject1).equals(mCachedEnabledPackages)) {
      return;
    }
    mCachedEnabledPackages = ((Set)localObject1);
    Object localObject2 = mContext.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
    HashSet localHashSet = new HashSet();
    localObject2 = ((List)localObject2).iterator();
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (ResolveInfo)((Iterator)localObject2).next();
      if (((Set)localObject1).contains(serviceInfo.packageName))
      {
        localObject4 = serviceInfo;
        localObject4 = new ComponentName(packageName, name);
        if (serviceInfo.permission != null)
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("Permission present on component ");
          ((StringBuilder)localObject3).append(localObject4);
          ((StringBuilder)localObject3).append(", not adding listener record.");
          Log.w("NotifManCompat", ((StringBuilder)localObject3).toString());
        }
        else
        {
          localHashSet.add(localObject4);
        }
      }
    }
    localObject1 = localHashSet.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (ComponentName)((Iterator)localObject1).next();
      if (!mRecordMap.containsKey(localObject2))
      {
        if (Log.isLoggable("NotifManCompat", 3))
        {
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("Adding listener record for ");
          ((StringBuilder)localObject4).append(localObject2);
          Log.d("NotifManCompat", ((StringBuilder)localObject4).toString());
        }
        mRecordMap.put(localObject2, new ListenerRecord((ComponentName)localObject2));
      }
    }
    localObject2 = mRecordMap.entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      if (!localHashSet.contains(((Map.Entry)localObject1).getKey()))
      {
        if (Log.isLoggable("NotifManCompat", 3))
        {
          localObject4 = z2.t("Removing listener record for ");
          ((StringBuilder)localObject4).append(((Map.Entry)localObject1).getKey());
          Log.d("NotifManCompat", ((StringBuilder)localObject4).toString());
        }
        ensureServiceUnbound((ListenerRecord)((Map.Entry)localObject1).getValue());
        ((Iterator)localObject2).remove();
      }
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            return false;
          }
          handleRetryListenerQueue((ComponentName)obj);
          return true;
        }
        handleServiceDisconnected((ComponentName)obj);
        return true;
      }
      paramMessage = (NotificationManagerCompat.ServiceConnectedEvent)obj;
      handleServiceConnected(componentName, iBinder);
      return true;
    }
    handleQueueTask((NotificationManagerCompat.Task)obj);
    return true;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (Log.isLoggable("NotifManCompat", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Connected to service ");
      localStringBuilder.append(paramComponentName);
      Log.d("NotifManCompat", localStringBuilder.toString());
    }
    mHandler.obtainMessage(1, new NotificationManagerCompat.ServiceConnectedEvent(paramComponentName, paramIBinder)).sendToTarget();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    if (Log.isLoggable("NotifManCompat", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Disconnected from service ");
      localStringBuilder.append(paramComponentName);
      Log.d("NotifManCompat", localStringBuilder.toString());
    }
    mHandler.obtainMessage(2, paramComponentName).sendToTarget();
  }
  
  public void queueTask(NotificationManagerCompat.Task paramTask)
  {
    mHandler.obtainMessage(0, paramTask).sendToTarget();
  }
  
  public static class ListenerRecord
  {
    public boolean bound = false;
    public final ComponentName componentName;
    public int retryCount = 0;
    public INotificationSideChannel service;
    public ArrayDeque<NotificationManagerCompat.Task> taskQueue = new ArrayDeque();
    
    public ListenerRecord(ComponentName paramComponentName)
    {
      componentName = paramComponentName;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationManagerCompat.SideChannelManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */