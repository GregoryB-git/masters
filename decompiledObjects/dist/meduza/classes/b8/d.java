package b8;

import android.net.Uri;
import com.google.android.gms.internal.firebase_auth_api.zzan;
import g;
import java.util.HashMap;
import java.util.Set;
import m6.j;

public final class d
{
  public static final zzan<String, Integer> d;
  public final String a;
  public final String b;
  public final String c;
  
  static
  {
    HashMap localHashMap = new HashMap();
    g.k(2, localHashMap, "recoverEmail", 0, "resetPassword", 4, "signIn", 1, "verifyEmail");
    localHashMap.put("verifyBeforeChangeEmail", Integer.valueOf(5));
    localHashMap.put("revertSecondFactorAddition", Integer.valueOf(6));
    d = zzan.zza(localHashMap);
  }
  
  public d(String paramString)
  {
    String str1 = a(paramString, "apiKey");
    String str2 = a(paramString, "oobCode");
    String str3 = a(paramString, "mode");
    if ((str1 != null) && (str2 != null) && (str3 != null))
    {
      j.e(str1);
      j.e(str2);
      a = str2;
      j.e(str3);
      b = str3;
      a(paramString, "continueUrl");
      a(paramString, "languageCode");
      c = a(paramString, "tenantId");
      return;
    }
    throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[] { "apiKey", "oobCode", "mode" }));
  }
  
  public static String a(String paramString1, String paramString2)
  {
    paramString1 = Uri.parse(paramString1);
    try
    {
      Set localSet = paramString1.getQueryParameterNames();
      if (localSet.contains(paramString2)) {
        return paramString1.getQueryParameter(paramString2);
      }
      if (localSet.contains("link"))
      {
        paramString1 = paramString1.getQueryParameter("link");
        j.e(paramString1);
        paramString1 = Uri.parse(paramString1).getQueryParameter(paramString2);
        return paramString1;
      }
    }
    catch (UnsupportedOperationException|NullPointerException paramString1)
    {
      for (;;) {}
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     b8.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */