package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import z2;

class StaggeredGridLayoutManager$LazySpanLookup
{
  private static final int MIN_SIZE = 10;
  public int[] mData;
  public List<FullSpanItem> mFullSpanItems;
  
  private int invalidateFullSpansAfter(int paramInt)
  {
    if (mFullSpanItems == null) {
      return -1;
    }
    FullSpanItem localFullSpanItem = getFullSpanItem(paramInt);
    if (localFullSpanItem != null) {
      mFullSpanItems.remove(localFullSpanItem);
    }
    int i = mFullSpanItems.size();
    for (int j = 0; j < i; j++) {
      if (mFullSpanItems.get(j)).mPosition >= paramInt) {
        break label82;
      }
    }
    j = -1;
    label82:
    if (j != -1)
    {
      localFullSpanItem = (FullSpanItem)mFullSpanItems.get(j);
      mFullSpanItems.remove(j);
      return mPosition;
    }
    return -1;
  }
  
  private void offsetFullSpansForAddition(int paramInt1, int paramInt2)
  {
    Object localObject = mFullSpanItems;
    if (localObject == null) {
      return;
    }
    for (int i = ((List)localObject).size() - 1; i >= 0; i--)
    {
      localObject = (FullSpanItem)mFullSpanItems.get(i);
      int j = mPosition;
      if (j >= paramInt1) {
        mPosition = (j + paramInt2);
      }
    }
  }
  
  private void offsetFullSpansForRemoval(int paramInt1, int paramInt2)
  {
    Object localObject = mFullSpanItems;
    if (localObject == null) {
      return;
    }
    for (int i = ((List)localObject).size() - 1; i >= 0; i--)
    {
      localObject = (FullSpanItem)mFullSpanItems.get(i);
      int j = mPosition;
      if (j >= paramInt1) {
        if (j < paramInt1 + paramInt2) {
          mFullSpanItems.remove(i);
        } else {
          mPosition = (j - paramInt2);
        }
      }
    }
  }
  
  public void addFullSpanItem(FullSpanItem paramFullSpanItem)
  {
    if (mFullSpanItems == null) {
      mFullSpanItems = new ArrayList();
    }
    int i = mFullSpanItems.size();
    for (int j = 0; j < i; j++)
    {
      FullSpanItem localFullSpanItem = (FullSpanItem)mFullSpanItems.get(j);
      if (mPosition == mPosition) {
        mFullSpanItems.remove(j);
      }
      if (mPosition >= mPosition)
      {
        mFullSpanItems.add(j, paramFullSpanItem);
        return;
      }
    }
    mFullSpanItems.add(paramFullSpanItem);
  }
  
  public void clear()
  {
    int[] arrayOfInt = mData;
    if (arrayOfInt != null) {
      Arrays.fill(arrayOfInt, -1);
    }
    mFullSpanItems = null;
  }
  
  public void ensureSize(int paramInt)
  {
    int[] arrayOfInt1 = mData;
    if (arrayOfInt1 == null)
    {
      arrayOfInt1 = new int[Math.max(paramInt, 10) + 1];
      mData = arrayOfInt1;
      Arrays.fill(arrayOfInt1, -1);
    }
    else if (paramInt >= arrayOfInt1.length)
    {
      int[] arrayOfInt2 = new int[sizeForPosition(paramInt)];
      mData = arrayOfInt2;
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
      arrayOfInt2 = mData;
      Arrays.fill(arrayOfInt2, arrayOfInt1.length, arrayOfInt2.length, -1);
    }
  }
  
  public int forceInvalidateAfter(int paramInt)
  {
    List localList = mFullSpanItems;
    if (localList != null) {
      for (int i = localList.size() - 1; i >= 0; i--) {
        if (mFullSpanItems.get(i)).mPosition >= paramInt) {
          mFullSpanItems.remove(i);
        }
      }
    }
    return invalidateAfter(paramInt);
  }
  
  public FullSpanItem getFirstFullSpanItemInRange(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    Object localObject = mFullSpanItems;
    if (localObject == null) {
      return null;
    }
    int i = ((List)localObject).size();
    for (int j = 0; j < i; j++)
    {
      localObject = (FullSpanItem)mFullSpanItems.get(j);
      int k = mPosition;
      if (k >= paramInt2) {
        return null;
      }
      if ((k >= paramInt1) && ((paramInt3 == 0) || (mGapDir == paramInt3) || ((paramBoolean) && (mHasUnwantedGapAfter)))) {
        return (FullSpanItem)localObject;
      }
    }
    return null;
  }
  
  public FullSpanItem getFullSpanItem(int paramInt)
  {
    Object localObject = mFullSpanItems;
    if (localObject == null) {
      return null;
    }
    for (int i = ((List)localObject).size() - 1; i >= 0; i--)
    {
      localObject = (FullSpanItem)mFullSpanItems.get(i);
      if (mPosition == paramInt) {
        return (FullSpanItem)localObject;
      }
    }
    return null;
  }
  
  public int getSpan(int paramInt)
  {
    int[] arrayOfInt = mData;
    if ((arrayOfInt != null) && (paramInt < arrayOfInt.length)) {
      return arrayOfInt[paramInt];
    }
    return -1;
  }
  
  public int invalidateAfter(int paramInt)
  {
    int[] arrayOfInt = mData;
    if (arrayOfInt == null) {
      return -1;
    }
    if (paramInt >= arrayOfInt.length) {
      return -1;
    }
    int i = invalidateFullSpansAfter(paramInt);
    if (i == -1)
    {
      arrayOfInt = mData;
      Arrays.fill(arrayOfInt, paramInt, arrayOfInt.length, -1);
      return mData.length;
    }
    i = Math.min(i + 1, mData.length);
    Arrays.fill(mData, paramInt, i, -1);
    return i;
  }
  
  public void offsetForAddition(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = mData;
    if ((arrayOfInt != null) && (paramInt1 < arrayOfInt.length))
    {
      int i = paramInt1 + paramInt2;
      ensureSize(i);
      arrayOfInt = mData;
      System.arraycopy(arrayOfInt, paramInt1, arrayOfInt, i, arrayOfInt.length - paramInt1 - paramInt2);
      Arrays.fill(mData, paramInt1, i, -1);
      offsetFullSpansForAddition(paramInt1, paramInt2);
    }
  }
  
  public void offsetForRemoval(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = mData;
    if ((arrayOfInt != null) && (paramInt1 < arrayOfInt.length))
    {
      int i = paramInt1 + paramInt2;
      ensureSize(i);
      arrayOfInt = mData;
      System.arraycopy(arrayOfInt, i, arrayOfInt, paramInt1, arrayOfInt.length - paramInt1 - paramInt2);
      arrayOfInt = mData;
      Arrays.fill(arrayOfInt, arrayOfInt.length - paramInt2, arrayOfInt.length, -1);
      offsetFullSpansForRemoval(paramInt1, paramInt2);
    }
  }
  
  public void setSpan(int paramInt, StaggeredGridLayoutManager.Span paramSpan)
  {
    ensureSize(paramInt);
    mData[paramInt] = mIndex;
  }
  
  public int sizeForPosition(int paramInt)
  {
    int i = mData.length;
    while (i <= paramInt) {
      i *= 2;
    }
    return i;
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class FullSpanItem
    implements Parcelable
  {
    public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator()
    {
      public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(Parcel paramAnonymousParcel)
      {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(paramAnonymousParcel);
      }
      
      public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int paramAnonymousInt)
      {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[paramAnonymousInt];
      }
    };
    public int mGapDir;
    public int[] mGapPerSpan;
    public boolean mHasUnwantedGapAfter;
    public int mPosition;
    
    public FullSpanItem() {}
    
    public FullSpanItem(Parcel paramParcel)
    {
      mPosition = paramParcel.readInt();
      mGapDir = paramParcel.readInt();
      int i = paramParcel.readInt();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      mHasUnwantedGapAfter = bool;
      i = paramParcel.readInt();
      if (i > 0)
      {
        int[] arrayOfInt = new int[i];
        mGapPerSpan = arrayOfInt;
        paramParcel.readIntArray(arrayOfInt);
      }
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public int getGapForSpan(int paramInt)
    {
      int[] arrayOfInt = mGapPerSpan;
      if (arrayOfInt == null) {
        paramInt = 0;
      } else {
        paramInt = arrayOfInt[paramInt];
      }
      return paramInt;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("FullSpanItem{mPosition=");
      localStringBuilder.append(mPosition);
      localStringBuilder.append(", mGapDir=");
      localStringBuilder.append(mGapDir);
      localStringBuilder.append(", mHasUnwantedGapAfter=");
      localStringBuilder.append(mHasUnwantedGapAfter);
      localStringBuilder.append(", mGapPerSpan=");
      localStringBuilder.append(Arrays.toString(mGapPerSpan));
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(mPosition);
      paramParcel.writeInt(mGapDir);
      paramParcel.writeInt(mHasUnwantedGapAfter);
      int[] arrayOfInt = mGapPerSpan;
      if ((arrayOfInt != null) && (arrayOfInt.length > 0))
      {
        paramParcel.writeInt(arrayOfInt.length);
        paramParcel.writeIntArray(mGapPerSpan);
      }
      else
      {
        paramParcel.writeInt(0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */