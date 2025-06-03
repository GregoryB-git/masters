package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzbf
{
  private final SharedPreferences zza;
  
  public zzbf(Context paramContext)
  {
    zza = paramContext.getSharedPreferences("_GRECAPTCHA", 0);
  }
  
  public final String zza()
  {
    String str1 = zza.getString("_GRECAPTCHA_KC", null);
    String str2 = str1;
    if (str1 == null) {
      str2 = "";
    }
    return str2;
  }
  
  public final void zzb(Map paramMap)
  {
    SharedPreferences.Editor localEditor = zza.edit();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localEditor.putString((String)paramMap.getKey(), (String)paramMap.getValue());
    }
    localEditor.commit();
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */