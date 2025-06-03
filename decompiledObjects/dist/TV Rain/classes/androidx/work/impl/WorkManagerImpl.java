package androidx.work.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.core.os.BuildCompat;
import androidx.lifecycle.LiveData;
import androidx.work.Configuration;
import androidx.work.Configuration.Provider;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Logger.LogcatLogger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.R.bool;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.LiveDataUtils;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.PruneWorkRunnable;
import androidx.work.impl.utils.RawQueries;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StatusRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import androidx.work.multiprocess.RemoteWorkManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class WorkManagerImpl
  extends WorkManager
{
  public static final int MAX_PRE_JOB_SCHEDULER_API_LEVEL = 22;
  public static final int MIN_JOB_SCHEDULER_API_LEVEL = 23;
  public static final String REMOTE_WORK_MANAGER_CLIENT = "androidx.work.multiprocess.RemoteWorkManagerClient";
  private static final String TAG = Logger.tagWithPrefix("WorkManagerImpl");
  private static WorkManagerImpl sDefaultInstance = null;
  private static WorkManagerImpl sDelegatedInstance = null;
  private static final Object sLock = new Object();
  private Configuration mConfiguration;
  private Context mContext;
  private boolean mForceStopRunnableCompleted;
  private PreferenceUtils mPreferenceUtils;
  private Processor mProcessor;
  private volatile RemoteWorkManager mRemoteWorkManager;
  private BroadcastReceiver.PendingResult mRescheduleReceiverResult;
  private List<Scheduler> mSchedulers;
  private WorkDatabase mWorkDatabase;
  private TaskExecutor mWorkTaskExecutor;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkManagerImpl(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor)
  {
    this(paramContext, paramConfiguration, paramTaskExecutor, paramContext.getResources().getBoolean(R.bool.workmanager_test_configuration));
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkManagerImpl(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor, @NonNull WorkDatabase paramWorkDatabase)
  {
    Object localObject = paramContext.getApplicationContext();
    Logger.setLogger(new Logger.LogcatLogger(paramConfiguration.getMinimumLoggingLevel()));
    localObject = createSchedulers((Context)localObject, paramConfiguration, paramTaskExecutor);
    internalInit(paramContext, paramConfiguration, paramTaskExecutor, paramWorkDatabase, (List)localObject, new Processor(paramContext, paramConfiguration, paramTaskExecutor, paramWorkDatabase, (List)localObject));
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkManagerImpl(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor, @NonNull WorkDatabase paramWorkDatabase, @NonNull List<Scheduler> paramList, @NonNull Processor paramProcessor)
  {
    internalInit(paramContext, paramConfiguration, paramTaskExecutor, paramWorkDatabase, paramList, paramProcessor);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkManagerImpl(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor, boolean paramBoolean)
  {
    this(paramContext, paramConfiguration, paramTaskExecutor, WorkDatabase.create(paramContext.getApplicationContext(), paramTaskExecutor.getBackgroundExecutor(), paramBoolean));
  }
  
  @Deprecated
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static WorkManagerImpl getInstance()
  {
    synchronized (sLock)
    {
      WorkManagerImpl localWorkManagerImpl = sDelegatedInstance;
      if (localWorkManagerImpl != null) {
        return localWorkManagerImpl;
      }
      localWorkManagerImpl = sDefaultInstance;
      return localWorkManagerImpl;
    }
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static WorkManagerImpl getInstance(@NonNull Context paramContext)
  {
    synchronized (sLock)
    {
      WorkManagerImpl localWorkManagerImpl1 = getInstance();
      WorkManagerImpl localWorkManagerImpl2 = localWorkManagerImpl1;
      if (localWorkManagerImpl1 == null)
      {
        paramContext = paramContext.getApplicationContext();
        if ((paramContext instanceof Configuration.Provider))
        {
          initialize(paramContext, ((Configuration.Provider)paramContext).getWorkManagerConfiguration());
          localWorkManagerImpl2 = getInstance(paramContext);
        }
        else
        {
          paramContext = new java/lang/IllegalStateException;
          paramContext.<init>("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
          throw paramContext;
        }
      }
      return localWorkManagerImpl2;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static void initialize(@NonNull Context paramContext, @NonNull Configuration paramConfiguration)
  {
    synchronized (sLock)
    {
      Object localObject2 = sDelegatedInstance;
      if ((localObject2 != null) && (sDefaultInstance != null))
      {
        paramContext = new java/lang/IllegalStateException;
        paramContext.<init>("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
        throw paramContext;
      }
      if (localObject2 == null)
      {
        Context localContext = paramContext.getApplicationContext();
        if (sDefaultInstance == null)
        {
          paramContext = new androidx/work/impl/WorkManagerImpl;
          localObject2 = new androidx/work/impl/utils/taskexecutor/WorkManagerTaskExecutor;
          ((WorkManagerTaskExecutor)localObject2).<init>(paramConfiguration.getTaskExecutor());
          paramContext.<init>(localContext, paramConfiguration, (TaskExecutor)localObject2);
          sDefaultInstance = paramContext;
        }
        sDelegatedInstance = sDefaultInstance;
      }
      return;
    }
  }
  
  private void internalInit(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor, @NonNull WorkDatabase paramWorkDatabase, @NonNull List<Scheduler> paramList, @NonNull Processor paramProcessor)
  {
    paramContext = paramContext.getApplicationContext();
    mContext = paramContext;
    mConfiguration = paramConfiguration;
    mWorkTaskExecutor = paramTaskExecutor;
    mWorkDatabase = paramWorkDatabase;
    mSchedulers = paramList;
    mProcessor = paramProcessor;
    mPreferenceUtils = new PreferenceUtils(paramWorkDatabase);
    mForceStopRunnableCompleted = false;
    if (!paramContext.isDeviceProtectedStorage())
    {
      mWorkTaskExecutor.executeOnBackgroundThread(new ForceStopRunnable(paramContext, this));
      return;
    }
    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public static void setDelegate(@Nullable WorkManagerImpl paramWorkManagerImpl)
  {
    synchronized (sLock)
    {
      sDelegatedInstance = paramWorkManagerImpl;
      return;
    }
  }
  
  /* Error */
  private void tryInitializeMultiProcessSupport()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 21
    //   3: invokestatic 231	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   6: iconst_2
    //   7: anewarray 227	java/lang/Class
    //   10: dup
    //   11: iconst_0
    //   12: ldc 76
    //   14: aastore
    //   15: dup
    //   16: iconst_1
    //   17: ldc 2
    //   19: aastore
    //   20: invokevirtual 235	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   23: iconst_2
    //   24: anewarray 66	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield 188	androidx/work/impl/WorkManagerImpl:mContext	Landroid/content/Context;
    //   33: aastore
    //   34: dup
    //   35: iconst_1
    //   36: aload_0
    //   37: aastore
    //   38: invokevirtual 241	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   41: checkcast 243	androidx/work/multiprocess/RemoteWorkManager
    //   44: putfield 245	androidx/work/impl/WorkManagerImpl:mRemoteWorkManager	Landroidx/work/multiprocess/RemoteWorkManager;
    //   47: goto +23 -> 70
    //   50: astore_1
    //   51: invokestatic 249	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   54: getstatic 60	androidx/work/impl/WorkManagerImpl:TAG	Ljava/lang/String;
    //   57: ldc -5
    //   59: iconst_1
    //   60: anewarray 253	java/lang/Throwable
    //   63: dup
    //   64: iconst_0
    //   65: aload_1
    //   66: aastore
    //   67: invokevirtual 257	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   70: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	WorkManagerImpl
    //   50	16	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	47	50	finally
  }
  
  @NonNull
  public WorkContinuation beginUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull List<OneTimeWorkRequest> paramList)
  {
    if (!paramList.isEmpty()) {
      return new WorkContinuationImpl(this, paramString, paramExistingWorkPolicy, paramList);
    }
    throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
  }
  
  @NonNull
  public WorkContinuation beginWith(@NonNull List<OneTimeWorkRequest> paramList)
  {
    if (!paramList.isEmpty()) {
      return new WorkContinuationImpl(this, paramList);
    }
    throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
  }
  
  @NonNull
  public Operation cancelAllWork()
  {
    CancelWorkRunnable localCancelWorkRunnable = CancelWorkRunnable.forAll(this);
    mWorkTaskExecutor.executeOnBackgroundThread(localCancelWorkRunnable);
    return localCancelWorkRunnable.getOperation();
  }
  
  @NonNull
  public Operation cancelAllWorkByTag(@NonNull String paramString)
  {
    paramString = CancelWorkRunnable.forTag(paramString, this);
    mWorkTaskExecutor.executeOnBackgroundThread(paramString);
    return paramString.getOperation();
  }
  
  @NonNull
  public Operation cancelUniqueWork(@NonNull String paramString)
  {
    paramString = CancelWorkRunnable.forName(paramString, this, true);
    mWorkTaskExecutor.executeOnBackgroundThread(paramString);
    return paramString.getOperation();
  }
  
  @NonNull
  public Operation cancelWorkById(@NonNull UUID paramUUID)
  {
    paramUUID = CancelWorkRunnable.forId(paramUUID, this);
    mWorkTaskExecutor.executeOnBackgroundThread(paramUUID);
    return paramUUID.getOperation();
  }
  
  @NonNull
  public PendingIntent createCancelPendingIntent(@NonNull UUID paramUUID)
  {
    paramUUID = SystemForegroundDispatcher.createCancelWorkIntent(mContext, paramUUID.toString());
    int i;
    if (BuildCompat.isAtLeastS()) {
      i = 167772160;
    } else {
      i = 134217728;
    }
    return PendingIntent.getService(mContext, 0, paramUUID, i);
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public List<Scheduler> createSchedulers(@NonNull Context paramContext, @NonNull Configuration paramConfiguration, @NonNull TaskExecutor paramTaskExecutor)
  {
    return Arrays.asList(new Scheduler[] { Schedulers.createBestAvailableBackgroundScheduler(paramContext, this), new GreedyScheduler(paramContext, paramConfiguration, paramTaskExecutor, this) });
  }
  
  @NonNull
  public WorkContinuationImpl createWorkContinuationForUniquePeriodicWork(@NonNull String paramString, @NonNull ExistingPeriodicWorkPolicy paramExistingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest paramPeriodicWorkRequest)
  {
    if (paramExistingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP) {
      paramExistingPeriodicWorkPolicy = ExistingWorkPolicy.KEEP;
    } else {
      paramExistingPeriodicWorkPolicy = ExistingWorkPolicy.REPLACE;
    }
    return new WorkContinuationImpl(this, paramString, paramExistingPeriodicWorkPolicy, Collections.singletonList(paramPeriodicWorkRequest));
  }
  
  @NonNull
  public Operation enqueue(@NonNull List<? extends WorkRequest> paramList)
  {
    if (!paramList.isEmpty()) {
      return new WorkContinuationImpl(this, paramList).enqueue();
    }
    throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
  }
  
  @NonNull
  public Operation enqueueUniquePeriodicWork(@NonNull String paramString, @NonNull ExistingPeriodicWorkPolicy paramExistingPeriodicWorkPolicy, @NonNull PeriodicWorkRequest paramPeriodicWorkRequest)
  {
    return createWorkContinuationForUniquePeriodicWork(paramString, paramExistingPeriodicWorkPolicy, paramPeriodicWorkRequest).enqueue();
  }
  
  @NonNull
  public Operation enqueueUniqueWork(@NonNull String paramString, @NonNull ExistingWorkPolicy paramExistingWorkPolicy, @NonNull List<OneTimeWorkRequest> paramList)
  {
    return new WorkContinuationImpl(this, paramString, paramExistingWorkPolicy, paramList).enqueue();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Context getApplicationContext()
  {
    return mContext;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Configuration getConfiguration()
  {
    return mConfiguration;
  }
  
  @NonNull
  public ListenableFuture<Long> getLastCancelAllTimeMillis()
  {
    final SettableFuture localSettableFuture = SettableFuture.create();
    final PreferenceUtils localPreferenceUtils = mPreferenceUtils;
    mWorkTaskExecutor.executeOnBackgroundThread(new Runnable()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 23	androidx/work/impl/WorkManagerImpl$1:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
        //   4: aload_0
        //   5: getfield 25	androidx/work/impl/WorkManagerImpl$1:val$preferenceUtils	Landroidx/work/impl/utils/PreferenceUtils;
        //   8: invokevirtual 35	androidx/work/impl/utils/PreferenceUtils:getLastCancelAllTimeMillis	()J
        //   11: invokestatic 41	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   14: invokevirtual 47	androidx/work/impl/utils/futures/SettableFuture:set	(Ljava/lang/Object;)Z
        //   17: pop
        //   18: goto +13 -> 31
        //   21: astore_1
        //   22: aload_0
        //   23: getfield 23	androidx/work/impl/WorkManagerImpl$1:val$future	Landroidx/work/impl/utils/futures/SettableFuture;
        //   26: aload_1
        //   27: invokevirtual 51	androidx/work/impl/utils/futures/SettableFuture:setException	(Ljava/lang/Throwable;)Z
        //   30: pop
        //   31: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	32	0	this	1
        //   21	6	1	localThrowable	Throwable
        // Exception table:
        //   from	to	target	type
        //   0	18	21	finally
      }
    });
    return localSettableFuture;
  }
  
  @NonNull
  public LiveData<Long> getLastCancelAllTimeMillisLiveData()
  {
    return mPreferenceUtils.getLastCancelAllTimeMillisLiveData();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public PreferenceUtils getPreferenceUtils()
  {
    return mPreferenceUtils;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Processor getProcessor()
  {
    return mProcessor;
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public RemoteWorkManager getRemoteWorkManager()
  {
    if (mRemoteWorkManager == null) {
      synchronized (sLock)
      {
        if (mRemoteWorkManager == null)
        {
          tryInitializeMultiProcessSupport();
          if ((mRemoteWorkManager == null) && (!TextUtils.isEmpty(mConfiguration.getDefaultProcessName())))
          {
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            localIllegalStateException.<init>("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
            throw localIllegalStateException;
          }
        }
      }
    }
    return mRemoteWorkManager;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public List<Scheduler> getSchedulers()
  {
    return mSchedulers;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public WorkDatabase getWorkDatabase()
  {
    return mWorkDatabase;
  }
  
  @NonNull
  public ListenableFuture<WorkInfo> getWorkInfoById(@NonNull UUID paramUUID)
  {
    paramUUID = StatusRunnable.forUUID(this, paramUUID);
    mWorkTaskExecutor.getBackgroundExecutor().execute(paramUUID);
    return paramUUID.getFuture();
  }
  
  @NonNull
  public LiveData<WorkInfo> getWorkInfoByIdLiveData(@NonNull UUID paramUUID)
  {
    LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(paramUUID.toString())), new Function()
    {
      public WorkInfo apply(List<WorkSpec.WorkInfoPojo> paramAnonymousList)
      {
        if ((paramAnonymousList != null) && (paramAnonymousList.size() > 0)) {
          paramAnonymousList = ((WorkSpec.WorkInfoPojo)paramAnonymousList.get(0)).toWorkInfo();
        } else {
          paramAnonymousList = null;
        }
        return paramAnonymousList;
      }
    }, mWorkTaskExecutor);
  }
  
  @NonNull
  public ListenableFuture<List<WorkInfo>> getWorkInfos(@NonNull WorkQuery paramWorkQuery)
  {
    paramWorkQuery = StatusRunnable.forWorkQuerySpec(this, paramWorkQuery);
    mWorkTaskExecutor.getBackgroundExecutor().execute(paramWorkQuery);
    return paramWorkQuery.getFuture();
  }
  
  public LiveData<List<WorkInfo>> getWorkInfosById(@NonNull List<String> paramList)
  {
    return LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForIds(paramList), WorkSpec.WORK_INFO_MAPPER, mWorkTaskExecutor);
  }
  
  @NonNull
  public ListenableFuture<List<WorkInfo>> getWorkInfosByTag(@NonNull String paramString)
  {
    paramString = StatusRunnable.forTag(this, paramString);
    mWorkTaskExecutor.getBackgroundExecutor().execute(paramString);
    return paramString.getFuture();
  }
  
  @NonNull
  public LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(@NonNull String paramString)
  {
    return LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForTag(paramString), WorkSpec.WORK_INFO_MAPPER, mWorkTaskExecutor);
  }
  
  @NonNull
  public ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(@NonNull String paramString)
  {
    paramString = StatusRunnable.forUniqueWork(this, paramString);
    mWorkTaskExecutor.getBackgroundExecutor().execute(paramString);
    return paramString.getFuture();
  }
  
  @NonNull
  public LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(@NonNull String paramString)
  {
    return LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.workSpecDao().getWorkStatusPojoLiveDataForName(paramString), WorkSpec.WORK_INFO_MAPPER, mWorkTaskExecutor);
  }
  
  @NonNull
  public LiveData<List<WorkInfo>> getWorkInfosLiveData(@NonNull WorkQuery paramWorkQuery)
  {
    return LiveDataUtils.dedupedMappedLiveDataFor(mWorkDatabase.rawWorkInfoDao().getWorkInfoPojosLiveData(RawQueries.workQueryToRawQuery(paramWorkQuery)), WorkSpec.WORK_INFO_MAPPER, mWorkTaskExecutor);
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public TaskExecutor getWorkTaskExecutor()
  {
    return mWorkTaskExecutor;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void onForceStopRunnableCompleted()
  {
    synchronized (sLock)
    {
      mForceStopRunnableCompleted = true;
      BroadcastReceiver.PendingResult localPendingResult = mRescheduleReceiverResult;
      if (localPendingResult != null)
      {
        localPendingResult.finish();
        mRescheduleReceiverResult = null;
      }
      return;
    }
  }
  
  @NonNull
  public Operation pruneWork()
  {
    PruneWorkRunnable localPruneWorkRunnable = new PruneWorkRunnable(this);
    mWorkTaskExecutor.executeOnBackgroundThread(localPruneWorkRunnable);
    return localPruneWorkRunnable.getOperation();
  }
  
  public void rescheduleEligibleWork()
  {
    SystemJobScheduler.cancelAll(getApplicationContext());
    getWorkDatabase().workSpecDao().resetScheduledState();
    Schedulers.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void setReschedulePendingResult(@NonNull BroadcastReceiver.PendingResult paramPendingResult)
  {
    synchronized (sLock)
    {
      mRescheduleReceiverResult = paramPendingResult;
      if (mForceStopRunnableCompleted)
      {
        paramPendingResult.finish();
        mRescheduleReceiverResult = null;
      }
      return;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void startWork(@NonNull String paramString)
  {
    startWork(paramString, null);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void startWork(@NonNull String paramString, @Nullable WorkerParameters.RuntimeExtras paramRuntimeExtras)
  {
    mWorkTaskExecutor.executeOnBackgroundThread(new StartWorkRunnable(this, paramString, paramRuntimeExtras));
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void stopForegroundWork(@NonNull String paramString)
  {
    mWorkTaskExecutor.executeOnBackgroundThread(new StopWorkRunnable(this, paramString, true));
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public void stopWork(@NonNull String paramString)
  {
    mWorkTaskExecutor.executeOnBackgroundThread(new StopWorkRunnable(this, paramString, false));
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkManagerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */