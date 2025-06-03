package android.support.v4.os;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public class a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new a();
  public IResultReceiver a;
  
  public a(Parcel paramParcel)
  {
    a = IResultReceiver.Stub.asInterface(paramParcel.readStrongBinder());
  }
  
  public void a(int paramInt, Bundle paramBundle) {}
  
  public final void b(int paramInt, Bundle paramBundle)
  {
    IResultReceiver localIResultReceiver = a;
    if (localIResultReceiver != null) {}
    try
    {
      localIResultReceiver.a3(paramInt, paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      for (;;) {}
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      if (a == null)
      {
        b localb = new android/support/v4/os/a$b;
        localb.<init>(this);
        a = localb;
      }
      paramParcel.writeStrongBinder(a.asBinder());
      return;
    }
    finally {}
  }
  
  public final class a
    implements Parcelable.Creator<a>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new a(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new a[paramInt];
    }
  }
  
  public final class b
    extends IResultReceiver.Stub
  {
    public b() {}
    
    public final void a3(int paramInt, Bundle paramBundle)
    {
      getClass();
      a(paramInt, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.os.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */