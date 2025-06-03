package com.google.android.datatransport.runtime.retries;

public final class Retries
{
  public static <TInput, TResult, TException extends Throwable> TResult retry(int paramInt, TInput paramTInput, Function<TInput, TResult, TException> paramFunction, RetryStrategy<TInput, TResult> paramRetryStrategy)
    throws Throwable
  {
    int i = paramInt;
    Object localObject = paramTInput;
    if (paramInt < 1) {
      return (TResult)paramFunction.apply(paramTInput);
    }
    do
    {
      paramTInput = paramFunction.apply(localObject);
      localObject = paramRetryStrategy.shouldRetry(localObject, paramTInput);
      if (localObject == null) {
        break;
      }
      paramInt = i - 1;
      i = paramInt;
    } while (paramInt >= 1);
    return paramTInput;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.retries.Retries
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */