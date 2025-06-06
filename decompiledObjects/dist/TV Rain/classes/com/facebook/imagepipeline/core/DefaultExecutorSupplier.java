package com.facebook.imagepipeline.core;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DefaultExecutorSupplier
  implements ExecutorSupplier
{
  private static final int NUM_IO_BOUND_THREADS = 2;
  private static final int NUM_LIGHTWEIGHT_BACKGROUND_THREADS = 1;
  private final Executor mBackgroundExecutor;
  private final Executor mDecodeExecutor;
  private final Executor mIoBoundExecutor = Executors.newFixedThreadPool(2, new PriorityThreadFactory(10, "FrescoIoBoundExecutor", true));
  private final Executor mLightWeightBackgroundExecutor;
  
  public DefaultExecutorSupplier(int paramInt)
  {
    mDecodeExecutor = Executors.newFixedThreadPool(paramInt, new PriorityThreadFactory(10, "FrescoDecodeExecutor", true));
    mBackgroundExecutor = Executors.newFixedThreadPool(paramInt, new PriorityThreadFactory(10, "FrescoBackgroundExecutor", true));
    mLightWeightBackgroundExecutor = Executors.newFixedThreadPool(1, new PriorityThreadFactory(10, "FrescoLightWeightBackgroundExecutor", true));
  }
  
  public Executor forBackgroundTasks()
  {
    return mBackgroundExecutor;
  }
  
  public Executor forDecode()
  {
    return mDecodeExecutor;
  }
  
  public Executor forLightweightBackgroundTasks()
  {
    return mLightWeightBackgroundExecutor;
  }
  
  public Executor forLocalStorageRead()
  {
    return mIoBoundExecutor;
  }
  
  public Executor forLocalStorageWrite()
  {
    return mIoBoundExecutor;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.DefaultExecutorSupplier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */