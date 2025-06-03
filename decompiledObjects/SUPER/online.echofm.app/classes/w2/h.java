package w2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class h
  implements Parcelable
{
  public static final Parcelable.Creator<h> CREATOR = new f();
  public Messenger o;
  
  public h(IBinder paramIBinder)
  {
    o = new Messenger(paramIBinder);
  }
  
  public final IBinder a()
  {
    Messenger localMessenger = o;
    localMessenger.getClass();
    return localMessenger.getBinder();
  }
  
  public final void b(Message paramMessage)
  {
    Messenger localMessenger = o;
    localMessenger.getClass();
    localMessenger.send(paramMessage);
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
      boolean bool = a().equals(((h)paramObject).a());
      return bool;
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public final int hashCode()
  {
    return a().hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Messenger localMessenger = o;
    localMessenger.getClass();
    paramParcel.writeStrongBinder(localMessenger.getBinder());
  }
}

/* Location:
 * Qualified Name:     w2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */