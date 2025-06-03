package r8;

import android.text.TextUtils;
import android.util.Log;
import eb.y;
import f;
import j8.a0;
import j8.c;
import java.util.HashMap;
import o8.a;
import org.json.JSONObject;

public final class b
  implements j
{
  public final String a;
  public final y b;
  
  public b(String paramString, y paramy)
  {
    if (paramString != null)
    {
      b = paramy;
      a = paramString;
      return;
    }
    throw new IllegalArgumentException("url must not be null.");
  }
  
  public static void a(a parama, i parami)
  {
    b(parama, "X-CRASHLYTICS-GOOGLE-APP-ID", a);
    b(parama, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    b(parama, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.0");
    b(parama, "Accept", "application/json");
    b(parama, "X-CRASHLYTICS-DEVICE-MODEL", b);
    b(parama, "X-CRASHLYTICS-OS-BUILD-VERSION", c);
    b(parama, "X-CRASHLYTICS-OS-DISPLAY-VERSION", d);
    b(parama, "X-CRASHLYTICS-INSTALLATION-ID", e).c()).a);
  }
  
  public static void b(a parama, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      c.put(paramString1, paramString2);
    }
  }
  
  public static HashMap c(i parami)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("build_version", h);
    localHashMap.put("display_version", g);
    localHashMap.put("source", Integer.toString(i));
    parami = f;
    if (!TextUtils.isEmpty(parami)) {
      localHashMap.put("instance", parami);
    }
    return localHashMap;
  }
  
  public final JSONObject d(o8.b paramb)
  {
    int i = a;
    String str = f.h("Settings response code was: ", i);
    boolean bool = Log.isLoggable("FirebaseCrashlytics", 2);
    int j = 0;
    Object localObject = null;
    if (bool) {
      Log.v("FirebaseCrashlytics", str, null);
    }
    if ((i == 200) || (i == 201) || (i == 202) || (i == 203)) {
      j = 1;
    }
    if (j != 0)
    {
      str = b;
      try
      {
        paramb = new org/json/JSONObject;
        paramb.<init>(str);
      }
      catch (Exception localException)
      {
        paramb = f.l("Failed to parse settings JSON from ");
        paramb.append(a);
        Log.w("FirebaseCrashlytics", paramb.toString(), localException);
        paramb = new StringBuilder();
        paramb.append("Settings response ");
        paramb.append(str);
        Log.w("FirebaseCrashlytics", paramb.toString(), null);
        paramb = (o8.b)localObject;
      }
    }
    else
    {
      paramb = a0.j.n("Settings request failed; (status: ", i, ") from ");
      paramb.append(a);
      Log.e("FirebaseCrashlytics", paramb.toString(), null);
      paramb = (o8.b)localObject;
    }
    return paramb;
  }
}

/* Location:
 * Qualified Name:     r8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */