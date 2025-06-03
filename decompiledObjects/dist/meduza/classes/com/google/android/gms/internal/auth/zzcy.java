package com.google.android.gms.internal.auth;

import a0.j;
import android.util.Base64;
import f;
import java.io.IOException;

final class zzcy
  extends zzdc
{
  public zzcy(zzcz paramzzcz, String paramString, Object paramObject, boolean paramBoolean, zzhy paramzzhy)
  {
    super(paramzzcz, "getTokenRefactor__blocked_packages", paramObject, true, null);
  }
  
  public final Object zza(Object paramObject)
  {
    try
    {
      zzhs localzzhs = zzhs.zzp(Base64.decode((String)paramObject, 3));
      return localzzhs;
    }
    catch (IOException|IllegalArgumentException localIOException)
    {
      j.t(f.m("Invalid byte[] value for ", zzc, ": "), (String)paramObject, "PhenotypeFlag");
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */