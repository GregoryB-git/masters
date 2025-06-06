package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

class ChildHelper
{
  private static final boolean DEBUG = false;
  private static final String TAG = "ChildrenHelper";
  public final Bucket mBucket;
  public final Callback mCallback;
  public final List<View> mHiddenViews;
  
  public ChildHelper(Callback paramCallback)
  {
    mCallback = paramCallback;
    mBucket = new Bucket();
    mHiddenViews = new ArrayList();
  }
  
  private int getOffset(int paramInt)
  {
    if (paramInt < 0) {
      return -1;
    }
    int i = mCallback.getChildCount();
    int j = paramInt;
    while (j < i)
    {
      int k = paramInt - (j - mBucket.countOnesBefore(j));
      if (k == 0)
      {
        while (mBucket.get(j)) {
          j++;
        }
        return j;
      }
      j += k;
    }
    return -1;
  }
  
  private void hideViewInternal(View paramView)
  {
    mHiddenViews.add(paramView);
    mCallback.onEnteredHiddenState(paramView);
  }
  
  private boolean unhideViewInternal(View paramView)
  {
    if (mHiddenViews.remove(paramView))
    {
      mCallback.onLeftHiddenState(paramView);
      return true;
    }
    return false;
  }
  
  public void addView(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0) {
      paramInt = mCallback.getChildCount();
    } else {
      paramInt = getOffset(paramInt);
    }
    mBucket.insert(paramInt, paramBoolean);
    if (paramBoolean) {
      hideViewInternal(paramView);
    }
    mCallback.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, boolean paramBoolean)
  {
    addView(paramView, -1, paramBoolean);
  }
  
  public void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0) {
      paramInt = mCallback.getChildCount();
    } else {
      paramInt = getOffset(paramInt);
    }
    mBucket.insert(paramInt, paramBoolean);
    if (paramBoolean) {
      hideViewInternal(paramView);
    }
    mCallback.attachViewToParent(paramView, paramInt, paramLayoutParams);
  }
  
  public void detachViewFromParent(int paramInt)
  {
    paramInt = getOffset(paramInt);
    mBucket.remove(paramInt);
    mCallback.detachViewFromParent(paramInt);
  }
  
  public View findHiddenNonRemovedView(int paramInt)
  {
    int i = mHiddenViews.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)mHiddenViews.get(j);
      RecyclerView.ViewHolder localViewHolder = mCallback.getChildViewHolder(localView);
      if ((localViewHolder.getLayoutPosition() == paramInt) && (!localViewHolder.isInvalid()) && (!localViewHolder.isRemoved())) {
        return localView;
      }
    }
    return null;
  }
  
  public View getChildAt(int paramInt)
  {
    paramInt = getOffset(paramInt);
    return mCallback.getChildAt(paramInt);
  }
  
  public int getChildCount()
  {
    return mCallback.getChildCount() - mHiddenViews.size();
  }
  
  public View getUnfilteredChildAt(int paramInt)
  {
    return mCallback.getChildAt(paramInt);
  }
  
  public int getUnfilteredChildCount()
  {
    return mCallback.getChildCount();
  }
  
  public void hide(View paramView)
  {
    int i = mCallback.indexOfChild(paramView);
    if (i >= 0)
    {
      mBucket.set(i);
      hideViewInternal(paramView);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("view is not a child, cannot hide ");
    localStringBuilder.append(paramView);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public int indexOfChild(View paramView)
  {
    int i = mCallback.indexOfChild(paramView);
    if (i == -1) {
      return -1;
    }
    if (mBucket.get(i)) {
      return -1;
    }
    return i - mBucket.countOnesBefore(i);
  }
  
  public boolean isHidden(View paramView)
  {
    return mHiddenViews.contains(paramView);
  }
  
  public void removeAllViewsUnfiltered()
  {
    mBucket.reset();
    for (int i = mHiddenViews.size() - 1; i >= 0; i--)
    {
      mCallback.onLeftHiddenState((View)mHiddenViews.get(i));
      mHiddenViews.remove(i);
    }
    mCallback.removeAllViews();
  }
  
  public void removeView(View paramView)
  {
    int i = mCallback.indexOfChild(paramView);
    if (i < 0) {
      return;
    }
    if (mBucket.remove(i)) {
      unhideViewInternal(paramView);
    }
    mCallback.removeViewAt(i);
  }
  
  public void removeViewAt(int paramInt)
  {
    paramInt = getOffset(paramInt);
    View localView = mCallback.getChildAt(paramInt);
    if (localView == null) {
      return;
    }
    if (mBucket.remove(paramInt)) {
      unhideViewInternal(localView);
    }
    mCallback.removeViewAt(paramInt);
  }
  
  public boolean removeViewIfHidden(View paramView)
  {
    int i = mCallback.indexOfChild(paramView);
    if (i == -1)
    {
      unhideViewInternal(paramView);
      return true;
    }
    if (mBucket.get(i))
    {
      mBucket.remove(i);
      unhideViewInternal(paramView);
      mCallback.removeViewAt(i);
      return true;
    }
    return false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(mBucket.toString());
    localStringBuilder.append(", hidden list:");
    localStringBuilder.append(mHiddenViews.size());
    return localStringBuilder.toString();
  }
  
  public void unhide(View paramView)
  {
    int i = mCallback.indexOfChild(paramView);
    if (i >= 0)
    {
      if (mBucket.get(i))
      {
        mBucket.clear(i);
        unhideViewInternal(paramView);
        return;
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("trying to unhide a view that was not hidden");
      localStringBuilder.append(paramView);
      throw new RuntimeException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("view is not a child, cannot hide ");
    localStringBuilder.append(paramView);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static class Bucket
  {
    public static final int BITS_PER_WORD = 64;
    public static final long LAST_BIT = Long.MIN_VALUE;
    public long mData = 0L;
    public Bucket mNext;
    
    private void ensureNext()
    {
      if (mNext == null) {
        mNext = new Bucket();
      }
    }
    
    public void clear(int paramInt)
    {
      if (paramInt >= 64)
      {
        Bucket localBucket = mNext;
        if (localBucket != null) {
          localBucket.clear(paramInt - 64);
        }
      }
      else
      {
        mData &= 1L << paramInt;
      }
    }
    
    public int countOnesBefore(int paramInt)
    {
      Bucket localBucket = mNext;
      if (localBucket == null)
      {
        if (paramInt >= 64) {
          return Long.bitCount(mData);
        }
        return Long.bitCount(mData & (1L << paramInt) - 1L);
      }
      if (paramInt < 64) {
        return Long.bitCount(mData & (1L << paramInt) - 1L);
      }
      paramInt = localBucket.countOnesBefore(paramInt - 64);
      return Long.bitCount(mData) + paramInt;
    }
    
    public boolean get(int paramInt)
    {
      if (paramInt >= 64)
      {
        ensureNext();
        return mNext.get(paramInt - 64);
      }
      boolean bool;
      if ((mData & 1L << paramInt) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void insert(int paramInt, boolean paramBoolean)
    {
      if (paramInt >= 64)
      {
        ensureNext();
        mNext.insert(paramInt - 64, paramBoolean);
      }
      else
      {
        long l1 = mData;
        boolean bool;
        if ((0x8000000000000000 & l1) != 0L) {
          bool = true;
        } else {
          bool = false;
        }
        long l2 = (1L << paramInt) - 1L;
        mData = ((l1 & l2) << 1 | l1 & l2);
        if (paramBoolean) {
          set(paramInt);
        } else {
          clear(paramInt);
        }
        if ((bool) || (mNext != null))
        {
          ensureNext();
          mNext.insert(0, bool);
        }
      }
    }
    
    public boolean remove(int paramInt)
    {
      if (paramInt >= 64)
      {
        ensureNext();
        return mNext.remove(paramInt - 64);
      }
      long l1 = 1L << paramInt;
      long l2 = mData;
      boolean bool;
      if ((l2 & l1) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      l2 &= l1;
      mData = l2;
      l1 -= 1L;
      mData = (l2 & l1 | Long.rotateRight(l1 & l2, 1));
      Bucket localBucket = mNext;
      if (localBucket != null)
      {
        if (localBucket.get(0)) {
          set(63);
        }
        mNext.remove(0);
      }
      return bool;
    }
    
    public void reset()
    {
      mData = 0L;
      Bucket localBucket = mNext;
      if (localBucket != null) {
        localBucket.reset();
      }
    }
    
    public void set(int paramInt)
    {
      if (paramInt >= 64)
      {
        ensureNext();
        mNext.set(paramInt - 64);
      }
      else
      {
        mData |= 1L << paramInt;
      }
    }
    
    public String toString()
    {
      Object localObject;
      if (mNext == null)
      {
        localObject = Long.toBinaryString(mData);
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(mNext.toString());
        ((StringBuilder)localObject).append("xx");
        ((StringBuilder)localObject).append(Long.toBinaryString(mData));
        localObject = ((StringBuilder)localObject).toString();
      }
      return (String)localObject;
    }
  }
  
  public static abstract interface Callback
  {
    public abstract void addView(View paramView, int paramInt);
    
    public abstract void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams);
    
    public abstract void detachViewFromParent(int paramInt);
    
    public abstract View getChildAt(int paramInt);
    
    public abstract int getChildCount();
    
    public abstract RecyclerView.ViewHolder getChildViewHolder(View paramView);
    
    public abstract int indexOfChild(View paramView);
    
    public abstract void onEnteredHiddenState(View paramView);
    
    public abstract void onLeftHiddenState(View paramView);
    
    public abstract void removeAllViews();
    
    public abstract void removeViewAt(int paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ChildHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */