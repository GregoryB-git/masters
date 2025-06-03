package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzm;
import java.io.Serializable;
import java.util.regex.Pattern;

final class zzn
  extends zzl
  implements Serializable
{
  private final Pattern zza;
  
  public zzn(Pattern paramPattern)
  {
    zza = ((Pattern)zzw.zza(paramPattern));
  }
  
  public final String toString()
  {
    return zza.toString();
  }
  
  public final zzm zza(CharSequence paramCharSequence)
  {
    return new zzq(zza.matcher(paramCharSequence));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */