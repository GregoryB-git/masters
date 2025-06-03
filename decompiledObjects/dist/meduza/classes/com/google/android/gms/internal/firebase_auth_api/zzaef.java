package com.google.android.gms.internal.firebase_auth_api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import q9.e;
import t9.b;

public final class zzaef
{
  private Context zza;
  private com.google.android.gms.internal.firebase-auth-api.zzaey zzb;
  private String zzc;
  private final u7.f zzd;
  private boolean zze = false;
  private String zzf;
  
  public zzaef(Context paramContext, u7.f paramf, String paramString)
  {
    m6.j.i(paramContext);
    zza = paramContext;
    m6.j.i(paramf);
    zzd = paramf;
    zzc = String.format("Android/%s/%s", new Object[] { "Fallback", paramString });
  }
  
  public zzaef(u7.f paramf, String paramString)
  {
    this(a, paramf, paramString);
  }
  
  private static String zza(u7.f paramf)
  {
    paramf = (a8.a)getInstancev.get();
    if (paramf == null) {
      return null;
    }
    try
    {
      z7.a locala = (z7.a)Tasks.await(paramf.a());
      if (locala.a() != null)
      {
        paramf = String.valueOf(locala.a());
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Error getting App Check token; using placeholder token instead. Error: ");
        localStringBuilder.append(paramf);
        Log.w("LocalRequestInterceptor", localStringBuilder.toString());
      }
      paramf = locala.b();
      return paramf;
    }
    catch (InterruptedException paramf) {}catch (ExecutionException paramf) {}
    paramf = paramf.getMessage();
    StringBuilder localStringBuilder = new StringBuilder("Unexpected error getting App Check token: ");
    localStringBuilder.append(paramf);
    Log.e("LocalRequestInterceptor", localStringBuilder.toString());
    return null;
  }
  
  private static String zzb(u7.f paramf)
  {
    paramf = (e)getInstancew.get();
    if (paramf != null)
    {
      try
      {
        paramf = (String)Tasks.await(paramf.a());
        return paramf;
      }
      catch (InterruptedException paramf) {}catch (ExecutionException paramf) {}
      String str = paramf.getMessage();
      paramf = new StringBuilder("Unable to get heartbeats: ");
      paramf.append(str);
      Log.w("LocalRequestInterceptor", paramf.toString());
    }
    return null;
  }
  
  public final void zza(String paramString)
  {
    zze = (TextUtils.isEmpty(paramString) ^ true);
  }
  
  public final void zza(URLConnection paramURLConnection)
  {
    StringBuilder localStringBuilder;
    if (zze)
    {
      localStringBuilder = f.l(zzc);
      localObject = "/FirebaseUI-Android";
    }
    else
    {
      localStringBuilder = f.l(zzc);
      localObject = "/FirebaseCore-Android";
    }
    localStringBuilder.append((String)localObject);
    Object localObject = localStringBuilder.toString();
    if (zzb == null) {
      zzb = new zzaey(zza);
    }
    paramURLConnection.setRequestProperty("X-Android-Package", zzb.zzb());
    paramURLConnection.setRequestProperty("X-Android-Cert", zzb.zza());
    paramURLConnection.setRequestProperty("Accept-Language", zzaee.zza());
    paramURLConnection.setRequestProperty("X-Client-Version", (String)localObject);
    paramURLConnection.setRequestProperty("X-Firebase-Locale", zzf);
    localObject = zzd;
    ((u7.f)localObject).a();
    paramURLConnection.setRequestProperty("X-Firebase-GMPID", c.b);
    paramURLConnection.setRequestProperty("X-Firebase-Client", zzb(zzd));
    localObject = zza(zzd);
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      paramURLConnection.setRequestProperty("X-Firebase-AppCheck", (String)localObject);
    }
    zzf = null;
  }
  
  public final void zzb(String paramString)
  {
    zzf = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */