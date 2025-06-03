package c8;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzbz;
import com.google.android.gms.internal.firebase_auth_api.zzbg;
import com.google.android.gms.internal.firebase_auth_api.zzbs;
import com.google.android.gms.internal.firebase_auth_api.zzke;
import com.google.android.gms.internal.firebase_auth_api.zzkh;
import com.google.android.gms.internal.firebase_auth_api.zzkq;
import com.google.android.gms.internal.firebase_auth_api.zzmi.zza;
import com.google.android.gms.internal.firebase_auth_api.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

public final class c1
{
  public static c1 c;
  public final String a;
  public final com.google.android.gms.internal.firebase-auth-api.zzmi b;
  
  public c1(Context paramContext, String paramString)
  {
    a = paramString;
    try
    {
      zzke.zza();
      zzmi.zza localzza = new com/google/android/gms/internal/firebase_auth_api/zzmi$zza;
      localzza.<init>();
      paramContext = localzza.zza(paramContext, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[] { paramString })).zza(zzkq.zza);
      paramContext.zza(String.format("android-keystore://firebear_master_key_id.%s", new Object[] { paramString }));
      paramContext = paramContext.zza();
    }
    catch (IOException paramContext) {}catch (GeneralSecurityException paramContext) {}
    paramString = paramContext.getMessage();
    paramContext = new StringBuilder("Exception encountered during crypto setup:\n");
    paramContext.append(paramString);
    Log.e("FirebearCryptoHelper", paramContext.toString());
    paramContext = null;
    b = paramContext;
  }
  
  public static c1 a(Context paramContext, String paramString)
  {
    c1 localc1 = c;
    if ((localc1 == null) || (!zzp.zza(a, paramString))) {
      c = new c1(paramContext, paramString);
    }
    return c;
  }
  
  public final String b()
  {
    if (b == null)
    {
      Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    zzbz localzzbz = zzbg.zza(localByteArrayOutputStream);
    try
    {
      synchronized (b)
      {
        b.zza().zza().zza(localzzbz);
        return Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 8);
      }
      str = localGeneralSecurityException.getMessage();
    }
    catch (IOException localIOException) {}catch (GeneralSecurityException localGeneralSecurityException) {}
    String str;
    StringBuilder localStringBuilder = new StringBuilder("Exception encountered when attempting to get Public Key:\n");
    localStringBuilder.append(str);
    Log.e("FirebearCryptoHelper", localStringBuilder.toString());
    return null;
  }
  
  public final String c(String paramString)
  {
    Object localObject = b;
    if (localObject == null)
    {
      Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
      return null;
    }
    try
    {
      try
      {
        com.google.android.gms.internal.firebase_auth_api.zzbj localzzbj = (com.google.android.gms.internal.firebase_auth_api.zzbj)b.zza().zza(zzkh.zza(), com.google.android.gms.internal.firebase-auth-api.zzbj.class);
        String str = new java/lang/String;
        str.<init>(localzzbj.zza(Base64.decode(paramString, 8), null), "UTF-8");
        return str;
      }
      finally {}
      localObject = paramString.getMessage();
    }
    catch (UnsupportedEncodingException paramString) {}catch (GeneralSecurityException paramString) {}
    paramString = new StringBuilder("Exception encountered while decrypting bytes:\n");
    paramString.append((String)localObject);
    Log.e("FirebearCryptoHelper", paramString.toString());
    return null;
  }
}

/* Location:
 * Qualified Name:     c8.c1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */