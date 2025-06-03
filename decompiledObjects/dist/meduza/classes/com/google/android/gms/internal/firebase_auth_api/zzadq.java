package com.google.android.gms.internal.firebase_auth_api;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.text.TextUtils;
import c8.p;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import m6.j;
import p6.a;

public final class zzadq
  extends AsyncTask<Void, Void, zzadt>
{
  private static final a zza = new a("FirebaseAuth", new String[] { "GetAuthDomainTask" });
  private final String zzb;
  private final String zzc;
  private final WeakReference<zzads> zzd;
  private final Uri.Builder zze;
  private final String zzf;
  private final u7.f zzg;
  
  public zzadq(String paramString1, String paramString2, Intent paramIntent, u7.f paramf, com.google.android.gms.internal.firebase-auth-api.zzads paramzzads)
  {
    j.e(paramString1);
    zzb = paramString1;
    j.i(paramf);
    zzg = paramf;
    j.e(paramString2);
    j.i(paramIntent);
    Object localObject = paramIntent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
    j.e((String)localObject);
    paramf = Uri.parse(paramzzads.zza((String)localObject)).buildUpon();
    localObject = paramf.appendPath("getProjectConfig").appendQueryParameter("key", (String)localObject).appendQueryParameter("androidPackageName", paramString1);
    j.i(paramString2);
    ((Uri.Builder)localObject).appendQueryParameter("sha1Cert", paramString2);
    zzc = paramf.build().toString();
    zzd = new WeakReference(paramzzads);
    zze = paramzzads.zza(paramIntent, paramString1, paramString2);
    zzf = paramIntent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
  }
  
  private final com.google.android.gms.internal.firebase-auth-api.zzadt zza(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = new java/net/URL;
      paramVarArgs.<init>(zzc);
      Object localObject1 = (zzads)zzd.get();
      paramVarArgs = ((zzads)localObject1).zza(paramVarArgs);
      paramVarArgs.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
      paramVarArgs.setConnectTimeout(60000);
      Object localObject2 = new com/google/android/gms/internal/firebase_auth_api/zzaef;
      ((zzaef)localObject2).<init>(((zzads)localObject1).zza(), zzg, zzaed.zza().zzb());
      ((zzaef)localObject2).zza(paramVarArgs);
      int i = paramVarArgs.getResponseCode();
      if (i != 200)
      {
        paramVarArgs = zza(paramVarArgs);
        zza.c(String.format("Error getting project config. Failed with %s %s", new Object[] { paramVarArgs, Integer.valueOf(i) }), new Object[0]);
        return zzadt.zzb(paramVarArgs);
      }
      localObject2 = new com/google/android/gms/internal/firebase_auth_api/zzagr;
      ((zzagr)localObject2).<init>();
      localObject1 = new java/lang/String;
      ((String)localObject1).<init>(zza(paramVarArgs.getInputStream(), 128));
      ((zzagr)localObject2).zza((String)localObject1);
      if (!TextUtils.isEmpty(zzf))
      {
        if (!((zzagr)localObject2).zza().contains(zzf)) {
          return zzadt.zzb("UNAUTHORIZED_DOMAIN");
        }
        return zzadt.zza(zzf);
      }
      localObject1 = ((zzagr)localObject2).zza().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramVarArgs = (String)((Iterator)localObject1).next();
        if (zza(paramVarArgs))
        {
          paramVarArgs = zzadt.zza(paramVarArgs);
          return paramVarArgs;
        }
      }
    }
    catch (zzabr paramVarArgs)
    {
      zza.c(f.j("ConversionException encountered: ", paramVarArgs.getMessage()), new Object[0]);
    }
    catch (NullPointerException paramVarArgs)
    {
      zza.c(f.j("Null pointer encountered: ", paramVarArgs.getMessage()), new Object[0]);
    }
    catch (IOException paramVarArgs)
    {
      zza.c(f.j("IOException occurred: ", paramVarArgs.getMessage()), new Object[0]);
    }
    return null;
  }
  
  private static String zza(HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      if (paramHttpURLConnection.getResponseCode() >= 400)
      {
        InputStream localInputStream = paramHttpURLConnection.getErrorStream();
        if (localInputStream == null) {
          return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
        }
        paramHttpURLConnection = new java/lang/String;
        paramHttpURLConnection.<init>(zza(localInputStream, 128));
        paramHttpURLConnection = (String)zzady.zza(paramHttpURLConnection, String.class);
        return paramHttpURLConnection;
      }
    }
    catch (IOException paramHttpURLConnection)
    {
      zza.f(f.j("Error parsing error message from response body in getErrorMessageFromBody. ", String.valueOf(paramHttpURLConnection)), new Object[0]);
    }
    return null;
  }
  
  private final void zza(com.google.android.gms.internal.firebase-auth-api.zzadt paramzzadt)
  {
    zzads localzzads = (zzads)zzd.get();
    Object localObject = null;
    String str;
    if (paramzzadt != null)
    {
      localObject = paramzzadt.zza();
      str = paramzzadt.zzb();
      paramzzadt = (com.google.android.gms.internal.firebase-auth-api.zzadt)localObject;
    }
    else
    {
      str = null;
      paramzzadt = (com.google.android.gms.internal.firebase-auth-api.zzadt)localObject;
    }
    if (localzzads == null)
    {
      zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
      return;
    }
    if (!TextUtils.isEmpty(paramzzadt))
    {
      localObject = zze;
      if (localObject != null)
      {
        ((Uri.Builder)localObject).authority(paramzzadt);
        localzzads.zza(zze.build(), zzb, getInstancezzg).v);
        return;
      }
    }
    paramzzadt = p.a(str);
    localzzads.zza(zzb, paramzzadt);
  }
  
  private static boolean zza(String paramString)
  {
    try
    {
      URI localURI = new java/net/URI;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("https://");
      ((StringBuilder)localObject).append(paramString);
      localURI.<init>(((StringBuilder)localObject).toString());
      localObject = localURI.getHost();
      if (localObject != null) {
        if (!((String)localObject).endsWith("firebaseapp.com"))
        {
          boolean bool = ((String)localObject).endsWith("web.app");
          if (!bool) {}
        }
        else
        {
          return true;
        }
      }
    }
    catch (URISyntaxException localURISyntaxException)
    {
      Object localObject = zza;
      String str = localURISyntaxException.getMessage();
      StringBuilder localStringBuilder = new StringBuilder("Error parsing URL for auth domain check: ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(". ");
      localStringBuilder.append(str);
      ((a)localObject).c(localStringBuilder.toString(), new Object[0]);
    }
    return false;
  }
  
  private static byte[] zza(InputStream paramInputStream, int paramInt)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      byte[] arrayOfByte = new byte[''];
      for (;;)
      {
        paramInt = paramInputStream.read(arrayOfByte);
        if (paramInt == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, paramInt);
      }
      paramInputStream = localByteArrayOutputStream.toByteArray();
      return paramInputStream;
    }
    finally
    {
      localByteArrayOutputStream.close();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */