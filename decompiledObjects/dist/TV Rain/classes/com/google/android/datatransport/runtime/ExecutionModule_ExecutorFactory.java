package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

public final class ExecutionModule_ExecutorFactory
  implements Factory<Executor>
{
  public static ExecutionModule_ExecutorFactory create()
  {
    return InstanceHolder.access$000();
  }
  
  public static Executor executor()
  {
    return (Executor)Preconditions.checkNotNull(ExecutionModule.executor(), "Cannot return null from a non-@Nullable @Provides method");
  }
  
  public Executor get()
  {
    return executor();
  }
  
  public static final class InstanceHolder
  {
    private static final ExecutionModule_ExecutorFactory INSTANCE = new ExecutionModule_ExecutorFactory();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */