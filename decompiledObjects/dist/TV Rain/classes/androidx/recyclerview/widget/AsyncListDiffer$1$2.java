package androidx.recyclerview.widget;

class AsyncListDiffer$1$2
  implements Runnable
{
  public AsyncListDiffer$1$2(AsyncListDiffer.1 param1, DiffUtil.DiffResult paramDiffResult) {}
  
  public void run()
  {
    AsyncListDiffer.1 local1 = this$1;
    AsyncListDiffer localAsyncListDiffer = this$0;
    if (mMaxScheduledGeneration == val$runGeneration) {
      localAsyncListDiffer.latchList(val$newList, val$result, val$commitCallback);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer.1.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */