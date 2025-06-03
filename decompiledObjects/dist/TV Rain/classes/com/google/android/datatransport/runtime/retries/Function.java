package com.google.android.datatransport.runtime.retries;

public abstract interface Function<TInput, TResult, TException extends Throwable>
{
  public abstract TResult apply(TInput paramTInput)
    throws Throwable;
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.retries.Function
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */