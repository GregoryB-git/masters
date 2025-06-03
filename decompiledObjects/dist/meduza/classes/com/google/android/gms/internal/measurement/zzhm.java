package com.google.android.gms.internal.measurement;

import android.net.Uri;
import g;
import r.h;

public final class zzhm
  implements zzhr
{
  private final h<String, h<String, String>> zza;
  
  public zzhm(h<String, h<String, String>> paramh)
  {
    zza = paramh;
  }
  
  public final String zza(Uri paramUri, String paramString1, String paramString2, String paramString3)
  {
    if (paramUri != null) {
      paramString1 = paramUri.toString();
    } else {
      if (paramString1 == null) {
        break label41;
      }
    }
    paramUri = zza;
    if (paramUri != null) {
      paramUri = (h)paramUri.getOrDefault(paramString1, null);
    } else {
      label41:
      paramUri = null;
    }
    if (paramUri == null) {
      return null;
    }
    paramString1 = paramString3;
    if (paramString2 != null) {
      paramString1 = g.d(paramString2, paramString3);
    }
    return (String)paramUri.getOrDefault(paramString1, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */