package Q4;

import E2.d;
import P4.t;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.b;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class l
{
  public static final Charset e = Charset.forName("UTF-8");
  public static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
  public static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
  public final Set a = new HashSet();
  public final Executor b;
  public final e c;
  public final e d;
  
  public l(Executor paramExecutor, e parame1, e parame2)
  {
    b = paramExecutor;
    c = parame1;
    d = parame2;
  }
  
  public static b e(e parame)
  {
    return parame.f();
  }
  
  public static Set f(e parame)
  {
    HashSet localHashSet = new HashSet();
    parame = e(parame);
    if (parame == null) {
      return localHashSet;
    }
    parame = parame.f().keys();
    while (parame.hasNext()) {
      localHashSet.add((String)parame.next());
    }
    return localHashSet;
  }
  
  public static String g(e parame, String paramString)
  {
    parame = e(parame);
    if (parame == null) {
      return null;
    }
    try
    {
      parame = parame.f().getString(paramString);
      return parame;
    }
    catch (JSONException parame) {}
    return null;
  }
  
  public static void j(String paramString1, String paramString2)
  {
    Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[] { paramString2, paramString1 }));
  }
  
  public void b(d paramd)
  {
    synchronized (a)
    {
      a.add(paramd);
      return;
    }
  }
  
  public final void c(String paramString, b paramb)
  {
    if (paramb == null) {
      return;
    }
    synchronized (a)
    {
      Iterator localIterator = a.iterator();
      if (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        Executor localExecutor = b;
        k localk = new Q4/k;
        localk.<init>(locald, paramString, paramb);
        localExecutor.execute(localk);
      }
    }
  }
  
  public Map d()
  {
    Object localObject = new HashSet();
    ((Set)localObject).addAll(f(c));
    ((Set)localObject).addAll(f(d));
    HashMap localHashMap = new HashMap();
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localHashMap.put(str, h(str));
    }
    return localHashMap;
  }
  
  public t h(String paramString)
  {
    String str = g(c, paramString);
    if (str != null)
    {
      c(paramString, e(c));
      return new q(str, 2);
    }
    str = g(d, paramString);
    if (str != null) {
      return new q(str, 1);
    }
    j(paramString, "FirebaseRemoteConfigValue");
    return new q("", 0);
  }
}

/* Location:
 * Qualified Name:     Q4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */