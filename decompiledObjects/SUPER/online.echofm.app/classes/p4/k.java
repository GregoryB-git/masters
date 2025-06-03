package p4;

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
import s3.e;
import w2.c;

public class k
{
  public final e a;
  public final n b;
  public final c c;
  public final r4.b d;
  public final r4.b e;
  public final s4.i f;
  
  public k(e parame, n paramn, r4.b paramb1, r4.b paramb2, s4.i parami)
  {
    this(parame, paramn, new c(parame.m()), paramb1, paramb2, parami);
  }
  
  public k(e parame, n paramn, c paramc, r4.b paramb1, r4.b paramb2, s4.i parami)
  {
    a = parame;
    b = paramn;
    c = paramc;
    d = paramb1;
    e = paramb2;
    f = parami;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  public static boolean g(String paramString)
  {
    return ("SERVICE_NOT_AVAILABLE".equals(paramString)) || ("INTERNAL_SERVER_ERROR".equals(paramString)) || ("InternalServerError".equals(paramString));
  }
  
  public V2.j b(String paramString1, String paramString2, String paramString3)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("delete", "1");
    return c(j(paramString1, paramString2, paramString3, localBundle));
  }
  
  public final V2.j c(V2.j paramj)
  {
    return paramj.g(b.a(), new j(this));
  }
  
  public final String d()
  {
    String str = a.q();
    try
    {
      str = a(MessageDigest.getInstance("SHA-1").digest(str.getBytes()));
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return "[HASH-ERROR]";
  }
  
  public V2.j e(String paramString1, String paramString2, String paramString3)
  {
    return c(j(paramString1, paramString2, paramString3, new Bundle()));
  }
  
  public final String f(Bundle paramBundle)
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
        paramBundle = String.valueOf(paramBundle);
        localObject = new StringBuilder(paramBundle.length() + 21);
        ((StringBuilder)localObject).append("Unexpected response: ");
        ((StringBuilder)localObject).append(paramBundle);
        Log.w("FirebaseInstanceId", ((StringBuilder)localObject).toString(), new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
      }
      throw new IOException("INSTANCE_ID_RESET");
    }
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
  
  public final Bundle i(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    paramBundle.putString("scope", paramString3);
    paramBundle.putString("sender", paramString2);
    paramBundle.putString("subtype", paramString2);
    paramBundle.putString("appid", paramString1);
    paramBundle.putString("gmp_app_id", a.r().c());
    paramBundle.putString("gmsv", Integer.toString(b.d()));
    paramBundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
    paramBundle.putString("app_ver", b.a());
    paramBundle.putString("app_ver_name", b.b());
    paramBundle.putString("firebase-app-name-hash", d());
    try
    {
      paramString1 = ((s4.n)V2.m.a(f.b(false))).b();
      if (!TextUtils.isEmpty(paramString1)) {
        paramBundle.putString("Goog-Firebase-Installations-Auth", paramString1);
      }
    }
    catch (InterruptedException paramString1)
    {
      break label177;
    }
    catch (ExecutionException paramString1)
    {
      break label177;
    }
    Log.w("FirebaseInstanceId", "FIS auth token is empty");
    break label187;
    label177:
    Log.e("FirebaseInstanceId", "Failed to get FIS auth token", paramString1);
    label187:
    paramBundle.putString("cliv", "fiid-21.1.0");
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
    return paramBundle;
  }
  
  public final V2.j j(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    i(paramString1, paramString2, paramString3, paramBundle);
    return c.a(paramBundle);
  }
}

/* Location:
 * Qualified Name:     p4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */