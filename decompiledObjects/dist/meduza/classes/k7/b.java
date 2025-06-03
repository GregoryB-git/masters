package k7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j7.g;

public final class b
  implements c, IInterface
{
  public final IBinder a;
  
  public b(IBinder paramIBinder)
  {
    a = paramIBinder;
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final void c2(String paramString, Bundle paramBundle, g paramg)
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    localParcel.writeString(paramString);
    int i = a.a;
    localParcel.writeInt(1);
    paramBundle.writeToParcel(localParcel, 0);
    localParcel.writeStrongBinder(paramg);
    try
    {
      a.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     k7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */