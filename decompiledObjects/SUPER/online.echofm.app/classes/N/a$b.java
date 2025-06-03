package N;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class a$b
  implements Parcelable.ClassLoaderCreator
{
  public a a(Parcel paramParcel)
  {
    return b(paramParcel, null);
  }
  
  public a b(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    if (paramParcel.readParcelable(paramClassLoader) == null) {
      return a.p;
    }
    throw new IllegalStateException("superState must be null");
  }
  
  public a[] c(int paramInt)
  {
    return new a[paramInt];
  }
}

/* Location:
 * Qualified Name:     N.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */