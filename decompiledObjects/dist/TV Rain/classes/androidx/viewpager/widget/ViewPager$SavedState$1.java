package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class ViewPager$SavedState$1
  implements Parcelable.ClassLoaderCreator<ViewPager.SavedState>
{
  public ViewPager.SavedState createFromParcel(Parcel paramParcel)
  {
    return new ViewPager.SavedState(paramParcel, null);
  }
  
  public ViewPager.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new ViewPager.SavedState(paramParcel, paramClassLoader);
  }
  
  public ViewPager.SavedState[] newArray(int paramInt)
  {
    return new ViewPager.SavedState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.ViewPager.SavedState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */