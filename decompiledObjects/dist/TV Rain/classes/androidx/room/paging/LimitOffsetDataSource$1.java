package androidx.room.paging;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker.Observer;
import java.util.Set;

class LimitOffsetDataSource$1
  extends InvalidationTracker.Observer
{
  public LimitOffsetDataSource$1(LimitOffsetDataSource paramLimitOffsetDataSource, String[] paramArrayOfString)
  {
    super(paramArrayOfString);
  }
  
  public void onInvalidated(@NonNull Set<String> paramSet)
  {
    this$0.invalidate();
  }
}

/* Location:
 * Qualified Name:     androidx.room.paging.LimitOffsetDataSource.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */