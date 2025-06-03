package com.google.android.recaptcha.internal;

import android.content.Context;
import ec.i;
import ic.a;
import ic.b;
import ic.c;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lc.h;
import sb.l;
import sb.m;
import sb.q;

public final class zzbm
  implements zzaq
{
  private final Context zza;
  private final String zzb;
  
  public zzbm(Context paramContext)
  {
    zza = paramContext;
    zzb = "rce_";
    new zzcd(paramContext);
  }
  
  public final String zza(String paramString)
  {
    String str = zzb;
    paramString = String.valueOf(paramString);
    paramString = new File(zza.getCacheDir(), str.concat(paramString));
    if (paramString.exists()) {
      return new String(zzcd.zza(paramString), StandardCharsets.UTF_8);
    }
    return null;
  }
  
  public final void zzb()
  {
    try
    {
      Object localObject1 = zza.getCacheDir().listFiles();
      if (localObject1 != null)
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        int i = localObject1.length;
        for (int j = 0; j < i; j++)
        {
          Object localObject2 = localObject1[j];
          if (h.n0(((File)localObject2).getName(), zzb)) {
            localArrayList.add(localObject2);
          }
        }
        localObject1 = localArrayList.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((File)((Iterator)localObject1).next()).delete();
        }
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void zzc(String paramString1, String paramString2)
  {
    Object localObject1 = new c('A', 'z');
    Object localObject2 = new ArrayList(m.j((Iterable)localObject1));
    localObject1 = ((a)localObject1).iterator();
    while (c) {
      ((ArrayList)localObject2).add(Character.valueOf(((l)localObject1).a()));
    }
    localObject2 = q.w((Collection)localObject2);
    Collections.shuffle((List)localObject2);
    String str = q.p(((List)localObject2).subList(0, 8), "", null, null, null, 62);
    localObject1 = zza;
    localObject2 = zzb;
    str = String.valueOf(str);
    localObject2 = new File(((Context)localObject1).getCacheDir(), ((String)localObject2).concat(str));
    zzcd.zzb((File)localObject2, String.valueOf(paramString2).getBytes(StandardCharsets.UTF_8));
    localObject1 = zza;
    paramString2 = zzb;
    paramString1 = String.valueOf(paramString1);
    ((File)localObject2).renameTo(new File(((Context)localObject1).getCacheDir(), paramString2.concat(paramString1)));
  }
  
  public final boolean zzd(String paramString)
  {
    boolean bool1 = false;
    try
    {
      File[] arrayOfFile = zza.getCacheDir().listFiles();
      Object localObject1 = null;
      Object localObject2 = localObject1;
      if (arrayOfFile != null)
      {
        int i = arrayOfFile.length;
        for (int j = 0;; j++)
        {
          localObject2 = localObject1;
          if (j >= i) {
            break;
          }
          localObject2 = arrayOfFile[j];
          String str1 = ((File)localObject2).getName();
          String str2 = zzb;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append(str2);
          localStringBuilder.append(paramString);
          boolean bool2 = i.a(str1, localStringBuilder.toString());
          if (bool2) {
            break;
          }
        }
      }
      if (localObject2 != null) {
        bool1 = true;
      }
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
    return bool1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */