package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

public final class a$b
  implements IInterface
{
  public static final a c = new a(null);
  public final IBinder b;
  
  public a$b(IBinder paramIBinder)
  {
    b = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return b;
  }
  
  public final String n()
  {
    Parcel localParcel1 = Parcel.obtain();
    Intrinsics.checkNotNullExpressionValue(localParcel1, "obtain()");
    Parcel localParcel2 = Parcel.obtain();
    Intrinsics.checkNotNullExpressionValue(localParcel2, "obtain()");
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      b.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final boolean o()
  {
    Parcel localParcel1 = Parcel.obtain();
    Intrinsics.checkNotNullExpressionValue(localParcel1, "obtain()");
    Parcel localParcel2 = Parcel.obtain();
    Intrinsics.checkNotNullExpressionValue(localParcel2, "obtain()");
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      boolean bool = true;
      localParcel1.writeInt(1);
      b.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i == 0) {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     O1.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */