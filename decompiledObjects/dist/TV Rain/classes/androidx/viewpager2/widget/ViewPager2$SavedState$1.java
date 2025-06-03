package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

final class ViewPager2$SavedState$1
  implements Parcelable.ClassLoaderCreator<ViewPager2.SavedState>
{
  public ViewPager2.SavedState createFromParcel(Parcel paramParcel)
  {
    return createFromParcel(paramParcel, null);
  }
  
  public ViewPager2.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new ViewPager2.SavedState(paramParcel, paramClassLoader);
  }
  
  public ViewPager2.SavedState[] newArray(int paramInt)
  {
    return new ViewPager2.SavedState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager2.widget.ViewPager2.SavedState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */