package n0;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

public abstract class a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new b();
  public static final a b = new a();
  public final Parcelable a;
  
  public a()
  {
    a = null;
  }
  
  public a(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    paramParcel = paramParcel.readParcelable(paramClassLoader);
    if (paramParcel == null) {
      paramParcel = b;
    }
    a = paramParcel;
  }
  
  public a(Parcelable paramParcelable)
  {
    if (paramParcelable != null)
    {
      if (paramParcelable == b) {
        paramParcelable = null;
      }
      a = paramParcelable;
      return;
    }
    throw new IllegalArgumentException("superState must not be null");
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(a, paramInt);
  }
  
  public static final class a
    extends a
  {}
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     n0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */