package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Objects;
import n6.a;

public final class zzeb
  extends a
{
  public static final Parcelable.Creator<zzeb> CREATOR = new zzee();
  public final int zza;
  public final String zzb;
  public final Intent zzc;
  
  public zzeb(int paramInt, String paramString, Intent paramIntent)
  {
    zza = paramInt;
    zzb = paramString;
    zzc = paramIntent;
  }
  
  public static zzeb zza(Activity paramActivity)
  {
    return new zzeb(paramActivity.hashCode(), paramActivity.getClass().getCanonicalName(), paramActivity.getIntent());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzeb)) {
      return false;
    }
    paramObject = (zzeb)paramObject;
    return (zza == zza) && (Objects.equals(zzb, zzb)) && (Objects.equals(zzc, zzc));
  }
  
  public final int hashCode()
  {
    return zza;
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
 * Qualified Name:     com.google.android.gms.internal.measurement.zzeb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */