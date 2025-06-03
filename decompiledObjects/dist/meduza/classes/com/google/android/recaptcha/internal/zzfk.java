package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.text.TextUtils;
import ec.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.h;
import sb.m;
import va.a;

public final class zzfk
{
  private final List zza = zzf(a.g(new String[] { "www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha" }));
  
  public zzfk()
  {
    this(true);
  }
  
  public zzfk(boolean paramBoolean) {}
  
  public static final boolean zzc(Uri paramUri)
  {
    return zze(paramUri);
  }
  
  private final boolean zzd(String paramString)
  {
    Object localObject = zza;
    if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
    {
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if (h.n0(paramString, (String)((Iterator)localObject).next())) {
          return true;
        }
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private static final boolean zze(Uri paramUri)
  {
    return (!TextUtils.isEmpty(paramUri.toString())) && (i.a("https", paramUri.getScheme())) && (!TextUtils.isEmpty(paramUri.getHost()));
  }
  
  private static final List zzf(List paramList)
  {
    ArrayList localArrayList = new ArrayList(m.j(paramList));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramList = new StringBuilder();
      paramList.append("https://");
      paramList.append(str);
      paramList.append("/");
      localArrayList.add(paramList.toString());
    }
    return localArrayList;
  }
  
  public final boolean zza(Uri paramUri)
  {
    return (zze(paramUri)) && (zzd(paramUri.toString()));
  }
  
  public final boolean zzb(String paramString)
  {
    paramString = Uri.parse(paramString);
    i.b(paramString);
    return (zze(paramString)) && (zzd(paramString.toString()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */