package com.google.firebase.messaging;

import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import o4.j.a;
import r4.b;
import s3.e;
import s4.n;
import w2.c;

public class F
{
  public final e a;
  public final K b;
  public final c c;
  public final b d;
  public final b e;
  public final s4.i f;
  
  public F(e parame, K paramK, b paramb1, b paramb2, s4.i parami)
  {
    this(parame, paramK, new c(parame.m()), paramb1, paramb2, parami);
  }
  
  public F(e parame, K paramK, c paramc, b paramb1, b paramb2, s4.i parami)
  {
    a = parame;
    b = paramK;
    c = paramc;
    d = paramb1;
    e = paramb2;
    f = parami;
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  public static boolean h(String paramString)
  {
    boolean bool;
    if ((!"SERVICE_NOT_AVAILABLE".equals(paramString)) && (!"INTERNAL_SERVER_ERROR".equals(paramString)) && (!"InternalServerError".equals(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public V2.j c()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("delete", "1");
    return d(k(K.c(a), "*", localBundle));
  }
  
  public final V2.j d(V2.j paramj)
  {
    return paramj.g(new r1.m(), new E(this));
  }
  
  public final String e()
  {
    String str = a.q();
    try
    {
      str = b(MessageDigest.getInstance("SHA-1").digest(str.getBytes()));
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return "[HASH-ERROR]";
  }
  
  public V2.j f()
  {
    return d(k(K.c(a), "*", new Bundle()));
  }
  
  public final String g(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Object localObject = paramBundle.getString("registration_id");
      if (localObject != null) {
        return (String)localObject;
      }
      localObject = paramBundle.getString("unregistered");
      if (localObject != null) {
        return (String)localObject;
      }
      localObject = paramBundle.getString("error");
      if (!"RST".equals(localObject))
      {
        if (localObject != null) {
          throw new IOException((String)localObject);
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unexpected response: ");
        ((StringBuilder)localObject).append(paramBundle);
        Log.w("FirebaseMessaging", ((StringBuilder)localObject).toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
      }
      throw new IOException("INSTANCE_ID_RESET");
    }
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
  
  public final void j(String paramString1, String paramString2, Bundle paramBundle)
  {
    paramBundle.putString("scope", paramString2);
    paramBundle.putString("sender", paramString1);
    paramBundle.putString("subtype", paramString1);
    paramBundle.putString("gmp_app_id", a.r().c());
    paramBundle.putString("gmsv", Integer.toString(b.d()));
    paramBundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
    paramBundle.putString("app_ver", b.a());
    paramBundle.putString("app_ver_name", b.b());
    paramBundle.putString("firebase-app-name-hash", e());
    try
    {
      paramString1 = ((n)V2.m.a(f.b(false))).b();
      if (!TextUtils.isEmpty(paramString1)) {
        paramBundle.putString("Goog-Firebase-Installations-Auth", paramString1);
      }
    }
    catch (InterruptedException paramString1)
    {
      break label159;
    }
    catch (ExecutionException paramString1)
    {
      break label159;
    }
    Log.w("FirebaseMessaging", "FIS auth token is empty");
    break label169;
    label159:
    Log.e("FirebaseMessaging", "Failed to get FIS auth token", paramString1);
    label169:
    paramBundle.putString("appid", (String)V2.m.a(f.a()));
    paramString1 = new StringBuilder();
    paramString1.append("fcm-");
    paramString1.append("23.3.1");
    paramBundle.putString("cliv", paramString1.toString());
    paramString2 = (o4.j)e.get();
    paramString1 = (O4.i)d.get();
    if ((paramString2 != null) && (paramString1 != null))
    {
      paramString2 = paramString2.b("fire-iid");
      if (paramString2 != j.a.p)
      {
        paramBundle.putString("Firebase-Client-Log-Type", Integer.toString(paramString2.c()));
        paramBundle.putString("Firebase-Client", paramString1.a());
      }
    }
  }
  
  public final V2.j k(String paramString1, String paramString2, Bundle paramBundle)
  {
    try
    {
      j(paramString1, paramString2, paramBundle);
      return c.a(paramBundle);
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    return V2.m.d(paramString1);
  }
  
  public V2.j l(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("/topics/");
    localStringBuilder.append(paramString2);
    localBundle.putString("gcm.topic", localStringBuilder.toString());
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("/topics/");
    localStringBuilder.append(paramString2);
    return d(k(paramString1, localStringBuilder.toString(), localBundle));
  }
  
  public V2.j m(String paramString1, String paramString2)
  {
    Bundle localBundle = new Bundle();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("/topics/");
    localStringBuilder.append(paramString2);
    localBundle.putString("gcm.topic", localStringBuilder.toString());
    localBundle.putString("delete", "1");
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("/topics/");
    localStringBuilder.append(paramString2);
    return d(k(paramString1, localStringBuilder.toString(), localBundle));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */