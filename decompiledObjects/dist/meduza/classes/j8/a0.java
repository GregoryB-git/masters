package j8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.g;
import k8.i;
import k8.i.a;
import n7.f;
import u9.d;

public final class a0
  implements b0
{
  public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
  public static final String h = Pattern.quote("/");
  public final f a;
  public final Context b;
  public final String c;
  public final d d;
  public final w e;
  public c f;
  
  public a0(Context paramContext, String paramString, d paramd, w paramw)
  {
    if (paramString != null)
    {
      b = paramContext;
      c = paramString;
      d = paramd;
      e = paramw;
      a = new f();
      return;
    }
    throw new IllegalArgumentException("appIdentifier must not be null");
  }
  
  public final String a(SharedPreferences paramSharedPreferences, String paramString)
  {
    try
    {
      String str = UUID.randomUUID().toString();
      str = g.matcher(str).replaceAll("").toLowerCase(Locale.US);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Created new Crashlytics installation ID: ");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(" for FID: ");
      ((StringBuilder)localObject).append(paramString);
      localObject = ((StringBuilder)localObject).toString();
      if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        Log.v("FirebaseCrashlytics", (String)localObject, null);
      }
      paramSharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", paramString).apply();
      return str;
    }
    finally {}
  }
  
  public final z b(boolean paramBoolean)
  {
    Object localObject1 = i.d;
    localObject1.getClass();
    i.a.a(new g((i.a)localObject1), k8.h.a);
    Object localObject2 = null;
    String str1;
    if (paramBoolean) {
      try
      {
        localObject1 = ((u9.h)Tasks.await(d.a(), 10000L, TimeUnit.MILLISECONDS)).a();
      }
      catch (Exception localException1)
      {
        Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", localException1);
      }
    } else {
      str1 = null;
    }
    try
    {
      String str2 = (String)Tasks.await(d.getId(), 10000L, TimeUnit.MILLISECONDS);
      localObject2 = str2;
    }
    catch (Exception localException2)
    {
      Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", localException2);
    }
    return new z((String)localObject2, str1);
  }
  
  public final b0.a c()
  {
    int i;
    try
    {
      c localc = f;
      i = 1;
      if ((localc != null) && ((b != null) || (!e.b()))) {
        j = 0;
      }
    }
    finally
    {
      break label474;
    }
    int j = 1;
    if (j == 0)
    {
      localObject2 = f;
      return (b0.a)localObject2;
    }
    b.z localz = b.z.e;
    localz.q("Determining Crashlytics installation ID...");
    SharedPreferences localSharedPreferences = b.getSharedPreferences("com.google.firebase.crashlytics", 0);
    Object localObject3 = localSharedPreferences.getString("firebase.installation.id", null);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Cached Firebase Installation ID: ");
    ((StringBuilder)localObject2).append((String)localObject3);
    localz.q(((StringBuilder)localObject2).toString());
    if (e.b())
    {
      Object localObject4 = b(false);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Fetched Firebase Installation ID: ");
      ((StringBuilder)localObject2).append(a);
      localz.q(((StringBuilder)localObject2).toString());
      localObject2 = localObject4;
      if (a == null)
      {
        localObject4 = new j8/z;
        if (localObject3 == null)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("SYN_");
          ((StringBuilder)localObject2).append(UUID.randomUUID().toString());
          localObject2 = ((StringBuilder)localObject2).toString();
        }
        else
        {
          localObject2 = localObject3;
        }
        ((z)localObject4).<init>((String)localObject2, null);
        localObject2 = localObject4;
      }
      if (Objects.equals(a, localObject3))
      {
        localObject4 = localSharedPreferences.getString("crashlytics.installation.id", null);
        localObject3 = new j8/c;
        ((c)localObject3).<init>((String)localObject4, a, b);
        localObject2 = localObject3;
      }
      else
      {
        localObject2 = new c(a(localSharedPreferences, a), a, b);
      }
      f = ((c)localObject2);
    }
    else
    {
      if ((localObject3 != null) && (((String)localObject3).startsWith("SYN_"))) {
        j = i;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        localObject3 = localSharedPreferences.getString("crashlytics.installation.id", null);
        localObject2 = new j8/c;
        ((c)localObject2).<init>((String)localObject3, null, null);
      }
      else
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("SYN_");
        ((StringBuilder)localObject2).append(UUID.randomUUID().toString());
        localObject2 = new c(a(localSharedPreferences, ((StringBuilder)localObject2).toString()), null, null);
      }
      f = ((c)localObject2);
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Install IDs: ");
    ((StringBuilder)localObject2).append(f);
    localz.q(((StringBuilder)localObject2).toString());
    localObject2 = f;
    return (b0.a)localObject2;
    label474:
    throw ((Throwable)localObject2);
  }
  
  public final String d()
  {
    f localf = a;
    Object localObject1 = b;
    try
    {
      if (a == null)
      {
        String str = ((Context)localObject1).getPackageManager().getInstallerPackageName(((Context)localObject1).getPackageName());
        localObject1 = str;
        if (str == null) {
          localObject1 = "";
        }
        a = ((String)localObject1);
      }
      if ("".equals(a)) {
        localObject1 = null;
      } else {
        localObject1 = a;
      }
      return (String)localObject1;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     j8.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */