package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class LinearLayoutManager$SavedState
  implements Parcelable
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
    public LinearLayoutManager.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new LinearLayoutManager.SavedState(paramAnonymousParcel);
    }
    
    public LinearLayoutManager.SavedState[] newArray(int paramAnonymousInt)
    {
      return new LinearLayoutManager.SavedState[paramAnonymousInt];
    }
  };
  public boolean mAnchorLayoutFromEnd;
  public int mAnchorOffset;
  public int mAnchorPosition;
  
  public LinearLayoutManager$SavedState() {}
  
  public LinearLayoutManager$SavedState(Parcel paramParcel)
  {
    mAnchorPosition = paramParcel.readInt();
    mAnchorOffset = paramParcel.readInt();
    int i = paramParcel.readInt();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    mAnchorLayoutFromEnd = bool;
  }
  
  public LinearLayoutManager$SavedState(SavedState paramSavedState)
  {
    mAnchorPosition = mAnchorPosition;
    mAnchorOffset = mAnchorOffset;
    mAnchorLayoutFromEnd = mAnchorLayoutFromEnd;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean hasValidAnchor()
  {
    boolean bool;
    if (mAnchorPosition >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void invalidateAnchor()
  {
    mAnchorPosition = -1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mAnchorPosition);
    paramParcel.writeInt(mAnchorOffset);
    paramParcel.writeInt(mAnchorLayoutFromEnd);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */