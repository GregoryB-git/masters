package com.google.android.gms.internal.firebase_auth_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v6.g;

public final class zzahx
{
  private List<String> zza;
  
  public zzahx()
  {
    this(null);
  }
  
  public zzahx(int paramInt, List<String> paramList)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      for (paramInt = 0; paramInt < paramList.size(); paramInt++) {
        paramList.set(paramInt, g.a((String)paramList.get(paramInt)));
      }
    }
    for (paramList = Collections.unmodifiableList(paramList);; paramList = Collections.emptyList())
    {
      zza = paramList;
      return;
    }
  }
  
  private zzahx(List<String> paramList)
  {
    zza = new ArrayList();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzahx zza()
  {
    return new zzahx(null);
  }
  
  public final List<String> zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */