package androidx.recyclerview.widget;

import android.util.SparseArray;
import z2;

public class RecyclerView$State
{
  public static final int STEP_ANIMATIONS = 4;
  public static final int STEP_LAYOUT = 2;
  public static final int STEP_START = 1;
  private SparseArray<Object> mData;
  public int mDeletedInvisibleItemCountSincePreviousLayout = 0;
  public long mFocusedItemId;
  public int mFocusedItemPosition;
  public int mFocusedSubChildId;
  public boolean mInPreLayout = false;
  public boolean mIsMeasuring = false;
  public int mItemCount = 0;
  public int mLayoutStep = 1;
  public int mPreviousLayoutItemCount = 0;
  public int mRemainingScrollHorizontal;
  public int mRemainingScrollVertical;
  public boolean mRunPredictiveAnimations = false;
  public boolean mRunSimpleAnimations = false;
  public boolean mStructureChanged = false;
  public int mTargetPosition = -1;
  public boolean mTrackOldChangeHolders = false;
  
  public void assertLayoutStep(int paramInt)
  {
    if ((mLayoutStep & paramInt) != 0) {
      return;
    }
    StringBuilder localStringBuilder = z2.t("Layout state should be one of ");
    localStringBuilder.append(Integer.toBinaryString(paramInt));
    localStringBuilder.append(" but it is ");
    localStringBuilder.append(Integer.toBinaryString(mLayoutStep));
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public boolean didStructureChange()
  {
    return mStructureChanged;
  }
  
  public <T> T get(int paramInt)
  {
    SparseArray localSparseArray = mData;
    if (localSparseArray == null) {
      return null;
    }
    return (T)localSparseArray.get(paramInt);
  }
  
  public int getItemCount()
  {
    int i;
    if (mInPreLayout) {
      i = mPreviousLayoutItemCount - mDeletedInvisibleItemCountSincePreviousLayout;
    } else {
      i = mItemCount;
    }
    return i;
  }
  
  public int getRemainingScrollHorizontal()
  {
    return mRemainingScrollHorizontal;
  }
  
  public int getRemainingScrollVertical()
  {
    return mRemainingScrollVertical;
  }
  
  public int getTargetScrollPosition()
  {
    return mTargetPosition;
  }
  
  public boolean hasTargetScrollPosition()
  {
    boolean bool;
    if (mTargetPosition != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isMeasuring()
  {
    return mIsMeasuring;
  }
  
  public boolean isPreLayout()
  {
    return mInPreLayout;
  }
  
  public void prepareForNestedPrefetch(RecyclerView.Adapter paramAdapter)
  {
    mLayoutStep = 1;
    mItemCount = paramAdapter.getItemCount();
    mInPreLayout = false;
    mTrackOldChangeHolders = false;
    mIsMeasuring = false;
  }
  
  public void put(int paramInt, Object paramObject)
  {
    if (mData == null) {
      mData = new SparseArray();
    }
    mData.put(paramInt, paramObject);
  }
  
  public void remove(int paramInt)
  {
    SparseArray localSparseArray = mData;
    if (localSparseArray == null) {
      return;
    }
    localSparseArray.remove(paramInt);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("State{mTargetPosition=");
    localStringBuilder.append(mTargetPosition);
    localStringBuilder.append(", mData=");
    localStringBuilder.append(mData);
    localStringBuilder.append(", mItemCount=");
    localStringBuilder.append(mItemCount);
    localStringBuilder.append(", mIsMeasuring=");
    localStringBuilder.append(mIsMeasuring);
    localStringBuilder.append(", mPreviousLayoutItemCount=");
    localStringBuilder.append(mPreviousLayoutItemCount);
    localStringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
    localStringBuilder.append(mDeletedInvisibleItemCountSincePreviousLayout);
    localStringBuilder.append(", mStructureChanged=");
    localStringBuilder.append(mStructureChanged);
    localStringBuilder.append(", mInPreLayout=");
    localStringBuilder.append(mInPreLayout);
    localStringBuilder.append(", mRunSimpleAnimations=");
    localStringBuilder.append(mRunSimpleAnimations);
    localStringBuilder.append(", mRunPredictiveAnimations=");
    localStringBuilder.append(mRunPredictiveAnimations);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public boolean willRunPredictiveAnimations()
  {
    return mRunPredictiveAnimations;
  }
  
  public boolean willRunSimpleAnimations()
  {
    return mRunSimpleAnimations;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */