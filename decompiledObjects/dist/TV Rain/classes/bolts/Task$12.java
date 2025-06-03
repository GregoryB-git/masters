package bolts;

class Task$12
  implements Continuation<TResult, Task<TContinuationResult>>
{
  public Task$12(Task paramTask, CancellationToken paramCancellationToken, Continuation paramContinuation) {}
  
  public Task<TContinuationResult> then(Task<TResult> paramTask)
  {
    CancellationToken localCancellationToken = val$ct;
    if ((localCancellationToken != null) && (localCancellationToken.isCancellationRequested())) {
      return Task.cancelled();
    }
    if (paramTask.isFaulted()) {
      return Task.forError(paramTask.getError());
    }
    if (paramTask.isCancelled()) {
      return Task.cancelled();
    }
    return paramTask.continueWith(val$continuation);
  }
}

/* Location:
 * Qualified Name:     bolts.Task.12
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */