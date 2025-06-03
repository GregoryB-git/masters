package com.google.android.datatransport.runtime.retries;

import androidx.annotation.Nullable;

public abstract interface RetryStrategy<TInput, TResult>
{
  @Nullable
  public abstract TInput shouldRetry(TInput paramTInput, TResult paramTResult);
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.retries.RetryStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */