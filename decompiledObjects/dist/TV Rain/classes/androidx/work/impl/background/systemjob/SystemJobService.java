package androidx.work.impl.background.systemjob;

import a3;
import android.app.Application;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RequiresApi(23)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService
  extends JobService
  implements ExecutionListener
{
  private static final String TAG = Logger.tagWithPrefix("SystemJobService");
  private final Map<String, JobParameters> mJobParameters = new HashMap();
  private WorkManagerImpl mWorkManagerImpl;
  
  @Nullable
  private static String getWorkSpecIdFromJobParameters(@NonNull JobParameters paramJobParameters)
  {
    try
    {
      paramJobParameters = paramJobParameters.getExtras();
      if ((paramJobParameters != null) && (paramJobParameters.containsKey("EXTRA_WORK_SPEC_ID")))
      {
        paramJobParameters = paramJobParameters.getString("EXTRA_WORK_SPEC_ID");
        return paramJobParameters;
      }
    }
    catch (NullPointerException paramJobParameters)
    {
      for (;;) {}
    }
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    try
    {
      WorkManagerImpl localWorkManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
      mWorkManagerImpl = localWorkManagerImpl;
      localWorkManagerImpl.getProcessor().addExecutionListener(this);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      if (!Application.class.equals(getApplication().getClass())) {
        break label60;
      }
    }
    Logger.get().warning(TAG, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
    return;
    label60:
    throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    WorkManagerImpl localWorkManagerImpl = mWorkManagerImpl;
    if (localWorkManagerImpl != null) {
      localWorkManagerImpl.getProcessor().removeExecutionListener(this);
    }
  }
  
  public void onExecuted(@NonNull String paramString, boolean paramBoolean)
  {
    Logger.get().debug(TAG, String.format("%s executed on JobScheduler", new Object[] { paramString }), new Throwable[0]);
    synchronized (mJobParameters)
    {
      paramString = (JobParameters)mJobParameters.remove(paramString);
      if (paramString != null) {
        jobFinished(paramString, paramBoolean);
      }
      return;
    }
  }
  
  public boolean onStartJob(@NonNull JobParameters paramJobParameters)
  {
    if (mWorkManagerImpl == null)
    {
      Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
      jobFinished(paramJobParameters, true);
      return false;
    }
    String str = getWorkSpecIdFromJobParameters(paramJobParameters);
    if (TextUtils.isEmpty(str))
    {
      Logger.get().error(TAG, "WorkSpec id not found!", new Throwable[0]);
      return false;
    }
    synchronized (mJobParameters)
    {
      if (mJobParameters.containsKey(str))
      {
        Logger.get().debug(TAG, String.format("Job is already being executed by SystemJobService: %s", new Object[] { str }), new Throwable[0]);
        return false;
      }
      Logger.get().debug(TAG, String.format("onStartJob for %s", new Object[] { str }), new Throwable[0]);
      mJobParameters.put(str, paramJobParameters);
      int i = Build.VERSION.SDK_INT;
      ??? = new WorkerParameters.RuntimeExtras();
      if (paramJobParameters.getTriggeredContentUris() != null) {
        triggeredContentUris = Arrays.asList(paramJobParameters.getTriggeredContentUris());
      }
      if (paramJobParameters.getTriggeredContentAuthorities() != null) {
        triggeredContentAuthorities = Arrays.asList(paramJobParameters.getTriggeredContentAuthorities());
      }
      if (i >= 28) {
        network = a3.i(paramJobParameters);
      }
      mWorkManagerImpl.startWork(str, (WorkerParameters.RuntimeExtras)???);
      return true;
    }
  }
  
  public boolean onStopJob(@NonNull JobParameters arg1)
  {
    if (mWorkManagerImpl == null)
    {
      Logger.get().debug(TAG, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
      return true;
    }
    String str = getWorkSpecIdFromJobParameters(???);
    if (TextUtils.isEmpty(str))
    {
      Logger.get().error(TAG, "WorkSpec id not found!", new Throwable[0]);
      return false;
    }
    Logger.get().debug(TAG, String.format("onStopJob for %s", new Object[] { str }), new Throwable[0]);
    synchronized (mJobParameters)
    {
      mJobParameters.remove(str);
      mWorkManagerImpl.stopWork(str);
      return mWorkManagerImpl.getProcessor().isCancelled(str) ^ true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemjob.SystemJobService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */