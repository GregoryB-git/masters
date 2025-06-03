package O3;

import E3.f;
import H3.D;
import H3.D.a;
import H3.s;
import L3.a;
import L3.b;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class c
  implements k
{
  public final String a;
  public final b b;
  public final f c;
  
  public c(String paramString, b paramb)
  {
    this(paramString, paramb, f.f());
  }
  
  public c(String paramString, b paramb, f paramf)
  {
    if (paramString != null)
    {
      c = paramf;
      b = paramb;
      a = paramString;
      return;
    }
    throw new IllegalArgumentException("url must not be null.");
  }
  
  public JSONObject a(j paramj, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      try
      {
        Map localMap = f(paramj);
        paramj = b(d(localMap), paramj);
        f localf = c;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Requesting settings from ");
        localStringBuilder.append(a);
        localf.b(localStringBuilder.toString());
        localf = c;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Settings query params were: ");
        localStringBuilder.append(localMap);
        localf.i(localStringBuilder.toString());
        paramj = g(paramj.c());
      }
      catch (IOException paramj)
      {
        c.e("Settings request failed.", paramj);
        paramj = null;
      }
      return paramj;
    }
    throw new RuntimeException("An invalid data collection token was used.");
  }
  
  public final a b(a parama, j paramj)
  {
    c(parama, "X-CRASHLYTICS-GOOGLE-APP-ID", a);
    c(parama, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    c(parama, "X-CRASHLYTICS-API-CLIENT-VERSION", s.l());
    c(parama, "Accept", "application/json");
    c(parama, "X-CRASHLYTICS-DEVICE-MODEL", b);
    c(parama, "X-CRASHLYTICS-OS-BUILD-VERSION", c);
    c(parama, "X-CRASHLYTICS-OS-DISPLAY-VERSION", d);
    c(parama, "X-CRASHLYTICS-INSTALLATION-ID", e.a().c());
    return parama;
  }
  
  public final void c(a parama, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      parama.d(paramString1, paramString2);
    }
  }
  
  public a d(Map paramMap)
  {
    paramMap = b.a(a, paramMap);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Crashlytics Android SDK/");
    localStringBuilder.append(s.l());
    return paramMap.d("User-Agent", localStringBuilder.toString()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
  }
  
  public final JSONObject e(String paramString)
  {
    try
    {
      localObject = new JSONObject(paramString);
      return (JSONObject)localObject;
    }
    catch (Exception localException)
    {
      f localf = c;
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Failed to parse settings JSON from ");
      ((StringBuilder)localObject).append(a);
      localf.l(((StringBuilder)localObject).toString(), localException);
      localf = c;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Settings response ");
      ((StringBuilder)localObject).append(paramString);
      localf.k(((StringBuilder)localObject).toString());
    }
    return null;
  }
  
  public final Map f(j paramj)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("build_version", h);
    localHashMap.put("display_version", g);
    localHashMap.put("source", Integer.toString(i));
    paramj = f;
    if (!TextUtils.isEmpty(paramj)) {
      localHashMap.put("instance", paramj);
    }
    return localHashMap;
  }
  
  public JSONObject g(L3.c paramc)
  {
    int i = paramc.b();
    f localf = c;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Settings response code was: ");
    localStringBuilder.append(i);
    localf.i(localStringBuilder.toString());
    if (h(i))
    {
      paramc = e(paramc.a());
    }
    else
    {
      paramc = c;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Settings request failed; (status: ");
      localStringBuilder.append(i);
      localStringBuilder.append(") from ");
      localStringBuilder.append(a);
      paramc.d(localStringBuilder.toString());
      paramc = null;
    }
    return paramc;
  }
  
  public boolean h(int paramInt)
  {
    boolean bool;
    if ((paramInt != 200) && (paramInt != 201) && (paramInt != 202) && (paramInt != 203)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     O3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */