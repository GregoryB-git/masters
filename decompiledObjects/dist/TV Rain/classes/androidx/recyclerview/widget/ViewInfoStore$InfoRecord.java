package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;

class ViewInfoStore$InfoRecord
{
  public static final int FLAG_APPEAR = 2;
  public static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
  public static final int FLAG_APPEAR_PRE_AND_POST = 14;
  public static final int FLAG_DISAPPEARED = 1;
  public static final int FLAG_POST = 8;
  public static final int FLAG_PRE = 4;
  public static final int FLAG_PRE_AND_POST = 12;
  public static Pools.Pool<InfoRecord> sPool = new Pools.SimplePool(20);
  public int flags;
  @Nullable
  public RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
  @Nullable
  public RecyclerView.ItemAnimator.ItemHolderInfo preInfo;
  
  public static void drainCache()
  {
    while (sPool.acquire() != null) {}
  }
  
  public static InfoRecord obtain()
  {
    InfoRecord localInfoRecord1 = (InfoRecord)sPool.acquire();
    InfoRecord localInfoRecord2 = localInfoRecord1;
    if (localInfoRecord1 == null) {
      localInfoRecord2 = new InfoRecord();
    }
    return localInfoRecord2;
  }
  
  public static void recycle(InfoRecord paramInfoRecord)
  {
    flags = 0;
    preInfo = null;
    postInfo = null;
    sPool.release(paramInfoRecord);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewInfoStore.InfoRecord
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */