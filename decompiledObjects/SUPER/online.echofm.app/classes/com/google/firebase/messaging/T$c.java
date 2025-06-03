package com.google.firebase.messaging;

import android.net.Uri;

public class T$c
{
  public final String a;
  public final String b;
  public final String[] c;
  public final String d;
  public final String e;
  public final String[] f;
  public final String g;
  public final String h;
  public final String i;
  public final String j;
  public final String k;
  public final String l;
  public final String m;
  public final Uri n;
  public final String o;
  public final Integer p;
  public final Integer q;
  public final Integer r;
  public final int[] s;
  public final Long t;
  public final boolean u;
  public final boolean v;
  public final boolean w;
  public final boolean x;
  public final boolean y;
  public final long[] z;
  
  public T$c(L paramL)
  {
    a = paramL.p("gcm.n.title");
    b = paramL.h("gcm.n.title");
    c = j(paramL, "gcm.n.title");
    d = paramL.p("gcm.n.body");
    e = paramL.h("gcm.n.body");
    f = j(paramL, "gcm.n.body");
    g = paramL.p("gcm.n.icon");
    i = paramL.o();
    j = paramL.p("gcm.n.tag");
    k = paramL.p("gcm.n.color");
    l = paramL.p("gcm.n.click_action");
    m = paramL.p("gcm.n.android_channel_id");
    n = paramL.f();
    h = paramL.p("gcm.n.image");
    o = paramL.p("gcm.n.ticker");
    p = paramL.b("gcm.n.notification_priority");
    q = paramL.b("gcm.n.visibility");
    r = paramL.b("gcm.n.notification_count");
    u = paramL.a("gcm.n.sticky");
    v = paramL.a("gcm.n.local_only");
    w = paramL.a("gcm.n.default_sound");
    x = paramL.a("gcm.n.default_vibrate_timings");
    y = paramL.a("gcm.n.default_light_settings");
    t = paramL.j("gcm.n.event_time");
    s = paramL.e();
    z = paramL.q();
  }
  
  public static String[] j(L paramL, String paramString)
  {
    paramString = paramL.g(paramString);
    if (paramString == null) {
      return null;
    }
    paramL = new String[paramString.length];
    for (int i1 = 0; i1 < paramString.length; i1++) {
      paramL[i1] = String.valueOf(paramString[i1]);
    }
    return paramL;
  }
  
  public String a()
  {
    return d;
  }
  
  public String[] b()
  {
    return f;
  }
  
  public String c()
  {
    return e;
  }
  
  public String d()
  {
    return m;
  }
  
  public String e()
  {
    return l;
  }
  
  public String f()
  {
    return k;
  }
  
  public String g()
  {
    return g;
  }
  
  public Uri h()
  {
    Object localObject = h;
    if (localObject != null) {
      localObject = Uri.parse((String)localObject);
    } else {
      localObject = null;
    }
    return (Uri)localObject;
  }
  
  public Uri i()
  {
    return n;
  }
  
  public Integer k()
  {
    return r;
  }
  
  public Integer l()
  {
    return p;
  }
  
  public String m()
  {
    return i;
  }
  
  public String n()
  {
    return j;
  }
  
  public String o()
  {
    return o;
  }
  
  public String p()
  {
    return a;
  }
  
  public String[] q()
  {
    return c;
  }
  
  public String r()
  {
    return b;
  }
  
  public Integer s()
  {
    return q;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.T.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */