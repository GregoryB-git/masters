package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;
import n6.a;

public final class zzaz
  extends a
{
  public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
  public final int zza = 1;
  public final String zzb;
  public final byte[] zzc;
  
  public zzaz(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    j.i(paramString);
    zzb = paramString;
    j.i(paramArrayOfByte);
    zzc = paramArrayOfByte;
  }
  
  public zzaz(String paramString, byte[] paramArrayOfByte)
  {
    this(1, paramString, paramArrayOfByte);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, zza);
    z.F(paramParcel, 2, zzb, false);
    z.w(paramParcel, 3, zzc, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzaz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */