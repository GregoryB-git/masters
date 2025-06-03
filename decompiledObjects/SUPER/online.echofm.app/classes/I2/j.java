package I2;

import H2.a.a;
import M2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class j
  extends M2.a
  implements IInterface
{
  public j(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
  }
  
  public final int Z0(H2.a parama, String paramString, boolean paramBoolean)
  {
    Parcel localParcel = o();
    c.e(localParcel, parama);
    localParcel.writeString(paramString);
    c.c(localParcel, paramBoolean);
    parama = n(3, localParcel);
    int i = parama.readInt();
    parama.recycle();
    return i;
  }
  
  public final int a1(H2.a parama, String paramString, boolean paramBoolean)
  {
    Parcel localParcel = o();
    c.e(localParcel, parama);
    localParcel.writeString(paramString);
    c.c(localParcel, paramBoolean);
    parama = n(5, localParcel);
    int i = parama.readInt();
    parama.recycle();
    return i;
  }
  
  public final H2.a b1(H2.a parama, String paramString, int paramInt)
  {
    Parcel localParcel = o();
    c.e(localParcel, parama);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    paramString = n(2, localParcel);
    parama = a.a.o(paramString.readStrongBinder());
    paramString.recycle();
    return parama;
  }
  
  public final H2.a c1(H2.a parama1, String paramString, int paramInt, H2.a parama2)
  {
    Parcel localParcel = o();
    c.e(localParcel, parama1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    c.e(localParcel, parama2);
    parama1 = n(8, localParcel);
    paramString = a.a.o(parama1.readStrongBinder());
    parama1.recycle();
    return paramString;
  }
  
  public final H2.a d1(H2.a parama, String paramString, int paramInt)
  {
    Parcel localParcel = o();
    c.e(localParcel, parama);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    parama = n(4, localParcel);
    paramString = a.a.o(parama.readStrongBinder());
    parama.recycle();
    return paramString;
  }
  
  public final H2.a e1(H2.a parama, String paramString, boolean paramBoolean, long paramLong)
  {
    Parcel localParcel = o();
    c.e(localParcel, parama);
    localParcel.writeString(paramString);
    c.c(localParcel, paramBoolean);
    localParcel.writeLong(paramLong);
    parama = n(7, localParcel);
    paramString = a.a.o(parama.readStrongBinder());
    parama.recycle();
    return paramString;
  }
  
  public final int v()
  {
    Parcel localParcel = n(6, o());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
}

/* Location:
 * Qualified Name:     I2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */