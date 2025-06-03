package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class CoordinatorLayout$SavedState$1
  implements Parcelable.ClassLoaderCreator<CoordinatorLayout.SavedState>
{
  public CoordinatorLayout.SavedState createFromParcel(Parcel paramParcel)
  {
    return new CoordinatorLayout.SavedState(paramParcel, null);
  }
  
  public CoordinatorLayout.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new CoordinatorLayout.SavedState(paramParcel, paramClassLoader);
  }
  
  public CoordinatorLayout.SavedState[] newArray(int paramInt)
  {
    return new CoordinatorLayout.SavedState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */