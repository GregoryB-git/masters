package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import z2;

public abstract class DownloadService
  extends Service
{
  public static final String ACTION_ADD = "com.google.android.exoplayer.downloadService.action.ADD";
  public static final String ACTION_INIT = "com.google.android.exoplayer.downloadService.action.INIT";
  public static final String ACTION_RELOAD_REQUIREMENTS = "com.google.android.exoplayer.downloadService.action.RELOAD_REQUIREMENTS";
  private static final String ACTION_RESTART = "com.google.android.exoplayer.downloadService.action.RESTART";
  private static final boolean DEBUG = false;
  public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000L;
  private static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1, false, false);
  public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
  public static final String KEY_DOWNLOAD_ACTION = "download_action";
  public static final String KEY_FOREGROUND = "foreground";
  private static final String TAG = "DownloadService";
  private static final HashMap<Class<? extends DownloadService>, RequirementsHelper> requirementsHelpers = new HashMap();
  @Nullable
  private final String channelId;
  @StringRes
  private final int channelName;
  private DownloadManager downloadManager;
  private DownloadManagerListener downloadManagerListener;
  @Nullable
  private final ForegroundNotificationUpdater foregroundNotificationUpdater;
  private int lastStartId;
  private boolean startedInForeground;
  private boolean taskRemoved;
  
  public DownloadService(int paramInt)
  {
    this(paramInt, 1000L);
  }
  
  public DownloadService(int paramInt, long paramLong)
  {
    this(paramInt, paramLong, null, 0);
  }
  
  public DownloadService(int paramInt1, long paramLong, @Nullable String paramString, @StringRes int paramInt2)
  {
    ForegroundNotificationUpdater localForegroundNotificationUpdater;
    if (paramInt1 == 0) {
      localForegroundNotificationUpdater = null;
    } else {
      localForegroundNotificationUpdater = new ForegroundNotificationUpdater(paramInt1, paramLong);
    }
    foregroundNotificationUpdater = localForegroundNotificationUpdater;
    channelId = paramString;
    channelName = paramInt2;
  }
  
  public static Intent buildAddActionIntent(Context paramContext, Class<? extends DownloadService> paramClass, DownloadAction paramDownloadAction, boolean paramBoolean)
  {
    return getIntent(paramContext, paramClass, "com.google.android.exoplayer.downloadService.action.ADD").putExtra("download_action", paramDownloadAction.toByteArray()).putExtra("foreground", paramBoolean);
  }
  
  private static Intent getIntent(Context paramContext, Class<? extends DownloadService> paramClass, String paramString)
  {
    return new Intent(paramContext, paramClass).setAction(paramString);
  }
  
  private void logd(String paramString) {}
  
  private void maybeStartWatchingRequirements(Requirements paramRequirements)
  {
    if (downloadManager.getDownloadCount() == 0) {
      return;
    }
    Class localClass = getClass();
    HashMap localHashMap = requirementsHelpers;
    if ((RequirementsHelper)localHashMap.get(localClass) == null)
    {
      paramRequirements = new RequirementsHelper(this, paramRequirements, getScheduler(), localClass, null);
      localHashMap.put(localClass, paramRequirements);
      paramRequirements.start();
      logd("started watching requirements");
    }
  }
  
  private void maybeStopWatchingRequirements()
  {
    if (downloadManager.getDownloadCount() > 0) {
      return;
    }
    stopWatchingRequirements();
  }
  
  public static void start(Context paramContext, Class<? extends DownloadService> paramClass)
  {
    paramContext.startService(getIntent(paramContext, paramClass, "com.google.android.exoplayer.downloadService.action.INIT"));
  }
  
  public static void startForeground(Context paramContext, Class<? extends DownloadService> paramClass)
  {
    Util.startForegroundService(paramContext, getIntent(paramContext, paramClass, "com.google.android.exoplayer.downloadService.action.INIT").putExtra("foreground", true));
  }
  
  public static void startWithAction(Context paramContext, Class<? extends DownloadService> paramClass, DownloadAction paramDownloadAction, boolean paramBoolean)
  {
    paramClass = buildAddActionIntent(paramContext, paramClass, paramDownloadAction, paramBoolean);
    if (paramBoolean) {
      Util.startForegroundService(paramContext, paramClass);
    } else {
      paramContext.startService(paramClass);
    }
  }
  
  private void stop()
  {
    Object localObject = foregroundNotificationUpdater;
    if (localObject != null)
    {
      ((ForegroundNotificationUpdater)localObject).stopPeriodicUpdates();
      if ((startedInForeground) && (Util.SDK_INT >= 26)) {
        foregroundNotificationUpdater.showNotificationIfNotAlready();
      }
    }
    if ((Util.SDK_INT < 28) && (taskRemoved))
    {
      stopSelf();
      logd("stopSelf()");
    }
    else
    {
      boolean bool = stopSelfResult(lastStartId);
      localObject = z2.t("stopSelf(");
      ((StringBuilder)localObject).append(lastStartId);
      ((StringBuilder)localObject).append(") result: ");
      ((StringBuilder)localObject).append(bool);
      logd(((StringBuilder)localObject).toString());
    }
  }
  
  private void stopWatchingRequirements()
  {
    RequirementsHelper localRequirementsHelper = (RequirementsHelper)requirementsHelpers.remove(getClass());
    if (localRequirementsHelper != null)
    {
      localRequirementsHelper.stop();
      logd("stopped watching requirements");
    }
  }
  
  public abstract DownloadManager getDownloadManager();
  
  public Notification getForegroundNotification(DownloadManager.TaskState[] paramArrayOfTaskState)
  {
    paramArrayOfTaskState = new StringBuilder();
    paramArrayOfTaskState.append(getClass().getName());
    paramArrayOfTaskState.append(" is started in the foreground but getForegroundNotification() is not implemented.");
    throw new IllegalStateException(paramArrayOfTaskState.toString());
  }
  
  public Requirements getRequirements()
  {
    return DEFAULT_REQUIREMENTS;
  }
  
  @Nullable
  public abstract Scheduler getScheduler();
  
  @Nullable
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    logd("onCreate");
    Object localObject = channelId;
    if (localObject != null) {
      NotificationUtil.createNotificationChannel(this, (String)localObject, channelName, 2);
    }
    downloadManager = getDownloadManager();
    localObject = new DownloadManagerListener(null);
    downloadManagerListener = ((DownloadManagerListener)localObject);
    downloadManager.addListener((DownloadManager.Listener)localObject);
  }
  
  public void onDestroy()
  {
    logd("onDestroy");
    ForegroundNotificationUpdater localForegroundNotificationUpdater = foregroundNotificationUpdater;
    if (localForegroundNotificationUpdater != null) {
      localForegroundNotificationUpdater.stopPeriodicUpdates();
    }
    downloadManager.removeListener(downloadManagerListener);
    maybeStopWatchingRequirements();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    lastStartId = paramInt2;
    int i = 0;
    taskRemoved = false;
    if (paramIntent != null)
    {
      localObject1 = paramIntent.getAction();
      int j = startedInForeground;
      if ((!paramIntent.getBooleanExtra("foreground", false)) && (!"com.google.android.exoplayer.downloadService.action.RESTART".equals(localObject1))) {
        paramInt1 = 0;
      } else {
        paramInt1 = 1;
      }
      startedInForeground = (j | paramInt1);
    }
    else
    {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "com.google.android.exoplayer.downloadService.action.INIT";
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("onStartCommand action: ");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(" startId: ");
    ((StringBuilder)localObject1).append(paramInt2);
    logd(((StringBuilder)localObject1).toString());
    switch (((String)localObject2).hashCode())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            paramInt1 = -1;
            break;
          } while (!((String)localObject2).equals("com.google.android.exoplayer.downloadService.action.INIT"));
          paramInt1 = 3;
          break;
        } while (!((String)localObject2).equals("com.google.android.exoplayer.downloadService.action.ADD"));
        paramInt1 = 2;
        break;
      } while (!((String)localObject2).equals("com.google.android.exoplayer.downloadService.action.RELOAD_REQUIREMENTS"));
      paramInt1 = 1;
      break;
      paramInt1 = i;
    } while (!((String)localObject2).equals("com.google.android.exoplayer.downloadService.action.RESTART"));
    switch (paramInt1)
    {
    default: 
      paramIntent = new StringBuilder();
      paramIntent.append("Ignoring unrecognized action: ");
      paramIntent.append((String)localObject2);
      Log.e("DownloadService", paramIntent.toString());
      break;
    case 2: 
      paramIntent = paramIntent.getByteArrayExtra("download_action");
      if (paramIntent == null) {
        Log.e("DownloadService", "Ignoring ADD action with no action data");
      } else {
        try
        {
          downloadManager.handleAction(paramIntent);
        }
        catch (IOException paramIntent)
        {
          Log.e("DownloadService", "Failed to handle ADD action", paramIntent);
        }
      }
      break;
    case 1: 
      stopWatchingRequirements();
    }
    paramIntent = getRequirements();
    if (paramIntent.checkRequirements(this)) {
      downloadManager.startDownloads();
    } else {
      downloadManager.stopDownloads();
    }
    maybeStartWatchingRequirements(paramIntent);
    if (downloadManager.isIdle()) {
      stop();
    }
    return 1;
  }
  
  public void onTaskRemoved(Intent paramIntent)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("onTaskRemoved rootIntent: ");
    localStringBuilder.append(paramIntent);
    logd(localStringBuilder.toString());
    taskRemoved = true;
  }
  
  public void onTaskStateChanged(DownloadManager.TaskState paramTaskState) {}
  
  public final class DownloadManagerListener
    implements DownloadManager.Listener
  {
    private DownloadManagerListener() {}
    
    public final void onIdle(DownloadManager paramDownloadManager)
    {
      DownloadService.access$400(DownloadService.this);
    }
    
    public void onInitialized(DownloadManager paramDownloadManager)
    {
      paramDownloadManager = DownloadService.this;
      DownloadService.access$200(paramDownloadManager, paramDownloadManager.getRequirements());
    }
    
    public void onTaskStateChanged(DownloadManager paramDownloadManager, DownloadManager.TaskState paramTaskState)
    {
      onTaskStateChanged(paramTaskState);
      if (DownloadService.access$300(DownloadService.this) != null) {
        if (state == 1) {
          DownloadService.access$300(DownloadService.this).startPeriodicUpdates();
        } else {
          DownloadService.access$300(DownloadService.this).update();
        }
      }
    }
  }
  
  public final class ForegroundNotificationUpdater
    implements Runnable
  {
    private final Handler handler;
    private boolean notificationDisplayed;
    private final int notificationId;
    private boolean periodicUpdatesStarted;
    private final long updateInterval;
    
    public ForegroundNotificationUpdater(int paramInt, long paramLong)
    {
      notificationId = paramInt;
      updateInterval = paramLong;
      handler = new Handler(Looper.getMainLooper());
    }
    
    public void run()
    {
      update();
    }
    
    public void showNotificationIfNotAlready()
    {
      if (!notificationDisplayed) {
        update();
      }
    }
    
    public void startPeriodicUpdates()
    {
      periodicUpdatesStarted = true;
      update();
    }
    
    public void stopPeriodicUpdates()
    {
      periodicUpdatesStarted = false;
      handler.removeCallbacks(this);
    }
    
    public void update()
    {
      DownloadManager.TaskState[] arrayOfTaskState = DownloadService.access$500(DownloadService.this).getAllTaskStates();
      DownloadService localDownloadService = DownloadService.this;
      localDownloadService.startForeground(notificationId, localDownloadService.getForegroundNotification(arrayOfTaskState));
      notificationDisplayed = true;
      if (periodicUpdatesStarted)
      {
        handler.removeCallbacks(this);
        handler.postDelayed(this, updateInterval);
      }
    }
  }
  
  public static final class RequirementsHelper
    implements RequirementsWatcher.Listener
  {
    private final Context context;
    private final Requirements requirements;
    private final RequirementsWatcher requirementsWatcher;
    @Nullable
    private final Scheduler scheduler;
    private final Class<? extends DownloadService> serviceClass;
    
    private RequirementsHelper(Context paramContext, Requirements paramRequirements, @Nullable Scheduler paramScheduler, Class<? extends DownloadService> paramClass)
    {
      context = paramContext;
      requirements = paramRequirements;
      scheduler = paramScheduler;
      serviceClass = paramClass;
      requirementsWatcher = new RequirementsWatcher(paramContext, this, paramRequirements);
    }
    
    private void notifyService()
      throws Exception
    {
      Intent localIntent = DownloadService.access$600(context, serviceClass, "com.google.android.exoplayer.downloadService.action.INIT");
      try
      {
        context.startService(localIntent);
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        throw new Exception(localIllegalStateException);
      }
    }
    
    public void requirementsMet(RequirementsWatcher paramRequirementsWatcher)
    {
      try
      {
        notifyService();
        paramRequirementsWatcher = scheduler;
        if (paramRequirementsWatcher != null) {
          paramRequirementsWatcher.cancel();
        }
        return;
      }
      catch (Exception paramRequirementsWatcher)
      {
        for (;;) {}
      }
    }
    
    public void requirementsNotMet(RequirementsWatcher paramRequirementsWatcher)
    {
      try
      {
        notifyService();
        if (scheduler != null)
        {
          paramRequirementsWatcher = context.getPackageName();
          if (!scheduler.schedule(requirements, paramRequirementsWatcher, "com.google.android.exoplayer.downloadService.action.RESTART")) {
            Log.e("DownloadService", "Scheduling downloads failed.");
          }
        }
        return;
      }
      catch (Exception paramRequirementsWatcher)
      {
        for (;;) {}
      }
    }
    
    public void start()
    {
      requirementsWatcher.start();
    }
    
    public void stop()
    {
      requirementsWatcher.stop();
      Scheduler localScheduler = scheduler;
      if (localScheduler != null) {
        localScheduler.cancel();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */