package i6;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class k
  implements Parcelable
{
  public static final Parcelable.Creator<k> CREATOR = new i();
  public Messenger a;
  
  public k(IBinder paramIBinder)
  {
    a = new Messenger(paramIBinder);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    try
    {
      Object localObject = a;
      localObject.getClass();
      localObject = ((Messenger)localObject).getBinder();
      paramObject = a;
      paramObject.getClass();
      boolean bool = localObject.equals(((Messenger)paramObject).getBinder());
      return bool;
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public final int hashCode()
  {
    Messenger localMessenger = a;
    localMessenger.getClass();
    return localMessenger.getBinder().hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Messenger localMessenger = a;
    localMessenger.getClass();
    paramParcel.writeStrongBinder(localMessenger.getBinder());
  }
}

/* Location:
 * Qualified Name:     i6.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */