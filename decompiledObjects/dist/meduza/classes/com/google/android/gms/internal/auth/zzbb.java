package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import m6.j;
import n6.a;

public final class zzbb
  extends a
{
  public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
  public final int zza = 1;
  public final String zzb;
  public final PendingIntent zzc;
  
  public zzbb(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    j.i(paramString);
    zzb = paramString;
    j.i(paramPendingIntent);
    zzc = paramPendingIntent;
  }
  
  public zzbb(String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramString, paramPendingIntent);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, zza);
    z.F(paramParcel, 2, zzb, false);
    z.E(paramParcel, 3, zzc, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */