package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class DrawerLayout$SavedState$1
  implements Parcelable.ClassLoaderCreator<DrawerLayout.SavedState>
{
  public DrawerLayout.SavedState createFromParcel(Parcel paramParcel)
  {
    return new DrawerLayout.SavedState(paramParcel, null);
  }
  
  public DrawerLayout.SavedState createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new DrawerLayout.SavedState(paramParcel, paramClassLoader);
  }
  
  public DrawerLayout.SavedState[] newArray(int paramInt)
  {
    return new DrawerLayout.SavedState[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.SavedState.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */