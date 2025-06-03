package com.google.android.gms.tasks;

public abstract interface SuccessContinuation<TResult, TContinuationResult>
{
  public abstract Task<TContinuationResult> then(TResult paramTResult);
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.SuccessContinuation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */