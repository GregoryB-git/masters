package com.google.android.gms.tasks;

public abstract interface Continuation<TResult, TContinuationResult>
{
  public abstract TContinuationResult then(Task<TResult> paramTask);
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.Continuation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */