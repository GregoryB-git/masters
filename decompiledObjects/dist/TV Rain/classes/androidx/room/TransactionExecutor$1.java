package androidx.room;

class TransactionExecutor$1
  implements Runnable
{
  public TransactionExecutor$1(TransactionExecutor paramTransactionExecutor, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      val$command.run();
      return;
    }
    finally
    {
      this$0.scheduleNext();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.TransactionExecutor.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */