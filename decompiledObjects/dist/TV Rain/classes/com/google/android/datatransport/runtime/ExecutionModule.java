package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

@Module
abstract class ExecutionModule
{
  @Provides
  @Singleton
  @SuppressLint({"ThreadPoolCreation"})
  public static Executor executor()
  {
    return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.ExecutionModule
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */