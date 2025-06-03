package androidx.core.os;

import android.os.Parcel;

@Deprecated
public abstract interface ParcelableCompatCreatorCallbacks<T>
{
  public abstract T createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader);
  
  public abstract T[] newArray(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.core.os.ParcelableCompatCreatorCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */