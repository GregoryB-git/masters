package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class AppCompatSpinner$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
  {
    public AppCompatSpinner.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new AppCompatSpinner.SavedState(paramAnonymousParcel);
    }
    
    public AppCompatSpinner.SavedState[] newArray(int paramAnonymousInt)
    {
      return new AppCompatSpinner.SavedState[paramAnonymousInt];
    }
  };
  public boolean mShowDropdown;
  
  public AppCompatSpinner$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    boolean bool;
    if (paramParcel.readByte() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    mShowDropdown = bool;
  }
  
  public AppCompatSpinner$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeByte((byte)mShowDropdown);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */