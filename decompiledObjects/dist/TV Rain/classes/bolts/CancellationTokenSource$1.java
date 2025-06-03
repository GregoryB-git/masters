package bolts;

class CancellationTokenSource$1
  implements Runnable
{
  public CancellationTokenSource$1(CancellationTokenSource paramCancellationTokenSource) {}
  
  public void run()
  {
    synchronized (CancellationTokenSource.access$000(this$0))
    {
      CancellationTokenSource.access$102(this$0, null);
      this$0.cancel();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     bolts.CancellationTokenSource.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */