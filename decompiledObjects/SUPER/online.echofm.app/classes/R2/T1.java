package R2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.measurement.a0;
import java.util.List;

public final class T1
  extends Y
  implements R1
{
  public T1(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
  }
  
  public final void D0(W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramW5);
    v(18, localParcel);
  }
  
  public final List F(W5 paramW5, Bundle paramBundle)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramW5);
    a0.d(localParcel, paramBundle);
    paramBundle = o(24, localParcel);
    paramW5 = paramBundle.createTypedArrayList(v5.CREATOR);
    paramBundle.recycle();
    return paramW5;
  }
  
  public final String G(W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramW5);
    localParcel = o(11, localParcel);
    paramW5 = localParcel.readString();
    localParcel.recycle();
    return paramW5;
  }
  
  public final void I0(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    Parcel localParcel = n();
    localParcel.writeLong(paramLong);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    v(10, localParcel);
  }
  
  public final List K0(String paramString1, String paramString2, String paramString3)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    paramString1 = o(17, localParcel);
    paramString2 = paramString1.createTypedArrayList(e.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final byte[] M0(I paramI, String paramString)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramI);
    localParcel.writeString(paramString);
    paramString = o(9, localParcel);
    paramI = paramString.createByteArray();
    paramString.recycle();
    return paramI;
  }
  
  public final void N(W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramW5);
    v(6, localParcel);
  }
  
  public final void O0(Bundle paramBundle, W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramBundle);
    a0.d(localParcel, paramW5);
    v(19, localParcel);
  }
  
  public final n P0(W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramW5);
    localParcel = o(21, localParcel);
    paramW5 = (n)a0.a(localParcel, n.CREATOR);
    localParcel.recycle();
    return paramW5;
  }
  
  public final void R0(I paramI, W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramI);
    a0.d(localParcel, paramW5);
    v(1, localParcel);
  }
  
  public final void S0(I paramI, String paramString1, String paramString2)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramI);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    v(5, localParcel);
  }
  
  public final void U0(W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramW5);
    v(20, localParcel);
  }
  
  public final List V0(String paramString1, String paramString2, W5 paramW5)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    a0.d(localParcel, paramW5);
    paramString2 = o(16, localParcel);
    paramString1 = paramString2.createTypedArrayList(e.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final List W(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    a0.e(localParcel, paramBoolean);
    paramString2 = o(15, localParcel);
    paramString1 = paramString2.createTypedArrayList(R5.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final void Z(R5 paramR5, W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramR5);
    a0.d(localParcel, paramW5);
    v(2, localParcel);
  }
  
  public final void c0(W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, paramW5);
    v(4, localParcel);
  }
  
  public final void m0(e parame, W5 paramW5)
  {
    Parcel localParcel = n();
    a0.d(localParcel, parame);
    a0.d(localParcel, paramW5);
    v(12, localParcel);
  }
  
  public final void n0(e parame)
  {
    Parcel localParcel = n();
    a0.d(localParcel, parame);
    v(13, localParcel);
  }
  
  public final List x0(String paramString1, String paramString2, boolean paramBoolean, W5 paramW5)
  {
    Parcel localParcel = n();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    a0.e(localParcel, paramBoolean);
    a0.d(localParcel, paramW5);
    paramString1 = o(14, localParcel);
    paramString2 = paramString1.createTypedArrayList(R5.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
}

/* Location:
 * Qualified Name:     R2.T1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */