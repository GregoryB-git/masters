package bolts;

class Task$3
  implements Continuation<TResult, Task<Void>>
{
  public Task$3(Task paramTask) {}
  
  public Task<Void> then(Task<TResult> paramTask)
    throws Exception
  {
    if (paramTask.isCancelled()) {
      return Task.cancelled();
    }
    if (paramTask.isFaulted()) {
      return Task.forError(paramTask.getError());
    }
    return Task.forResult(null);
  }
}

/* Location:
 * Qualified Name:     bolts.Task.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */