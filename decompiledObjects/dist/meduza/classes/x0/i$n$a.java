package x0;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class i$n$a
  implements Parcelable.ClassLoaderCreator<i.n>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new i.n(paramParcel, null);
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new i.n(paramParcel, paramClassLoader);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new i.n[paramInt];
  }
}

/* Location:
 * Qualified Name:     x0.i.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */