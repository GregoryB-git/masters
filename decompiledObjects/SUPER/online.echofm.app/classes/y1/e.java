package y1;

import G1.g;
import O1.C;
import O1.C.a;
import O1.P;
import V5.t;
import android.os.BaseBundle;
import android.os.Bundle;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONObject;
import x1.N;
import x1.o;

public final class e
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public static final a t = new a(null);
  public static final HashSet u = new HashSet();
  public final JSONObject o;
  public final boolean p;
  public final boolean q;
  public final String r;
  public final String s;
  
  public e(String paramString1, String paramString2, Double paramDouble, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, UUID paramUUID)
  {
    p = paramBoolean1;
    q = paramBoolean2;
    r = paramString2;
    o = d(paramString1, paramString2, paramDouble, paramBundle, paramUUID);
    s = b();
  }
  
  public e(String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    paramString1 = new JSONObject(paramString1);
    o = paramString1;
    p = paramBoolean1;
    paramString1 = paramString1.optString("_eventName");
    Intrinsics.checkNotNullExpressionValue(paramString1, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
    r = paramString1;
    s = paramString2;
    q = paramBoolean2;
  }
  
  private final Object writeReplace()
  {
    String str = o.toString();
    Intrinsics.checkNotNullExpressionValue(str, "jsonObject.toString()");
    return new b(str, p, q, s);
  }
  
  public final String b()
  {
    a locala = t;
    String str = o.toString();
    Intrinsics.checkNotNullExpressionValue(str, "jsonObject.toString()");
    return a.a(locala, str);
  }
  
  public final boolean c()
  {
    return p;
  }
  
  public final JSONObject d(String paramString1, String paramString2, Double paramDouble, Bundle paramBundle, UUID paramUUID)
  {
    a locala = t;
    a.b(locala, paramString2);
    JSONObject localJSONObject = new JSONObject();
    paramString2 = J1.a.e(paramString2);
    localJSONObject.put("_eventName", paramString2);
    localJSONObject.put("_eventName_md5", a.a(locala, paramString2));
    localJSONObject.put("_logTime", System.currentTimeMillis() / 'Ϩ');
    localJSONObject.put("_ui", paramString1);
    if (paramUUID != null) {
      localJSONObject.put("_session_id", paramUUID);
    }
    if (paramBundle != null)
    {
      paramString1 = i(paramBundle);
      paramBundle = paramString1.keySet().iterator();
      while (paramBundle.hasNext())
      {
        paramString2 = (String)paramBundle.next();
        localJSONObject.put(paramString2, paramString1.get(paramString2));
      }
    }
    if (paramDouble != null) {
      localJSONObject.put("_valueToSum", paramDouble.doubleValue());
    }
    if (q) {
      localJSONObject.put("_inBackground", "1");
    }
    if (p)
    {
      localJSONObject.put("_implicitlyLogged", "1");
    }
    else
    {
      paramString1 = C.e;
      paramDouble = N.s;
      paramString2 = localJSONObject.toString();
      Intrinsics.checkNotNullExpressionValue(paramString2, "eventObject.toString()");
      paramString1.c(paramDouble, "AppEvents", "Created app event '%s'", new Object[] { paramString2 });
    }
    return localJSONObject;
  }
  
  public final JSONObject e()
  {
    return o;
  }
  
  public final String f()
  {
    return r;
  }
  
  public final boolean g()
  {
    boolean bool;
    if (s == null) {
      bool = true;
    } else {
      bool = Intrinsics.a(b(), s);
    }
    return bool;
  }
  
  public final boolean h()
  {
    return p;
  }
  
  public final Map i(Bundle paramBundle)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = t;
      Intrinsics.checkNotNullExpressionValue(str, "key");
      a.b((a)localObject, str);
      localObject = paramBundle.get(str);
      if ((!(localObject instanceof String)) && (!(localObject instanceof Number)))
      {
        paramBundle = x.a;
        paramBundle = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[] { localObject, str }, 2));
        Intrinsics.checkNotNullExpressionValue(paramBundle, "java.lang.String.format(format, *args)");
        throw new o(paramBundle);
      }
      localHashMap.put(str, localObject.toString());
    }
    F1.a.c(localHashMap);
    paramBundle = J1.a.a;
    J1.a.f(localHashMap, r);
    paramBundle = D1.a.a;
    D1.a.c(localHashMap, r);
    return localHashMap;
  }
  
  public String toString()
  {
    Object localObject = x.a;
    localObject = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[] { o.optString("_eventName"), Boolean.valueOf(p), o.toString() }, 3));
    Intrinsics.checkNotNullExpressionValue(localObject, "java.lang.String.format(format, *args)");
    return (String)localObject;
  }
  
  public static final class a
  {
    public final String c(String paramString)
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        Charset localCharset = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(localCharset, "Charset.forName(charsetName)");
        if (paramString != null)
        {
          paramString = paramString.getBytes(localCharset);
          Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.String).getBytes(charset)");
          localMessageDigest.update(paramString, 0, paramString.length);
          paramString = localMessageDigest.digest();
          Intrinsics.checkNotNullExpressionValue(paramString, "digest.digest()");
          return g.c(paramString);
        }
      }
      catch (UnsupportedEncodingException paramString)
      {
        break label78;
      }
      catch (NoSuchAlgorithmException paramString) {}
      paramString = new java/lang/NullPointerException;
      paramString.<init>("null cannot be cast to non-null type java.lang.String");
      throw paramString;
      label78:
      P.i0("Failed to generate checksum: ", paramString);
      return "1";
      P.i0("Failed to generate checksum: ", paramString);
      return "0";
    }
    
    public final void d(String paramString)
    {
      if ((paramString != null) && (paramString.length() != 0) && (paramString.length() <= 40)) {
        synchronized (e.a())
        {
          boolean bool = e.a().contains(paramString);
          t localt = t.a;
          if (!bool)
          {
            if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").b(paramString)) {
              synchronized (e.a())
              {
                e.a().add(paramString);
              }
            }
            ??? = x.a;
            paramString = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[] { paramString }, 1));
            Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(format, *args)");
            throw new o(paramString);
          }
          return;
        }
      }
      ??? = paramString;
      if (paramString == null) {
        ??? = "<None Provided>";
      }
      paramString = x.a;
      paramString = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[] { ???, Integer.valueOf(40) }, 2));
      Intrinsics.checkNotNullExpressionValue(paramString, "java.lang.String.format(locale, format, *args)");
      throw new o(paramString);
    }
  }
  
  public static final class b
    implements Serializable
  {
    public static final a s = new a(null);
    private static final long serialVersionUID = 20160803001L;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final String r;
    
    public b(String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
    {
      o = paramString1;
      p = paramBoolean1;
      q = paramBoolean2;
      r = paramString2;
    }
    
    private final Object readResolve()
    {
      return new e(o, p, q, r, null);
    }
    
    public static final class a {}
  }
}

/* Location:
 * Qualified Name:     y1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */