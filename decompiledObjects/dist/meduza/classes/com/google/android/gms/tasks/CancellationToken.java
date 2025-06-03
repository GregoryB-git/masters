package com.google.android.gms.tasks;

public abstract class CancellationToken
{
  public abstract boolean isCancellationRequested();
  
  public abstract CancellationToken onCanceledRequested(OnTokenCanceledListener paramOnTokenCanceledListener);
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.CancellationToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */