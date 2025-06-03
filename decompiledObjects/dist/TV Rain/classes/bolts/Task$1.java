package bolts;

final class Task$1
  implements Runnable
{
  public Task$1(TaskCompletionSource paramTaskCompletionSource) {}
  
  public void run()
  {
    val$tcs.trySetResult(null);
  }
}

/* Location:
 * Qualified Name:     bolts.Task.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */