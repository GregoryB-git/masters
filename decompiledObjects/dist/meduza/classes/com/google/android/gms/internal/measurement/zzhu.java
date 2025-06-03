package com.google.android.gms.internal.measurement;

import a0.j;
import android.content.Context;
import android.net.Uri;
import f;
import r.b;
import r.h;

public final class zzhu
{
  private static final b<String, Uri> zza = new b();
  
  public static Uri zza(String paramString)
  {
    try
    {
      b localb = zza;
      Object localObject1 = (Uri)localb.getOrDefault(paramString, null);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = Uri.encode(paramString);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("content://com.google.android.gms.phenotype/");
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = Uri.parse(((StringBuilder)localObject1).toString());
        localb.put(paramString, localObject2);
      }
      return (Uri)localObject2;
    }
    finally {}
  }
  
  public static String zza(Context paramContext, String paramString)
  {
    if (!paramString.contains("#")) {
      return j.k(paramString, "#", "", paramContext.getPackageName());
    }
    throw new IllegalArgumentException(f.j("The passed in package cannot already have a subpackage: ", paramString));
  }
  
  public static boolean zza(String paramString1, String paramString2)
  {
    return ((paramString1.equals("eng")) || (paramString1.equals("userdebug"))) && ((paramString2.contains("dev-keys")) || (paramString2.contains("test-keys")));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */