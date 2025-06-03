package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class AbsSavedState$2
  implements Parcelable.ClassLoaderCreator<AbsSavedState>
{
  public AbsSavedState createFromParcel(Parcel paramParcel)
  {
    return createFromParcel(paramParcel, null);
  }
  
  public AbsSavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    if (paramParcel.readParcelable(paramClassLoader) == null) {
      return AbsSavedState.EMPTY_STATE;
    }
    throw new IllegalStateException("superState must be null");
  }
  
  public AbsSavedState[] newArray(int paramInt)
  {
    return new AbsSavedState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.customview.view.AbsSavedState.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */