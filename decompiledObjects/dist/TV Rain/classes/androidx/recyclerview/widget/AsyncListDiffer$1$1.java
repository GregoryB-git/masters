package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import java.util.List;

class AsyncListDiffer$1$1
  extends DiffUtil.Callback
{
  public AsyncListDiffer$1$1(AsyncListDiffer.1 param1) {}
  
  public boolean areContentsTheSame(int paramInt1, int paramInt2)
  {
    Object localObject1 = this$1.val$oldList.get(paramInt1);
    Object localObject2 = this$1.val$newList.get(paramInt2);
    if ((localObject1 != null) && (localObject2 != null)) {
      return this$1.this$0.mConfig.getDiffCallback().areContentsTheSame(localObject1, localObject2);
    }
    if ((localObject1 == null) && (localObject2 == null)) {
      return true;
    }
    throw new AssertionError();
  }
  
  public boolean areItemsTheSame(int paramInt1, int paramInt2)
  {
    Object localObject1 = this$1.val$oldList.get(paramInt1);
    Object localObject2 = this$1.val$newList.get(paramInt2);
    if ((localObject1 != null) && (localObject2 != null)) {
      return this$1.this$0.mConfig.getDiffCallback().areItemsTheSame(localObject1, localObject2);
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
  public Object getChangePayload(int paramInt1, int paramInt2)
  {
    Object localObject1 = this$1.val$oldList.get(paramInt1);
    Object localObject2 = this$1.val$newList.get(paramInt2);
    if ((localObject1 != null) && (localObject2 != null)) {
      return this$1.this$0.mConfig.getDiffCallback().getChangePayload(localObject1, localObject2);
    }
    throw new AssertionError();
  }
  
  public int getNewListSize()
  {
    return this$1.val$newList.size();
  }
  
  public int getOldListSize()
  {
    return this$1.val$oldList.size();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */