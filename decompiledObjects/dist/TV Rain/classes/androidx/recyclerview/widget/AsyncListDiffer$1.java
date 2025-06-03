package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;

class AsyncListDiffer$1
  implements Runnable
{
  public AsyncListDiffer$1(AsyncListDiffer paramAsyncListDiffer, List paramList1, List paramList2, int paramInt, Runnable paramRunnable) {}
  
  public void run()
  {
    final DiffUtil.DiffResult localDiffResult = DiffUtil.calculateDiff(new DiffUtil.Callback()
    {
      public boolean areContentsTheSame(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        Object localObject1 = val$oldList.get(paramAnonymousInt1);
        Object localObject2 = val$newList.get(paramAnonymousInt2);
        if ((localObject1 != null) && (localObject2 != null)) {
          return this$0.mConfig.getDiffCallback().areContentsTheSame(localObject1, localObject2);
        }
        if ((localObject1 == null) && (localObject2 == null)) {
          return true;
        }
        throw new AssertionError();
      }
      
      public boolean areItemsTheSame(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        Object localObject1 = val$oldList.get(paramAnonymousInt1);
        Object localObject2 = val$newList.get(paramAnonymousInt2);
        if ((localObject1 != null) && (localObject2 != null)) {
          return this$0.mConfig.getDiffCallback().areItemsTheSame(localObject1, localObject2);
        }
        boolean bool;
        if ((localObject1 == null) && (localObject2 == null)) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      @Nullable
      public Object getChangePayload(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        Object localObject1 = val$oldList.get(paramAnonymousInt1);
        Object localObject2 = val$newList.get(paramAnonymousInt2);
        if ((localObject1 != null) && (localObject2 != null)) {
          return this$0.mConfig.getDiffCallback().getChangePayload(localObject1, localObject2);
        }
        throw new AssertionError();
      }
      
      public int getNewListSize()
      {
        return val$newList.size();
      }
      
      public int getOldListSize()
      {
        return val$oldList.size();
      }
    });
    this$0.mMainThreadExecutor.execute(new Runnable()
    {
      public void run()
      {
        AsyncListDiffer.1 local1 = AsyncListDiffer.1.this;
        AsyncListDiffer localAsyncListDiffer = this$0;
        if (mMaxScheduledGeneration == val$runGeneration) {
          localAsyncListDiffer.latchList(val$newList, localDiffResult, val$commitCallback);
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */