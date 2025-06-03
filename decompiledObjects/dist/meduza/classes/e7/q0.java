package e7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.List;

public final class q0
  extends zzbu
  implements n0
{
  public q0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
  }
  
  public final void C(k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzb(20, localParcel);
  }
  
  public final void E0(k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzb(6, localParcel);
  }
  
  public final void F(f paramf, k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramf);
    zzbw.zza(localParcel, paramk6);
    zzb(12, localParcel);
  }
  
  public final void M1(k6 paramk6, e parame)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzbw.zza(localParcel, parame);
    zzb(30, localParcel);
  }
  
  public final void M2(k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzb(18, localParcel);
  }
  
  public final void N1(k6 paramk6, d6 paramd6, s0 params0)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzbw.zza(localParcel, paramd6);
    zzbw.zza(localParcel, params0);
    zzb(29, localParcel);
  }
  
  public final List<q6> O2(String paramString1, String paramString2, boolean paramBoolean, k6 paramk6)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramBoolean);
    zzbw.zza(localParcel, paramk6);
    paramString2 = zza(14, localParcel);
    paramString1 = paramString2.createTypedArrayList(q6.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final List<f> T2(String paramString1, String paramString2, k6 paramk6)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    zzbw.zza(localParcel, paramk6);
    paramString1 = zza(16, localParcel);
    paramString2 = paramString1.createTypedArrayList(f.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final void V(f0 paramf0, k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramf0);
    zzbw.zza(localParcel, paramk6);
    zzb(1, localParcel);
  }
  
  public final String V1(k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    localParcel = zza(11, localParcel);
    paramk6 = localParcel.readString();
    localParcel.recycle();
    return paramk6;
  }
  
  public final byte[] V2(f0 paramf0, String paramString)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramf0);
    localParcel.writeString(paramString);
    paramString = zza(9, localParcel);
    paramf0 = paramString.createByteArray();
    paramString.recycle();
    return paramf0;
  }
  
  public final void Y1(k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzb(27, localParcel);
  }
  
  public final void d1(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    Parcel localParcel = b_();
    localParcel.writeLong(paramLong);
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    zzb(10, localParcel);
  }
  
  public final void g0(q6 paramq6, k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramq6);
    zzbw.zza(localParcel, paramk6);
    zzb(2, localParcel);
  }
  
  public final List<q6> h0(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    zzbw.zza(localParcel, paramBoolean);
    paramString2 = zza(15, localParcel);
    paramString1 = paramString2.createTypedArrayList(q6.CREATOR);
    paramString2.recycle();
    return paramString1;
  }
  
  public final List<f> h1(String paramString1, String paramString2, String paramString3)
  {
    Parcel localParcel = b_();
    localParcel.writeString(paramString1);
    localParcel.writeString(paramString2);
    localParcel.writeString(paramString3);
    paramString1 = zza(17, localParcel);
    paramString2 = paramString1.createTypedArrayList(f.CREATOR);
    paramString1.recycle();
    return paramString2;
  }
  
  public final void h2(k6 paramk6, Bundle paramBundle, p0 paramp0)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzbw.zza(localParcel, paramBundle);
    zzbw.zza(localParcel, paramp0);
    zzb(31, localParcel);
  }
  
  public final void k0(k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzb(26, localParcel);
  }
  
  public final void l1(k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzb(25, localParcel);
  }
  
  public final List m(Bundle paramBundle, k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzbw.zza(localParcel, paramBundle);
    paramBundle = zza(24, localParcel);
    paramk6 = paramBundle.createTypedArrayList(w5.CREATOR);
    paramBundle.recycle();
    return paramk6;
  }
  
  public final void m(Bundle paramBundle, k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramBundle);
    zzbw.zza(localParcel, paramk6);
    zzb(19, localParcel);
  }
  
  public final void r2(k6 paramk6)
  {
    Parcel localParcel = b_();
    zzbw.zza(localParcel, paramk6);
    zzb(4, localParcel);
  }
  
  public final n v1(k6 paramk6)
  {
    Object localObject = b_();
    zzbw.zza((Parcel)localObject, paramk6);
    paramk6 = zza(21, (Parcel)localObject);
    localObject = (n)zzbw.zza(paramk6, n.CREATOR);
    paramk6.recycle();
    return (n)localObject;
  }
}

/* Location:
 * Qualified Name:     e7.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */