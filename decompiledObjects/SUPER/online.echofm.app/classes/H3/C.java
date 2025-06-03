package H3;

import E3.f;
import V2.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C
  implements D
{
  public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
  public static final String h = Pattern.quote("/");
  public final E a;
  public final Context b;
  public final String c;
  public final s4.i d;
  public final y e;
  public D.a f;
  
  public C(Context paramContext, String paramString, s4.i parami, y paramy)
  {
    if (paramContext != null)
    {
      if (paramString != null)
      {
        b = paramContext;
        c = paramString;
        d = parami;
        e = paramy;
        a = new E();
        return;
      }
      throw new IllegalArgumentException("appIdentifier must not be null");
    }
    throw new IllegalArgumentException("appContext must not be null");
  }
  
  public static String c()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SYN_");
    localStringBuilder.append(UUID.randomUUID().toString());
    return localStringBuilder.toString();
  }
  
  public static String e(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    } else {
      paramString = g.matcher(paramString).replaceAll("").toLowerCase(Locale.US);
    }
    return paramString;
  }
  
  public static boolean k(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("SYN_"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public D.a a()
  {
    Object localObject2;
    label281:
    try
    {
      if (!n())
      {
        D.a locala = f;
        return locala;
      }
    }
    finally
    {
      break label281;
      f.f().i("Determining Crashlytics installation ID...");
      SharedPreferences localSharedPreferences = i.r(b);
      Object localObject3 = localSharedPreferences.getString("firebase.installation.id", null);
      localObject2 = f.f();
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      ((StringBuilder)localObject4).append("Cached Firebase Installation ID: ");
      ((StringBuilder)localObject4).append((String)localObject3);
      ((f)localObject2).i(((StringBuilder)localObject4).toString());
      if (e.d())
      {
        localObject4 = d();
        localObject2 = f.f();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Fetched Firebase Installation ID: ");
        localStringBuilder.append((String)localObject4);
        ((f)localObject2).i(localStringBuilder.toString());
        localObject2 = localObject4;
        if (localObject4 == null) {
          if (localObject3 == null) {
            localObject2 = c();
          } else {
            localObject2 = localObject3;
          }
        }
        if (((String)localObject2).equals(localObject3)) {
          localObject2 = D.a.a(l(localSharedPreferences), (String)localObject2);
        }
      }
      for (;;)
      {
        f = ((D.a)localObject2);
        break;
        localObject2 = D.a.a(b((String)localObject2, localSharedPreferences), (String)localObject2);
        continue;
        if (k((String)localObject3)) {
          localObject2 = D.a.b(l(localSharedPreferences));
        } else {
          localObject2 = D.a.b(b(c(), localSharedPreferences));
        }
      }
      localObject3 = f.f();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Install IDs: ");
      ((StringBuilder)localObject2).append(f);
      ((f)localObject3).i(((StringBuilder)localObject2).toString());
      localObject2 = f;
      return (D.a)localObject2;
    }
  }
  
  public final String b(String paramString, SharedPreferences paramSharedPreferences)
  {
    try
    {
      String str = e(UUID.randomUUID().toString());
      f localf = f.f();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Created new Crashlytics installation ID: ");
      localStringBuilder.append(str);
      localStringBuilder.append(" for FID: ");
      localStringBuilder.append(paramString);
      localf.i(localStringBuilder.toString());
      paramSharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", paramString).apply();
      return str;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public String d()
  {
    Object localObject = d.a();
    String str;
    try
    {
      localObject = (String)c0.f((j)localObject);
    }
    catch (Exception localException)
    {
      f.f().l("Failed to retrieve Firebase Installation ID.", localException);
      str = null;
    }
    return str;
  }
  
  public String f()
  {
    return c;
  }
  
  public String g()
  {
    return a.a(b);
  }
  
  public String h()
  {
    return String.format(Locale.US, "%s/%s", new Object[] { m(Build.MANUFACTURER), m(Build.MODEL) });
  }
  
  public String i()
  {
    return m(Build.VERSION.INCREMENTAL);
  }
  
  public String j()
  {
    return m(Build.VERSION.RELEASE);
  }
  
  public final String l(SharedPreferences paramSharedPreferences)
  {
    return paramSharedPreferences.getString("crashlytics.installation.id", null);
  }
  
  public final String m(String paramString)
  {
    return paramString.replaceAll(h, "");
  }
  
  public final boolean n()
  {
    D.a locala = f;
    boolean bool;
    if ((locala != null) && ((locala.d() != null) || (!e.d()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     H3.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */