package androidx.core.app;

import a;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import f0;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService
  extends Service
{
  public static final boolean DEBUG = false;
  public static final String TAG = "JobIntentService";
  public static final HashMap<ComponentName, WorkEnqueuer> sClassWorkEnqueuer = new HashMap();
  public static final Object sLock = new Object();
  public final ArrayList<CompatWorkItem> mCompatQueue;
  public WorkEnqueuer mCompatWorkEnqueuer;
  public CommandProcessor mCurProcessor;
  public boolean mDestroyed = false;
  public boolean mInterruptIfStopped = false;
  public CompatJobEngine mJobImpl;
  public boolean mStopped = false;
  
  public JobIntentService()
  {
    if (Build.VERSION.SDK_INT >= 26) {
      mCompatQueue = null;
    } else {
      mCompatQueue = new ArrayList();
    }
  }
  
  public static void enqueueWork(@NonNull Context paramContext, @NonNull ComponentName paramComponentName, int paramInt, @NonNull Intent paramIntent)
  {
    if (paramIntent != null) {
      synchronized (sLock)
      {
        paramContext = getWorkEnqueuer(paramContext, paramComponentName, true, paramInt);
        paramContext.ensureJobId(paramInt);
        paramContext.enqueueWork(paramIntent);
        return;
      }
    }
    throw new IllegalArgumentException("work must not be null");
  }
  
  public static void enqueueWork(@NonNull Context paramContext, @NonNull Class<?> paramClass, int paramInt, @NonNull Intent paramIntent)
  {
    enqueueWork(paramContext, new ComponentName(paramContext, paramClass), paramInt, paramIntent);
  }
  
  public static WorkEnqueuer getWorkEnqueuer(Context paramContext, ComponentName paramComponentName, boolean paramBoolean, int paramInt)
  {
    HashMap localHashMap = sClassWorkEnqueuer;
    WorkEnqueuer localWorkEnqueuer = (WorkEnqueuer)localHashMap.get(paramComponentName);
    Object localObject = localWorkEnqueuer;
    if (localWorkEnqueuer == null)
    {
      if (Build.VERSION.SDK_INT >= 26)
      {
        if (paramBoolean) {
          paramContext = new JobWorkEnqueuer(paramContext, paramComponentName, paramInt);
        } else {
          throw new IllegalArgumentException("Can't be here without a job id");
        }
      }
      else {
        paramContext = new CompatWorkEnqueuer(paramContext, paramComponentName);
      }
      localHashMap.put(paramComponentName, paramContext);
      localObject = paramContext;
    }
    return (WorkEnqueuer)localObject;
  }
  
  public GenericWorkItem dequeueWork()
  {
    ??? = mJobImpl;
    if (??? != null) {
      return ((CompatJobEngine)???).dequeueWork();
    }
    synchronized (mCompatQueue)
    {
      if (mCompatQueue.size() > 0)
      {
        GenericWorkItem localGenericWorkItem = (GenericWorkItem)mCompatQueue.remove(0);
        return localGenericWorkItem;
      }
      return null;
    }
  }
  
  public boolean doStopCurrentWork()
  {
    CommandProcessor localCommandProcessor = mCurProcessor;
    if (localCommandProcessor != null) {
      localCommandProcessor.cancel(mInterruptIfStopped);
    }
    mStopped = true;
    return onStopCurrentWork();
  }
  
  public void ensureProcessorRunningLocked(boolean paramBoolean)
  {
    if (mCurProcessor == null)
    {
      mCurProcessor = new CommandProcessor();
      WorkEnqueuer localWorkEnqueuer = mCompatWorkEnqueuer;
      if ((localWorkEnqueuer != null) && (paramBoolean)) {
        localWorkEnqueuer.serviceProcessingStarted();
      }
      mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
  }
  
  public boolean isStopped()
  {
    return mStopped;
  }
  
  public IBinder onBind(@NonNull Intent paramIntent)
  {
    paramIntent = mJobImpl;
    if (paramIntent != null) {
      return paramIntent.compatGetBinder();
    }
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (Build.VERSION.SDK_INT >= 26)
    {
      mJobImpl = new JobServiceEngineImpl(this);
      mCompatWorkEnqueuer = null;
    }
    else
    {
      mJobImpl = null;
      mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    ArrayList localArrayList = mCompatQueue;
    if (localArrayList != null) {
      try
      {
        mDestroyed = true;
        mCompatWorkEnqueuer.serviceProcessingFinished();
      }
      finally {}
    }
  }
  
  public abstract void onHandleWork(@NonNull Intent paramIntent);
  
  public int onStartCommand(@Nullable Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (mCompatQueue != null)
    {
      mCompatWorkEnqueuer.serviceStartReceived();
      synchronized (mCompatQueue)
      {
        ArrayList localArrayList2 = mCompatQueue;
        CompatWorkItem localCompatWorkItem = new androidx/core/app/JobIntentService$CompatWorkItem;
        if (paramIntent == null) {
          paramIntent = new Intent();
        }
        localCompatWorkItem.<init>(this, paramIntent, paramInt2);
        localArrayList2.add(localCompatWorkItem);
        ensureProcessorRunningLocked(true);
        return 3;
      }
    }
    return 2;
  }
  
  public boolean onStopCurrentWork()
  {
    return true;
  }
  
  public void processorFinished()
  {
    ArrayList localArrayList1 = mCompatQueue;
    if (localArrayList1 != null) {
      try
      {
        mCurProcessor = null;
        ArrayList localArrayList2 = mCompatQueue;
        if ((localArrayList2 != null) && (localArrayList2.size() > 0)) {
          ensureProcessorRunningLocked(false);
        } else if (!mDestroyed) {
          mCompatWorkEnqueuer.serviceProcessingFinished();
        }
      }
      finally {}
    }
  }
  
  public void setInterruptIfStopped(boolean paramBoolean)
  {
    mInterruptIfStopped = paramBoolean;
  }
  
  public final class CommandProcessor
    extends AsyncTask<Void, Void, Void>
  {
    public CommandProcessor() {}
    
    public Void doInBackground(Void... paramVarArgs)
    {
      for (;;)
      {
        paramVarArgs = dequeueWork();
        if (paramVarArgs == null) {
          break;
        }
        onHandleWork(paramVarArgs.getIntent());
        paramVarArgs.complete();
      }
      return null;
    }
    
    public void onCancelled(Void paramVoid)
    {
      processorFinished();
    }
    
    public void onPostExecute(Void paramVoid)
    {
      processorFinished();
    }
  }
  
  public static abstract interface CompatJobEngine
  {
    public abstract IBinder compatGetBinder();
    
    public abstract JobIntentService.GenericWorkItem dequeueWork();
  }
  
  public static final class CompatWorkEnqueuer
    extends JobIntentService.WorkEnqueuer
  {
    private final Context mContext;
    private final PowerManager.WakeLock mLaunchWakeLock;
    public boolean mLaunchingService;
    private final PowerManager.WakeLock mRunWakeLock;
    public boolean mServiceProcessing;
    
    public CompatWorkEnqueuer(Context paramContext, ComponentName paramComponentName)
    {
      super();
      mContext = paramContext.getApplicationContext();
      paramContext = (PowerManager)paramContext.getSystemService("power");
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramComponentName.getClassName());
      ((StringBuilder)localObject).append(":launch");
      localObject = paramContext.newWakeLock(1, ((StringBuilder)localObject).toString());
      mLaunchWakeLock = ((PowerManager.WakeLock)localObject);
      ((PowerManager.WakeLock)localObject).setReferenceCounted(false);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramComponentName.getClassName());
      ((StringBuilder)localObject).append(":run");
      paramContext = paramContext.newWakeLock(1, ((StringBuilder)localObject).toString());
      mRunWakeLock = paramContext;
      paramContext.setReferenceCounted(false);
    }
    
    public void enqueueWork(Intent paramIntent)
    {
      paramIntent = new Intent(paramIntent);
      paramIntent.setComponent(mComponentName);
      if (mContext.startService(paramIntent) != null) {
        try
        {
          if (!mLaunchingService)
          {
            mLaunchingService = true;
            if (!mServiceProcessing) {
              mLaunchWakeLock.acquire(60000L);
            }
          }
        }
        finally {}
      }
    }
    
    public void serviceProcessingFinished()
    {
      try
      {
        if (mServiceProcessing)
        {
          if (mLaunchingService) {
            mLaunchWakeLock.acquire(60000L);
          }
          mServiceProcessing = false;
          mRunWakeLock.release();
        }
        return;
      }
      finally {}
    }
    
    public void serviceProcessingStarted()
    {
      try
      {
        if (!mServiceProcessing)
        {
          mServiceProcessing = true;
          mRunWakeLock.acquire(600000L);
          mLaunchWakeLock.release();
        }
        return;
      }
      finally {}
    }
    
    public void serviceStartReceived()
    {
      try
      {
        mLaunchingService = false;
        return;
      }
      finally {}
    }
  }
  
  public final class CompatWorkItem
    implements JobIntentService.GenericWorkItem
  {
    public final Intent mIntent;
    public final int mStartId;
    
    public CompatWorkItem(Intent paramIntent, int paramInt)
    {
      mIntent = paramIntent;
      mStartId = paramInt;
    }
    
    public void complete()
    {
      stopSelf(mStartId);
    }
    
    public Intent getIntent()
    {
      return mIntent;
    }
  }
  
  public static abstract interface GenericWorkItem
  {
    public abstract void complete();
    
    public abstract Intent getIntent();
  }
  
  @RequiresApi(26)
  public static final class JobServiceEngineImpl
    extends JobServiceEngine
    implements JobIntentService.CompatJobEngine
  {
    public static final boolean DEBUG = false;
    public static final String TAG = "JobServiceEngineImpl";
    public final Object mLock = new Object();
    public JobParameters mParams;
    public final JobIntentService mService;
    
    public JobServiceEngineImpl(JobIntentService paramJobIntentService)
    {
      super();
      mService = paramJobIntentService;
    }
    
    public IBinder compatGetBinder()
    {
      return getBinder();
    }
    
    public JobIntentService.GenericWorkItem dequeueWork()
    {
      synchronized (mLock)
      {
        Object localObject2 = mParams;
        if (localObject2 == null) {
          return null;
        }
        localObject2 = ((JobParameters)localObject2).dequeueWork();
        if (localObject2 != null)
        {
          ((JobWorkItem)localObject2).getIntent().setExtrasClassLoader(mService.getClassLoader());
          return new WrapperWorkItem((JobWorkItem)localObject2);
        }
        return null;
      }
    }
    
    public boolean onStartJob(JobParameters paramJobParameters)
    {
      mParams = paramJobParameters;
      mService.ensureProcessorRunningLocked(false);
      return true;
    }
    
    public boolean onStopJob(JobParameters paramJobParameters)
    {
      boolean bool = mService.doStopCurrentWork();
      synchronized (mLock)
      {
        mParams = null;
        return bool;
      }
    }
    
    public final class WrapperWorkItem
      implements JobIntentService.GenericWorkItem
    {
      public final JobWorkItem mJobWork;
      
      public WrapperWorkItem(JobWorkItem paramJobWorkItem)
      {
        mJobWork = paramJobWorkItem;
      }
      
      public void complete()
      {
        synchronized (mLock)
        {
          JobParameters localJobParameters = mParams;
          if (localJobParameters != null) {
            f0.r(localJobParameters, mJobWork);
          }
          return;
        }
      }
      
      public Intent getIntent()
      {
        return mJobWork.getIntent();
      }
    }
  }
  
  @RequiresApi(26)
  public static final class JobWorkEnqueuer
    extends JobIntentService.WorkEnqueuer
  {
    private final JobInfo mJobInfo;
    private final JobScheduler mJobScheduler;
    
    public JobWorkEnqueuer(Context paramContext, ComponentName paramComponentName, int paramInt)
    {
      super();
      ensureJobId(paramInt);
      mJobInfo = new JobInfo.Builder(paramInt, mComponentName).setOverrideDeadline(0L).build();
      mJobScheduler = ((JobScheduler)paramContext.getApplicationContext().getSystemService("jobscheduler"));
    }
    
    public void enqueueWork(Intent paramIntent)
    {
      mJobScheduler.enqueue(mJobInfo, new JobWorkItem(paramIntent));
    }
  }
  
  public static abstract class WorkEnqueuer
  {
    public final ComponentName mComponentName;
    public boolean mHasJobId;
    public int mJobId;
    
    public WorkEnqueuer(ComponentName paramComponentName)
    {
      mComponentName = paramComponentName;
    }
    
    public abstract void enqueueWork(Intent paramIntent);
    
    public void ensureJobId(int paramInt)
    {
      if (!mHasJobId)
      {
        mHasJobId = true;
        mJobId = paramInt;
      }
      else
      {
        if (mJobId != paramInt) {
          break label29;
        }
      }
      return;
      label29:
      StringBuilder localStringBuilder = a.r("Given job ID ", paramInt, " is different than previous ");
      localStringBuilder.append(mJobId);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    
    public void serviceProcessingFinished() {}
    
    public void serviceProcessingStarted() {}
    
    public void serviceStartReceived() {}
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.JobIntentService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */