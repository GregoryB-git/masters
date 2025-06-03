package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public class Toolbar$SavedState
  extends AbsSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
  {
    public Toolbar.SavedState createFromParcel(Parcel paramAnonymousParcel)
    {
      return new Toolbar.SavedState(paramAnonymousParcel, null);
    }
    
    public Toolbar.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
    {
      return new Toolbar.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
    }
    
    public Toolbar.SavedState[] newArray(int paramAnonymousInt)
    {
      return new Toolbar.SavedState[paramAnonymousInt];
    }
  };
  public int expandedMenuItemId;
  public boolean isOverflowOpen;
  
  public Toolbar$SavedState(Parcel paramParcel)
  {
    this(paramParcel, null);
  }
  
  public Toolbar$SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    super(paramParcel, paramClassLoader);
    expandedMenuItemId = paramParcel.readInt();
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    isOverflowOpen = bool;
  }
  
  public Toolbar$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(expandedMenuItemId);
    paramParcel.writeInt(isOverflowOpen);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */