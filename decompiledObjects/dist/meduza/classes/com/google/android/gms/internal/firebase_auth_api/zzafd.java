package com.google.android.gms.internal.firebase_auth_api;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import android.util.Base64;
import b8.c0;
import com.google.android.gms.internal.auth_api_phone.zzab;
import com.google.android.gms.tasks.Task;
import f;
import g;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x6.c;
import x6.d;

final class zzafd
{
  private static final p6.a zza = new p6.a("FirebaseAuth", new String[] { "SmsRetrieverHelper" });
  private final Context zzb;
  private final ScheduledExecutorService zzc;
  private final HashMap<String, zzafk> zzd = new HashMap();
  
  public zzafd(Context paramContext, ScheduledExecutorService paramScheduledExecutorService)
  {
    zzb = paramContext;
    zzc = paramScheduledExecutorService;
  }
  
  public static String zza(String paramString)
  {
    paramString = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(paramString);
    if (paramString.find()) {
      return paramString.group();
    }
    return null;
  }
  
  private static String zza(String paramString1, String paramString2)
  {
    String str = g.e(paramString1, " ", paramString2);
    try
    {
      paramString2 = MessageDigest.getInstance("SHA-256");
      paramString2.update(str.getBytes(StandardCharsets.UTF_8));
      str = Base64.encodeToString(Arrays.copyOf(paramString2.digest(), 9), 3).substring(0, 11);
      paramString2 = zza;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Package: ");
      localStringBuilder.append(paramString1);
      localStringBuilder.append(" -- Hash: ");
      localStringBuilder.append(str);
      paramString2.a(localStringBuilder.toString(), new Object[0]);
      return str;
    }
    catch (NoSuchAlgorithmException paramString1)
    {
      zza.c(f.j("NoSuchAlgorithm: ", paramString1.getMessage()), new Object[0]);
    }
    return null;
  }
  
  private final void zzd(String paramString)
  {
    zzafk localzzafk = (zzafk)zzd.get(paramString);
    if (localzzafk == null) {
      return;
    }
    if ((!zzh) && (!zzae.zzc(zzd)))
    {
      zza.f("Timed out waiting for SMS.", new Object[0]);
      paramString = zzb.iterator();
      while (paramString.hasNext()) {
        ((zzadp)paramString.next()).zza(zzd);
      }
      zzi = true;
    }
  }
  
  private final void zze(String paramString)
  {
    zzafk localzzafk = (zzafk)zzd.get(paramString);
    if (localzzafk == null) {
      return;
    }
    if (!zzi) {
      zzd(paramString);
    }
    zzb(paramString);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzadp zza(com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp, String paramString)
  {
    return new zzafi(this, paramzzadp, paramString);
  }
  
  public final void zza(String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp, long paramLong, boolean paramBoolean)
  {
    zzd.put(paramString, new zzafk(paramLong, paramBoolean));
    zzb(paramzzadp, paramString);
    paramzzadp = (zzafk)zzd.get(paramString);
    if (zza <= 0L)
    {
      zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
      return;
    }
    zzf = zzc.schedule(new zzafg(this, paramString), zza, TimeUnit.SECONDS);
    if (!zzc)
    {
      zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
      return;
    }
    paramString = new zzafh(this, paramString);
    paramzzadp = new IntentFilter();
    paramzzadp.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
    v.a.registerReceiver(zzb.getApplicationContext(), paramString, paramzzadp, 2);
    new zzab(zzb).startSmsRetriever().addOnFailureListener(new zzaff(this));
  }
  
  public final String zzb()
  {
    try
    {
      String str = zzb.getPackageName();
      if (Build.VERSION.SDK_INT < 28) {
        localObject = azzb).b(64, str).signatures;
      } else {
        localObject = azzb).b(134217728, str).signingInfo.getApkContentsSigners();
      }
      Object localObject = zza(str, localObject[0].toCharsString());
      if (localObject != null) {
        return (String)localObject;
      }
      zza.c("Hash generation failed.", new Object[0]);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      zza.c("Unable to find package to obtain hash.", new Object[0]);
    }
    return null;
  }
  
  public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp, String paramString)
  {
    paramString = (zzafk)zzd.get(paramString);
    if (paramString == null) {
      return;
    }
    zzb.add(paramzzadp);
    if (zzg) {
      paramzzadp.zzb(zzd);
    }
    if (zzh) {
      paramzzadp.zza(c0.G(zzd, zze));
    }
    if (zzi) {
      paramzzadp.zza(zzd);
    }
  }
  
  public final void zzb(String paramString)
  {
    zzafk localzzafk = (zzafk)zzd.get(paramString);
    if (localzzafk == null) {
      return;
    }
    ScheduledFuture localScheduledFuture = zzf;
    if ((localScheduledFuture != null) && (!localScheduledFuture.isDone())) {
      zzf.cancel(false);
    }
    zzb.clear();
    zzd.remove(paramString);
  }
  
  public final boolean zzc(String paramString)
  {
    return zzd.get(paramString) != null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */