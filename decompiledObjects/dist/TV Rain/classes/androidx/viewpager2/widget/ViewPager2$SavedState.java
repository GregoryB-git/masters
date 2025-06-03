package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import androidx.annotation.RequiresApi;

class ViewPager2$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public ViewPager2.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return createFromParcel(paramAnonymousParcel, null);
    }
    
    public ViewPager2.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new ViewPager2.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public ViewPager2.SavedState[] newArray(int paramAnonymousInt)
    {
      return new ViewPager2.SavedState[paramAnonymousInt];
    }
  };
  public Parcelable mAdapterState;
  public int mCurrentItem;
  public int mRecyclerViewId;
  
  public ViewPager2$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    readValues(paramParcel, null);
  }
  
  @RequiresApi(24)
  public ViewPager2$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    readValues(paramParcel, paramClassLoader);
  }
  
  public ViewPager2$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  private void readValues(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    mRecyclerViewId = paramParcel.readInt();
    mCurrentItem = paramParcel.readInt();
    mAdapterState = paramParcel.readParcelable(paramClassLoader);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(mRecyclerViewId);
    paramParcel.writeInt(mCurrentItem);
    paramParcel.writeParcelable(mAdapterState, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */