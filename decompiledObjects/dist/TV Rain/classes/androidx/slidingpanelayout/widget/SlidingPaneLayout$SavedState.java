package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

class SlidingPaneLayout$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public SlidingPaneLayout.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new SlidingPaneLayout.SavedState(paramAnonymousParcel, null);
    }
    
    public SlidingPaneLayout.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new SlidingPaneLayout.SavedState(paramAnonymousParcel, null);
    }
    
    public SlidingPaneLayout.SavedState[] newArray(int paramAnonymousInt)
    {
      return new SlidingPaneLayout.SavedState[paramAnonymousInt];
    }
  };
  public boolean isOpen;
  
  public SlidingPaneLayout$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    isOpen = bool;
  }
  
  public SlidingPaneLayout$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(isOpen);
  }
}

/* Location:
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */