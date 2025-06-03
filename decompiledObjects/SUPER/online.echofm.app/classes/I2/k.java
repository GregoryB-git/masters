package I2;

import H2.a.a;
import M2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class k
  extends M2.a
  implements IInterface
{
  public k(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
  }
  
  public final H2.a Z0(H2.a parama1, String paramString, int paramInt, H2.a parama2)
  {
    Parcel localParcel = o();
    c.e(localParcel, parama1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    c.e(localParcel, parama2);
    parama1 = n(3, localParcel);
    paramString = a.a.o(parama1.readStrongBinder());
    parama1.recycle();
    return paramString;
  }
  
  public final H2.a v(H2.a parama1, String paramString, int paramInt, H2.a parama2)
  {
    Parcel localParcel = o();
    c.e(localParcel, parama1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    c.e(localParcel, parama2);
    parama1 = n(2, localParcel);
    paramString = a.a.o(parama1.readStrongBinder());
    parama1.recycle();
    return paramString;
  }
}

/* Location:
 * Qualified Name:     I2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */