package androidx.core.app;

import a3;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import android.support.v4.app.INotificationSideChannel;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p3;
import u2;
import z2;

public final class NotificationManagerCompat
{
  public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
  private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
  public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
  public static final int IMPORTANCE_DEFAULT = 3;
  public static final int IMPORTANCE_HIGH = 4;
  public static final int IMPORTANCE_LOW = 2;
  public static final int IMPORTANCE_MAX = 5;
  public static final int IMPORTANCE_MIN = 1;
  public static final int IMPORTANCE_NONE = 0;
  public static final int IMPORTANCE_UNSPECIFIED = -1000;
  public static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
  private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
  private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
  private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
  private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
  private static final String TAG = "NotifManCompat";
  @GuardedBy("sEnabledNotificationListenersLock")
  private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
  @GuardedBy("sEnabledNotificationListenersLock")
  private static String sEnabledNotificationListeners;
  private static final Object sEnabledNotificationListenersLock = new Object();
  private static final Object sLock = new Object();
  @GuardedBy("sLock")
  private static SideChannelManager sSideChannelManager;
  private final Context mContext;
  private final NotificationManager mNotificationManager;
  
  private NotificationManagerCompat(Context paramContext)
  {
    mContext = paramContext;
    mNotificationManager = ((NotificationManager)paramContext.getSystemService("notification"));
  }
  
  @NonNull
  public static NotificationManagerCompat from(@NonNull Context paramContext)
  {
    return new NotificationManagerCompat(paramContext);
  }
  
  @NonNull
  public static Set<String> getEnabledListenerPackages(@NonNull Context paramContext)
  {
    Object localObject1 = Settings.Secure.getString(paramContext.getContentResolver(), "enabled_notification_listeners");
    paramContext = sEnabledNotificationListenersLock;
    if (localObject1 != null) {}
    try
    {
      if (!((String)localObject1).equals(sEnabledNotificationListeners))
      {
        String[] arrayOfString = ((String)localObject1).split(":", -1);
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>(arrayOfString.length);
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          ComponentName localComponentName = ComponentName.unflattenFromString(arrayOfString[j]);
          if (localComponentName != null) {
            localHashSet.add(localComponentName.getPackageName());
          }
        }
        sEnabledNotificationListenerPackages = localHashSet;
        sEnabledNotificationListeners = (String)localObject1;
      }
      localObject1 = sEnabledNotificationListenerPackages;
      return (Set<String>)localObject1;
    }
    finally {}
  }
  
  private void pushSideChannelQueue(Task paramTask)
  {
    synchronized (sLock)
    {
      if (sSideChannelManager == null)
      {
        SideChannelManager localSideChannelManager = new androidx/core/app/NotificationManagerCompat$SideChannelManager;
        localSideChannelManager.<init>(mContext.getApplicationContext());
        sSideChannelManager = localSideChannelManager;
      }
      sSideChannelManager.queueTask(paramTask);
      return;
    }
  }
  
  private static boolean useSideChannelForNotification(Notification paramNotification)
  {
    paramNotification = NotificationCompat.getExtras(paramNotification);
    boolean bool;
    if ((paramNotification != null) && (paramNotification.getBoolean("android.support.useSideChannel"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean areNotificationsEnabled()
  {
    return mNotificationManager.areNotificationsEnabled();
  }
  
  public void cancel(int paramInt)
  {
    cancel(null, paramInt);
  }
  
  public void cancel(@Nullable String paramString, int paramInt)
  {
    mNotificationManager.cancel(paramString, paramInt);
  }
  
  public void cancelAll()
  {
    mNotificationManager.cancelAll();
  }
  
  public void createNotificationChannel(@NonNull NotificationChannel paramNotificationChannel)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      u2.q(mNotificationManager, paramNotificationChannel);
    }
  }
  
  public void createNotificationChannel(@NonNull NotificationChannelCompat paramNotificationChannelCompat)
  {
    createNotificationChannel(paramNotificationChannelCompat.getNotificationChannel());
  }
  
  public void createNotificationChannelGroup(@NonNull NotificationChannelGroup paramNotificationChannelGroup)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      p3.l(mNotificationManager, paramNotificationChannelGroup);
    }
  }
  
  public void createNotificationChannelGroup(@NonNull NotificationChannelGroupCompat paramNotificationChannelGroupCompat)
  {
    createNotificationChannelGroup(paramNotificationChannelGroupCompat.getNotificationChannelGroup());
  }
  
  public void createNotificationChannelGroups(@NonNull List<NotificationChannelGroup> paramList)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      u2.D(mNotificationManager, paramList);
    }
  }
  
  public void createNotificationChannelGroupsCompat(@NonNull List<NotificationChannelGroupCompat> paramList)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (!paramList.isEmpty()))
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(((NotificationChannelGroupCompat)paramList.next()).getNotificationChannelGroup());
      }
      u2.C(mNotificationManager, localArrayList);
    }
  }
  
  public void createNotificationChannels(@NonNull List<NotificationChannel> paramList)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      u2.t(mNotificationManager, paramList);
    }
  }
  
  public void createNotificationChannelsCompat(@NonNull List<NotificationChannelCompat> paramList)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (!paramList.isEmpty()))
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(((NotificationChannelCompat)paramList.next()).getNotificationChannel());
      }
      u2.s(mNotificationManager, localArrayList);
    }
  }
  
  public void deleteNotificationChannel(@NonNull String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      p3.m(mNotificationManager, paramString);
    }
  }
  
  public void deleteNotificationChannelGroup(@NonNull String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      u2.r(mNotificationManager, paramString);
    }
  }
  
  public void deleteUnlistedNotificationChannels(@NonNull Collection<String> paramCollection)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      Iterator localIterator = mNotificationManager.getNotificationChannels().iterator();
      while (localIterator.hasNext())
      {
        NotificationChannel localNotificationChannel = (NotificationChannel)localIterator.next();
        if ((!paramCollection.contains(localNotificationChannel.getId())) && ((Build.VERSION.SDK_INT < 30) || (!paramCollection.contains(d.m(localNotificationChannel))))) {
          mNotificationManager.deleteNotificationChannel(localNotificationChannel.getId());
        }
      }
    }
  }
  
  public int getImportance()
  {
    return mNotificationManager.getImportance();
  }
  
  @Nullable
  public NotificationChannel getNotificationChannel(@NonNull String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return u2.e(mNotificationManager, paramString);
    }
    return null;
  }
  
  @Nullable
  public NotificationChannel getNotificationChannel(@NonNull String paramString1, @NonNull String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 30) {
      return d.c(mNotificationManager, paramString1, paramString2);
    }
    return getNotificationChannel(paramString1);
  }
  
  @Nullable
  public NotificationChannelCompat getNotificationChannelCompat(@NonNull String paramString)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      paramString = getNotificationChannel(paramString);
      if (paramString != null) {
        return new NotificationChannelCompat(paramString);
      }
    }
    return null;
  }
  
  @Nullable
  public NotificationChannelCompat getNotificationChannelCompat(@NonNull String paramString1, @NonNull String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      paramString1 = getNotificationChannel(paramString1, paramString2);
      if (paramString1 != null) {
        return new NotificationChannelCompat(paramString1);
      }
    }
    return null;
  }
  
  @Nullable
  public NotificationChannelGroup getNotificationChannelGroup(@NonNull String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      return a3.f(mNotificationManager, paramString);
    }
    if (i >= 26)
    {
      Iterator localIterator = getNotificationChannelGroups().iterator();
      while (localIterator.hasNext())
      {
        NotificationChannelGroup localNotificationChannelGroup = (NotificationChannelGroup)localIterator.next();
        if (localNotificationChannelGroup.getId().equals(paramString)) {
          return localNotificationChannelGroup;
        }
      }
    }
    return null;
  }
  
  @Nullable
  public NotificationChannelGroupCompat getNotificationChannelGroupCompat(@NonNull String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28)
    {
      paramString = getNotificationChannelGroup(paramString);
      if (paramString != null) {
        return new NotificationChannelGroupCompat(paramString);
      }
    }
    else if (i >= 26)
    {
      paramString = getNotificationChannelGroup(paramString);
      if (paramString != null) {
        return new NotificationChannelGroupCompat(paramString, getNotificationChannels());
      }
    }
    return null;
  }
  
  @NonNull
  public List<NotificationChannelGroup> getNotificationChannelGroups()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return p3.i(mNotificationManager);
    }
    return Collections.emptyList();
  }
  
  @NonNull
  public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat()
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26)
    {
      Object localObject = getNotificationChannelGroups();
      if (!((List)localObject).isEmpty())
      {
        List localList;
        if (i >= 28) {
          localList = Collections.emptyList();
        } else {
          localList = getNotificationChannels();
        }
        ArrayList localArrayList = new ArrayList(((List)localObject).size());
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (NotificationChannelGroup)localIterator.next();
          if (Build.VERSION.SDK_INT >= 28) {
            localArrayList.add(new NotificationChannelGroupCompat((NotificationChannelGroup)localObject));
          } else {
            localArrayList.add(new NotificationChannelGroupCompat((NotificationChannelGroup)localObject, localList));
          }
        }
        return localArrayList;
      }
    }
    return Collections.emptyList();
  }
  
  @NonNull
  public List<NotificationChannel> getNotificationChannels()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return u2.p(mNotificationManager);
    }
    return Collections.emptyList();
  }
  
  @NonNull
  public List<NotificationChannelCompat> getNotificationChannelsCompat()
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      Object localObject = getNotificationChannels();
      if (!((List)localObject).isEmpty())
      {
        ArrayList localArrayList = new ArrayList(((List)localObject).size());
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localArrayList.add(new NotificationChannelCompat((NotificationChannel)((Iterator)localObject).next()));
        }
        return localArrayList;
      }
    }
    return Collections.emptyList();
  }
  
  @RequiresPermission("android.permission.POST_NOTIFICATIONS")
  public void notify(int paramInt, @NonNull Notification paramNotification)
  {
    notify(null, paramInt, paramNotification);
  }
  
  @RequiresPermission("android.permission.POST_NOTIFICATIONS")
  public void notify(@Nullable String paramString, int paramInt, @NonNull Notification paramNotification)
  {
    if (useSideChannelForNotification(paramNotification))
    {
      pushSideChannelQueue(new NotifyTask(mContext.getPackageName(), paramInt, paramString, paramNotification));
      mNotificationManager.cancel(paramString, paramInt);
    }
    else
    {
      mNotificationManager.notify(paramString, paramInt, paramNotification);
    }
  }
  
  public static class CancelTask
    implements NotificationManagerCompat.Task
  {
    public final boolean all;
    public final int id;
    public final String packageName;
    public final String tag;
    
    public CancelTask(String paramString)
    {
      packageName = paramString;
      id = 0;
      tag = null;
      all = true;
    }
    
    public CancelTask(String paramString1, int paramInt, String paramString2)
    {
      packageName = paramString1;
      id = paramInt;
      tag = paramString2;
      all = false;
    }
    
    public void send(INotificationSideChannel paramINotificationSideChannel)
      throws RemoteException
    {
      if (all) {
        paramINotificationSideChannel.cancelAll(packageName);
      } else {
        paramINotificationSideChannel.cancel(packageName, id, tag);
      }
    }
    
    @NonNull
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("CancelTask[");
      localStringBuilder.append("packageName:");
      localStringBuilder.append(packageName);
      localStringBuilder.append(", id:");
      localStringBuilder.append(id);
      localStringBuilder.append(", tag:");
      localStringBuilder.append(tag);
      localStringBuilder.append(", all:");
      localStringBuilder.append(all);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static class NotifyTask
    implements NotificationManagerCompat.Task
  {
    public final int id;
    public final Notification notif;
    public final String packageName;
    public final String tag;
    
    public NotifyTask(String paramString1, int paramInt, String paramString2, Notification paramNotification)
    {
      packageName = paramString1;
      id = paramInt;
      tag = paramString2;
      notif = paramNotification;
    }
    
    public void send(INotificationSideChannel paramINotificationSideChannel)
      throws RemoteException
    {
      paramINotificationSideChannel.notify(packageName, id, tag, notif);
    }
    
    @NonNull
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("NotifyTask[");
      localStringBuilder.append("packageName:");
      localStringBuilder.append(packageName);
      localStringBuilder.append(", id:");
      localStringBuilder.append(id);
      localStringBuilder.append(", tag:");
      return z2.s(localStringBuilder, tag, "]");
    }
  }
  
  public static class ServiceConnectedEvent
  {
    public final ComponentName componentName;
    public final IBinder iBinder;
    
    public ServiceConnectedEvent(ComponentName paramComponentName, IBinder paramIBinder)
    {
      componentName = paramComponentName;
      iBinder = paramIBinder;
    }
  }
  
  public static class SideChannelManager
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
    
    public SideChannelManager(Context paramContext)
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
  
  public static abstract interface Task
  {
    public abstract void send(INotificationSideChannel paramINotificationSideChannel)
      throws RemoteException;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */