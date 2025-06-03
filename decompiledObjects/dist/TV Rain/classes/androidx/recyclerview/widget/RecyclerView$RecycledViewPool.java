package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class RecyclerView$RecycledViewPool
{
  private static final int DEFAULT_MAX_SCRAP = 5;
  private int mAttachCount = 0;
  public SparseArray<ScrapData> mScrap = new SparseArray();
  
  private ScrapData getScrapDataForType(int paramInt)
  {
    ScrapData localScrapData1 = (ScrapData)mScrap.get(paramInt);
    ScrapData localScrapData2 = localScrapData1;
    if (localScrapData1 == null)
    {
      localScrapData2 = new ScrapData();
      mScrap.put(paramInt, localScrapData2);
    }
    return localScrapData2;
  }
  
  public void attach()
  {
    mAttachCount += 1;
  }
  
  public void clear()
  {
    for (int i = 0; i < mScrap.size(); i++) {
      mScrap.valueAt(i)).mScrapHeap.clear();
    }
  }
  
  public void detach()
  {
    mAttachCount -= 1;
  }
  
  public void factorInBindTime(int paramInt, long paramLong)
  {
    ScrapData localScrapData = getScrapDataForType(paramInt);
    mBindRunningAverageNs = runningAverage(mBindRunningAverageNs, paramLong);
  }
  
  public void factorInCreateTime(int paramInt, long paramLong)
  {
    ScrapData localScrapData = getScrapDataForType(paramInt);
    mCreateRunningAverageNs = runningAverage(mCreateRunningAverageNs, paramLong);
  }
  
  @Nullable
  public RecyclerView.ViewHolder getRecycledView(int paramInt)
  {
    Object localObject = (ScrapData)mScrap.get(paramInt);
    if ((localObject != null) && (!mScrapHeap.isEmpty()))
    {
      localObject = mScrapHeap;
      for (paramInt = ((ArrayList)localObject).size() - 1; paramInt >= 0; paramInt--) {
        if (!((RecyclerView.ViewHolder)((ArrayList)localObject).get(paramInt)).isAttachedToTransitionOverlay()) {
          return (RecyclerView.ViewHolder)((ArrayList)localObject).remove(paramInt);
        }
      }
    }
    return null;
  }
  
  public int getRecycledViewCount(int paramInt)
  {
    return getScrapDataForTypemScrapHeap.size();
  }
  
  public void onAdapterChanged(RecyclerView.Adapter paramAdapter1, RecyclerView.Adapter paramAdapter2, boolean paramBoolean)
  {
    if (paramAdapter1 != null) {
      detach();
    }
    if ((!paramBoolean) && (mAttachCount == 0)) {
      clear();
    }
    if (paramAdapter2 != null) {
      attach();
    }
  }
  
  public void putRecycledView(RecyclerView.ViewHolder paramViewHolder)
  {
    int i = paramViewHolder.getItemViewType();
    ArrayList localArrayList = getScrapDataForTypemScrapHeap;
    if (mScrap.get(i)).mMaxScrap <= localArrayList.size()) {
      return;
    }
    paramViewHolder.resetInternal();
    localArrayList.add(paramViewHolder);
  }
  
  public long runningAverage(long paramLong1, long paramLong2)
  {
    if (paramLong1 == 0L) {
      return paramLong2;
    }
    paramLong1 /= 4L;
    return paramLong2 / 4L + paramLong1 * 3L;
  }
  
  public void setMaxRecycledViews(int paramInt1, int paramInt2)
  {
    Object localObject = getScrapDataForType(paramInt1);
    mMaxScrap = paramInt2;
    localObject = mScrapHeap;
    while (((ArrayList)localObject).size() > paramInt2) {
      ((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1);
    }
  }
  
  public int size()
  {
    int i = 0;
    int k;
    for (int j = 0; i < mScrap.size(); j = k)
    {
      ArrayList localArrayList = mScrap.valueAt(i)).mScrapHeap;
      k = j;
      if (localArrayList != null) {
        k = localArrayList.size() + j;
      }
      i++;
    }
    return j;
  }
  
  public boolean willBindInTime(int paramInt, long paramLong1, long paramLong2)
  {
    long l = getScrapDataForTypemBindRunningAverageNs;
    boolean bool;
    if ((l != 0L) && (paramLong1 + l >= paramLong2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean willCreateInTime(int paramInt, long paramLong1, long paramLong2)
  {
    long l = getScrapDataForTypemCreateRunningAverageNs;
    boolean bool;
    if ((l != 0L) && (paramLong1 + l >= paramLong2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static class ScrapData
  {
    public long mBindRunningAverageNs = 0L;
    public long mCreateRunningAverageNs = 0L;
    public int mMaxScrap = 5;
    public final ArrayList<RecyclerView.ViewHolder> mScrapHeap = new ArrayList();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.RecycledViewPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */