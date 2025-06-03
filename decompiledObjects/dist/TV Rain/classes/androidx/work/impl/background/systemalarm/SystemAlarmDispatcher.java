package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmDispatcher
  implements ExecutionListener
{
  private static final int DEFAULT_START_ID = 0;
  private static final String KEY_START_ID = "KEY_START_ID";
  private static final String PROCESS_COMMAND_TAG = "ProcessCommand";
  public static final String TAG = Logger.tagWithPrefix("SystemAlarmDispatcher");
  public final CommandHandler mCommandHandler;
  @Nullable
  private CommandsCompletedListener mCompletedListener;
  public final Context mContext;
  public Intent mCurrentIntent;
  public final List<Intent> mIntents;
  private final Handler mMainHandler;
  private final Processor mProcessor;
  private final TaskExecutor mTaskExecutor;
  private final WorkManagerImpl mWorkManager;
  private final WorkTimer mWorkTimer;
  
  public SystemAlarmDispatcher(@NonNull Context paramContext)
  {
    this(paramContext, null, null);
  }
  
  @VisibleForTesting
  public SystemAlarmDispatcher(@NonNull Context paramContext, @Nullable Processor paramProcessor, @Nullable WorkManagerImpl paramWorkManagerImpl)
  {
    Context localContext = paramContext.getApplicationContext();
    mContext = localContext;
    mCommandHandler = new CommandHandler(localContext);
    mWorkTimer = new WorkTimer();
    if (paramWorkManagerImpl == null) {
      paramWorkManagerImpl = WorkManagerImpl.getInstance(paramContext);
    }
    mWorkManager = paramWorkManagerImpl;
    if (paramProcessor == null) {
      paramProcessor = paramWorkManagerImpl.getProcessor();
    }
    mProcessor = paramProcessor;
    mTaskExecutor = paramWorkManagerImpl.getWorkTaskExecutor();
    paramProcessor.addExecutionListener(this);
    mIntents = new ArrayList();
    mCurrentIntent = null;
    mMainHandler = new Handler(Looper.getMainLooper());
  }
  
  private void assertMainThread()
  {
    if (mMainHandler.getLooper().getThread() == Thread.currentThread()) {
      return;
    }
    throw new IllegalStateException("Needs to be invoked on the main thread.");
  }
  
  @MainThread
  private boolean hasIntentWithAction(@NonNull String paramString)
  {
    assertMainThread();
    synchronized (mIntents)
    {
      Iterator localIterator = mIntents.iterator();
      while (localIterator.hasNext()) {
        if (paramString.equals(((Intent)localIterator.next()).getAction())) {
          return true;
        }
      }
      return false;
    }
  }
  
  @MainThread
  private void processCommand()
  {
    assertMainThread();
    PowerManager.WakeLock localWakeLock = WakeLocks.newWakeLock(mContext, "ProcessCommand");
    try
    {
      localWakeLock.acquire();
      TaskExecutor localTaskExecutor = mWorkManager.getWorkTaskExecutor();
      Runnable local1 = new androidx/work/impl/background/systemalarm/SystemAlarmDispatcher$1;
      local1.<init>(this);
      localTaskExecutor.executeOnBackgroundThread(local1);
      return;
    }
    finally
    {
      localWakeLock.release();
    }
  }
  
  @MainThread
  public boolean add(@NonNull Intent paramIntent, int paramInt)
  {
    Object localObject1 = Logger.get();
    Object localObject2 = TAG;
    int i = 0;
    ((Logger)localObject1).debug((String)localObject2, String.format("Adding command %s (%s)", new Object[] { paramIntent, Integer.valueOf(paramInt) }), new Throwable[0]);
    assertMainThread();
    localObject1 = paramIntent.getAction();
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      Logger.get().warning((String)localObject2, "Unknown command. Ignoring", new Throwable[0]);
      return false;
    }
    if (("ACTION_CONSTRAINTS_CHANGED".equals(localObject1)) && (hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED"))) {
      return false;
    }
    paramIntent.putExtra("KEY_START_ID", paramInt);
    localObject2 = mIntents;
    paramInt = i;
    try
    {
      if (!mIntents.isEmpty()) {
        paramInt = 1;
      }
      mIntents.add(paramIntent);
      if (paramInt == 0) {
        processCommand();
      }
      return true;
    }
    finally {}
  }
  
  @MainThread
  public void dequeueAndCheckForCompletion()
  {
    ??? = Logger.get();
    Object localObject2 = TAG;
    ((Logger)???).debug((String)localObject2, "Checking if commands are complete.", new Throwable[0]);
    assertMainThread();
    synchronized (mIntents)
    {
      if (mCurrentIntent != null)
      {
        Logger.get().debug((String)localObject2, String.format("Removing command %s", new Object[] { mCurrentIntent }), new Throwable[0]);
        if (((Intent)mIntents.remove(0)).equals(mCurrentIntent))
        {
          mCurrentIntent = null;
        }
        else
        {
          localObject2 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject2).<init>("Dequeue-d command is not the first.");
          throw ((Throwable)localObject2);
        }
      }
      SerialExecutor localSerialExecutor = mTaskExecutor.getBackgroundExecutor();
      if ((!mCommandHandler.hasPendingCommands()) && (mIntents.isEmpty()) && (!localSerialExecutor.hasPendingTasks()))
      {
        Logger.get().debug((String)localObject2, "No more commands & intents.", new Throwable[0]);
        localObject2 = mCompletedListener;
        if (localObject2 != null) {
          ((CommandsCompletedListener)localObject2).onAllCommandsCompleted();
        }
      }
      else if (!mIntents.isEmpty())
      {
        processCommand();
      }
      return;
    }
  }
  
  public Processor getProcessor()
  {
    return mProcessor;
  }
  
  public TaskExecutor getTaskExecutor()
  {
    return mTaskExecutor;
  }
  
  public WorkManagerImpl getWorkManager()
  {
    return mWorkManager;
  }
  
  public WorkTimer getWorkTimer()
  {
    return mWorkTimer;
  }
  
  public void onDestroy()
  {
    Logger.get().debug(TAG, "Destroying SystemAlarmDispatcher", new Throwable[0]);
    mProcessor.removeExecutionListener(this);
    mWorkTimer.onDestroy();
    mCompletedListener = null;
  }
  
  public void onExecuted(@NonNull String paramString, boolean paramBoolean)
  {
    postOnMainThread(new AddRunnable(this, CommandHandler.createExecutionCompletedIntent(mContext, paramString, paramBoolean), 0));
  }
  
  public void postOnMainThread(@NonNull Runnable paramRunnable)
  {
    mMainHandler.post(paramRunnable);
  }
  
  public void setCompletedListener(@NonNull CommandsCompletedListener paramCommandsCompletedListener)
  {
    if (mCompletedListener != null)
    {
      Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
      return;
    }
    mCompletedListener = paramCommandsCompletedListener;
  }
  
  public static class AddRunnable
    implements Runnable
  {
    private final SystemAlarmDispatcher mDispatcher;
    private final Intent mIntent;
    private final int mStartId;
    
    public AddRunnable(@NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher, @NonNull Intent paramIntent, int paramInt)
    {
      mDispatcher = paramSystemAlarmDispatcher;
      mIntent = paramIntent;
      mStartId = paramInt;
    }
    
    public void run()
    {
      mDispatcher.add(mIntent, mStartId);
    }
  }
  
  public static abstract interface CommandsCompletedListener
  {
    public abstract void onAllCommandsCompleted();
  }
  
  public static class DequeueAndCheckForCompletion
    implements Runnable
  {
    private final SystemAlarmDispatcher mDispatcher;
    
    public DequeueAndCheckForCompletion(@NonNull SystemAlarmDispatcher paramSystemAlarmDispatcher)
    {
      mDispatcher = paramSystemAlarmDispatcher;
    }
    
    public void run()
    {
      mDispatcher.dequeueAndCheckForCompletion();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.SystemAlarmDispatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */