package x3;

import A2.n;
import R2.n3;
import R2.r3;
import R2.s3;
import R2.t4;
import X2.t;
import X2.v;
import X2.v.a;
import X2.y;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.AbstractCollection;
import java.util.List;
import w3.a.c;

public abstract class a
{
  public static final y a = y.c0("_in", "_xa", "_xu", "_aq", "_aa", "_ai", new String[] { "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire" });
  public static final v b = v.d0("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
  public static final v c = v.b0("auto", "app", "am");
  public static final v d = v.a0("_r", "_dbg");
  public static final v e = new v.a().i(s3.a).i(s3.b).k();
  public static final v f = v.a0("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
  
  public static Bundle a(a.c paramc)
  {
    Bundle localBundle = new Bundle();
    Object localObject = a;
    if (localObject != null) {
      localBundle.putString("origin", (String)localObject);
    }
    localObject = b;
    if (localObject != null) {
      localBundle.putString("name", (String)localObject);
    }
    localObject = c;
    if (localObject != null) {
      n3.b(localBundle, localObject);
    }
    localObject = d;
    if (localObject != null) {
      localBundle.putString("trigger_event_name", (String)localObject);
    }
    localBundle.putLong("trigger_timeout", e);
    localObject = f;
    if (localObject != null) {
      localBundle.putString("timed_out_event_name", (String)localObject);
    }
    localObject = g;
    if (localObject != null) {
      localBundle.putBundle("timed_out_event_params", (Bundle)localObject);
    }
    localObject = h;
    if (localObject != null) {
      localBundle.putString("triggered_event_name", (String)localObject);
    }
    localObject = i;
    if (localObject != null) {
      localBundle.putBundle("triggered_event_params", (Bundle)localObject);
    }
    localBundle.putLong("time_to_live", j);
    localObject = k;
    if (localObject != null) {
      localBundle.putString("expired_event_name", (String)localObject);
    }
    localObject = l;
    if (localObject != null) {
      localBundle.putBundle("expired_event_params", (Bundle)localObject);
    }
    localBundle.putLong("creation_timestamp", m);
    localBundle.putBoolean("active", n);
    localBundle.putLong("triggered_timestamp", o);
    return localBundle;
  }
  
  public static String b(String paramString)
  {
    String str = r3.a(paramString);
    if (str != null) {
      return str;
    }
    return paramString;
  }
  
  public static a.c c(Bundle paramBundle)
  {
    n.i(paramBundle);
    a.c localc = new a.c();
    a = ((String)n.i((String)n3.a(paramBundle, "origin", String.class, null)));
    b = ((String)n.i((String)n3.a(paramBundle, "name", String.class, null)));
    c = n3.a(paramBundle, "value", Object.class, null);
    d = ((String)n3.a(paramBundle, "trigger_event_name", String.class, null));
    Long localLong = Long.valueOf(0L);
    e = ((Long)n3.a(paramBundle, "trigger_timeout", Long.class, localLong)).longValue();
    f = ((String)n3.a(paramBundle, "timed_out_event_name", String.class, null));
    g = ((Bundle)n3.a(paramBundle, "timed_out_event_params", Bundle.class, null));
    h = ((String)n3.a(paramBundle, "triggered_event_name", String.class, null));
    i = ((Bundle)n3.a(paramBundle, "triggered_event_params", Bundle.class, null));
    j = ((Long)n3.a(paramBundle, "time_to_live", Long.class, localLong)).longValue();
    k = ((String)n3.a(paramBundle, "expired_event_name", String.class, null));
    l = ((Bundle)n3.a(paramBundle, "expired_event_params", Bundle.class, null));
    n = ((Boolean)n3.a(paramBundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
    m = ((Long)n3.a(paramBundle, "creation_timestamp", Long.class, localLong)).longValue();
    o = ((Long)n3.a(paramBundle, "triggered_timestamp", Long.class, localLong)).longValue();
    return localc;
  }
  
  public static void d(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (("clx".equals(paramString1)) && ("_ae".equals(paramString2))) {
      paramBundle.putLong("_r", 1L);
    }
  }
  
  public static boolean e(String paramString, Bundle paramBundle)
  {
    if (b.contains(paramString)) {
      return false;
    }
    if (paramBundle != null)
    {
      paramString = d;
      int i = paramString.size();
      int j = 0;
      while (j < i)
      {
        Object localObject = paramString.get(j);
        j++;
        if (paramBundle.containsKey((String)localObject)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static boolean f(String paramString1, String paramString2)
  {
    if ((!"_ce1".equals(paramString2)) && (!"_ce2".equals(paramString2)))
    {
      if ("_ln".equals(paramString2)) {
        return (paramString1.equals("fcm")) || (paramString1.equals("fiam"));
      }
      if (e.contains(paramString2)) {
        return false;
      }
      v localv = f;
      int i = localv.size();
      int j = 0;
      while (j < i)
      {
        paramString1 = localv.get(j);
        j++;
        if (paramString2.matches((String)paramString1)) {
          return false;
        }
      }
      return true;
    }
    return (paramString1.equals("fcm")) || (paramString1.equals("frc"));
  }
  
  public static boolean g(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (!"_cmp".equals(paramString2)) {
      return true;
    }
    if (!j(paramString1)) {
      return false;
    }
    if (paramBundle == null) {
      return false;
    }
    paramString2 = d;
    int i = paramString2.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = paramString2.get(j);
      j++;
      if (paramBundle.containsKey((String)localObject)) {
        return false;
      }
    }
    paramString1.hashCode();
    i = paramString1.hashCode();
    j = -1;
    switch (i)
    {
    default: 
      break;
    case 3142703: 
      if (paramString1.equals("fiam")) {
        j = 2;
      }
      break;
    case 101230: 
      if (paramString1.equals("fdl")) {
        j = 1;
      }
      break;
    case 101200: 
      if (paramString1.equals("fcm")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return false;
    case 2: 
      paramString1 = "fiam_integration";
    }
    for (;;)
    {
      paramBundle.putString("_cis", paramString1);
      return true;
      paramString1 = "fdl_integration";
      continue;
      paramString1 = "fcm_integration";
    }
  }
  
  public static boolean h(a.c paramc)
  {
    if (paramc == null) {
      return false;
    }
    String str = a;
    if ((str != null) && (!str.isEmpty()))
    {
      Object localObject = c;
      if ((localObject != null) && (t4.a(localObject) == null)) {
        return false;
      }
      if (!j(str)) {
        return false;
      }
      if (!f(str, b)) {
        return false;
      }
      localObject = k;
      if (localObject != null)
      {
        if (!e((String)localObject, l)) {
          return false;
        }
        if (!g(str, k, l)) {
          return false;
        }
      }
      localObject = h;
      if (localObject != null)
      {
        if (!e((String)localObject, i)) {
          return false;
        }
        if (!g(str, h, i)) {
          return false;
        }
      }
      localObject = f;
      if (localObject != null)
      {
        if (!e((String)localObject, g)) {
          return false;
        }
        if (!g(str, f, g)) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public static boolean i(String paramString)
  {
    return !a.contains(paramString);
  }
  
  public static boolean j(String paramString)
  {
    return !c.contains(paramString);
  }
}

/* Location:
 * Qualified Name:     x3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */