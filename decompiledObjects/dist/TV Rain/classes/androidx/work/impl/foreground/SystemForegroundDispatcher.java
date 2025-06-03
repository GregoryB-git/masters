package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundDispatcher
  implements WorkConstraintsCallback, ExecutionListener
{
  private static final String ACTION_CANCEL_WORK = "ACTION_CANCEL_WORK";
  private static final String ACTION_NOTIFY = "ACTION_NOTIFY";
  private static final String ACTION_START_FOREGROUND = "ACTION_START_FOREGROUND";
  private static final String ACTION_STOP_FOREGROUND = "ACTION_STOP_FOREGROUND";
  private static final String KEY_FOREGROUND_SERVICE_TYPE = "KEY_FOREGROUND_SERVICE_TYPE";
  private static final String KEY_NOTIFICATION = "KEY_NOTIFICATION";
  private static final String KEY_NOTIFICATION_ID = "KEY_NOTIFICATION_ID";
  private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
  public static final String TAG = Logger.tagWithPrefix("SystemFgDispatcher");
  @Nullable
  private Callback mCallback;
  public final WorkConstraintsTracker mConstraintsTracker;
  private Context mContext;
  public String mCurrentForegroundWorkSpecId;
  public final Map<String, ForegroundInfo> mForegroundInfoById;
  public final Object mLock;
  private final TaskExecutor mTaskExecutor;
  public final Set<WorkSpec> mTrackedWorkSpecs;
  private WorkManagerImpl mWorkManagerImpl;
  public final Map<String, WorkSpec> mWorkSpecById;
  
  public SystemForegroundDispatcher(@NonNull Context paramContext)
  {
    mContext = paramContext;
    mLock = new Object();
    paramContext = WorkManagerImpl.getInstance(paramContext);
    mWorkManagerImpl = paramContext;
    paramContext = paramContext.getWorkTaskExecutor();
    mTaskExecutor = paramContext;
    mCurrentForegroundWorkSpecId = null;
    mForegroundInfoById = new LinkedHashMap();
    mTrackedWorkSpecs = new HashSet();
    mWorkSpecById = new HashMap();
    mConstraintsTracker = new WorkConstraintsTracker(mContext, paramContext, this);
    mWorkManagerImpl.getProcessor().addExecutionListener(this);
  }
  
  @VisibleForTesting
  public SystemForegroundDispatcher(@NonNull Context paramContext, @NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull WorkConstraintsTracker paramWorkConstraintsTracker)
  {
    mContext = paramContext;
    mLock = new Object();
    mWorkManagerImpl = paramWorkManagerImpl;
    mTaskExecutor = paramWorkManagerImpl.getWorkTaskExecutor();
    mCurrentForegroundWorkSpecId = null;
    mForegroundInfoById = new LinkedHashMap();
    mTrackedWorkSpecs = new HashSet();
    mWorkSpecById = new HashMap();
    mConstraintsTracker = paramWorkConstraintsTracker;
    mWorkManagerImpl.getProcessor().addExecutionListener(this);
  }
  
  @NonNull
  public static Intent createCancelWorkIntent(@NonNull Context paramContext, @NonNull String paramString)
  {
    paramContext = new Intent(paramContext, SystemForegroundService.class);
    paramContext.setAction("ACTION_CANCEL_WORK");
    paramContext.setData(Uri.parse(String.format("workspec://%s", new Object[] { paramString })));
    paramContext.putExtra("KEY_WORKSPEC_ID", paramString);
    return paramContext;
  }
  
  @NonNull
  public static Intent createNotifyIntent(@NonNull Context paramContext, @NonNull String paramString, @NonNull ForegroundInfo paramForegroundInfo)
  {
    paramContext = new Intent(paramContext, SystemForegroundService.class);
    paramContext.setAction("ACTION_NOTIFY");
    paramContext.putExtra("KEY_NOTIFICATION_ID", paramForegroundInfo.getNotificationId());
    paramContext.putExtra("KEY_FOREGROUND_SERVICE_TYPE", paramForegroundInfo.getForegroundServiceType());
    paramContext.putExtra("KEY_NOTIFICATION", paramForegroundInfo.getNotification());
    paramContext.putExtra("KEY_WORKSPEC_ID", paramString);
    return paramContext;
  }
  
  @NonNull
  public static Intent createStartForegroundIntent(@NonNull Context paramContext, @NonNull String paramString, @NonNull ForegroundInfo paramForegroundInfo)
  {
    paramContext = new Intent(paramContext, SystemForegroundService.class);
    paramContext.setAction("ACTION_START_FOREGROUND");
    paramContext.putExtra("KEY_WORKSPEC_ID", paramString);
    paramContext.putExtra("KEY_NOTIFICATION_ID", paramForegroundInfo.getNotificationId());
    paramContext.putExtra("KEY_FOREGROUND_SERVICE_TYPE", paramForegroundInfo.getForegroundServiceType());
    paramContext.putExtra("KEY_NOTIFICATION", paramForegroundInfo.getNotification());
    paramContext.putExtra("KEY_WORKSPEC_ID", paramString);
    return paramContext;
  }
  
  @NonNull
  public static Intent createStopForegroundIntent(@NonNull Context paramContext)
  {
    paramContext = new Intent(paramContext, SystemForegroundService.class);
    paramContext.setAction("ACTION_STOP_FOREGROUND");
    return paramContext;
  }
  
  @MainThread
  private void handleCancelWork(@NonNull Intent paramIntent)
  {
    Logger.get().info(TAG, String.format("Stopping foreground work for %s", new Object[] { paramIntent }), new Throwable[0]);
    paramIntent = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
    if ((paramIntent != null) && (!TextUtils.isEmpty(paramIntent))) {
      mWorkManagerImpl.cancelWorkById(UUID.fromString(paramIntent));
    }
  }
  
  @MainThread
  private void handleNotify(@NonNull Intent paramIntent)
  {
    int i = 0;
    int j = paramIntent.getIntExtra("KEY_NOTIFICATION_ID", 0);
    int k = paramIntent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
    String str = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
    Notification localNotification = (Notification)paramIntent.getParcelableExtra("KEY_NOTIFICATION");
    Logger.get().debug(TAG, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[] { Integer.valueOf(j), str, Integer.valueOf(k) }), new Throwable[0]);
    if ((localNotification != null) && (mCallback != null))
    {
      paramIntent = new ForegroundInfo(j, localNotification, k);
      mForegroundInfoById.put(str, paramIntent);
      if (TextUtils.isEmpty(mCurrentForegroundWorkSpecId))
      {
        mCurrentForegroundWorkSpecId = str;
        mCallback.startForeground(j, k, localNotification);
      }
      else
      {
        mCallback.notify(j, localNotification);
        if ((k != 0) && (Build.VERSION.SDK_INT >= 29))
        {
          paramIntent = mForegroundInfoById.entrySet().iterator();
          while (paramIntent.hasNext()) {
            i |= ((ForegroundInfo)((Map.Entry)paramIntent.next()).getValue()).getForegroundServiceType();
          }
          paramIntent = (ForegroundInfo)mForegroundInfoById.get(mCurrentForegroundWorkSpecId);
          if (paramIntent != null) {
            mCallback.startForeground(paramIntent.getNotificationId(), i, paramIntent.getNotification());
          }
        }
      }
    }
  }
  
  @MainThread
  private void handleStartForeground(@NonNull final Intent paramIntent)
  {
    Logger.get().info(TAG, String.format("Started foreground service %s", new Object[] { paramIntent }), new Throwable[0]);
    paramIntent = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
    final WorkDatabase localWorkDatabase = mWorkManagerImpl.getWorkDatabase();
    mTaskExecutor.executeOnBackgroundThread(new Runnable()
    {
      public void run()
      {
        Object localObject1 = localWorkDatabase.workSpecDao().getWorkSpec(paramIntent);
        if ((localObject1 != null) && (((WorkSpec)localObject1).hasConstraints())) {
          synchronized (mLock)
          {
            mWorkSpecById.put(paramIntent, localObject1);
            mTrackedWorkSpecs.add(localObject1);
            localObject1 = SystemForegroundDispatcher.this;
            mConstraintsTracker.replace(mTrackedWorkSpecs);
          }
        }
      }
    });
  }
  
  public WorkManagerImpl getWorkManager()
  {
    return mWorkManagerImpl;
  }
  
  @MainThread
  public void handleStop(@NonNull Intent paramIntent)
  {
    Logger.get().info(TAG, "Stopping foreground service", new Throwable[0]);
    paramIntent = mCallback;
    if (paramIntent != null) {
      paramIntent.stop();
    }
  }
  
  public void onAllConstraintsMet(@NonNull List<String> paramList) {}
  
  public void onAllConstraintsNotMet(@NonNull List<String> paramList)
  {
    if (!paramList.isEmpty())
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        Logger.get().debug(TAG, String.format("Constraints unmet for WorkSpec %s", new Object[] { str }), new Throwable[0]);
        mWorkManagerImpl.stopForegroundWork(str);
      }
    }
  }
  
  @MainThread
  public void onDestroy()
  {
    mCallback = null;
    synchronized (mLock)
    {
      mConstraintsTracker.reset();
      mWorkManagerImpl.getProcessor().removeExecutionListener(this);
      return;
    }
  }
  
  @MainThread
  public void onExecuted(@NonNull String paramString, boolean paramBoolean)
  {
    synchronized (mLock)
    {
      Object localObject2 = (WorkSpec)mWorkSpecById.remove(paramString);
      if (localObject2 != null) {
        paramBoolean = mTrackedWorkSpecs.remove(localObject2);
      } else {
        paramBoolean = false;
      }
      if (paramBoolean) {
        mConstraintsTracker.replace(mTrackedWorkSpecs);
      }
      localObject2 = (ForegroundInfo)mForegroundInfoById.remove(paramString);
      if ((paramString.equals(mCurrentForegroundWorkSpecId)) && (mForegroundInfoById.size() > 0))
      {
        Iterator localIterator = mForegroundInfoById.entrySet().iterator();
        for (??? = (Map.Entry)localIterator.next(); localIterator.hasNext(); ??? = (Map.Entry)localIterator.next()) {}
        mCurrentForegroundWorkSpecId = ((String)((Map.Entry)???).getKey());
        if (mCallback != null)
        {
          ??? = (ForegroundInfo)((Map.Entry)???).getValue();
          mCallback.startForeground(((ForegroundInfo)???).getNotificationId(), ((ForegroundInfo)???).getForegroundServiceType(), ((ForegroundInfo)???).getNotification());
          mCallback.cancelNotification(((ForegroundInfo)???).getNotificationId());
        }
      }
      ??? = mCallback;
      if ((localObject2 != null) && (??? != null))
      {
        Logger.get().debug(TAG, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[] { Integer.valueOf(((ForegroundInfo)localObject2).getNotificationId()), paramString, Integer.valueOf(((ForegroundInfo)localObject2).getForegroundServiceType()) }), new Throwable[0]);
        ((Callback)???).cancelNotification(((ForegroundInfo)localObject2).getNotificationId());
      }
      return;
    }
  }
  
  public void onStartCommand(@NonNull Intent paramIntent)
  {
    String str = paramIntent.getAction();
    if ("ACTION_START_FOREGROUND".equals(str))
    {
      handleStartForeground(paramIntent);
      handleNotify(paramIntent);
    }
    else if ("ACTION_NOTIFY".equals(str))
    {
      handleNotify(paramIntent);
    }
    else if ("ACTION_CANCEL_WORK".equals(str))
    {
      handleCancelWork(paramIntent);
    }
    else if ("ACTION_STOP_FOREGROUND".equals(str))
    {
      handleStop(paramIntent);
    }
  }
  
  @MainThread
  public void setCallback(@NonNull Callback paramCallback)
  {
    if (mCallback != null)
    {
      Logger.get().error(TAG, "A callback already exists.", new Throwable[0]);
      return;
    }
    mCallback = paramCallback;
  }
  
  public static abstract interface Callback
  {
    public abstract void cancelNotification(int paramInt);
    
    public abstract void notify(int paramInt, @NonNull Notification paramNotification);
    
    public abstract void startForeground(int paramInt1, int paramInt2, @NonNull Notification paramNotification);
    
    public abstract void stop();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */