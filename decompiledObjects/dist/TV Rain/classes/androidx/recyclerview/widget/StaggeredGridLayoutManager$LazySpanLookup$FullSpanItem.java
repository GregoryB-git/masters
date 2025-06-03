package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import z2;

@SuppressLint({"BanParcelableUsage"})
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
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
  
  public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem() {}
  
  public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel paramParcel)
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

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */