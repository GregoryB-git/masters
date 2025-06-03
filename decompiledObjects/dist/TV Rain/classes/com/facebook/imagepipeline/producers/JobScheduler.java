package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public class JobScheduler
{
  public static final String QUEUE_TIME_KEY = "queueTime";
  private final Runnable mDoJobRunnable;
  @VisibleForTesting
  @GuardedBy("this")
  public EncodedImage mEncodedImage;
  private final Executor mExecutor;
  private final JobRunnable mJobRunnable;
  @VisibleForTesting
  @GuardedBy("this")
  public long mJobStartTime;
  @VisibleForTesting
  @GuardedBy("this")
  public JobState mJobState;
  @VisibleForTesting
  @GuardedBy("this")
  public long mJobSubmitTime;
  private final int mMinimumJobIntervalMs;
  @VisibleForTesting
  @GuardedBy("this")
  public int mStatus;
  private final Runnable mSubmitJobRunnable;
  
  public JobScheduler(Executor paramExecutor, JobRunnable paramJobRunnable, int paramInt)
  {
    mExecutor = paramExecutor;
    mJobRunnable = paramJobRunnable;
    mMinimumJobIntervalMs = paramInt;
    mDoJobRunnable = new Runnable()
    {
      public void run()
      {
        JobScheduler.access$000(JobScheduler.this);
      }
    };
    mSubmitJobRunnable = new Runnable()
    {
      public void run()
      {
        JobScheduler.access$100(JobScheduler.this);
      }
    };
    mEncodedImage = null;
    mStatus = 0;
    mJobState = JobState.IDLE;
    mJobSubmitTime = 0L;
    mJobStartTime = 0L;
  }
  
  /* Error */
  private void doJob()
  {
    // Byte code:
    //   0: invokestatic 91	android/os/SystemClock:uptimeMillis	()J
    //   3: lstore_1
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 65	com/facebook/imagepipeline/producers/JobScheduler:mEncodedImage	Lcom/facebook/imagepipeline/image/EncodedImage;
    //   10: astore_3
    //   11: aload_0
    //   12: getfield 67	com/facebook/imagepipeline/producers/JobScheduler:mStatus	I
    //   15: istore 4
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield 65	com/facebook/imagepipeline/producers/JobScheduler:mEncodedImage	Lcom/facebook/imagepipeline/image/EncodedImage;
    //   22: aload_0
    //   23: iconst_0
    //   24: putfield 67	com/facebook/imagepipeline/producers/JobScheduler:mStatus	I
    //   27: aload_0
    //   28: getstatic 94	com/facebook/imagepipeline/producers/JobScheduler$JobState:RUNNING	Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;
    //   31: putfield 72	com/facebook/imagepipeline/producers/JobScheduler:mJobState	Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;
    //   34: aload_0
    //   35: lload_1
    //   36: putfield 76	com/facebook/imagepipeline/producers/JobScheduler:mJobStartTime	J
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_3
    //   42: iload 4
    //   44: invokestatic 98	com/facebook/imagepipeline/producers/JobScheduler:shouldProcess	(Lcom/facebook/imagepipeline/image/EncodedImage;I)Z
    //   47: ifeq +15 -> 62
    //   50: aload_0
    //   51: getfield 53	com/facebook/imagepipeline/producers/JobScheduler:mJobRunnable	Lcom/facebook/imagepipeline/producers/JobScheduler$JobRunnable;
    //   54: aload_3
    //   55: iload 4
    //   57: invokeinterface 102 3 0
    //   62: aload_3
    //   63: invokestatic 108	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   66: aload_0
    //   67: invokespecial 111	com/facebook/imagepipeline/producers/JobScheduler:onJobFinished	()V
    //   70: return
    //   71: astore 5
    //   73: aload_3
    //   74: invokestatic 108	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   77: aload_0
    //   78: invokespecial 111	com/facebook/imagepipeline/producers/JobScheduler:onJobFinished	()V
    //   81: aload 5
    //   83: athrow
    //   84: astore_3
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_3
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	JobScheduler
    //   3	33	1	l	long
    //   10	64	3	localEncodedImage	EncodedImage
    //   84	4	3	localObject1	Object
    //   15	41	4	i	int
    //   71	11	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   41	62	71	finally
    //   6	41	84	finally
    //   85	87	84	finally
  }
  
  private void enqueueJob(long paramLong)
  {
    if (paramLong > 0L) {
      JobStartExecutorSupplier.get().schedule(mSubmitJobRunnable, paramLong, TimeUnit.MILLISECONDS);
    } else {
      mSubmitJobRunnable.run();
    }
  }
  
  private void onJobFinished()
  {
    long l1 = SystemClock.uptimeMillis();
    try
    {
      long l2;
      int i;
      if (mJobState == JobState.RUNNING_AND_PENDING)
      {
        l2 = Math.max(mJobStartTime + mMinimumJobIntervalMs, l1);
        i = 1;
        mJobSubmitTime = l1;
        mJobState = JobState.QUEUED;
      }
      else
      {
        mJobState = JobState.IDLE;
        l2 = 0L;
        i = 0;
      }
      if (i != 0) {
        enqueueJob(l2 - l1);
      }
      return;
    }
    finally {}
  }
  
  private static boolean shouldProcess(EncodedImage paramEncodedImage, int paramInt)
  {
    boolean bool;
    if ((!BaseConsumer.isLast(paramInt)) && (!BaseConsumer.statusHasFlag(paramInt, 4)) && (!EncodedImage.isValid(paramEncodedImage))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void submitJob()
  {
    mExecutor.execute(mDoJobRunnable);
  }
  
  public void clearJob()
  {
    try
    {
      EncodedImage localEncodedImage = mEncodedImage;
      mEncodedImage = null;
      mStatus = 0;
      EncodedImage.closeSafely(localEncodedImage);
      return;
    }
    finally {}
  }
  
  public long getQueuedTime()
  {
    try
    {
      long l1 = mJobStartTime;
      long l2 = mJobSubmitTime;
      return l1 - l2;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean scheduleJob()
  {
    long l1 = SystemClock.uptimeMillis();
    try
    {
      boolean bool = shouldProcess(mEncodedImage, mStatus);
      int i = 0;
      if (!bool) {
        return false;
      }
      int j = 3.$SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState[mJobState.ordinal()];
      long l2;
      if (j != 1)
      {
        if (j == 3) {
          mJobState = JobState.RUNNING_AND_PENDING;
        }
        l2 = 0L;
      }
      else
      {
        l2 = Math.max(mJobStartTime + mMinimumJobIntervalMs, l1);
        mJobSubmitTime = l1;
        mJobState = JobState.QUEUED;
        i = 1;
      }
      if (i != 0) {
        enqueueJob(l2 - l1);
      }
      return true;
    }
    finally {}
  }
  
  public boolean updateJob(EncodedImage paramEncodedImage, int paramInt)
  {
    if (!shouldProcess(paramEncodedImage, paramInt)) {
      return false;
    }
    try
    {
      EncodedImage localEncodedImage = mEncodedImage;
      mEncodedImage = EncodedImage.cloneOrNull(paramEncodedImage);
      mStatus = paramInt;
      EncodedImage.closeSafely(localEncodedImage);
      return true;
    }
    finally {}
  }
  
  public static abstract interface JobRunnable
  {
    public abstract void run(EncodedImage paramEncodedImage, int paramInt);
  }
  
  @VisibleForTesting
  public static class JobStartExecutorSupplier
  {
    private static ScheduledExecutorService sJobStarterExecutor;
    
    public static ScheduledExecutorService get()
    {
      if (sJobStarterExecutor == null) {
        sJobStarterExecutor = Executors.newSingleThreadScheduledExecutor();
      }
      return sJobStarterExecutor;
    }
  }
  
  @VisibleForTesting
  public static enum JobState
  {
    static
    {
      JobState localJobState1 = new JobState("IDLE", 0);
      IDLE = localJobState1;
      JobState localJobState2 = new JobState("QUEUED", 1);
      QUEUED = localJobState2;
      JobState localJobState3 = new JobState("RUNNING", 2);
      RUNNING = localJobState3;
      JobState localJobState4 = new JobState("RUNNING_AND_PENDING", 3);
      RUNNING_AND_PENDING = localJobState4;
      $VALUES = new JobState[] { localJobState1, localJobState2, localJobState3, localJobState4 };
    }
    
    private JobState() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.JobScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */