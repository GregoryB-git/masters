package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;

class ViewInfoStore
{
  private static final boolean DEBUG = false;
  @VisibleForTesting
  public final SimpleArrayMap<RecyclerView.ViewHolder, InfoRecord> mLayoutHolderMap = new SimpleArrayMap();
  @VisibleForTesting
  public final LongSparseArray<RecyclerView.ViewHolder> mOldChangedHolders = new LongSparseArray();
  
  private RecyclerView.ItemAnimator.ItemHolderInfo popFromLayoutStep(RecyclerView.ViewHolder paramViewHolder, int paramInt)
  {
    int i = mLayoutHolderMap.indexOfKey(paramViewHolder);
    if (i < 0) {
      return null;
    }
    InfoRecord localInfoRecord = (InfoRecord)mLayoutHolderMap.valueAt(i);
    if (localInfoRecord != null)
    {
      int j = flags;
      if ((j & paramInt) != 0)
      {
        j = paramInt & j;
        flags = j;
        if (paramInt == 4)
        {
          paramViewHolder = preInfo;
        }
        else
        {
          if (paramInt != 8) {
            break label110;
          }
          paramViewHolder = postInfo;
        }
        if ((j & 0xC) == 0)
        {
          mLayoutHolderMap.removeAt(i);
          InfoRecord.recycle(localInfoRecord);
        }
        return paramViewHolder;
        label110:
        throw new IllegalArgumentException("Must provide flag PRE or POST");
      }
    }
    return null;
  }
  
  public void addToAppearedInPreLayoutHolders(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    InfoRecord localInfoRecord1 = (InfoRecord)mLayoutHolderMap.get(paramViewHolder);
    InfoRecord localInfoRecord2 = localInfoRecord1;
    if (localInfoRecord1 == null)
    {
      localInfoRecord2 = InfoRecord.obtain();
      mLayoutHolderMap.put(paramViewHolder, localInfoRecord2);
    }
    flags |= 0x2;
    preInfo = paramItemHolderInfo;
  }
  
  public void addToDisappearedInLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    InfoRecord localInfoRecord1 = (InfoRecord)mLayoutHolderMap.get(paramViewHolder);
    InfoRecord localInfoRecord2 = localInfoRecord1;
    if (localInfoRecord1 == null)
    {
      localInfoRecord2 = InfoRecord.obtain();
      mLayoutHolderMap.put(paramViewHolder, localInfoRecord2);
    }
    flags |= 0x1;
  }
  
  public void addToOldChangeHolders(long paramLong, RecyclerView.ViewHolder paramViewHolder)
  {
    mOldChangedHolders.put(paramLong, paramViewHolder);
  }
  
  public void addToPostLayout(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    InfoRecord localInfoRecord1 = (InfoRecord)mLayoutHolderMap.get(paramViewHolder);
    InfoRecord localInfoRecord2 = localInfoRecord1;
    if (localInfoRecord1 == null)
    {
      localInfoRecord2 = InfoRecord.obtain();
      mLayoutHolderMap.put(paramViewHolder, localInfoRecord2);
    }
    postInfo = paramItemHolderInfo;
    flags |= 0x8;
  }
  
  public void addToPreLayout(RecyclerView.ViewHolder paramViewHolder, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo)
  {
    InfoRecord localInfoRecord1 = (InfoRecord)mLayoutHolderMap.get(paramViewHolder);
    InfoRecord localInfoRecord2 = localInfoRecord1;
    if (localInfoRecord1 == null)
    {
      localInfoRecord2 = InfoRecord.obtain();
      mLayoutHolderMap.put(paramViewHolder, localInfoRecord2);
    }
    preInfo = paramItemHolderInfo;
    flags |= 0x4;
  }
  
  public void clear()
  {
    mLayoutHolderMap.clear();
    mOldChangedHolders.clear();
  }
  
  public RecyclerView.ViewHolder getFromOldChangeHolders(long paramLong)
  {
    return (RecyclerView.ViewHolder)mOldChangedHolders.get(paramLong);
  }
  
  public boolean isDisappearing(RecyclerView.ViewHolder paramViewHolder)
  {
    paramViewHolder = (InfoRecord)mLayoutHolderMap.get(paramViewHolder);
    boolean bool = true;
    if ((paramViewHolder == null) || ((flags & 0x1) == 0)) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isInPreLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    paramViewHolder = (InfoRecord)mLayoutHolderMap.get(paramViewHolder);
    boolean bool;
    if ((paramViewHolder != null) && ((flags & 0x4) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onDetach() {}
  
  public void onViewDetached(RecyclerView.ViewHolder paramViewHolder)
  {
    removeFromDisappearedInLayout(paramViewHolder);
  }
  
  @Nullable
  public RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    return popFromLayoutStep(paramViewHolder, 8);
  }
  
  @Nullable
  public RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    return popFromLayoutStep(paramViewHolder, 4);
  }
  
  public void process(ProcessCallback paramProcessCallback)
  {
    for (int i = mLayoutHolderMap.size() - 1; i >= 0; i--)
    {
      RecyclerView.ViewHolder localViewHolder = (RecyclerView.ViewHolder)mLayoutHolderMap.keyAt(i);
      InfoRecord localInfoRecord = (InfoRecord)mLayoutHolderMap.removeAt(i);
      int j = flags;
      if ((j & 0x3) == 3)
      {
        paramProcessCallback.unused(localViewHolder);
      }
      else if ((j & 0x1) != 0)
      {
        RecyclerView.ItemAnimator.ItemHolderInfo localItemHolderInfo = preInfo;
        if (localItemHolderInfo == null) {
          paramProcessCallback.unused(localViewHolder);
        } else {
          paramProcessCallback.processDisappeared(localViewHolder, localItemHolderInfo, postInfo);
        }
      }
      else if ((j & 0xE) == 14)
      {
        paramProcessCallback.processAppeared(localViewHolder, preInfo, postInfo);
      }
      else if ((j & 0xC) == 12)
      {
        paramProcessCallback.processPersistent(localViewHolder, preInfo, postInfo);
      }
      else if ((j & 0x4) != 0)
      {
        paramProcessCallback.processDisappeared(localViewHolder, preInfo, null);
      }
      else if ((j & 0x8) != 0)
      {
        paramProcessCallback.processAppeared(localViewHolder, preInfo, postInfo);
      }
      InfoRecord.recycle(localInfoRecord);
    }
  }
  
  public void removeFromDisappearedInLayout(RecyclerView.ViewHolder paramViewHolder)
  {
    paramViewHolder = (InfoRecord)mLayoutHolderMap.get(paramViewHolder);
    if (paramViewHolder == null) {
      return;
    }
    flags &= 0xFFFFFFFE;
  }
  
  public void removeViewHolder(RecyclerView.ViewHolder paramViewHolder)
  {
    for (int i = mOldChangedHolders.size() - 1; i >= 0; i--) {
      if (paramViewHolder == mOldChangedHolders.valueAt(i))
      {
        mOldChangedHolders.removeAt(i);
        break;
      }
    }
    paramViewHolder = (InfoRecord)mLayoutHolderMap.remove(paramViewHolder);
    if (paramViewHolder != null) {
      InfoRecord.recycle(paramViewHolder);
    }
  }
  
  public static class InfoRecord
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
  
  public static abstract interface ProcessCallback
  {
    public abstract void processAppeared(RecyclerView.ViewHolder paramViewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
    
    public abstract void processDisappeared(RecyclerView.ViewHolder paramViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
    
    public abstract void processPersistent(RecyclerView.ViewHolder paramViewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo1, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo paramItemHolderInfo2);
    
    public abstract void unused(RecyclerView.ViewHolder paramViewHolder);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewInfoStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */