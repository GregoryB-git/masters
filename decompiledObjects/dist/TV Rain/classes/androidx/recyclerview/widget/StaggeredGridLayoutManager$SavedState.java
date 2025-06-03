package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.RestrictTo;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class StaggeredGridLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
    public StaggeredGridLayoutManager.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new StaggeredGridLayoutManager.SavedState(paramAnonymousParcel);
    }
    
    public StaggeredGridLayoutManager.SavedState[] newArray(int paramAnonymousInt)
    {
      return new StaggeredGridLayoutManager.SavedState[paramAnonymousInt];
    }
  };
  public boolean mAnchorLayoutFromEnd;
  public int mAnchorPosition;
  public List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> mFullSpanItems;
  public boolean mLastLayoutRTL;
  public boolean mReverseLayout;
  public int[] mSpanLookup;
  public int mSpanLookupSize;
  public int[] mSpanOffsets;
  public int mSpanOffsetsSize;
  public int mVisibleAnchorPosition;
  
  public StaggeredGridLayoutManager$SavedState() {}
  
  public StaggeredGridLayoutManager$SavedState(Parcel paramParcel)
  {
    mAnchorPosition = paramParcel.readInt();
    mVisibleAnchorPosition = paramParcel.readInt();
    int i = paramParcel.readInt();
    mSpanOffsetsSize = i;
    int[] arrayOfInt;
    if (i > 0)
    {
      arrayOfInt = new int[i];
      mSpanOffsets = arrayOfInt;
      paramParcel.readIntArray(arrayOfInt);
    }
    i = paramParcel.readInt();
    mSpanLookupSize = i;
    if (i > 0)
    {
      arrayOfInt = new int[i];
      mSpanLookup = arrayOfInt;
      paramParcel.readIntArray(arrayOfInt);
    }
    i = paramParcel.readInt();
    boolean bool1 = false;
    if (i == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    mReverseLayout = bool2;
    if (paramParcel.readInt() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    mAnchorLayoutFromEnd = bool2;
    boolean bool2 = bool1;
    if (paramParcel.readInt() == 1) {
      bool2 = true;
    }
    mLastLayoutRTL = bool2;
    mFullSpanItems = paramParcel.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
  }
  
  public StaggeredGridLayoutManager$SavedState(SavedState paramSavedState)
  {
    mSpanOffsetsSize = mSpanOffsetsSize;
    mAnchorPosition = mAnchorPosition;
    mVisibleAnchorPosition = mVisibleAnchorPosition;
    mSpanOffsets = mSpanOffsets;
    mSpanLookupSize = mSpanLookupSize;
    mSpanLookup = mSpanLookup;
    mReverseLayout = mReverseLayout;
    mAnchorLayoutFromEnd = mAnchorLayoutFromEnd;
    mLastLayoutRTL = mLastLayoutRTL;
    mFullSpanItems = mFullSpanItems;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void invalidateAnchorPositionInfo()
  {
    mSpanOffsets = null;
    mSpanOffsetsSize = 0;
    mAnchorPosition = -1;
    mVisibleAnchorPosition = -1;
  }
  
  public void invalidateSpanInfo()
  {
    mSpanOffsets = null;
    mSpanOffsetsSize = 0;
    mSpanLookupSize = 0;
    mSpanLookup = null;
    mFullSpanItems = null;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mAnchorPosition);
    paramParcel.writeInt(mVisibleAnchorPosition);
    paramParcel.writeInt(mSpanOffsetsSize);
    if (mSpanOffsetsSize > 0) {
      paramParcel.writeIntArray(mSpanOffsets);
    }
    paramParcel.writeInt(mSpanLookupSize);
    if (mSpanLookupSize > 0) {
      paramParcel.writeIntArray(mSpanLookup);
    }
    paramParcel.writeInt(mReverseLayout);
    paramParcel.writeInt(mAnchorLayoutFromEnd);
    paramParcel.writeInt(mLastLayoutRTL);
    paramParcel.writeList(mFullSpanItems);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */