package N;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

public abstract class a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new b();
  public static final a p = new a();
  public final Parcelable o;
  
  public a()
  {
    o = null;
  }
  
  public a(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    paramParcel = paramParcel.readParcelable(paramClassLoader);
    if (paramParcel == null) {
      paramParcel = p;
    }
    o = paramParcel;
  }
  
  public a(Parcelable paramParcelable)
  {
    if (paramParcelable != null)
    {
      if (paramParcelable == p) {
        paramParcelable = null;
      }
      o = paramParcelable;
      return;
    }
    throw new IllegalArgumentException("superState must not be null");
  }
  
  public final Parcelable a()
  {
    return o;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(o, paramInt);
  }
  
  public static final class a
    extends a
  {
    public a()
    {
      super();
    }
  }
  
  public static final class b
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
}

/* Location:
 * Qualified Name:     N.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */