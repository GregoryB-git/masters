package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;
import n6.a;

public final class zzav
  extends a
{
  public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
  public final int zza = 1;
  public final String zzb;
  public final int zzc;
  
  public zzav(int paramInt1, String paramString, int paramInt2)
  {
    j.i(paramString);
    zzb = paramString;
    zzc = paramInt2;
  }
  
  public zzav(String paramString, int paramInt)
  {
    this(1, paramString, paramInt);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.z(paramParcel, 1, zza);
    z.F(paramParcel, 2, zzb, false);
    z.z(paramParcel, 3, zzc);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzav
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */