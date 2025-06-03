package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzv
{
  private final zzf zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzab zzb;
  private final int zzc;
  
  private zzv(com.google.android.gms.internal.firebase-auth-api.zzab paramzzab)
  {
    this(paramzzab, false, zzj.zza, Integer.MAX_VALUE);
  }
  
  private zzv(com.google.android.gms.internal.firebase-auth-api.zzab paramzzab, boolean paramBoolean, zzf paramzzf, int paramInt)
  {
    zzb = paramzzab;
    zza = paramzzf;
    zzc = Integer.MAX_VALUE;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzv zza(char paramChar)
  {
    zzh localzzh = new zzh(paramChar);
    zzw.zza(localzzh);
    return new zzv(new zzy(localzzh));
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzv zza(String paramString)
  {
    paramString = zzr.zza(paramString);
    if ((paramString.zza("").zzc() ^ true)) {
      return new zzv(new zzaa(paramString));
    }
    throw new IllegalArgumentException(zzae.zza("The pattern may not match the empty string: %s", new Object[] { paramString }));
  }
  
  public final List<String> zza(CharSequence paramCharSequence)
  {
    zzw.zza(paramCharSequence);
    paramCharSequence = zzb.zza(this, paramCharSequence);
    ArrayList localArrayList = new ArrayList();
    while (paramCharSequence.hasNext()) {
      localArrayList.add((String)paramCharSequence.next());
    }
    return Collections.unmodifiableList(localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */