package x0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

public final class i$n
  implements Parcelable
{
  public static final Parcelable.Creator<n> CREATOR = new a();
  public final Bundle a;
  
  public i$n(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    paramParcel = paramParcel.readBundle();
    a = paramParcel;
    if ((paramClassLoader != null) && (paramParcel != null)) {
      paramParcel.setClassLoader(paramClassLoader);
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(a);
  }
  
  public final class a
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
}

/* Location:
 * Qualified Name:     x0.i.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */