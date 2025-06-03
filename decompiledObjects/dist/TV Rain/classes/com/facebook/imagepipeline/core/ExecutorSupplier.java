package com.facebook.imagepipeline.core;

import java.util.concurrent.Executor;

public abstract interface ExecutorSupplier
{
  public abstract Executor forBackgroundTasks();
  
  public abstract Executor forDecode();
  
  public abstract Executor forLightweightBackgroundTasks();
  
  public abstract Executor forLocalStorageRead();
  
  public abstract Executor forLocalStorageWrite();
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ExecutorSupplier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */