package n0;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class a$b
  implements Parcelable.ClassLoaderCreator<a>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    if (paramParcel.readParcelable(null) == null) {
      return a.b;
    }
    throw new IllegalStateException("superState must be null");
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    if (paramParcel.readParcelable(paramClassLoader) == null) {
      return a.b;
    }
    throw new IllegalStateException("superState must be null");
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new a[paramInt];
  }
}

/* Location:
 * Qualified Name:     n0.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */