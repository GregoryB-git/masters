package r9;

import android.content.pm.PackageInfo;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import i6.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import q0.g;
import t9.b;
import u7.j;
import u9.d;

public final class e
{
  public final u7.f a;
  public final h b;
  public final c c;
  public final b<ca.f> d;
  public final b<q9.f> e;
  public final d f;
  
  public e(u7.f paramf, h paramh, b<ca.f> paramb, b<q9.f> paramb1, d paramd)
  {
    a = paramf;
    b = paramh;
    c = localc;
    d = paramb;
    e = paramb1;
    f = paramd;
  }
  
  public final Task a(Bundle paramBundle, String arg2, String paramString2, String paramString3)
  {
    paramBundle.putString("scope", paramString3);
    paramBundle.putString("sender", paramString2);
    paramBundle.putString("subtype", paramString2);
    paramBundle.putString("appid", ???);
    ??? = a;
    ???.a();
    paramBundle.putString("gmp_app_id", c.b);
    synchronized (b)
    {
      if (d == 0)
      {
        paramString2 = ???.b("com.google.android.gms");
        if (paramString2 != null) {
          d = versionCode;
        }
      }
      int i = d;
      paramBundle.putString("gmsv", Integer.toString(i));
      paramBundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
      synchronized (b)
      {
        if (b == null) {
          ???.c();
        }
        paramString2 = b;
        paramBundle.putString("app_ver", paramString2);
        synchronized (b)
        {
          if (c == null) {
            ???.c();
          }
          paramString2 = c;
          paramBundle.putString("app_ver_name", paramString2);
          ??? = a;
          ???.a();
          ??? = b;
          try
          {
            ??? = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(???.getBytes()), 11);
          }
          catch (NoSuchAlgorithmException ???)
          {
            ??? = "[HASH-ERROR]";
          }
          paramBundle.putString("firebase-app-name-hash", ???);
          try
          {
            ??? = ((u9.h)Tasks.await(f.a())).a();
            if (!TextUtils.isEmpty(???)) {
              paramBundle.putString("Goog-Firebase-Installations-Auth", ???);
            } else {
              Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
          }
          catch (InterruptedException ???) {}catch (ExecutionException ???) {}
          Log.e("FirebaseInstanceId", "Failed to get FIS auth token", ???);
          paramBundle.putString("cliv", "fiid-21.1.0");
          ??? = (q9.f)e.get();
          paramString2 = (ca.f)d.get();
          if ((??? != null) && (paramString2 != null))
          {
            i = ???.b();
            if (i != 1)
            {
              paramBundle.putString("Firebase-Client-Log-Type", Integer.toString(g.c(i)));
              paramBundle.putString("Firebase-Client", paramString2.a());
            }
          }
          return c.a(paramBundle);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     r9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */