package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class Fragment$SavedState$1
  implements Parcelable.ClassLoaderCreator<Fragment.SavedState>
{
  public Fragment.SavedState createFromParcel(Parcel paramParcel)
  {
    return new Fragment.SavedState(paramParcel, null);
  }
  
  public Fragment.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new Fragment.SavedState(paramParcel, paramClassLoader);
  }
  
  public Fragment.SavedState[] newArray(int paramInt)
  {
    return new Fragment.SavedState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment.SavedState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */